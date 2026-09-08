CREATE TABLE IF NOT EXIST livre (
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    titre       VARCHAR NOT NULL,
    auteur      VARCHAR,
    isbn        VARCHAR,
    nbPages     INTEGER NOT NULL
);

CREATE TABLE IF NOT EXIST utilisateur (
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    nom         VARCHAR NOT NULL,
    email       VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXIST emprunt (
    id                           INTEGER PRIMARY KEY AUTOINCREMENT,
    livre_id                     INTEGER NOT NULL,
    utilisateur_id               INTEGER NOT NULL,
    date_emprunt                 TIMESTAMP NOT NULL,
    date_retour                  TIMESTAMP
    FOREIGN KEY (livre_id)       REFERENCES livre(id),
    FOREIGN KEY (utilisateur_id) REFERENCES utilisateur(id)
);