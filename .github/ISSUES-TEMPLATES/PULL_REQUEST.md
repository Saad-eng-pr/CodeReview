# Modèle de Pull Request

## Description

Ce projet Java, intitulé `AwesomePasswordChecker`, propose une évaluation de la robustesse des mots de passe en les comparant à des clusters de référence grâce au calcul de distances euclidiennes. Il se distingue par une approche innovante intégrant des données issues de fichiers CSV, tout en offrant une fonction de hachage MD5 pour anonymiser les informations. Cependant, certaines limitations techniques freinent son plein potentiel : des erreurs dans les calculs de distance (valeurs NaN) et des difficultés dans le traitement des fichiers CSV. Ce correctif introduit des améliorations significatives pour renforcer la fiabilité du projet, optimisant ainsi son efficacité comme outil d’analyse de la sécurité des mots de passe.

## Type de Changement

- [x] Correction de bugs (résolution des problèmes liés au calcul de distance et au parsing des fichiers CSV).
- [x] Mise à jour et amélioration de la documentation du projet.
- [x] Refactorisation et optimisation du code existant pour une meilleure lisibilité et efficacité.

## Changements Apportés

- [x] Révision de la méthode de calcul de la distance euclidienne pour éviter la génération de résultats invalides (comme les NaN).
- [x] Amélioration de la logique de parsing des fichiers CSV pour garantir l’utilisation correcte du séparateur `","` et une meilleure compatibilité.
- [x] Ajustements mineurs pour améliorer la lisibilité, la robustesse et la maintenabilité du code.

## Liste de Contrôle

- [x] Le code respecte les normes de codage et les bonnes pratiques adoptées dans ce projet.
- [x] Tous les tests pertinents ont été exécutés avec succès, et les résultats sont conformes aux attentes.
- [x] Les nouvelles fonctionnalités ont été testées et fonctionnent correctement.
- [x] Les problèmes répertoriés dans le fichier `bug_report.md` ont été examinés et résolus lorsque cela était pertinent.

## Instructions de Test

- [x] Préparez un fichier `.csv` contenant des centres de clusters valides et placez-le dans le répertoire approprié ou ajoutez-le au classpath.
- [x] Exécutez la méthode d’analyse des mots de passe en utilisant divers exemples, y compris des mots de passe simples, complexes et non valides.
- [x] Vérifiez que les distances calculées sont correctes et qu’aucune valeur NaN ou résultat incohérent n’est produit.
- [x] Assurez-vous que les fonctionnalités liées au hachage MD5 et à la génération de masques fonctionnent comme prévu.

## Remarques

Cette mise à jour vise non seulement à corriger des problèmes techniques, mais aussi à renforcer la documentation et la facilité de maintenance, permettant à ce projet d’atteindre son plein potentiel comme outil de sécurité des mots de passe.