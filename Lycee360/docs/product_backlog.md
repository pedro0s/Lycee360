# Product Backlog - Lycee360

## Echelle Story Points

Fibonacci: 1, 2, 3, 5, 8, 13

## User Stories (10)

### US01
- **Formulation**: En tant qu'eleve, je veux creer un compte afin d'acceder a mon espace scolaire.
- **Priorite**: Must
- **Story Points**: 3
- **Responsable**: Membre 1
- **Criteres d'acceptation**:
  1. L'eleve peut saisir nom, prenom, email, mot de passe.
  2. Le systeme refuse un email deja utilise.
  3. Un compte actif est cree avec un identifiant unique.

### US02
- **Formulation**: En tant qu'enseignant, je veux me connecter afin de gerer mes classes.
- **Priorite**: Must
- **Story Points**: 2
- **Responsable**: Membre 1
- **Criteres d'acceptation**:
  1. L'authentification valide email + mot de passe.
  2. En cas d'erreur, un message explicite s'affiche.
  3. Le role enseignant est reconnu apres connexion.

### US03
- **Formulation**: En tant qu'enseignant, je veux creer une evaluation afin de noter ma classe.
- **Priorite**: Must
- **Story Points**: 3
- **Responsable**: Membre 2
- **Criteres d'acceptation**:
  1. L'evaluation contient matiere, date, coefficient.
  2. Une evaluation est rattachee a une classe existante.
  3. L'evaluation est visible dans la liste des evaluations.

### US04
- **Formulation**: En tant qu'enseignant, je veux saisir les notes des eleves afin de calculer leur moyenne.
- **Priorite**: Must
- **Story Points**: 5
- **Responsable**: Membre 2
- **Criteres d'acceptation**:
  1. La note doit etre comprise entre 0 et 20.
  2. Le calcul de moyenne tient compte des coefficients.
  3. La moyenne est consultable dans le profil eleve.

### US05
- **Formulation**: En tant que surveillant, je veux enregistrer une absence afin d'assurer le suivi de presence.
- **Priorite**: Must
- **Story Points**: 3
- **Responsable**: Membre 3
- **Criteres d'acceptation**:
  1. Chaque absence contient date, creneau et motif.
  2. Le statut justifie/non justifie est modifiable.
  3. L'historique des absences d'un eleve est accessible.

### US06
- **Formulation**: En tant qu'administrateur, je veux suivre les retards afin d'identifier les comportements repetitifs.
- **Priorite**: Should
- **Story Points**: 2
- **Responsable**: Membre 3
- **Criteres d'acceptation**:
  1. Un retard enregistre la date et la duree en minutes.
  2. Le total des retards mensuels est calcule par eleve.
  3. Les eleves depassant un seuil sont signales.

### US07
- **Formulation**: En tant que parent, je veux envoyer un message a l'enseignant afin de demander un suivi.
- **Priorite**: Should
- **Story Points**: 3
- **Responsable**: Membre 4
- **Criteres d'acceptation**:
  1. Le parent peut rediger et envoyer un message.
  2. L'enseignant voit le message dans sa boite de reception.
  3. Le systeme conserve date, expediteur et contenu.

### US08
- **Formulation**: En tant qu'enseignant, je veux repondre a un parent afin d'assurer une communication rapide.
- **Priorite**: Could
- **Story Points**: 2
- **Responsable**: Membre 4
- **Criteres d'acceptation**:
  1. L'enseignant peut repondre depuis un message recu.
  2. La reponse est associee au fil de discussion.
  3. Le parent voit l'etat lu/non lu.

### US09
- **Formulation**: En tant qu'administrateur, je veux un score de risque decrochage afin de prioriser l'accompagnement.
- **Priorite**: Must
- **Story Points**: 8
- **Responsable**: Membre 5
- **Criteres d'acceptation**:
  1. Le score combine absences, retards et moyenne.
  2. Le niveau de risque est classe (Faible/Moyen/Eleve).
  3. Une action recommandee est proposee automatiquement.

### US10
- **Formulation**: En tant que conseiller pedagogique, je veux consulter un tableau de bord afin de suivre les alertes eleves.
- **Priorite**: Should
- **Story Points**: 5
- **Responsable**: Membre 5
- **Criteres d'acceptation**:
  1. Le dashboard affiche les alertes triees par priorite.
  2. Chaque alerte contient motifs et recommandation.
  3. Le conseiller peut marquer une alerte comme traitee.
