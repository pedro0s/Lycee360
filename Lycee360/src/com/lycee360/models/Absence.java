package com.lycee360.models;

import java.time.LocalDate;

public class Absence {
    private Eleve eleve;
    private LocalDate dateAbsence;
    private String creneau;
    private boolean justifiee;
    private String motif;

    public Absence() {
    }

    public Absence(Eleve eleve, LocalDate dateAbsence, String creneau, boolean justifiee, String motif) {
        this.eleve = eleve;
        this.dateAbsence = dateAbsence;
        this.creneau = creneau;
        this.justifiee = justifiee;
        this.motif = motif;
    }

    public void justifier(String motif) {
        this.justifiee = true;
        this.motif = motif;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public LocalDate getDateAbsence() {
        return dateAbsence;
    }

    public String getCreneau() {
        return creneau;
    }

    public boolean isJustifiee() {
        return justifiee;
    }

    public String getMotif() {
        return motif;
    }
}
