var connect = require('connect');
var http = require('http');

var app = connect();

/*function doOne(request, response, next){
	console.log("do One");
	next();
}

function doTwo(request, response){
	console.log("do Two");
}

app.use(doOne);
app.use(doTwo);*/

function about(request, response){
	console.log("사용자가 about 페이지를 요청했습니다.")
}
function email(request, response){
	console.log("사용자가 email 페이지를 요청했습니다.")
}

app.use("/about", about);
app.use("/email", email);

http.createServer(app).listen(8888);
console.log("서버가 작동 중 입니다.")

