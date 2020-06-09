package com.kh.animal.model.vo;

public class Tiger extends Animal{
	
	private int exp;
	private int hp;
	private final int power = 15;
	private String name;
	
	public Tiger() {
		
	}
	
	public Tiger(int exp, int hp, String name) {
		super();
		this.exp = exp;
		this.hp = hp;
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	@Override
	public void cry() {
		System.out.println("ȣ���̰� ��ϴ�.");
		
	}

	@Override
	public void die() {
		System.out.println("ȣ���̰� �׾����ϴ�.");
		
	}

	@Override
	public void attack() {
		System.out.println("ȣ���̰� �����մϴ�.");
		
	}

	@Override
	public void hit() {
		System.out.println("ȣ���̰� ����� ������ hp�� �����մϴ�.");
		setHp(getHp() - 10);
		
		if(getHp() <= 0 ) {
			die();
			System.out.println("����ġ�� " + getExp() + "��ŭ ����մϴ�.");
		}
		
	}

}
