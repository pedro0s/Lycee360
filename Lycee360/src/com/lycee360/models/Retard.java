package com.lycee360.models;

import java.time.LocalDate;

public class Retard {
    private Eleve eleve;
    private LocalDate dateRetard;
    private int dureeMinutes;
    private String motif;

    public Retard() {
    }

    public Retard(Eleve eleve, LocalDate dateRetard, int dureeMinutes, String motif) {
        this.eleve = eleve;
        this.dateRetard = dateRetard;
        this.dureeMinutes = dureeMinutes;
        this.motif = motif;
    }

    public boolean estSignificatif() {
        return dureeMinutes >= 15;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public LocalDate getDateRetard() {
        return dateRetard;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public String getMotif() {
        return motif;
    }
}
