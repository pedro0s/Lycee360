# Approche hybride AGL + IA (exemples a documenter)

Ce fichier sert de base pour la section "Code - Approche hybride" du rapport final.

## Exemple 1 - Calcul moyenne ponderee

### Prompt IA
"Donne une methode Java pour calculer la moyenne ponderee d'un eleve a partir d'une liste de notes et des coefficients, avec division protegee quand la liste est vide."

### Code genere (resume)
- Boucle sur notes
- Somme note * coefficient
- Division par somme coefficients

### Corrections humaines
1. Ajout controle sur eleve cible.
2. Ajout validation note 0..20.
3. Ajustement nommage francais et messages metier.

## Exemple 2 - Score de risque decrochage

### Prompt IA
"Propose un algorithme simple de score risque (0-100) base sur absences non justifiees, retards significatifs et moyenne scolaire."

### Code genere (resume)
- Score lineaire non borne
- Niveaux faible/moyen/eleve

### Corrections humaines
1. Bornage explicite du score a 100.
2. Pondération adaptee au contexte lycee.
3. Ajout d'une action recommandee selon le niveau.
