CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    status boolean NOT NULL,
    date_todo VARCHAR(255) NOT NULL
);
insert into tasks (status, id, date_todo, description, title) values(true, default, current_date::text,'desc', 'some title' ),
                                                               (true, default, current_date::text,'desc', 'some title2' );