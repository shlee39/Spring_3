/**
 * 
 */

function check(){
	alert("check");
	let check = document.getElementsByClassName("check")
	const all = document.getElementById("all");
	
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