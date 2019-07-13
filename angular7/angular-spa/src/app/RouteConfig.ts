import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { CareerComponent } from './career/career.component';
import { PageNotFoundComponent } from './pageNotFound/pageNotFound.component';
import { CareerWithParamComponent } from './careerWithParam/careerWithParam.component';

export const route: Routes=[
    {path:'home', component:HomeComponent},
    {path:'about',component:AboutComponent},
    {path:'career',component:CareerComponent},
    {path:'careerWithParam/:id',component:CareerWithParamComponent},
    {path:'',redirectTo:'/home',pathMatch:'full'},
    { path: '**', component: PageNotFoundComponent }
]