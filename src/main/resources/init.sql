create schema vivo collate utf8mb4_0900_ai_ci;

create table admission_score
(
    major_id int  not null,
    year     int  not null,
    score    int  not null,
    region   char null,
    constraint admission_score_pk
        unique (major_id, year)
);

create table auth_req
(
    id        int  not null
        primary key,
    user_id   int  not null,
    real_name char not null,
    stu_id    int  not null,
    card_pic  char not null
);

create table forum
(
    id            int  not null
        primary key,
    university_id int  not null,
    name          char not null,
    major_id      int  not null
);

create table major
(
    id            int  not null
        primary key,
    name          char not null,
    university_id int  not null,
    briefIntro    char null,
    address       char null,
    tel           char null
);

create table post
(
    id          int                  not null
        primary key,
    forum_id    int                  not null,
    title       char                 not null,
    content     char                 not null,
    pre_post_id int                  null,
    `delete`    tinyint(1) default 0 not null,
    user_id     int                  not null,
    send_time   datetime             null
);

create table university
(
    id         int  not null
        primary key,
    name       char not null,
    briefIntro char null,
    url        char null,
    address    char null,
    tel        char null,
    post_code  int  null
);

create table user
(
    id            int                  not null
        primary key,
    name          char                 not null,
    password      int                  not null,
    university_id int                  null,
    major_id      int                  null,
    is_admin      tinyint(1) default 0 not null
);

