console.log("welcome to node");

//console.log(window);
console.log(this);

f1();

function f1(){
    console.log("inside f1()");
}

//f2();
let f2 = function(){
    console.log("inside f2()");
}

f2();

//console.log(global);