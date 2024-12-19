
# AwesomePasswordChecker

**AwesomePasswordChecker** est une bibliothèque Java permettant d'évaluer la sécurité des mots de passe. Elle utilise des algorithmes de clustering pour calculer la distance entre un mot de passe donné et des centres de clusters prédéfinis. De plus, elle fournit des fonctionnalités comme la génération de masques et le calcul de hash MD5.

## Fonctionnalités principales

- **Analyse des mots de passe** : 
  - Calcul des distances euclidiennes entre les mots de passe et des centres de clusters.
  - Génération de masques pour caractériser les mots de passe.
- **Calcul de hash MD5** : 
  - Fonction MD5 implémentée pour générer des hachages de texte en format hexadécimal.

## Prérequis

- Java 8 ou version ultérieure.
- Un fichier CSV contenant les centres de clusters. Par défaut, le fichier `cluster_centers_HAC_aff.csv` doit être inclus dans le classpath.

## Installation

1. Clonez ce dépôt :
   ```bash
   git clone <url_du_dépôt>
   ```

2. Compilez le projet :
   ```bash
   javac -d bin src/toto/AwesomePasswordChecker.java
   ```

3. Assurez-vous que le fichier `cluster_centers_HAC_aff.csv` est accessible dans le classpath si vous utilisez la méthode `getInstance()` sans argument.


## Structure du projet

```plaintext
src/
  toto/
    AwesomePasswordChecker.java  # Fichier principal contenant les classes et méthodes
resources/
  cluster_centers_HAC_aff.csv    # Fichier CSV contenant les centres de clusters
```

## Contributions

Les contributions sont les bienvenues ! Veuillez suivre les étapes suivantes :
1. Forkez ce dépôt.
2. Créez une branche pour vos modifications :
   ```bash
   git checkout -b ma-branche
   ```
3. Soumettez une pull request.

## License

Ce projet est sous licence MIT. Consultez le fichier LICENSE pour plus de détails.

---

Merci d'utiliser **AwesomePasswordChecker** ! Si vous avez des questions ou des suggestions, n'hésitez pas à nous contacter.
