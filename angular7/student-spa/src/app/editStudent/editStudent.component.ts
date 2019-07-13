import { Component } from "@angular/core";
import { StudentService } from '../studentService/studentService';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: 'edit',
    templateUrl: 'editStudent.component.html'
})

export class EditStudentComponent {
    student: any = {};
    id: String;
    constructor(private studSvc: StudentService, private router: Router,
        private route: ActivatedRoute) {
        this.route.paramMap.subscribe( params => (this.id=params.get("id")));
        this.getStudentById(this.id);
        //this.student = studObj;
        //console.log(this.student);
    }

    getStudentById(id) {
        this.studSvc.getStudentById(id)
            .then((r) => {
                this.student = r[0];
                console.log(this.student);
                this.student.isMale = this.student.isMale.toString();
            })
            .catch((e)=>{
                this.student = e;
            })
    }

    updateData() {
        this.studSvc.updateStudent(this.id, this.student)
            .then((r) => {
                //this.result = r;
                console.log(r);
                //this.displayStudents();
                this.router.navigate(['/home']);
            })
            .catch((e) => {
                //this.result = e;
            })
    }
}
