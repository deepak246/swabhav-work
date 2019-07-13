import { Routes } from '@angular/router';
import { DisplayStudentsComponent } from './displayStudents/displayStudents.component';
import { AddStudentComponent } from './addStudent/addStudent.component';
import { EditStudentComponent } from './editStudent/editStudent.component';

export const route: Routes=[
    {path:'home', component:DisplayStudentsComponent},
    {path:'add', component:AddStudentComponent},
    {path:'edit/:id', component:EditStudentComponent},
    {path:'',redirectTo:'/home',pathMatch:'full'}

]