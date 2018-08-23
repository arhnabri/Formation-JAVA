# Exercice sur la programmation objet
L'idée de cette exercice est de réaliser une calculatrice capable de faire les opérations suivantes :

 - Addition
 - Soustraction
 - Division
 - Multiplication

# Projet

Le squelette du projet est fourni vous devez compléter les différentes classes. Il peut être nécessaire d'en créer de nouvelle.
Vous devez conserver la structure du projet !

## Explication
Nous allons réaliser à partir d'une chaine de caractères donnée en entrée du programme un calcul.
Par exemple :
 1. pour la chaine "12/2" donnée en entrée le résultat sera 6.
 2. pour la chaine "12/6+42*2+12/10" le résultat sera 10.

## Cas d'erreur
Si l'opération en entrée est incorrecte il faudra renvoyer une erreur de type UnsupportedOperationException contenant le message "operation non valide".
Voici des exemples de chaine en erreur : 
 1. abcd+12
 2. abcd
 3. 12

## Test unitaire
Le fichier TestLauncher permet de tester votre code. 
**Il ne doit pas être modifier !** 
Pour lancer les tests faites un clic droit sur le fichier > run as > junit test
Vous pouvez également les tests avec la commande "mvn test" si vous préférez utiliser Maven.

## Conseil

Un certain nombre de méthode sont déjà présentes dans la classe **OperationEnum**. N'hésitez pas à les utiliser si vous en avez besoin.

**BON COURAGE :)**