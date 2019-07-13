import { Component } from "@angular/core";

@Component({
    selector: 'aurionpro-career',
    templateUrl: 'career.component.html'
})
export class CareerComponent{
    career: string;
    constructor(){
        this.career = "Career";
    }
}