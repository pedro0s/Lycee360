# Lycee360

Lycee360 est un prototype Java plain de gestion de lycee, realise dans un cadre Agile/Scrum sur 2 sprints.

## Pitch

Lycee360 centralise la gestion pedagogique et la vie scolaire (notes, absences, alertes risque, messagerie simple) afin d'aider l'equipe educative a detecter tot les eleves en risque de decrochage.

## Acteurs

- Administrateur
- Enseignant
- Eleve
- Parent/Tuteur
- Conseiller pedagogique

## Fonctionnalites principales (1 membre = 1 fonctionnalite)

1. Authentification et gestion des profils
2. Gestion des matieres, evaluations et notes
3. Gestion des absences et retards
4. Messagerie interne parent-enseignant
5. Radar decrochage et tableau de bord administrateur

## Structure

- `docs/` : livrables Sprint 1 + Sprint 2
- `src/com/lycee360/models/` : classes Java et `Main.java`
- `diagrammes/` : schemas PlantUML de base

## Execution

Depuis la racine du projet:

```bash
javac -encoding UTF-8 -d out src/com/lycee360/models/*.java
java -cp out com.lycee360.models.Main
```

Le `Main` affiche:
- une demonstration Sprint 1 (fondations)
- une demonstration Sprint 2 (scenarios metier complets)
