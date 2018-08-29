# Exercice sur la programmation objet
L'idée de cet exercice est de réaliser une calculatrice capable de faire les opérations suivantes :

 - Addition
 - Soustraction
 - Division
 - Multiplication

# Projet

Le squelette du projet est fourni vous devez compléter les différentes classes. Il peut être nécessaire d'en créer de nouvelles.
Vous devez conserver la structure du projet !

## Explication
Nous allons réaliser des cacluls à partir d'une chaine de caractères donnée en entrée du programme.
A chaque nouvel opérateur il faut réaliser une nouvelle opération, à la manière d'une calculatrice simple.
Il ne faut donc pas gérer la priorité des opérateurs *** et */*.
Par exemple :
 1. pour la chaine "12/2" donnée en entrée le résultat sera 6.
 2. pour la chaine "12/6+42*2+12/10" le résultat sera 10 (et non pas 87.2 avec la gestion de la priorité des opérations)

## Cas d'erreur
Si l'opération en entrée est incorrecte il faudra renvoyer une erreur de type UnsupportedOperationException contenant le message "operation non valide".
Voici des exemples de chaines en erreur : 
 1. abcd+12
 2. abcd
 3. 12

## Test unitaire
Le fichier TestLauncher permet de tester votre code. 
**Il ne doit pas être modifié !** 
Pour lancer les tests faites un clic droit sur le fichier > run as > junit test.
Vous pouvez également lancer les tests avec la commande "mvn test" si vous préférez utiliser Maven.

## Conseil

Il est deja fourni une classe abstraite *Operation* ainsi qu'une classe *Calculatrice* (à implémenter) qui servira à effectuer des opérations à partir de la chaîne de charactères fournie.


Un certain nombre de méthodes sont déjà présentes dans la classe **OperationEnum**. N'hésitez pas à les utiliser si vous en avez besoin.

**BON COURAGE :)**