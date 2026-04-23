package com.lycee360.models;

import java.util.ArrayList;
import java.util.List;

public class GestionLycee {
    private final List<Eleve> eleves;
    private final List<Note> notes;
    private final List<Absence> absences;
    private final List<Retard> retards;
    private final List<Message> messages;
    private final List<AlerteRisque> alertes;

    public GestionLycee() {
        this.eleves = new ArrayList<>();
        this.notes = new ArrayList<>();
        this.absences = new ArrayList<>();
        this.retards = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.alertes = new ArrayList<>();
    }

    public void inscrireEleve(Eleve eleve) {
        eleves.add(eleve);
    }

    public void ajouterNote(Note note) {
        if (!note.estValide()) {
            throw new IllegalArgumentException("Note invalide: la valeur doit etre entre 0 et 20.");
        }
        notes.add(note);
    }

    public void enregistrerAbsence(Absence absence) {
        absences.add(absence);
    }

    public void enregistrerRetard(Retard retard) {
        retards.add(retard);
    }

    public void envoyerMessage(Message message) {
        messages.add(message);
    }

    public double calculerMoyenneEleve(Eleve eleve) {
        double sommePonderee = 0.0;
        int sommeCoefficients = 0;

        for (Note note : notes) {
            if (note.getEleve().getId() == eleve.getId()) {
                int coef = note.getEvaluation().getCoefficient();
                sommePonderee += note.getValeur() * coef;
                sommeCoefficients += coef;
            }
        }

        if (sommeCoefficients == 0) {
            return 0.0;
        }
        return sommePonderee / sommeCoefficients;
    }

    public int compterAbsencesNonJustifiees(Eleve eleve) {
        int compteur = 0;
        for (Absence absence : absences) {
            if (absence.getEleve().getId() == eleve.getId() && !absence.isJustifiee()) {
                compteur++;
            }
        }
        return compteur;
    }

    public int compterRetardsSignificatifs(Eleve eleve) {
        int compteur = 0;
        for (Retard retard : retards) {
            if (retard.getEleve().getId() == eleve.getId() && retard.estSignificatif()) {
                compteur++;
            }
        }
        return compteur;
    }

    public AlerteRisque genererAlerte(Eleve eleve) {
        double moyenne = calculerMoyenneEleve(eleve);
        int absencesNonJustifiees = compterAbsencesNonJustifiees(eleve);
        int retardsSignificatifs = compterRetardsSignificatifs(eleve);

        // Score sur 100 base sur 3 dimensions.
        double score = 0.0;
        score += absencesNonJustifiees * 12.0;
        score += retardsSignificatifs * 6.0;
        score += Math.max(0.0, 10.0 - moyenne) * 5.0;

        if (score > 100.0) {
            score = 100.0;
        }

        String niveau;
        if (score >= 60.0) {
            niveau = "Eleve";
        } else if (score >= 30.0) {
            niveau = "Moyen";
        } else {
            niveau = "Faible";
        }

        String motifs = "absences non justifiees=" + absencesNonJustifiees
                + ", retards significatifs=" + retardsSignificatifs
                + ", moyenne=" + String.format("%.2f", moyenne);

        String action;
        if ("Eleve".equals(niveau)) {
            action = "Convocation parent + plan de soutien immediat.";
        } else if ("Moyen".equals(niveau)) {
            action = "Entretien eleve + suivi hebdomadaire.";
        } else {
            action = "Suivi normal.";
        }

        AlerteRisque alerte = new AlerteRisque(eleve, score, niveau, motifs, action);
        alertes.add(alerte);
        return alerte;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public List<AlerteRisque> getAlertes() {
        return alertes;
    }
}
