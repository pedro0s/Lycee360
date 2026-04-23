-- Schema relationnel de base - Lycee360

CREATE TABLE classe (
    id_classe INT PRIMARY KEY,
    nom_classe VARCHAR(50) NOT NULL,
    niveau VARCHAR(30) NOT NULL,
    annee_scolaire VARCHAR(20) NOT NULL
);

CREATE TABLE eleve (
    id_eleve INT PRIMARY KEY,
    nom VARCHAR(80) NOT NULL,
    prenom VARCHAR(80) NOT NULL,
    email VARCHAR(120) UNIQUE NOT NULL,
    classe VARCHAR(50) NOT NULL
);

CREATE TABLE enseignant (
    id_enseignant INT PRIMARY KEY,
    nom VARCHAR(80) NOT NULL,
    prenom VARCHAR(80) NOT NULL,
    email VARCHAR(120) UNIQUE NOT NULL,
    specialite VARCHAR(80) NOT NULL
);

CREATE TABLE matiere (
    id_matiere INT PRIMARY KEY,
    libelle VARCHAR(80) NOT NULL,
    coefficient INT NOT NULL
);

CREATE TABLE evaluation (
    id_evaluation INT PRIMARY KEY,
    id_matiere INT NOT NULL,
    type_eval VARCHAR(40) NOT NULL,
    date_eval DATE NOT NULL,
    coefficient INT NOT NULL,
    FOREIGN KEY (id_matiere) REFERENCES matiere(id_matiere)
);

CREATE TABLE note (
    id_note INT PRIMARY KEY,
    id_eleve INT NOT NULL,
    id_evaluation INT NOT NULL,
    valeur DECIMAL(4,2) NOT NULL,
    appreciation VARCHAR(200),
    FOREIGN KEY (id_eleve) REFERENCES eleve(id_eleve),
    FOREIGN KEY (id_evaluation) REFERENCES evaluation(id_evaluation)
);

CREATE TABLE absence (
    id_absence INT PRIMARY KEY,
    id_eleve INT NOT NULL,
    date_absence DATE NOT NULL,
    creneau VARCHAR(30) NOT NULL,
    justifiee BOOLEAN NOT NULL,
    motif VARCHAR(200),
    FOREIGN KEY (id_eleve) REFERENCES eleve(id_eleve)
);

CREATE TABLE retard (
    id_retard INT PRIMARY KEY,
    id_eleve INT NOT NULL,
    date_retard DATE NOT NULL,
    duree_minutes INT NOT NULL,
    motif VARCHAR(200),
    FOREIGN KEY (id_eleve) REFERENCES eleve(id_eleve)
);

CREATE TABLE message (
    id_message INT PRIMARY KEY,
    id_expediteur INT NOT NULL,
    type_expediteur VARCHAR(30) NOT NULL,
    id_destinataire INT NOT NULL,
    type_destinataire VARCHAR(30) NOT NULL,
    contenu VARCHAR(500) NOT NULL,
    date_envoi TIMESTAMP NOT NULL,
    lu BOOLEAN NOT NULL
);

CREATE TABLE alerte_risque (
    id_alerte INT PRIMARY KEY,
    id_eleve INT NOT NULL,
    score_risque DECIMAL(5,2) NOT NULL,
    niveau_risque VARCHAR(20) NOT NULL,
    motifs VARCHAR(300) NOT NULL,
    action_recommandee VARCHAR(300) NOT NULL,
    statut_traitement VARCHAR(30) NOT NULL,
    FOREIGN KEY (id_eleve) REFERENCES eleve(id_eleve)
);
