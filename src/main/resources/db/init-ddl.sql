/*
* Database init DDL script when using MySQL
*/
create table lecture(
    id bigint auto_increment primary key comment 'ID',
    speaker varchar(30) not null comment '강연자',
    place varchar(50) not null comment '강연장',
    contents varchar(255) not null comment '강연 내용',
    capacity smallint not null comment '수용 인원',
    register_date_time datetime(6) not null comment '강연 접수 일시',
    start_date_time datetime(6) not null comment '강연 시작 일시'
) comment 'lecture' charset = utf8mb4;

create table booking
(
    id         bigint auto_increment primary key comment 'ID',
    lecture_id bigint      not null comment '강연 ID',
    user_no     varchar(10)      not null comment '사용자 번호',
    status     varchar(30) not null default 'BOOKED' comment '예약 상태'
)comment 'booking' charset = utf8mb4;

create index booking_idx01 on booking (lecture_id);
create index booking_idx02 on booking (user_no);








