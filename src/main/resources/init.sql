create schema vivo collate utf8mb4_0900_ai_ci;

create table admission_score
(
    major_id int not null,
    year int not null,
    score int not null,
    region char(11) null,
    constraint admission_score_pk
        unique (major_id, year)
);

create table auth_req
(
    id int not null
        primary key,
    user_id int not null,
    real_name char(11) not null,
    stu_id int not null,
    card_pic char(128) not null
);

create table forum
(
    id int not null
        primary key,
    university_id int not null,
    name char(11) not null,
    major_id int not null
);

create table major
(
    id int not null
        primary key,
    name char(11) not null,
    university_id int not null,
    briefIntro text null,
    address char(128) null,
    tel char(15) null,
    url char(128) not null
);

create table post
(
    id int not null
        primary key,
    forum_id int not null,
    title char(11) not null,
    content text not null,
    pre_post_id int null,
    `delete` tinyint(1) default 0 not null,
    user_id int not null,
    send_time datetime null
);

create table university
(
    id int not null
        primary key,
    name char(11) not null,
    briefIntro text null,
    url char(128) null,
    address char(128) null,
    tel char(15) null,
    post_code int null
);

create table user
(
    id int not null
        primary key,
    name char not null,
    password char(20) not null,
    university_id int null,
    major_id int null,
    is_admin tinyint(1) default 0 not null
);

