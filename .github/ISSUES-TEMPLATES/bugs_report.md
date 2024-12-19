# Rapport des bugs

## Bug 1 : Absence de constructeur par défaut
Le projet manque de constructeurs par défaut dans certaines classes, ce qui complique leur instanciation, notamment lors des tests ou de l'utilisation de frameworks.

## Bug 2 : Erreurs dans euclidien_distance
La fonction retourne des valeurs NaN en raison du calcul de la racine carrée d'un nombre négatif. Cela fausse les résultats des comparaisons de distances.

## Bug 3 : Mauvaise gestion des fichiers CSV
Le projet utilise ; comme séparateur de valeurs, tandis que les fichiers CSV emploient ,, ce qui empêche la lecture correcte des données.