# Exercice sur les fuites mémoires
L'idée de cette exercice est de comprendre et de corriger le test unitaire qui fait un OutOfMemoryError.

# Projet

Le squelette du projet est fourni vous devez compléter la méthode **testSansErreur** !

## Explication
Dans le fichier TestLauncher.java vous trouverez la méthode **testThrowOutOfMemory**.
Si vous lancer le test vous verrez qu'elle produit une erreur.
Il faut retoucher le code pour le plus avoir cette erreur.
Pour lancer les tests lancer la commande **mvn test**

## Conseil

L'idée n'est pas de changer l'option XMX présent dans le pom mais plutôt de chercher qu'elles sont les objets qui peuvent rester en mémoire.

**BON COURAGE :)**