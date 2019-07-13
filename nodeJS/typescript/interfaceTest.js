function printCustomer(customers) {
    for (let c of customers) {
        console.log(c.firstname);
    }
}
printCustomer([
    { id: '101', firstname: "abc", lastname: "xyz" }
]);
