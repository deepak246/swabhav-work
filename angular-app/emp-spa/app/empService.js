angular.module("emp.app")
    .factory('empService', function () {
        var obj = {};

        var employees = [
            {
                "name": "deepak",
                "salary": 85000,
                "doj": "1/1/2019",
                "designation": "Developer"
            },
            {
                "name": "abhishek",
                "salary": 60000,
                "doj": "1/1/2019",
                "designation": "Analyst"
            },
            {
                "name": "yo",
                "salary": 8000,
                "doj": "1/1/2019",
                "designation": "Developer"
            },
            {
                "name": "yo",
                "salary": 8000,
                "doj": "1/1/2019",
                "designation": "Developer"
            }

        ]
        obj.getEmployees = function(){
            return employees;
        }
        obj.addEmployee = function(emp){
            //console.log()
            employees.push(emp);
        }
        obj.removeEmployee = function(id){
            employees.splice(id,1);
        }
        obj.updateEmployee = function(id){

        }

        return obj;
    });
