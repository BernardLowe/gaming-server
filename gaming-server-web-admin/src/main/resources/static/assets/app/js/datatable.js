var DataTable = function () {
    //== Private functions

    // demo initializer
    var handelInit = function() {

        var datatable = $('.m-datatable').mDatatable({
            data: {
                saveState: {cookie: false},
            },
            pagination:false
        });
    };

    return {
        //== Public functions
        init: function() {
            // init dmeo
            handelInit();
        },
    };
}();


jQuery(document).ready(function() {
    DataTable.init();
});