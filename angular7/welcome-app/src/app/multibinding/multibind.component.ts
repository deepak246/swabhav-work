import { Component } from '@angular/core';
import { MathService } from '../services/MathService';
import { NumbersApiService } from '../services/NumbersApiService';
@Component({
    selector: 'multi-bind',
    templateUrl: './multibind.component.html'
})

export class MultiBindComponent {
    msg: String;
    result: any;
    no: number;
    constructor(private apisvc: NumbersApiService) {
        this.msg = "welcome to my Angular Component";
    }

    getNumFacts(no) {
        if(no==null){
            this.result = "Plz Plz...Enter number";
            return;
        }
        this.apisvc.getFacts(no)
            .then((r)=>{
                this.result = r;
            })
            .catch((e)=>{
                this.result = e;
            })
    }
}