import { Component, Input, Output } from "@angular/core";
import { EventEmitter } from '@angular/core';

@Component({
    selector: 'btn-toggle',
    templateUrl: 'btntoggle.component.html'
})

export class BtnToggleComponent{
    @Input()
    valueForText:String;
    @Input()
    onColor:string;
    @Input()
    offColor:string;
    myColor: string;
    @Output()
    stateChange:EventEmitter<String>;
    
    status: boolean = false;
    constructor(){
        console.log("inside constructor");
        this.valueForText="";
        this.onColor="";
        this.stateChange = new EventEmitter<String>();
    }
    onInit(){
        console.log("inside init");
        console.log(this.valueForText);
    }

    clickHandler(e){
        console.log(e);
        console.log("clicked");
        if(this.status==false){
            this.status = true;
            this.myColor = this.onColor; 
            this.stateChange.emit('statechange firing: ON');
        }
        else{
            this.status = false;
            this.myColor = this.offColor;
            this.stateChange.emit('statechange firing: OFF');
        }
        
    }
}