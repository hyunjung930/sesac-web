/*
    �ڹ� �Խ��� �������α׷� ���̺� ����
       �Խñ� ��ȣ      no            ������     �⺻Ű
       ����                title          ������      �ʼ��׸�
       �۾���             writer        ������      �ʼ��׸�
       �����             reg_date   ��¥��      ���� �� ����ð�
*/
create table t_board(
    no         number(5)   primary key
    , title     varchar2(100)  not null
    , writer   varchar2(30)  not null
    , reg_date  date  default sysdate
);

-- �Խ��ǹ�ȣ ����
create sequence seq_t_board_no;
