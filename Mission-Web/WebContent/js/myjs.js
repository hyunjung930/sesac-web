/**
 * 내가 만든 이것저것 함수들 
 */
// Form에서 입력데이터 유무 체크 
function isNull(obj, msg) {// 아이디를 입력하는 것에 대한 함수를 만든다.
		if (obj.value == '') {
			alert(msg)
			obj.focus()
			return true
		}
		return false
	}