package com.calc;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		try {
			System.out.println("����������A: ");
			double numA = input.nextDouble();
			System.out.println("��ѡ���������(+, -, *, /): ");
			char operator = input.next().charAt(0);
			System.out.println("����������B: ");
			double numB = input.nextDouble();
			double result;
			Operation oper = null;
			oper = OperationFactory.createOperate(operator);
			result = oper.GetResult(numA, numB, operator);
			System.out.println("�����: " + result);
		} catch (Exception ex) {
			System.out.println("�����������" + ex.getMessage());
		}
	}

}
