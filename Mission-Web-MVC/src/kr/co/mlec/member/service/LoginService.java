package kr.co.mlec.member.service;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.member.dao.LoginDAO;
import kr.co.mlec.member.vo.LoginVO;

public class LoginService {

	
	private LoginDAO loginDao;
	private BoardDAO boardDao;	//여러개의 DAO들이 올 수 있다.
	
	
	public LoginService() {
		loginDao = new LoginDAO();
		
	}
	public LoginVO login(LoginVO loginVO) {
		return loginDao.login(loginVO);
		
	}
}
