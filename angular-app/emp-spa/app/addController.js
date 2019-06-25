angular.module("emp.app")
    .controller('addController', [
        '$scope','$location','empService','$rootScope',
        function ($scope,$location,empService,$rootScope) {
            if($rootScope.loginStatus!= true){
                $location.path('/');
                return;
            }

            $scope.addClicked = function(){
                console.log($scope.designation);
                let newEmp = {
                    "name" : $scope.name,
                    "salary": $scope.salary,
                    "doj": $scope.doj,
                    "designation": $scope.designation
                }
                empService.addEmployee(newEmp);
                $location.path('#!/');
            }
        }
    ]);