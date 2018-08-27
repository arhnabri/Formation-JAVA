# Exercice sur Java 7
L'idée de cet exercice est la classe à l'aide du scénario fournit.

# Projet

Vous devez juste compléter la classe TestLauncher !

## Explication
Dans le répertoire src/main/resources vous allez retrouver un fichier exemple.xlsx.
En premier, vous devez utiliser la classe Path afin de charger le fichier.
Puis vous devez lire le fichier à l'aide de Poi.
Pour cela ouvrez le fichier avec POI puis utilisez les iterators pour lire le fichier : 
 - workbook.sheetIterator() lit les pages
 - sheet.rowIterator() lit une ligne
 - row.cellIterator() lit les cellules.
 
Vous devez ensuite à partir d'une ligne du fichier excel créer une Personne.
Dans la première colonne du fichier excel les valeurs possibles sont :
 - "H" il faut créer un objet de type Homme
 - "F" il faut créer un objet de type Femme
 
La dernière colonne est une date. Pour la mettre au bon format il faut utiliser la méthode **convertDate** présente dans la classe Personne.
Puis enfin vous devez parcourir la liste de personne et imprimer à l'aide de la méthode **toString** le résultat.

## Conseil

Pour lire le fichier vous devez utiliser **new XSSFWorkbook(is)** qui prend en paramètre un InputStream.
Pour lire une date en POI vous pouvez utilisez l'instruction suivante : 
if (HSSFDateUtil.isCellDateFormatted(cell)) {
	cell.getDateCellValue();
}

**BON COURAGE :)**