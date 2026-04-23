package com.lycee360.models;

public class Enseignant extends Utilisateur {
    private String specialite;

    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom, String email, String motDePasse, String specialite) {
        super(id, nom, prenom, email, motDePasse, "Enseignant");
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + ", specialite: " + specialite;
    }
}
