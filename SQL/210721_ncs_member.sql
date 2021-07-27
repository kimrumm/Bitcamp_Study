create table project.member (
idx int auto_increment,
memberid varchar(14) not null,
password varchar(20) not null,
membername varchar(20) not null,
regdate timestamp default current_timestamp,
constraint member_idx_pk primary key (idx),
constraint member_memberid_up unique (memberid)
);

commit;