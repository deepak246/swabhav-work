
let ip = "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/";

let fetchStudentData = function(){
    return new Promise(function(resolve,reject){
    //console.log("hello");
        $.ajax({
            type: "GET",
            url: ip,
            success: (result) =>{
                resolve(result);
            }
        })
    })
}

let saveStudentData = function(stud){
    return new Promise(function(resolve,reject){
        $.ajax({
            type:"POST",
            url: ip,
            success: (result)=>{
                resolve(result);
            },
            data: stud
        })
    })
}

let deleteStudentData = function(studId){
    return new Promise(function(resolve,reject){
        $.ajax({
            type: "DELETE",
            url: ip+studId,
            success: (result)=>{
                resolve(result);
            }
        })
    })
}

let updateStudentData = function(studId,stud){
   return new Promise(function(resolve,reject){
        $.ajax({
            type: "PUT",
            url: ip+studId,
            success: (result)=>{
                resolve(result);
            },
            data: stud
        })
    })
}