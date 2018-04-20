# 실습에 필요한 테이블 생성

## 게시판 테이블 생성
create table ex_board (
    bno int not null,
    titl varchar(255) not null,
    cont text,
    cdt datetime not null
);

## 테이블의 주키(primary key;PK) 칼럼을 설정
alter table ex_board
  add constraint ex_board_pk primary key (bno);
  
## PK 커럼 'bno'의 값을 자동으로 증가하도록 설정
주의! primary key 칼럼인 경우에만 자동 증가를 설정할 수 있다. 일반 컬럼은 안된다.
alter table ex_board
  modify column bno int not null auto_increment;
  
## ex_board의 설정 상태 보기
\\\\
describe ex_board;
desc ex_board;

## 데이터 입력
\\\\
insert into ex_board(titl, cont, cdt) value('subject1', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject2', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject3', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject4', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject5', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject6', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject7', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject8', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject9', 'contents1', now());
insert into ex_board(titl, cont, cdt) value('subject10', 'contents1', now());

## 데이터 조회
\\\\\
select bno, titl, cont, cdt from ex_board;

## 데이터 변경
update ex_board set title='okok' where bno=7;

## 데이터 삭제             
delete from ex_board where bno=8;










