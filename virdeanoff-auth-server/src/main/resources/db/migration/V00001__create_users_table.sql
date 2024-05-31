create table if not exists users
(
    user_id       serial primary key,
    user_login    text unique not null,
    user_password text        not null,
    role          text        not null
)