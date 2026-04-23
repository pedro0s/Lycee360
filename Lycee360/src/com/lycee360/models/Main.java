package com.lycee360.models;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        demoSprint1();
        System.out.println();
        demoSprint2();
    }

    private static void demoSprint1() {
        System.out.println("=== Lycee360 - Sprint 1 (Fondations) ===");

        Eleve eleve = new Eleve(1, "Ben Salah", "Amira", "amira@lycee.tn", "1234", "2eme Info 1");
        Enseignant enseignant = new Enseignant(2, "Karray", "Fatma", "fatma@lycee.tn", "abcd", "Informatique");
        ParentTuteur parent = new ParentTuteur(3, "Ben Salah", "Hatem", "hatem@lycee.tn", "parent1", "Pere");

        System.out.println("--- Authentification/Profils ---");
        System.out.println(eleve.afficherDetails());
        System.out.println("Connexion eleve reussie ? " + eleve.seConnecter("amira@lycee.tn", "1234"));

        Matiere matiere = new Matiere(10, "Algorithmique", 3);
        Evaluation evaluation = new Evaluation(100, matiere, "Controle", LocalDate.now(), 2);
        Note note = new Note(eleve, evaluation, 14.5, "Bon travail");

        System.out.println("--- Notes/Evaluations ---");
        System.out.println("Evaluation creee: " + evaluation);
        System.out.println("Note valide ? " + note.estValide());

        Absence absence = new Absence(eleve, LocalDate.now().minusDays(1), "08:00-10:00", false, "Non renseigne");
        Retard retard = new Retard(eleve, LocalDate.now(), 18, "Transport");
        System.out.println("--- Absences/Retards ---");
        System.out.println("Absence enregistree (justifiee? " + absence.isJustifiee() + ")");
        System.out.println("Retard significatif ? " + retard.estSignificatif());

        Message message = new Message(parent, enseignant, "Bonjour, je souhaite un suivi pour Amira.");
        System.out.println("--- Messagerie ---");
        System.out.println(message.afficherResume());

        AlerteRisque alerte = new AlerteRisque(eleve, 42.0, "Moyen", "Absences et baisse de moyenne",
                "Entretien avec conseiller pedagogique");
        System.out.println("--- Radar Decrochage ---");
        System.out.println(alerte.afficherAlerte());
    }

    private static void demoSprint2() {
        System.out.println("=== Lycee360 - Sprint 2 (Produit complet) ===");

        GestionLycee gestionLycee = new GestionLycee();
        Eleve eleve = new Eleve(11, "Trabelsi", "Youssef", "youssef@lycee.tn", "pass11", "1ere Science 2");
        Enseignant enseignant = new Enseignant(12, "Mansouri", "Sarra", "sarra@lycee.tn", "prof12", "Maths");
        ParentTuteur parent = new ParentTuteur(13, "Trabelsi", "Leila", "leila@lycee.tn", "parent13", "Mere");

        gestionLycee.inscrireEleve(eleve);
        System.out.println("1) Inscription eleve: " + eleve.afficherDetails());

        Matiere maths = new Matiere(20, "Mathematiques", 4);
        Evaluation ds1 = new Evaluation(201, maths, "Devoir surveille", LocalDate.now().minusDays(7), 3);
        Evaluation oral = new Evaluation(202, maths, "Oral", LocalDate.now().minusDays(2), 1);

        gestionLycee.ajouterNote(new Note(eleve, ds1, 8.0, "Bases fragiles"));
        gestionLycee.ajouterNote(new Note(eleve, oral, 9.0, "Participation correcte"));
        double moyenne = gestionLycee.calculerMoyenneEleve(eleve);
        System.out.println("2) Moyenne calculee de " + eleve.getPrenom() + ": " + String.format("%.2f", moyenne) + "/20");

        gestionLycee.enregistrerAbsence(new Absence(eleve, LocalDate.now().minusDays(6), "10:00-12:00", false, "Non renseigne"));
        gestionLycee.enregistrerAbsence(new Absence(eleve, LocalDate.now().minusDays(4), "08:00-10:00", false, "Non renseigne"));
        gestionLycee.enregistrerRetard(new Retard(eleve, LocalDate.now().minusDays(3), 20, "Bus"));
        gestionLycee.enregistrerRetard(new Retard(eleve, LocalDate.now().minusDays(1), 17, "Bus"));
        System.out.println("3) Absences non justifiees: " + gestionLycee.compterAbsencesNonJustifiees(eleve));
        System.out.println("4) Retards significatifs: " + gestionLycee.compterRetardsSignificatifs(eleve));

        Message msgParent = new Message(parent, enseignant, "Je voudrais comprendre la baisse des notes.");
        gestionLycee.envoyerMessage(msgParent);
        msgParent.marquerCommeLu();
        Message reponse = new Message(enseignant, parent, "Un plan de soutien est propose des la semaine prochaine.");
        gestionLycee.envoyerMessage(reponse);
        System.out.println("5) Conversation parent-enseignant:");
        for (Message m : gestionLycee.getMessages()) {
            System.out.println("   - " + m.afficherResume() + " | lu=" + m.isLu());
        }

        AlerteRisque alerte = gestionLycee.genererAlerte(eleve);
        System.out.println("6) Alerte generee: " + alerte.afficherAlerte());
        System.out.println("7) Dashboard admin: total alertes = " + gestionLycee.getAlertes().size());
    }
}
