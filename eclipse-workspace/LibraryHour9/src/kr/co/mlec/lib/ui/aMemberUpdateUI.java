package kr.co.mlec.lib.ui;

import kr.co.mlec.lib.dao.aMemberDAO;
import kr.co.mlec.lib.vo.memberVO;

public class aMemberUpdateUI extends baseUI {

	@Override
	public void execute() {


		String id = scanStr("아이디를 입력하세요.");
		String Password = scanStr("비밀번호를 입력하세요.");
		String Name = scanStr("이름를 입력하세요.");
		String Sex = scanStr("성별를 입력하세요.");
		String Phone = scanStr("핸드폰 번호를 입력하세요.");

		aMemberDAO aMemberDao = new aMemberDAO();
		memberVO member = new memberVO();
		
		member.setId(id);
		member.setPassword(Password);
		member.setName(Name);
		member.setSex(Sex);
		member.setPhone(Phone);

		aMemberDao.UpdateMember(member);

		System.out.println("회원 수정을 완료하였습니다");
	}

}
