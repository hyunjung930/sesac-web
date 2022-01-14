package kr.co.mlec.member.vo;

public class LoginVO {

	private String id;
	private String password;
	private String type;		//"s" : 관리자, "u": 일반 사용자
	
	public LoginVO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LoginVO [id=" + id + ", password=" + password + ", type=" + type + "]";
	}
	
	
	
	
}
