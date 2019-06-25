angular.module("acme.app")
    .controller('productDetailsController', [
        '$scope', 'productDataService', '$routeParams',
        function ($scope, productDataService, $routeParams) {

            $scope.index = $routeParams.id;
            console.log("Index = "+$scope.index);
            productDataService.getProductsList()
                .then((r) => {
                    $scope.products = r;
                    //console.log($scope.products);
                    //console.log("product details:"+$scope.products[$scope.index].productName);
                    $scope.productName = $scope.products[$scope.index].productName;
                    $scope.productCode = $scope.products[$scope.index].productCode;
                    $scope.description = $scope.products[$scope.index].description;
                    $scope.releaseDate = $scope.products[$scope.index].releaseDate;
                    $scope.price = $scope.products[$scope.index].price;
                    $scope.starRating = $scope.products[$scope.index].starRating;
                    $scope.imageUrl = $scope.products[$scope.index].imageUrl;
                })
                .catch((e) => {
                    $scope.products = e;
                })
            
            //console.log("product details:"+products[$scope.index]);

        }
    ]);