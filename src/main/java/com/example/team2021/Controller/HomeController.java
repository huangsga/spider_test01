package com.example.team2021.Controller;

import com.example.team2021.Entity.User;
import com.example.team2021.Entity.UserLog;
import com.example.team2021.Service.UserLogService;
import com.example.team2021.Service.UserService;
import com.example.team2021.Service.issueService;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/main")
public class HomeController {
    @Autowired
    private issueService issueService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserLogService userLogService;

    @GetMapping("/index")
    public String getIssue(HttpSession session,Model model){
        User user=(User)session.getAttribute("us");
        if (user == null) {
           model.addAttribute("Username","游客");
        }
        else{
            model.addAttribute("Username",user.getUsername());
        }
        return "index-1";
    }
    @GetMapping("/register")
    public String registerinfo(){
        return "page_register";
    }
    @GetMapping("/login")
    public String logininfo(){
        return "page_login";
    }
    @PostMapping("/register")
    public String addUserInfo(@RequestParam(value="username") String username,
                              @RequestParam(value="password") String password,
                              @RequestParam(value="email") String email) {
        if (!username.isEmpty() && !password.isEmpty()) {
            User user=userService.UserLogin(username,password);
            if(user!=null){
                return "redirect:/main/error";
            }
            else {
                userService.addUserInfo(username, password,email);
                return "redirect:/main/login";
            }
        } else {
            return "redirect:/main/register";
        }
    }
    @GetMapping("/error")
    public String errorUserInfo(){
        return "pag_error_404";
    }
    @GetMapping("/error2")
    public String error2UserInfo(){
        return "pag_error_405";
    }
    @PostMapping("/login")
    public String loginInfo(@RequestParam(value="username") String username,
                            @RequestParam(value="password") String password,
                            HttpSession session, HttpServletRequest request,
                            HttpServletResponse response) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "uknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip.equals("0:0:0:0:0:0:0:1")) {
            ip = "127.0.0.1";
        }
        System.out.println("IP地址" + ip);
        String agentStr = request.getHeader("user-agent");
        System.out.println(agentStr);
        UserAgent agent = UserAgent.parseUserAgentString(agentStr);
        Browser browser = agent.getBrowser();
        System.out.println("类型：" + browser.getBrowserType() +
                "\n名称：" + browser.getName() +
                "\n厂商：" + browser.getManufacturer() +
                "\n产品系列：" + browser.getGroup() +
                "\n引擎：" + browser.getRenderingEngine());
        //浏览器版本
        Version version = agent.getBrowserVersion();
        System.out.println("===================");
        System.out.println("主版本：" + version.getMajorVersion() +
                "\n小版本：" + version.getMinorVersion() +
                "\n完整版本：" + version.getVersion());
        //操作系统
        System.out.println("========================");
        OperatingSystem os = agent.getOperatingSystem();
        System.out.println("名称："+os.getName()+
                "\n设备类型："+os.getDeviceType()+
                "\n产品系列："+os.getGroup()+
                "\n生成厂商："+os.getManufacturer());


        UserLog log=new UserLog();


        User user =userService.UserLogin(username,password);
        if(user!=null){
            log.setUserid(user.getUserId());
            log.setIP_Address(ip);
            log.setOS(os.getName());
            log.setIE(browser.getName());
            log.setLog_Content("系统登录");
            //写入登录日志
            Integer i = userLogService.InsertLog(log);
            //创建用户Session信息
            session.setAttribute("us",user);
            return "redirect:/main/index";
        }
        else{
            return "redirect:/main/error2";
        }

    }

}
