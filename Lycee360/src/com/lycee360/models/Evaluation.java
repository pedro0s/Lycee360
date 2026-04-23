package com.lycee360.models;

import java.time.LocalDate;

public class Evaluation {
    private int id;
    private Matiere matiere;
    private String type;
    private LocalDate dateEvaluation;
    private int coefficient;

    public Evaluation() {
    }

    public Evaluation(int id, Matiere matiere, String type, LocalDate dateEvaluation, int coefficient) {
        this.id = id;
        this.matiere = matiere;
        this.type = type;
        this.dateEvaluation = dateEvaluation;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(LocalDate dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return type + " - " + matiere.getLibelle() + " (" + dateEvaluation + ")";
    }
}
