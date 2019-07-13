import { Injectable } from '@angular/core';

@Injectable()
export class MathService{
    constructor(){
        console.log("mathservice created");
    }

    cubeEvenNo(no){
        console.log("no");
        return new Promise((resolve,reject)=>{
            if(no%2==0){
                resolve(no*no*no);
            }
            else{
                reject('not an even number');
            }
        })
    }
}