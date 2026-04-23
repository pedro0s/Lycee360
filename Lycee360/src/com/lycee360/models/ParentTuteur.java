package com.lycee360.models;

public class ParentTuteur extends Utilisateur {
    private String lienParente;

    public ParentTuteur() {
    }

    public ParentTuteur(int id, String nom, String prenom, String email, String motDePasse, String lienParente) {
        super(id, nom, prenom, email, motDePasse, "Parent");
        this.lienParente = lienParente;
    }

    public String getLienParente() {
        return lienParente;
    }

    public void setLienParente(String lienParente) {
        this.lienParente = lienParente;
    }
}
