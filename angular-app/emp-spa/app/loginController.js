angular.module("emp.app")
    .controller('loginController', [
        '$scope', '$location', '$rootScope','$window',
        function ($scope, $location, $rootScope,$window) {

            $rootScope.logoutClicked = function () {
                $rootScope.loginStatus = false;
                $rootScope.username = "";
                $rootScope.pwd = "";
                $window.sessionStorage.username = "";
                $window.sessionStorage.pwd = "";
                alert('You have successfully logged out');
                $location.path('/');
            }

            $scope.loginClicked = function () {
                if ($scope.username == "admin" && $scope.pwd == "123") {
                    $rootScope.loginStatus = true;
                    $rootScope.username = $scope.username;
                    $rootScope.pwd = $scope.pwd;
                    $window.sessionStorage.username = $scope.username;
                    $window.sessionStorage.pwd = $scope.pwd;
                    console.log($scope.loginStatus)
                    alert("Logged In Successfully")
                    $location.path('/');
                }
                else {
                    alert("Username or password Invalid");
                }
            }
            $rootScope.checkStatus = function(){
                if($window.sessionStorage.username=="admin" && $window.sessionStorage.pwd=="123"){
                    $rootScope.loginStatus = true;
                    $scope.username = $window.sessionStorage.username;
                    $scope.pwd = $window.sessionStorage.pwd;
                }
            }

        }
    ])