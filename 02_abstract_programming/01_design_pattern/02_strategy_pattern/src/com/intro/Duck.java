package com.intro;

public abstract class Duck {
	QuackBehavior quackBehavior; // ���� quackBehavior ����ʵ�����ɽ�
	FlyBehavior flyBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
		
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
