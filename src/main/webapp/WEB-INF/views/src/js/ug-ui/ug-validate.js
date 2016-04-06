/**
 * Created by Jeng on 2015/12/17.
 */
/*jshint globalstrict:true*/
/*global angular:false*/
(function(){
    // Create global xmg obj and its namespaces
    // build processes may have already created an xmg obj
    window.ug = window.ug || {};
    window.ug.version = '1.0.0';
    (function(angular){
        'use strict';
        /**
         * 校验规则表达式
         */
        var Regex_Rules = {
            telephoneRegex:{
                name:"telephone",
                regex: /^(1)[0-9]{10}$/,
                message:"请输入有效的手机号码"
            },
            chinaZipRegex:{
                name:"chinaZip",
                regex: /^\d{6}$/,
                message:"请输入有效邮政编码"
            },
            chineseRegex:{
                name: "chinese",
                regex: /^[\u4E00-\u9FFF]+$/,
                message:"请输入中文汉字"
            },
            chinaIdRegex:{
                name:"chinaId",
                regex: /^[1-9]\d{5}[1-9]\d{3}(((0[13578]|1[02])(0[1-9]|[12]\d|3[0-1]))|((0[469]|11)(0[1-9]|[12]\d|30))|(02(0[1-9]|[12]\d)))(\d{4}|\d{3}[xX])$/,
                message:"请输入有效身份证号码"
            },
            notSpecialCharacterRegex:{
                name:"notSpecialCharacter",
                regex: /^[A-Za-z0-9]+$/,
                message:"请输入大小写字母或数字"
            }
        };

// 校验框架
        var $ugValidate = ["$ugValidateDefault", function( $ugValidateDefault) {
            return {
                restrict: 'A',
                scope:{
                    ugValidate:"="
                },
                require:"form",
                link: function(scope, element, attr) {
                    var option = angular.extend($ugValidateDefault, scope.ugValidate);
                    scope.ugValidate.validator = $(element).validate(option);
                    angular.extend(scope.ugValidate, option);
                }
            };
        }];
        /**
         * 校验框架
         */
        angular.module('ug.validate', ["ng"])
            .constant("Regex_Rules", Regex_Rules)
            .constant("$ugValidateDefault", {
                errorElement: "div",
                errorClass:"error"
            })
            .factory("$ugValidateProvider", function () {
                return {
                    setDefaults: function (options) {
                        $.validator.setDefaults(options);
                    },
                    addMethod: function (name, func, errorText) {
                        $.validator.addMethod(name, func, errorText);
                    }
                }
            })
            .run(["$ugValidateProvider", "Regex_Rules", function($ugValidateProvider, Regex_Rules){
                // 中文
                $ugValidateProvider.addMethod(Regex_Rules.chineseRegex.name, function(value,element,params){
                    var ruleRegex = new RegExp(Regex_Rules.chineseRegex.regex);
                    if(ruleRegex.test(value)){
                        return true;
                    }else{
                        return false;
                    }
                }, Regex_Rules.chineseRegex.message);

                // 身份证
                $ugValidateProvider.addMethod(Regex_Rules.chinaIdRegex.name, function(value,element,params){
                    var ruleRegex = new RegExp(Regex_Rules.chinaIdRegex.regex);
                    if(ruleRegex.test(value)){
                        return true;
                    }else{
                        return false;
                    }
                }, Regex_Rules.chinaIdRegex.message);

                // 手机号码
                $ugValidateProvider.addMethod(Regex_Rules.telephoneRegex.name, function(value,element,params){
                    var ruleRegex = new RegExp(Regex_Rules.telephoneRegex.regex);
                    if(ruleRegex.test(value)){
                        return true;
                    }else{
                        return false;
                    }
                }, Regex_Rules.telephoneRegex.message);
            }])
            .directive('ugValidate', $ugValidate);

    }(angular));
})();