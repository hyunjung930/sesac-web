package com.sesac.springBootMVCProject.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.sesac.springBootMVCProject.vo.BoardVO;

//interface 설계   Repository <=== CrudRepository <=== PagingAndSortingRepository
public interface BoardRepository extends PagingAndSortingRepository<BoardVO, Long>{
//여기는 Entity
	
	//CrudRepository의 기본 method: findAll(), findById(), save(), delete(), count()
	
	//규칙에 맞는 method 추가한다.
	List<BoardVO> findByTitle(String title);
	List<BoardVO> findByWriter(String writer);
	List<BoardVO> findByContent(String Content);
	List<BoardVO> findByTitleAndWriter(String title, String writer);
	List<BoardVO> findByBnoBetween(Long bno,Long bno2);
	
	List<BoardVO> findByContentLike(String Content);
	List<BoardVO> findByContentContaining(String Content);		//포함하다
	List<BoardVO> findByContentContainingAndBnoGreaterThan(String Content,Long bno);
	List<BoardVO> findByContentContainingAndBnoGreaterThanOrderByBnoDesc(String Content,Long bno);
	
	List<BoardVO> findByContentContainingAndWriterStartingWith(String Content,String Writer);
	//content or writer
	List<BoardVO> findByContentContainingOrderByWriterDesc(String Content);
	//0216 진행
	
	long countByWriter(String writer);
	
	
	//Paging 추가
	
	List<BoardVO> findByContentContainingAndBnoGreaterThanOrderByBnoDesc(String Content,Long bno,
			Pageable paging);
	
	List<BoardVO> findByContentContaining(String Content,Pageable paging);
	//Data정보만 return 한다ㅣ	
	Page<BoardVO>findByBnoGreaterThan(Long bno, Pageable paging);	
	//결과에 페이징 정보 + 내용 같이 보여줌. Page정보와 Data를 return 한다.  

	//Sql과 비슷하다.
	//JPQL(JPA Query LAnguage...).... JPA가 자동생성되는 함수로는 한계가 있다.JPQL를 이용해서 해결한다.
	@Query("select b from BoardVO b where b.title like %?1% and b.bno > ?2 order by b.bno desc")
	List<BoardVO> findByTitle2(String title, Long bno);

	
	@Query("select b from BoardVO b where b.title like %:title% and b.bno > :bno2 order by b.bno desc")
	List<BoardVO> findByTitle3(@Param("bno2") Long bno, @Param("title") String title);

	@Query("select b from #{#entityName} b where b.title like %:title% and b.bno > :bno2 order by b.bno desc")
	List<BoardVO> findByTitle4(@Param("bno2") Long bno, @Param("title") String title);
	//#{#entityName} : 엔티티 네임을 알아서 불러옴
	
	@Query(value = "select * from tbl2_boards  where title like %?2% and bno>?1 order by bno desc"
			, nativeQuery = true)	//nativeQuery = true 는 sql문이다.
	List<BoardVO> findByTitle5(@Param("bno2") Long bno, @Param("title") String title);
}
