import { Component } from "@angular/core";
import { ActivatedRoute } from '@angular/router';

@Component({
    selector: 'career-with-param',
    templateUrl: 'careerWithParam.component.html'
})
export class CareerWithParamComponent{
    careerParam: string;
    id:String;
    constructor(private route:ActivatedRoute){
        this.route.paramMap.subscribe( params => (this.id=params.get("id")));
        //this.id = this.route.snapshot.paramMap.get("id");
        this.careerParam = "Career with Param";
    }
}