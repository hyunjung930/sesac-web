package test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.member.dao.LoginDAO;
import kr.co.mlec.member.vo.LoginVO;

public class MyTest {
	
	@Ignore
	@Test
	public void 전체게시글조회서비스() throws Exception {
		BoardService service = new BoardService();
		List<BoardVO> list = service.selectAllBoard();

		for (BoardVO vo : list) {
		}
		// assertNotNull(list); //list에 넣는 데이터가 널이면 못읽어왔을 때가 널
	}
	@Test
	public void 로그인서비스() throws Exception{
		LoginDAO dao = new LoginDAO();
		
		
		LoginVO vo = new LoginVO();
		vo.setId("aaa");
		vo.setPassword("1234");
		
		LoginVO user = dao.login(vo);
		
		
		assertNotNull(user);
	}
}
