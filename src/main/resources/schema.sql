drop table if exists Contact;
create table if not exists Contact (
    id identity primary key,
    name varchar(50) not null,
    email varchar(70),
    phone varchar(9)
);

CREATE SEQUENCE if not exists CONTACT_SEQ START WITH 5 INCREMENT BY 1;