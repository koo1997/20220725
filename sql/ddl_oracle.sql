CREATE TABLE member_board (
    memberid VARCHAR2(50 CHAR) PRIMARY KEY,
    name VARCHAR2(50 CHAR) NOT NULL,
    password VARCHAR2(10 CHAR) NOT NULL,
    regdate DATE NOT NULL
);

CREATE TABLE article (
    article_no NUMBER(5) PRIMARY KEY,
    writer_id VARCHAR2(50 CHAR) NOT NULL,
    writer_name VARCHAR2(50 CHAR) NOT NULL,
    title VARCHAR2(255 CHAR) NOT NULL,
    regdate DATE NOT NULL,
    moddate DATE NOT NULL,
    read_cnt NUMBER(5)
);

CREATE SEQUENCE article_seq
START WITH 1
INCREMENT BY 1
MAXVALUE 99999
NOCYCLE;

CREATE TABLE article_content (
    article_no NUMBER(5) PRIMARY KEY,
    content VARCHAR2(1000 CHAR)
);