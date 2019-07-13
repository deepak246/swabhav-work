import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class StudentService {
    constructor(private http: HttpClient) {

    }
    getStudents() {
        return this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/", { responseType: 'json' })
            .toPromise();
    }

    getStudentById(id) {
        return this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id, { responseType: 'json' })
            .toPromise();
    }

    addStudent(studObj) {
        return this.http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",studObj, { responseType: 'json' })
            .toPromise();
    }

    deleteStudent(id){
        return this.http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id)
            .toPromise();
    }

    updateStudent(id, studObj){
        return this.http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id, studObj)
            .toPromise();
    }
}