create table recipes
(
    id          int auto_increment primary key,
    title       varchar(255) not null unique,
    description text         not null
);