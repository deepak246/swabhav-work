import { Component } from "@angular/core";
import { StudentService } from '../studentService/studentService';
import { Router } from '@angular/router';

@Component({
    selector: 'display-students',
    templateUrl: 'displayStudents.component.html'
})

export class DisplayStudentsComponent {
    msg: String;
    result: any;
    resultLength: number;
    id: string;
    name: string;
    email: string;
    age: string;
    isMale: boolean;
    date: string;

    constructor(private stdsvc: StudentService, private router: Router) {
        this.msg = "display students";
        this.displayStudents();
    }

    displayStudents() {
        this.stdsvc.getStudents()
            .then((r) => {
                this.result = r;
                this.resultLength = this.result.length;
            })
            .catch((e) => {
                this.result = e;
            })
    }

    deleteStudent(id) {
        this.stdsvc.deleteStudent(id)
            .then((r) => {
                //this.result = r;
                console.log(r);
                this.displayStudents();
            })
            .catch((e) => {
                //this.result = e;
            })
    }

}

