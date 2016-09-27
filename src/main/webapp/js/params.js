function arrayTest(){
	var array = [1,2,3,4,5,6];
	$.ajax({
		url : "/spring-web/params/arrayTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify(array),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}

function objectArrayTest(){
	var array = [1,2,3,4,5,6];
	$.ajax({
		url : "/spring-web/params/objectArrayTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify({array:array}),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}


function mapTest(){
	var map = {name:'tom',sex:'男'};
	$.ajax({
		url : "/spring-web/params/mapTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify(map),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}

function objectMapTest(){
	var map = {name:'tom',sex:'男'};
	$.ajax({
		url : "/spring-web/params/objectMapTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify({map:map}),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}


function listTest(){
	var list = [1,2,3,4,5,6,7,8,9];
	$.ajax({
		url : "/spring-web/params/listTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify(list),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}

function objectListTest(){
	var list = [1,2,3,4,5,6,7,8,9];
	$.ajax({
		url : "/spring-web/params/objectListTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify({list:list}),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}


function setTest(){
	var set = [1,2,3,4,5,6,7,8,9];
	$.ajax({
		url : "/spring-web/params/setTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify(set),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}


function objectSetTest(){
	var set = [1,2,3,4,5,6,7,8,9];
	$.ajax({
		url : "/spring-web/params/objectSetTest",
		dataType : "json",
		contentType : "application/json",
		data : JSON.stringify({set:set}),
		type : "POST",
		success : function(data) {
			
		},
		error : function(err) {
			
		}
	});
}