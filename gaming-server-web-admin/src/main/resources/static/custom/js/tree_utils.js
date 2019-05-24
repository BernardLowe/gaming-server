var TreeUtils = function () {

    /**
     * 默认的参数
     */
    var defaultParams = {
        // 树的元素 ID
        treeId: 'tree',
        // 远程请求地址
        url: '',
        // 需要返回参数对象，如：{'pid': node.id}
        callbackParams: function (node) {
            return {
                'pid': node.id
            }
        },
        // 选中节点的事件
        callbackSelected: function (e, data) {
            $("#parentId").val(data.node.id);
            $("#parentName").val(data.node.text);
        },
        // 用于查询节点 Text 的 ID
        parentId: 0,
        // 用于回显的文本框 ID
        parentNameInputId: 'parentName'
    };

    /**
     * Ajax 请求树
     */
    var handlerAjaxTree = function (params) {
        $(params).extend(defaultParams);

        $("#" + params.treeId).jstree({
            "core": {
                "themes": {
                    "responsive": false
                },
                // so that create works
                "check_callback": true,
                'data': {
                    'url': function (node) {
                        return params.url;
                    },
                    'data': function (node) {
                        return params.callbackParams(node);
                    }
                }
            },
            "types": {
                "default": {
                    "icon": "fa fa-folder m--font-brand"
                },
                "file": {
                    "icon": "fa fa-file  m--font-brand"
                }
            },
            "state": {"key": "demo3"},
            "plugins": ["dnd", "state", "types"]
        });

        $('#' + params.treeId).on('activate_node.jstree', function(e, data) {
            params.callbackSelected(e, data);
        });
    };

    return {
        ajaxTree: function (params) {
            handlerAjaxTree(params);
        }
    }
}();