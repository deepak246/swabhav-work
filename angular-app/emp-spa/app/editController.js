angular.module("emp.app")
    .controller('editController', [
        '$scope', 'empService', '$routeParams', '$location', '$rootScope',
        function ($scope, empService, $routeParams, $location, $rootScope) {
            //$scope.empList = "hello";

            if ($rootScope.loginStatus != true) {
                //console.log("hello");
                $location.path('/');
                return;
            }

            $scope.index = $routeParams.id;
            $scope.empList = empService.getEmployees();
            $scope.name = $scope.empList[$scope.index].name;
            $scope.salary = $scope.empList[$scope.index].salary;
            $scope.doj = $scope.empList[$scope.index].doj;
            $scope.designation = $scope.empList[$scope.index].designation;
            console.log($scope.designation);

            $scope.updateClicked = function () {
                let newEmp = {
                    "name": $scope.name,
                    "salary": $scope.salary,
                    "doj": $scope.doj,
                    "designation": $scope.designation
                }

                $scope.empList[$scope.index] = newEmp;
                $location.path('/');
            }
        }
    ]);