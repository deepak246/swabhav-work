class Customer{
    private _id: Number;
    private _firstname: String;
    private _lastname: String;

    constructor (id:number, firstname:String, lastname:String) {
        this._id = id;
        this._firstname = firstname;
        this._lastname = lastname;
    }

    public get FirstName(){
        return this._firstname;
    }

    public set FirstName(fname){
        this._firstname = fname;
    }

}

let c1 = new Customer(101,"abc","xyz");

console.log(c1.FirstName);
c1.FirstName = "x";
console.log(c1.FirstName);