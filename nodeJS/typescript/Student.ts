export class Student{
    constructor(private rollno, private firstName, private cgpa){
        this.rollno = rollno;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public get RollNo(){
        return this.rollno;
    }

    public get FirstName(){
        return this.firstName;
    }

    public get Cgpa(){
        return this.cgpa;
    }
}

export class Address{
    constructor(private city){

    }

    public get City(){
        return this.city;
    }
}