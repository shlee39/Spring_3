/**
 * 
 */

let check = document.getElementsByClassName("check")
let all = document.getElementById("all");

function check(){
	alert("check");
	
	//
	let result = true;
	
	for(ch of check){
		if(!ch.checked){
			//4개 중 하나라도 false가 있는지 검사
			result=false;
			break;
		}
	}
	
	all.checked=result;
	
}