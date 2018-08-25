package com.aubay.functionnal.avant;

import java.util.Comparator;

public class CompareSalaireInverse implements Comparator<Employe> {

	/**
	 * Compare 2 employés suivant leur salaire.
	 * 
	 * @return un nombre positif si le salaire de e1 est supérieur au salaire de
	 *         e2, 0 si les 2 salaires sont les mêmes, et négatif sinon.
	 */
	@Override
	public int compare(Employe e1, Employe e2) {
		return Double.compare(e2.getSalaire(), e1.getSalaire());
	}
}