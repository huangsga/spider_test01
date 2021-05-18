package com.example.team2021.Mapper;

import com.example.team2021.Entity.Back;
import com.example.team2021.Entity.ViewIssue;
import com.example.team2021.Entity.Zhijigaokao;
import com.example.team2021.Entity.gaokaozixun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BackMapper {
    // 查询用户信息
    @Select("select * from userinfo")
    List<Back> findalluser();
    // 添加用户信息
    @Select("insert into userinfo(username,password,user_sex,grade,education,school,email,phone,provinces,creatDate,birthday) values(#{username},#{password},#{user_sex},#{grade},#{education},#{school},#{email},#{phone},#{provinces},sysdate(),#{birthday})")
    Integer adduserinfo(Back back);
    // 显示需要修改的用户信息
    @Select("select * from userinfo where userid=#{userid}")
    Back findoneuser(Integer userid);

    // 修改用户信息
    @Select("update userinfo set username=#{username},password=#{password},user_sex=#{user_sex},grade=#{grade},education=#{education},school=#{school},email=#{email},phone=#{phone},provinces=#{provinces},birthday=#{birthday} where userid=#{userid}")
    Integer edituserinfo(Back back);
    // 删除用户信息
    @Select("delete from userinfo where userid=#{userid}")
    Integer deleteUserinfo(Integer userid);

    //查找真题
    @Select("select * from team01.zhijigaokao")
    List<Zhijigaokao> findAllzhenti();

    // 删除试题信息
    @Select("delete from zhijigaokao where pic_id=#{picId}")
    Integer deleteZhenti(Integer picId);

    //查找shiti01表所有试题
    @Select("select * from shiti01 join jiaocai on shiti01.jiaocai_id = jiaocai.jiaocai_id where isdelete = 0 limit 100")
    List<ViewIssue> findAllIssue();

    // 显示需要修改的试题信息
    @Select("select * from shiti01 join jiaocai on shiti01.jiaocai_id = jiaocai.jiaocai_id where isdelete = 0 and shiti01.shiti_id =#{shitiId}")
    ViewIssue findOneIssue(Integer shitiId);

    // 修改试题信息
    @Select("update shiti01 set shiti_id=#{shitiId},shiti_timu=#{shitiTimu},shiti_option=#{shitiOption},shiti_daan_href=#{shitiDaanHref},shiti_kaodian=#{shitiKaodian},shiti_hard=#{shitiHard},shiti_time=#{shitiTime},isdelete=#{isdelete} where shiti_id=#{shitiId}")
    Integer editIssue(ViewIssue viewIssue);

    // 删除shiti01表信息
    @Select("delete from shiti01 where shiti_id=#{shitiId} where isdelete = 0")
    Integer deleteIssue(Integer shitiId);

    //查找资讯表所有资讯
    @Select("select * from gaokaozixun")
    List<gaokaozixun> findAllzixun();
}
