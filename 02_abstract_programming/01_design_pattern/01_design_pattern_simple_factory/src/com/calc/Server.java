package com.calc;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		try {
			System.out.println("请输入数字A: ");
			double numA = input.nextDouble();
			System.out.println("请选择运算符号(+, -, *, /): ");
			char operator = input.next().charAt(0);
			System.out.println("请输入数字B: ");
			double numB = input.nextDouble();
			double result;
			Operation oper = null;
			oper = OperationFactory.createOperate(operator);
			result = oper.GetResult(numA, numB, operator);
			System.out.println("结果是: " + result);
		} catch (Exception ex) {
			System.out.println("你的输入有误：" + ex.getMessage());
		}
	}

}
