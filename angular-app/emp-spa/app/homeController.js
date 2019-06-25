angular.module("emp.app")
    .controller('homeController', [
        '$scope','empService',
        function ($scope,empService) {
            $scope.empList = empService.getEmployees();

            $scope.deleteClicked = function(index){
                empService.removeEmployee(index);
            }
        }
    ]);