package kr.co.mlec.lib.ui;

import java.util.List;

import kr.co.mlec.lib.dao.memberDAO;
import kr.co.mlec.lib.vo.memberVO;

//상속??
public class aMemberAllUI extends aMemberManageUI {
	@Override
	public void execute() {

		memberDAO dao = new memberDAO();
		List<memberVO> list = dao.selectAllMember();

		System.out.println(
				"============================ <   회      원     출       력     >==================================");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(" 아이디\t\t  " + "패스워드 \t\t" + "이름\t\t" + "성별\t\t" + "핸드폰번호");
		System.out.println("---------------------------------------------------------------------------------");
		for (memberVO book : list) {
			System.out.printf("%10s\t%-13s\t%-17s\t%-15s\t%-20s\n", book.getId(), book.getPassword(), book.getName(),
					book.getSex(), book.getPhone());
		}

		System.out.println("=====================================================================================");
	}

}
