
angular.module('acme.app', ['ngRoute'])
.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: "fragments/welcome.html",
                controller: "welcomeController"
            })
            
            .when('/productList', {
                templateUrl: "fragments/productList.html",
                controller: "productListController"
            })
            .when('/productDetails:id', {
                templateUrl: "fragments/productDetails.html",
                controller: "productDetailsController"
            })
            .otherwise('/',{
                redirectTo : '/'
                //templateUrl: "fragments/home.html",
                //controller: "homeController"
            })
            
    }
])