package com.aubay.poo.calculatrice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Calculatrice {

	public BigDecimal calcule(final String operation) {
		int nombreOperation = (int) OperationEnum.nombreOperation(operation);
		final List<Operation> resultats = new ArrayList<>();
		if (nombreOperation > 0) {
			resultats.add(faireCalcul(operation));
			IntStream.range(0, nombreOperation - 1).forEach(i ->
				resultats.add(faireCalcul(resultats.get(resultats.size() - 1).getNewOperation()))
			);
		} else {
			throw new UnsupportedOperationException("operation non valide");
		}
		return resultats.get(resultats.size() - 1).getResultat();
	}
	
	public Operation faireCalcul(final String operationTodo) {
		final Integer indexOperator = OperationEnum.calculeIndexOperator(operationTodo);
		
		final OperationEnum operationEnumTodo = OperationEnum.valueOf(operationTodo.charAt(indexOperator));
		Integer secondIndexOperator = OperationEnum.calculeIndexOperator(operationTodo.substring(indexOperator + 1));
		
		if (secondIndexOperator != -1) {
			secondIndexOperator += indexOperator + 1;
		}
		
		final String droite;
		if (secondIndexOperator == -1) {
			droite = operationTodo.substring(indexOperator + 1);
		} else {
			droite = operationTodo.substring(indexOperator + 1, secondIndexOperator);
		}
		final String gauche = operationTodo.substring(0, indexOperator);
		
		final Operation oper = OperationFactory.creerOperation(operationEnumTodo, BigDecimalFactory.creerBigDecimal(gauche), BigDecimalFactory.creerBigDecimal(droite));
		oper.setResultat(oper.faireOperation());
		if (secondIndexOperator != -1) {
			oper.setNewOperation(oper.getResultat() + operationTodo.substring(secondIndexOperator));
		} else {
			oper.setNewOperation("");
		}
		return oper;
	}
	
}
