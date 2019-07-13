import { Component } from "@angular/core";
import { StudentService } from '../studentService/studentService';
import { Router } from '@angular/router';

@Component({
    selector: 'add-student',
    templateUrl: 'addStudent.component.html'
})

export class AddStudentComponent {
    rollNo: String;
    name: string;
    email: string;
    gender: string;
    date: string;
    age: string;
    result: any;
    constructor(private studSvc: StudentService, private router: Router) {

    }
    addData() {
        let studObj = {
            rollNo: this.rollNo,
            name: this.name,
            email: this.email,
            isMale: this.gender,
            date: this.date,
            age: this.age
        }

        this.studSvc.addStudent(studObj)
            .then((r)=>{
                this.result = r;
                //alert('data added successfully');
                this.router.navigate(['/home']);
            })
            .catch((e)=>{
                this.result = e;
            })

        console.log(this.rollNo + " " + this.name + " " + this.email + " " + this.gender + " " + this.date + " " + this.age);
    }
}