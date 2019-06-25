angular.module("acme.app")
    .controller('productListController', [
        '$scope', 'productDataService',
        function ($scope, productDataService) {
            // $scope.empList = empService.getEmployees();
            productDataService.getProductsList()
                .then((r) => {
                    $scope.products = r;
                    console.log($scope.products);
                })
                .catch((e) => {
                    $scope.products = e;
                })

            $scope.imgBtnName = "Show Image";
            $scope.imgStatus = true;
            $scope.imgBtnClicked = function () {
                if ($scope.imgBtnName == "Show Image") {
                    $scope.imgBtnName = "Hide Image";
                    $scope.imgStatus = false;
                    return;
                }
                if ($scope.imgBtnName == "Hide Image") {
                    $scope.imgBtnName = "Show Image"
                    $scope.imgStatus = true;
                    return;
                }
            }
        }
    ]);