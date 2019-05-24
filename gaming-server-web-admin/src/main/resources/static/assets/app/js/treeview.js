var Treeview = function () {

    var handlerInitTree = function () {
        $("#m_tree_1").jstree({
            "core" : {
                "themes" : {
                    "responsive": false
                },
                // so that create works
                "check_callback" : true,
                'data' : {
                    'url' : function (node) {
                        return '/channel/tree';
                    },
                    'data' : function (node) {
                        return { 'pid' : node.id };
                    }
                }
            },
            "types" : {
                "default" : {
                    "icon" : "fa fa-folder m--font-brand"
                },
                "file" : {
                    "icon" : "fa fa-file  m--font-brand"
                }
            },
            "state" : { "key" : "demo3" },
            "plugins" : [ "dnd", "state", "types" ]
        });
        // $('#m_tree_1').jstree({
        //     "types" : {
        //         "default" : {
        //             "icon" : "fa fa-folder"
        //         },
        //         "file" : {
        //             "icon" : "fa fa-file"
        //         }
        //     },
        //     "plugins": ["types"]
        // });

        $("#m_tree_1").bind("activate_node.jstree",function (obj,e) {
           var currenNode = e.node;
            $("#pid").val(currenNode.id);
           $("#pidText").val(currenNode.text);
        });
    }

    return {
        //main function to initiate the module
        init: function () {
            handlerInitTree();
        }
    };
}();

jQuery(document).ready(function() {
    Treeview.init();
});