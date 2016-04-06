/**
 */
define(function () {
    return ["$scope", "ItemCategoryAPI", "$modal", "$ugDialog", function($scope, ItemCategoryAPI, $modal, $ugDialog){
        $scope.itemCategoryList = [];
        $scope.queryParam = {};
        $scope.getOrganizationTree = function(){
            ItemCategoryAPI.query({
                id:$scope.queryParam.id
            }, function(data){
                $scope.itemCategoryList = data;
            });
        };
        $scope.removeNode = function(item){
            var msg = "是否删除此组织?";
            if(item.nodes && item.nodes.length > 0){
                msg = "此组织存在下级组织，确认将同步删除此组织所有下级组织，是否删除？"
            }
            $ugDialog.confirm(msg).then(function(){
                ItemCategoryAPI.delete({
                    id: item.id
                }, function(){
                    $scope.getItemCategoryTree();
                });
            })
        };
        $scope.addChildItemCategory = function(item){
            $scope.openAddModel({
                parentId:item.id,
                parentName:item.name
            }, 'ADD_CHILD_NODE');
        };
        $scope.updateChildItemCategory = function(item){
            $scope.openAddModel(angular.copy(item));
        };
        $scope.openAddModel = function (itemCategory, action) {
            var modalInstance = $modal.open({
                templateUrl: 'addItemCategory.html',
                resolve:{
                    CurrentItemCategory : function(){
                        return itemCategory;
                    },
                    Action: function(){
                        return action;
                    }
                },
                controller: ["$scope", "ItemCategoryAPI", "$modalInstance", "CurrentItemCategory", "Action", function ($scope, ItemCategoryAPI, $modalInstance, CurrentItemCategory, Action) {
                    $scope.itemCategory = {};
                    if(CurrentItemCategory){
                        if(Action == 'ADD_CHILD_NODE'){
                            $scope.organization.parentId = CurrentItemCategory.parentId;
                            $scope.organization.parentName = CurrentItemCategory.parentName;
                        }else{
                            $scope.organization = {
                                id:CurrentItemCategory.id,
                                name:CurrentItemCategory.name,
                                description:CurrentItemCategory.description,
                                parentId:CurrentItemCategory.parentId,
                                parentName:CurrentItemCategory.parentName
                            };
                        }
                    }
                    $scope.errors = null;
                    $scope.addItemCategoryForm = {};
                    $scope.saveItemCategory = function(){
                        $scope.errors = null;
                        if($scope.addItemCategoryForm.validator.form()){
                            if($scope.itemCategory.id){
                                ItemCategoryAPI.update($scope.itemCategory, function(){
                                    $modalInstance.close();
                                }, function(data){
                                    $scope.errors = data.data;
                                })
                            }else{
                                ItemCategoryAPI.save($scope.itemCategory, function(){
                                    $modalInstance.close();
                                }, function(data){
                                    $scope.errors = data.data;
                                })
                            }
                        }
                    };
                    $scope.cancel = function () {
                        $modalInstance.dismiss('cancel');
                    };
                }]
            });
            modalInstance.result.then(function () {
                $scope.getItemCategoryTree();
            });
        };

        $scope.getItemCategoryTree();

        loadScript("js/plugin/bootstraptree/bootstrap-tree.min.js");
    }];
});