/**
 * Created by Jeng on 2016/1/8.
 */
define(function () {
    return ["$scope", "CouponAPI", "$modal", "$ugDialog", function($scope, CouponAPI, $modal, $ugDialog){
        $scope.couponList = [];
        $scope.pageSetting = {
            pageSize:10,
            pageNum:1
        };
        $scope.queryParam = {};
        $scope.getCouponList = function(){
            CouponAPI.query({
                limit:$scope.pageSetting.pageSize,
                offset:$scope.pageSetting.pageNum,
                keyword:$scope.queryParam.keyword
            }, function(data){
                $scope.couponList = data.data;
                $scope.pageInfoSetting = data.pageInfo;
                $scope.pageInfoSetting.loadData = $scope.getCouponList;
            });
        };
        $scope.removeCoupon = function(index){
            $ugDialog.confirm("是否删除此卡券？").then(function(){
                CouponAPI.delete({
                    id: $scope.couponList[index].id
                }, function(){
                    $scope.getCouponList();
                });
            })
        };
        $scope.updateCoupon = function(index){
            $scope.open(angular.copy($scope.couponList[index]));
        };
        $scope.open = function (coupon) {
            var modalInstance = $modal.open({
                templateUrl: 'addCoupon.html',
                resolve: {
                    CurrentCoupon: function(){
                        return coupon;
                    }
                },
                controller: ["$scope", "CouponAPI","CouponCategoryAPI","CurrentCoupon", "$modalInstance", function ($scope, CouponAPI,CouponCategoryAPI, CurrentCoupon, $modalInstance) {
                    $scope.coupon = {
                        couponType : 1,
                        isUsed : 0,
                        isUseful : 1,
                        isGift : 0
                    };
                    if(CurrentCoupon){
                        $scope.coupon = CurrentCoupon;
                    }
                    $scope.getCategoryList = function(){
                        $scope.pageSetting = {
                            pageSize:1000,
                            pageNum:1
                        };
                        $scope.queryParam = {};
                        $scope.categoryList = [];
                        CouponCategoryAPI.query({
                            limit:$scope.pageSetting.pageSize,
                            offset:$scope.pageSetting.pageNum,
                            categoryType :$scope.coupon.couponType
                        }, function(data){
                            $scope.categoryList = data.data;
                            $scope.pageInfoSetting = data.pageInfo;
                            $scope.pageInfoSetting.loadData = $scope.getCategoryList;
                        });
                    }
                    $scope.getCategoryList();
                    $scope.datepickerSetting = {
                        datepickerPopupConfig:{
                            "current-text":"今天",
                            "clear-text":"清除",
                            "close-text":"关闭"
                        },
                        beginTime:{
                            opened:false
                        },
                        endTime:{
                            opened:false
                        }
                    };
                    $scope.open = function($event, index) {
                        $event.preventDefault();
                        $event.stopPropagation();
                        if(index == 0){
                            $scope.datepickerSetting.beginTime.opened = true;
                        }else if(index == 1){
                            $scope.datepickerSetting.endTime.opened = true;
                        }
                    };
                    $scope.errors = null;
                    $scope.addCouponForm = {};
                    $scope.saveCoupon = function(){
                        $scope.errors = null;
                        if($scope.addCouponForm.validator.form()){
                            if($scope.coupon.id){
                                CouponAPI.update($scope.coupon, function(){
                                    $modalInstance.close();
                                }, function(data){
                                    $scope.errors = data.data;
                                })
                            }else{
                                CouponAPI.save($scope.coupon, function(){
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

                    $scope.selectCategory = function(){
                        $scope.coupon.couponCategory = null;
                        if($scope.coupon.couponType == 2){
                             $scope.coupon.couponValue = 1;
                         }else{
                             $scope.coupon.couponValue = "";
                         }
                        $scope.getCategoryList();
                    };
                }]
            });
            modalInstance.result.then(function () {
                $scope.getCouponList();
            });
        };

        $scope.getCouponList();
    }];
});