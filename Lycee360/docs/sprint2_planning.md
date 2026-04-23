# Sprint 2 Planning - "Le produit complet"

## Sprint Goal

Livrer un prototype Java V2 avec scenarios metier complets et interactions reelles entre les fonctionnalites.

## Backlog Sprint 2

- US reportees eventuelles du Sprint 1
- US06 (retards repetitifs)
- US07 (message parent -> enseignant)
- US08 (reponse enseignant -> parent)
- US10 (dashboard conseiller)
- Renforcement US04 et US09 en logique complete

## Decomposition technique

### Membre 1
- Validation metier sur creation de profils
- Connexion avec verification role
- Gestion des erreurs et messages metier

### Membre 2
- Calcul moyenne ponderee reelle
- Verification bornes note (0..20)
- Lien evaluation <-> matiere <-> eleve

### Membre 3
- Regles absences/retards
- Detection automatique des retards repetitifs
- Indicateurs mensuels

### Membre 4
- Historique de conversation parent/enseignant
- Gestion lu/non lu
- Reponses contextualisees

### Membre 5
- Calcul score risque avec pondération
- Classification Faible/Moyen/Eleve
- Dashboard synthese + actions recommandees

## Definition of Done Sprint 2

1. Methodes metier completees (plus de logique provisoire).
2. `Main.java V2` execute des scenarios bout en bout.
3. Interactions entre classes de membres differents.
4. Tests manuels de scenarios principaux realises.
5. Rapport final consolide pret pour soutenance.
