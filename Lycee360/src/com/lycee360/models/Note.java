package com.lycee360.models;

public class Note {
    private Eleve eleve;
    private Evaluation evaluation;
    private double valeur;
    private String appreciation;

    public Note() {
    }

    public Note(Eleve eleve, Evaluation evaluation, double valeur, String appreciation) {
        this.eleve = eleve;
        this.evaluation = evaluation;
        this.valeur = valeur;
        this.appreciation = appreciation;
    }

    public boolean estValide() {
        return valeur >= 0.0 && valeur <= 20.0;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public String getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }
}
