import { Injectable } from "@angular/core";

import { HttpClient } from '@angular/common/http';

@Injectable()
export class NumbersApiService {
    constructor(private http: HttpClient) {
        console.log("numbers api service created");
    }

    getFacts(no){
        console.log("number = "+no);
        return this.http.get("http://numbersapi.com/" + no, {responseType:'text'})
            .toPromise();   
    }
}