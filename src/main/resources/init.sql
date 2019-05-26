create schema if not exists vivo collate utf8mb4_0900_ai_ci;

create table if not exists admission_score
(
    major_id int not null,
    year     int not null,
    score    int not null,
    constraint admission_score_pk
        unique (major_id, year)
);

create table if not exists forum
(
    id            int  not null
        primary key,
    university_id int  not null,
    name          char not null,
    major_id      int  not null
);

create table if not exists major
(
    id            int  not null
        primary key,
    name          char not null,
    university_id int  not null,
    briefIntro    char null,
    address       char null,
    tel           char null
);

create table if not exists post
(
    id          int  not null
        primary key,
    forum_id    int  not null,
    title       char not null,
    content     char not null,
    pre_post_id int  null
);

create table if not exists university
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

create table if not exists user
(
    id            int                  not null
        primary key,
    name          char                 not null,
    password      int                  not null,
    university_id int                  null,
    major_id      int                  null,
    is_admin      tinyint(1) default 0 not null
);

