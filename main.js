var date1 = new Date();
function forLoop(){
    for(var tmp = 0; tmp <= 1000000; tmp++){
        var a = 22
        var b = 7
        c = a/b
        d = c/b
        console.log(d)
    }
}

async function asyncCall() {
    console.log('calling');
    var result = await forLoop();
    console.log(result);
}
asyncCall()
var date2 = new Date();
console.log("\nStart at : ")
console.log(date1)
console.log("\nFinished at : ")
console.log(date2)
console.log("\nTime taken : ")
var dTime = date2.getTime() - date1.getTime();
console.log(dTime)