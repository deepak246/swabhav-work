import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from '../app-routing.module';
import { WelcomeComponent } from '../welcome/welcome.component';
import { StudentComponent } from '../student/student.component';
import { BlueballComponent } from '../blueball/blueball.component';
import { MultiBindComponent } from '../multibinding/multibind.component';
import { MathService } from '../services/MathService';
import { NumbersApiService } from '../services/NumbersApiService';
import { SnakeCasePipe } from '../services/snakecase.pipe';
import { BtnToggleComponent } from '../btntoggle/btntoggle.component';
import { BtnRatingComponent } from '../btnrating/btnrating.component';


@NgModule({ declarations: [
    WelcomeComponent,
    StudentComponent,
    BlueballComponent,
    MultiBindComponent,
    SnakeCasePipe,
    BtnToggleComponent,
    BtnRatingComponent
],
imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
],
providers: [MathService, NumbersApiService],
bootstrap: [WelcomeComponent]

})

export class WelcomeModule{

}