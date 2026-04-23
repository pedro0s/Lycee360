package com.lycee360.models;

import java.time.LocalDateTime;

public class Message {
    private Utilisateur expediteur;
    private Utilisateur destinataire;
    private String contenu;
    private LocalDateTime dateEnvoi;
    private boolean lu;

    public Message() {
    }

    public Message(Utilisateur expediteur, Utilisateur destinataire, String contenu) {
        this.expediteur = expediteur;
        this.destinataire = destinataire;
        this.contenu = contenu;
        this.dateEnvoi = LocalDateTime.now();
        this.lu = false;
    }

    public void marquerCommeLu() {
        this.lu = true;
    }

    public String afficherResume() {
        return "[" + dateEnvoi + "] " + expediteur.getPrenom() + " -> " + destinataire.getPrenom() + " : " + contenu;
    }

    public Utilisateur getExpediteur() {
        return expediteur;
    }

    public Utilisateur getDestinataire() {
        return destinataire;
    }

    public String getContenu() {
        return contenu;
    }

    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
    }

    public boolean isLu() {
        return lu;
    }
}
