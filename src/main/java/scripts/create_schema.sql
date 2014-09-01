CREATE TABLE LEinOC (
     id serial PRIMARY KEY,
     timestamp timestamp NOT NULL DEFAULT NOW(),
     user_id VARCHAR(255),
     oc_id VARCHAR(255),
     le_id VARCHAR(255),
     le_name varchar(255),
     p_name varchar(255),
     up_name varchar(255)
);