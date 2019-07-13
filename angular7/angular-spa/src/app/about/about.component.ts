import { Component } from "@angular/core";

@Component({
    selector: 'aurionpro-about',
    templateUrl: 'about.component.html'
})
export class AboutComponent{
    about: string;
    constructor(){
        this.about = "About Us";
    }
}