CREATE DATABASE ToDoDatabase;

CREATE table todos(
id int primary key auto_increment,
todo varchar(30),
`status` boolean
);

INSERT INTO todos (todo, `status`) VALUES ('Feed the Cat', false);
INSERT INTO todos (todo, `status`) VALUES ('Feed the Dog', false);
INSERT INTO todos (todo, `status`) VALUES ('Feed the Snake', false);
INSERT INTO todos (todo, `status`) VALUES ('Feed the Hobo', false);

SELECT * from todos;