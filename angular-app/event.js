/*angular.module('modStudent', [])
.controller('controllerStud', function ($scope, $timeout) {


    $scope.load = function () {

        $scope.student = {
            id: 1,
            name: "deepak",
            cgpa: 9.99,
            image: "101400.png"
        }

        $timeout(function () {
            $scope.student = {
                id: 1,
                name: "yogita",
                cgpa: 10,
                image: "101400.png"
            }
        }, 5000);

    }
});
*/

angular.module("modStudent", [])
    .controller('controllerStud', [
        '$scope', '$timeout',
        function ($scope, $timeout) {
            $scope.load = function () {

                $scope.student = {
                    id: 1,
                    name: "deepak",
                    cgpa: 9.99,
                    image: "101400.png"
                }

                $timeout(function () {
                    $scope.student = {
                        id: 1,
                        name: "yogita",
                        cgpa: 10,
                        image: "101400.png"
                    }
                }, 5000);

            }
        }
    ])