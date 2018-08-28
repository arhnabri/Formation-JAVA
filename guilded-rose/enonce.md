# Exercice de refactoring: Guilded Rose
L'idée de cet exercice est de:
 - réaliser des **tests unitaires** couvrant la totalité d'un code existant
 - **refactorer** le code en utilisant la **POO**
 - ajouter une **nouvelle fonctionnalité** 

# Projet
Le code source à refactorer est fourni dans les classes **GuildedRose** et **Item**.
La classe de test à compléter est dans la classe **GildedRoseFixmeTest**.

# Explication
Bienvenue à Gilded Rose, une petite auberge dans un emplacement privilégié dans une ville importante dirigée par un aubergiste sympathique nommé Allison. Nous achetons et vendons également uniquement les meilleurs produits. Malheureusement, nos produits se dégradent constamment en termes de qualité à l'approche de leur date de péremption. Nous avons un système en place qui met à jour notre inventaire pour nous. Il a été développé par un type sans prétention nommé Leeroy, qui a évolué vers de nouvelles aventures. Votre tâche consiste à ajouter une nouvelle fonctionnalité à notre système afin que nous puissions commencer à vendre une nouvelle catégorie d’articles. Tout d'abord une introduction à notre système:
 - Tous les articles ont une valeur *SellIn* qui indique le nombre de jours pendant lesquels nous devons vendre l'article
 - Tous les articles ont une valeur *Quality* qui indique la valeur de l'article
 - À la fin de chaque journée, notre système décrémente les deux valeurs pour chaque article

Assez simple, non ? Eh bien, c'est là que ça devient intéressant:

 - Une fois la date de péremption écoulée, la qualité se dégrade deux fois plus vite
 - La *Quality* d'un objet n'est jamais négative
 - Plus *AgedBrie* vieillit plus il augmente en qualité
 - La *Quality* d'un objet n'est jamais supérieure à 50
 - *Sulfuras*, étant un objet légendaire, ne doit jamais être vendu ou diminuer en qualité
 - *Backstage Pass*, comme *AgedBrie*, augmente la *Quality* à mesure que sa valeur *SellIn* approche: la qualité augmente de 2 quand il y a 10 jours ou moins et de 3 quand il y a 5 jours ou moins mais la qualité tombe à 0 après le concert

## Objectif

Nous avons récemment signé un fournisseur d'articles *Conjured*. Cela nécessite une mise à jour de notre système:
 - Les éléments *Conjured* se dégradent en qualité deux fois plus vite que les objets normaux

## Règles
La réalisation de cet exercice se fera en 3 étapes:
 - Ecriture des tests unitaires
 - Refactoring du code en POO dans l'optique de rajouter simplement un nouvel objet
 - L'ajout d'un nouvel objet *Conjured*

## Conseils
N'hésitez pas à apporter des modifications à la méthode *UpdateQuality*  et à changer complètement le code tant que tout fonctionne correctement. Cependant, **ne modifiez pas** la classe *Item* ni la signature du constructeur de *GuildedRose* (*Item[] items*), car celles-ci appartiennent au gobelin situé dans le coin qui passera immédiatement en mode berserk et vous assommera, ou pire...

Cela ne vous empêche pas d'avoir votre propre représentation des objets à manipuler.
Vous trouverez une classe *ItemFactory* (à implémenter) prenant en paramètre un *Item* et retournant un objet *AbstractItem* (à implémenter également) qui sera à étendre par vos objets.

Utiliser **EclEmma** pour vérifier que vos tests couvrent tout le code.

Attention, ne pas oublier le comportement par default lorsque le nom de l'objet ne correspond pas à l'un des 4 cités.

Clarification: un article ne peut jamais avoir sa qualité supérieure à 50, cependant *Sulfuras* est un objet légendaire et sa qualité est de 80 et ne change jamais.

**BON COURAGE :)**