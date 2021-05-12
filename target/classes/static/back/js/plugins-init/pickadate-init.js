(function($) {
    "use strict"

    //date picker classic default
    $('.datepicker-default').pickadate({selectedYear:80,min: new Date(1950,1,1),
        max: new Date(),format:'yyyy-mm-dd'});
})(jQuery);