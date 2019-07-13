import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'genderPipe'
})

export class GenderPipe implements PipeTransform{
    //gender: string = "";
    transform(isMale:boolean): string {
        if(isMale==true){
            return "Male";
        }
        return "female";
    }
}