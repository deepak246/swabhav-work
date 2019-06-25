angular.module('spa.app', ['ngRoute'])
    .config(['$routeProvider',
        function ($routeProvider) {
            $routeProvider
                .when('/', {
                    templateUrl: "fragments/history.html",
                    controller: "historyController"
                })
                .when('/politics', {
                    templateUrl: "fragments/politics.html",
                    controller: "politicsController"
                })
                .when('/places', {
                    templateUrl: "fragments/places.html",
                    controller: "placesController"
                })
        }])

    .controller('historyController', [
        '$scope',
        function ($scope) {
            $scope.history = {
                "data": "HISTORY: Lorem ipsum dolor sit amet consectetur adipisicing elit. Laudantium dolorem aliquam dignissimos sint unde sed nisi, esse fuga ex officiis. Similique dolorem consequuntur aliquid ullam. Consequuntur tenetur veniam praesentium repellendus."
            }
        }
    ])
    .controller('politicsController', [
        '$scope',
        function ($scope) {
            $scope.politics = {
                "data": "POLITICS: Lorem ipsum dolor sit amet consectetur adipisicing elit. Laudantium dolorem aliquam dignissimos sint unde sed nisi, esse fuga ex officiis. Similique dolorem consequuntur aliquid ullam. Consequuntur tenetur veniam praesentium repellendus."
            }
        }
    ])
    .controller('placesController', [
        '$scope',
        function ($scope) {
            $scope.places = {
                "data": "PLACES: Lorem ipsum dolor sit amet consectetur adipisicing elit. Laudantium dolorem aliquam dignissimos sint unde sed nisi, esse fuga ex officiis. Similique dolorem consequuntur aliquid ullam. Consequuntur tenetur veniam praesentium repellendus."
            }

        }
    ])
