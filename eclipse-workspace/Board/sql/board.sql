/*
    자바 게시판 관리프로그램 테이블 생성
       게시글 번호      no            숫자형     기본키
       제목                title          문자형      필수항목
       글쓴이             writer        문자형      필수항목
       등록일             reg_date   날짜형      삽입 시 현재시간
*/
create table t_board(
    no         number(5)   primary key
    , title     varchar2(100)  not null
    , writer   varchar2(30)  not null
    , reg_date  date  default sysdate
);

-- 게시판번호 생성
create sequence seq_t_board_no;
