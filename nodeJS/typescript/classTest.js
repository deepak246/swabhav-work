class Customer {
    constructor(id, firstname, lastname) {
        this._id = id;
        this._firstname = firstname;
        this._lastname = lastname;
    }
    get FirstName() {
        return this._firstname;
    }
    set FirstName(fname) {
        this._firstname = fname;
    }
}
let c1 = new Customer(101, "abc", "xyz");
console.log(c1.FirstName);
c1.FirstName = "x";
console.log(c1.FirstName);
