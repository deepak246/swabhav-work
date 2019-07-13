import { Component } from "@angular/core";

@Component({
    selector: 'page-not-found',
    templateUrl: 'pageNotFound.component.html'
})
export class PageNotFoundComponent{
    noPage: string;
    constructor(){
        this.noPage = "Page Not Found";
    }
}