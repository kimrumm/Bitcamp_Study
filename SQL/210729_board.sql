drop table if exists test.MVCBOARD;

create table test.mvcboard (
	bdno int not null auto_increment primary key ,
	bdname varchar(20) not null,
    bdtitle varchar(50) not null,
    bdcontent text not null,
    bddate timestamp default current_timestamp
);

-- test
insert into test.mvcboard (bdname, bdtitle, bdcontent) values('이름1', '제목MVC', '글 내용 MVC 테스트 중');

commit;


-- select 
-- 1.게시글 전체 출력
select * from test.mvcboard;

-- 2. 게시글 하나 출력
select * from test.mvcboard where bdno=1;


-- insert
-- 1. 글쓰기
insert into test.mvcboard (bdname, bdtitle, bdcontent) values('이름1', '제목MVC', '글 내용 MVC 테스트 중');

-- edit
-- 1. 글 수정
update test.mvcboard set bdtitle='제목MVC', bdcontent='222', bdname ='이름2' where bdno=1;

-- delete
-- 글 삭제
delete from test.mvcboard where bdno=2;
