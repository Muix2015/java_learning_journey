package com.calc;

public abstract class Operation {
	
	private double _numberA = 0;
	private double _numberB = 0;
	
	
	
	public double get_numberA() {
		return _numberA;
	}



	public void set_numberA(double _numberA) {
		this._numberA = _numberA;
	}



	public double get_numberB() {
		return _numberB;
	}



	public void set_numberB(double _numberB) {
		this._numberB = _numberB;
	}
	public abstract double  GetResult(double numberA, double numberB, char operator);


//	public static double GetResult(double numberA, double numberB, char operator) {
//		double result = 0.1d;
////		switch(operator) {
////		case '+':
////			result = numberA + numberB;
////			break;
////		case '-':
////			result = numberA - numberB;
////			break;
////		case '*':
////			result = numberA * numberB;
////			break;
////		case '/':
////			result = numberA / numberB;
////			break;
////		}
//		return result;
//	}
}

class OperationAdd extends Operation {
	public double GetResult(double numberA, double numberB, char operator) {
		double result = 0;
		result = numberA + numberB;
		return result;
	}
}

class OperationSub extends Operation {
	public double GetResult(double numberA, double numberB, char operator) {
		double result = 0;
		result = numberA - numberB;
		return result;
	}
}

class OperationMul extends Operation {
	public double GetResult(double numberA, double numberB, char operator) {
		double result = 0;
		result = numberA * numberB;
		return result;
	}
}

class OperationDiv extends Operation {
	public double GetResult(double numberA, double numberB, char operator) {
		double result = 0;
//		if (numberB == 0) {
//			throw new Exception("除数不能为0.");
//		}
		result = numberA / numberB;
		return result;
	}
}