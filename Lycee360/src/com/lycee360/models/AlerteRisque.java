package com.lycee360.models;

public class AlerteRisque {
    private Eleve eleve;
    private double scoreRisque;
    private String niveauRisque;
    private String motifs;
    private String actionRecommandee;
    private boolean traitee;

    public AlerteRisque() {
    }

    public AlerteRisque(Eleve eleve, double scoreRisque, String niveauRisque, String motifs, String actionRecommandee) {
        this.eleve = eleve;
        this.scoreRisque = scoreRisque;
        this.niveauRisque = niveauRisque;
        this.motifs = motifs;
        this.actionRecommandee = actionRecommandee;
        this.traitee = false;
    }

    public void marquerTraitee() {
        this.traitee = true;
    }

    public String afficherAlerte() {
        return "Alerte eleve " + eleve.getPrenom() + " " + eleve.getNom()
                + " | score=" + String.format("%.1f", scoreRisque)
                + " | niveau=" + niveauRisque
                + " | motifs=" + motifs
                + " | action=" + actionRecommandee;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public double getScoreRisque() {
        return scoreRisque;
    }

    public String getNiveauRisque() {
        return niveauRisque;
    }

    public String getMotifs() {
        return motifs;
    }

    public String getActionRecommandee() {
        return actionRecommandee;
    }

    public boolean isTraitee() {
        return traitee;
    }
}
