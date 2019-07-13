"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(rollno, firstName, cgpa) {
        this.rollno = rollno;
        this.firstName = firstName;
        this.cgpa = cgpa;
        this.rollno = rollno;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
    Object.defineProperty(Student.prototype, "RollNo", {
        get: function () {
            return this.rollno;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "FirstName", {
        get: function () {
            return this.firstName;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "Cgpa", {
        get: function () {
            return this.cgpa;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var Address = /** @class */ (function () {
    function Address(city) {
        this.city = city;
    }
    Object.defineProperty(Address.prototype, "City", {
        get: function () {
            return this.city;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
