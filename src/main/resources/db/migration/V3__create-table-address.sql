CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE address
(
    id          UUID            DEFAULT    gen_random_uuid()    PRIMARY KEY,
    city        varchar(255)                                    NOT NULL,
    uf          varchar(255)                                    NOT NULL,
    event_id    UUID,

    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);