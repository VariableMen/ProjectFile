package com.kh.animal.model.vo;

public class Lion extends Animal{

	private int exp;
	private int hp;
	private final int power = 20;
	private String name;
	
	public Lion() {
		
	}
	
	public Lion(int exp, int hp, String name) {
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
		System.out.println("사자가 웁니다.");
		
	}

	@Override
	public void die() {
		System.out.println("사자가 죽었습니다.");
		
	}

	@Override
	public void attack() {
		System.out.println("사자가 공격합니다.");
		
	}

	@Override
	public void hit() {
		System.out.println("사자가 비명을 지르며 hp가 감소합니다.");
		setHp(getHp() - 10);
		
		if(getHp() <= 0 ) {
			die();
			System.out.println("경험치가 " + getExp() + "만큼 상승합니다.");
		}
		
	}

}
