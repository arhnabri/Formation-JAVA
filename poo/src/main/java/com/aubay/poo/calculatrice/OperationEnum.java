package com.aubay.poo.calculatrice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum OperationEnum {

	PLUS('+'), MOINS('-'), DIVISE('/'), MULTIPLIE('*');

	private int operateur;

	OperationEnum(final int operateur) {
		this.operateur = operateur;
	}

	public final int getOperateur() {
		return operateur;
	}

	public static Integer calculeIndexOperator(final String operationTodo) {
		List<Integer> listIndexOperations = new ArrayList<>();
		listIndexOperations.add(operationTodo.indexOf(PLUS.getOperateur()));
		listIndexOperations.add(operationTodo.indexOf(MOINS.getOperateur()));
		listIndexOperations.add(operationTodo.indexOf(MULTIPLIE.getOperateur()));
		listIndexOperations.add(operationTodo.indexOf(DIVISE.getOperateur()));
		listIndexOperations = listIndexOperations.stream().filter(index -> index != -1).collect(Collectors.toList());
		if (listIndexOperations.isEmpty()) {
			return -1;
		}
		return listIndexOperations.stream().mapToInt(index -> index).min().getAsInt();
	}

	public static OperationEnum valueOf(final int character) {
		final OperationEnum operationEnum;
		switch (character) {
		case '+':
			operationEnum = OperationEnum.PLUS;
			break;
		case '-':
			operationEnum = OperationEnum.MOINS;
			break;
		case '/':
			operationEnum = OperationEnum.DIVISE;
			break;
		case '*':
			operationEnum = OperationEnum.MULTIPLIE;
			break;
		default:
			throw new UnsupportedOperationException("operation non valide");
		}
		return operationEnum;
	}
	
	public static long nombreOperation(final String operation) {
		return operation.chars().filter(character -> PLUS.getOperateur() == character
				|| MOINS.getOperateur() == character
				|| MULTIPLIE.getOperateur() == character 
				|| DIVISE.getOperateur() == character)
				.count();
	}

}
