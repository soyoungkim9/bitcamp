create table ex1(
  no int not null primary key auto_increment,
  title varchar(255) not null,
  content text,
  rdt datetime not null
);

/* 첨부 파일 테이블 */
create table ex2(
  fno int not null primary key auto_increment, /* 첨부파일 고유번호 */
  filepath varchar(255) not null, /* 파일시스템에 저장된 첨부파일의 경로 */
  bno int not null /* 게시판 번호 */
);

insert into ex1(title,rdt) values('aaa', now());
insert into ex1(title,rdt) values('bbb', now());
insert into ex1(title,rdt) values('ccc', now());
insert into ex1(title,rdt) values('ddd', now());
insert into ex1(title,rdt) values('eee', now());
insert into ex1(title,rdt) values('fff', now());
insert into ex1(title,rdt) values('ggg', now());
insert into ex1(title,rdt) values('hhh', now());
insert into ex1(title,rdt) values('iii', now());
insert into ex1(title,rdt) values('jjj', now());
```

첨부파일 데이터 입력:
```
insert into ex2(filepath, bno) values('c:/download/a.gif', 1);
insert into ex2(filepath, bno) values('c:/download/b.gif', 1);
insert into ex2(filepath, bno) values('c:/download/c.gif', 1);
insert into ex2(filepath, bno) values('c:/download/d.gif', 5);
insert into ex2(filepath, bno) values('c:/download/e.gif', 5);
insert into ex2(filepath, bno) values('c:/download/f.gif', 10);