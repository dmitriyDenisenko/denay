create table if not exists admins
(
    admin_id    serial primary key,
    admin_login text unique,
    name        text,
    surname     text,
    lastname    text,
    phone       text unique,
    email       text unique
);

create table if not exists deans
(
    dean_id    serial primary key,
    dean_login text unique,
    name       text,
    surname    text,
    lastname   text,
    phone      text unique,
    email      text unique
);

create table if not exists teachers
(
    teacher_id    serial primary key,
    teacher_login text unique,
    name          text,
    surname       text,
    lastname      text,
    phone         text unique,
    email         text unique,
    department    text
);

create table if not exists groups
(
    group_id serial primary key,
    name     text unique,
    year     smallint
);

create table if not exists students
(
    student_id    serial primary key,
    student_login text unique,
    name          text,
    surname       text,
    lastname      text,
    phone         text unique,
    email         text unique,
    group_id      int references groups (group_id)
);

create table if not exists subjects
(
    subject_id serial primary key,
    name       text unique,
    teacher_id int references teachers (teacher_id),
    group_id   int references groups (group_id)
);

create table if not exists grade_types
(
    grade_type_id serial primary key,
    type          text unique
);

create table if not exists grades
(
    grade_id      serial primary key,
    student_id    int references students (student_id),
    teacher_id    int references teachers (teacher_id),
    subject_id    int references subjects (subject_id),
    grade_type_id int references grade_types (grade_type_id),
    grade         int
);

