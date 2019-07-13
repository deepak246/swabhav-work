import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'SnakeCasePipe'
})

export class SnakeCasePipe implements PipeTransform{
    words: String[];
    result: String = "";
    transform(value: String): String{
        console.log(value);
        if(value!=null){
            this.result = "";
            this.words = value.split(" ");
            for(let i=0;i<this.words.length-2;i++){
                this.words[i] = this.words[i] + "_";
                this.result = this.result + "" + this.words[i]; 
            }
            this.result = this.result + "" + this.words[this.words.length-1]; 
        }
        return this.result;
    }
}