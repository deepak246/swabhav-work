interface ICustomer{
    id: String;
    firstname: String;
    lastname: String;
}

function printCustomer(customers:ICustomer[]){
    for(let c of customers){
        console.log(c.id);
        console.log(c.firstname);
        console.log(c.lastname);
    }
}

printCustomer([
    {id:'101',firstname: "abc",lastname: "xyz"},
    {id:'102',firstname: "deepak",lastname: "gupta"}
])