CREATE TABLE users (
   id INT NOT NULL PRIMARY KEY,
   username VARCHAR(50) UNIQUE NOT NULL,
   preferred_name VARCHAR(50) NOT NULL,
   email VARCHAR(50) NOT NULL,
   password VARCHAR(50) NOT NULL,
   isTutor BOOLEAN NOT NULL,
   isStudent BOOLEAN NOT NULL
);