import { Component } from '@angular/core';
@Component({
    selector: 'aurionpro-welcome',
    templateUrl: 'welcome.component.html'
})

export class WelcomeComponent {
    msg: String;
    myText: String;
    fontSize: String;
    fontStyle: String;
    backgroundColor: String;
    fontColor: String;
    myOnColor: String = "green";
    myOffColor: String = "red";
    constructor() {
        this.msg = "welcome to my Angular Component";
        this.myText = "btn hello"
    }

    clickHandler(e){
        console.log("event = "+e);
    }
}