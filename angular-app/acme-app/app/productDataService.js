angular.module("acme.app")
    .factory('productDataService', [
        '$q', '$http',
        function ($q, $http) {
            var obj = {};

            obj.getProductsList = function () {
                return $q((resolve, reject) => {
                    $http({
                        method: "GET",
                        url: "http://localhost/angular-app/acme-app/products.json"
                    })
                        .then(function (response) {
                            resolve(response.data);
                            //console.log(response);
                        },
                            function (response) {
                                reject(response.statusText);
                            })
                })
            }

            return obj;
        }
    ])
    .directive('starRating', function () {
        var directive = {
            restrict: 'E',
            //scope: {product: '='},
            template: '<i class="fa fa-star-half" aria-hidden="true"></i>'           
        }
        return directive;
    })

    .filter('starFilter', function ($sce) {
        return function (input) {
            let images = "";
            let index;
            for (index = 1; index < input; index++) {
                images = images + '<i class="fa fa-star" aria-hidden="true"></i>';
            }
            index--;
            let temp = input - index;
            if (temp > 0) {
                index++;
                images = images + '<i class="fa fa-star-half" aria-hidden="true"></i>';
            }
            return $sce.trustAsHtml(images);
        }
    })