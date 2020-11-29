CREATE SEQUENCE post_sq MINVALUE 1 INCREMENT BY 1;

CREATE TABLE post
(
    id      bigint primary key,
    title   varchar(255) not null,
    content text         not null,
    created datetime     not null
);

INSERT INTO post(id, title, content, created)
VALUES (NEXT VALUE FOR post_sq, 'My first post', 'This is a nice post', current_timestamp);

INSERT INTO post(id, title, content, created)
VALUES (NEXT VALUE FOR post_sq, 'My second post', 'This is the second post', current_timestamp);

INSERT INTO post(id, title, content, created)
VALUES (NEXT VALUE FOR post_sq, 'My third post', 'This is the third post', current_timestamp);