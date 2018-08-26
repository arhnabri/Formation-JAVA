# Exercice sur les fuites mémoires
L'idée de cet exercice est de comprendre et de corriger le test unitaire qui fait un OutOfMemoryError.

# Projet

Le squelette du projet est fourni : vous devez compléter la méthode **testSansErreur** !

## Explication
Dans le fichier TestLauncher.java vous trouverez la méthode **testThrowOutOfMemory**.
Si vous lancez le test vous verrez qu'il produit une erreur.
Il faut retoucher le code pour ne plus avoir cette erreur.
Pour lancer les tests faites la commande **mvn test**.

## Conseil

L'idée n'est pas de changer l'option XMX présenté dans le pom mais plutôt de chercher quels sont les objets qui peuvent rester en mémoire.

**BON COURAGE :)**