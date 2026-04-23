# Sprint 1 Planning - "Les fondations"

## Sprint Goal

Concevoir l'experience utilisateur (maquettes) et fournir un squelette Java executable qui demontre les 5 fonctionnalites en logique simplifiee.

## User Stories selectionnees (Must prioritaires)

- US01 (3 SP)
- US02 (2 SP)
- US03 (3 SP)
- US04 (5 SP)
- US05 (3 SP)
- US09 (8 SP)

## Decomposition technique par membre

### Membre 1 - Authentification et profils
- Creer classes `Utilisateur`, `Eleve`, `Enseignant`
- Ajouter methodes `seConnecter()`, `afficherDetails()`
- Preparer objets de test pour `Main.java V1`

### Membre 2 - Notes et evaluations
- Creer classes `Matiere`, `Evaluation`, `Note`
- Ajouter methodes de base (constructeurs/getters/setters/toString)
- Integration affichage notes dans `Main.java V1`

### Membre 3 - Absences et retards
- Creer classes `Absence`, `Retard`
- Ajouter methodes `justifier()`, `estRepetitif()`
- Simulation d'une absence et d'un retard dans `Main.java V1`

### Membre 4 - Messagerie
- Creer classe `Message`
- Ajouter envoi/lecture simple en memoire
- Demonstration d'echange parent-enseignant dans `Main.java V1`

### Membre 5 - Radar decrochage
- Creer classe `AlerteRisque`
- Ajouter calcul simplifie du score
- Affichage d'une alerte dans `Main.java V1`

## Tableau Kanban (a reproduire dans Trello/Jira)

- A faire -> En cours -> En revue -> Termine

## Definition of Done Sprint 1

1. Le code compile.
2. `Main.java V1` execute un scenario de base pour chaque fonctionnalite.
3. Chaque fonctionnalite est integree via Pull Request.
4. Au moins un review croise par fonctionnalite.
