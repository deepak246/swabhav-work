import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DisplayStudentsComponent } from './displayStudents/displayStudents.component';
import { StudentService } from './studentService/studentService';
import { HttpClientModule } from '@angular/common/http';
import { GenderPipe } from './studentService/gender.pipe';
import { AddStudentComponent } from './addStudent/addStudent.component';
import {FormsModule} from '@angular/forms';
import { EditStudentComponent } from './editStudent/editStudent.component';
import { SearchPipe } from './studentService/search.pipe';


@NgModule({
  declarations: [
    AppComponent,
    DisplayStudentsComponent,
    GenderPipe,
    AddStudentComponent,
    EditStudentComponent,
    SearchPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
