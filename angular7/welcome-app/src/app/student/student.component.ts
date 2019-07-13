import { Component } from "@angular/core";
import { IStudent } from "./IStudent";
import { ICourse } from './ICourse';

@Component({
    selector: 'aurionpro-student',
    templateUrl: 'student.component.html'
})

export class StudentComponent {
    student: IStudent;
    courses: ICourse[];
    constructor() {
        this.student = {
            name: "deepak",
            cgpa: 9.99,
            location: "Mumbai",
            profilePic: "../../assets/download.jpg"
        };
        
    }

    loadCourses(e) {
        console.log(e);
        this.courses = [
            {
                courseId: 101,
                courseName: "java",
                fees: 5000
            },
            {
                courseId: 102,
                courseName: ".net",
                fees: 2000
            }
        ];
    }

    nameChange(newValue){
        console.log(newValue);
        this.student.name = newValue;
    }

    convertCgpaToColor() {
        if (this.student.cgpa <= 6) {
            return 'red';
        }
        if (this.student.cgpa > 6 && this.student.cgpa <= 8) {
            return 'yellow';
        }
        return 'green';
    }
}