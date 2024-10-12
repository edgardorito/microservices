CREATE TABLE book (
                      id SERIAL PRIMARY KEY,
                      title VARCHAR (50) NOT NULL,
                      authorName VARCHAR (50) NOT NULL,
                      isbn BIGINT NOT NULL,
                      published_date DATE NOT NULL,
                      created_at TIMESTAMP NOT NULL
);


CREATE SEQUENCE hibernate_sequence START 1;