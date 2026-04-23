package com.lycee360.models;

public class Eleve extends Utilisateur {
    private String classe;

    public Eleve() {
    }

    public Eleve(int id, String nom, String prenom, String email, String motDePasse, String classe) {
        super(id, nom, prenom, email, motDePasse, "Eleve");
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String afficherDetails() {
        return super.afficherDetails() + ", classe: " + classe;
    }
}
