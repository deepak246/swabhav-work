import { Component } from "@angular/core";

@Component({
    selector: 'aurionpro-home',
    templateUrl: 'home.component.html'
})
export class HomeComponent{
    home: string;
    constructor(){
        this.home = "Home";
    }
}