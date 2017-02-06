// var my_var = func

console.log("user 1 made a request");
setTimeout(callBack,5000);
// console.log("database request takes 5 sec");
// console.log("database delievers");

console.log("user 2 made a request");
setTimeout(callBack,5000);
// console.log("database request takes 5 sec");
// console.log("database delievers");


console.log("user 3 made a request");
setTimeout(callBack,5000);
// console.log("database request takes 5 sec");
// console.log("database delievers");
function callBack()
{
	console.log("Queried database and database delievered in 5 sec ");

}
