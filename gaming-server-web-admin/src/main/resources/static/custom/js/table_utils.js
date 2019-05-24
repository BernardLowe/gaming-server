var TableUtils = function () {

    /**
     * Ajax 表格
     * @param url 请求地址
     * @param columns 自定义列表项
     */
    var handlerInitAjaxTable = function (url, columns) {
        var datatable = $('.m_datatable').mDatatable({
            translate: {
                records: {
                    processing: '请稍候...',
                    noRecords: '还没有任何数据',
                },
                toolbar: {
                    pagination: {
                        items: {
                            default: {
                                first: '首页',
                                prev: '上一页',
                                next: '下一页',
                                last: '尾页',
                                more: '更多',
                                input: '页码',
                                select: '选择',
                            },
                            info: '显示第 {{start}} - {{end}} 条记录，共 {{total}} 条记录',
                        },
                    },
                },
            },

            data: {
                type: 'remote',
                source: {
                    read: {
                        // sample GET method
                        method: 'GET',
                        url: url,
                        map: function (raw) {
                            // sample data mapping
                            var dataSet = raw;
                            if (typeof raw.data !== 'undefined') {
                                dataSet = raw.data;
                            }
                            return dataSet;
                        },
                    },
                },
                pageSize: 10,
                serverPaging: true,
                serverFiltering: true,
                serverSorting: true,
            },

            // layout definition
            layout: {
                scroll: false,
                footer: false
            },

            // column sorting
            sortable: true,

            pagination: true,

            toolbar: {
                // toolbar items
                items: {
                    // pagination
                    pagination: {
                        // page size select
                        pageSizeSelect: [10, 20, 30, 50, 100]
                    },
                },
            },

            search: {
                input: $('#generalSearch'),
            },

            // columns definition
            columns: columns
        });
    };

    return {
        ajaxTable: function (url, columns) {
            handlerInitAjaxTable(url, columns);
        }
    }

}();