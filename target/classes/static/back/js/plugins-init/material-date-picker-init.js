(function($) {
    "use strict"

    // MAterial Date picker
    $('#mdate').bootstrapMaterialDatePicker({
        weekStart: 0,
        time: false
    });
    $('#timepicker').bootstrapMaterialDatePicker({
        format: 'YYYY-MM-DD',
        time: true,
        date: false
    });
    $('#date-format').bootstrapMaterialDatePicker({
        format: 'YYYY-MM-DD'
    });

    $('#min-date').bootstrapMaterialDatePicker({
        format: 'YYYY-MM-DD',
        minDate: new Date()
    });

})(jQuery);