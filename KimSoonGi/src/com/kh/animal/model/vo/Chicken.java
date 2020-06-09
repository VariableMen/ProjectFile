package com.kh.animal.model.vo;

public class Chicken extends Animal{
	
	private int exp;
	private int hp;
	private final int power = 10;
	private String name;
	
	public Chicken() {
		
	}
	
	public Chicken(int exp, int hp, String name) {
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
		System.out.println("닭이 웁니다.");
		
	}

	@Override
	public void die() {
		System.out.println("닭이 죽었습니다.");
		
	}

	@Override
	public void attack() {
		System.out.println("닭이 공격합니다.");
		
	}

	@Override
	public void hit() {
		System.out.println("닭이 비명을 지르며 hp가 감소합니다.");
		setHp(getHp() - 10);
		
		if(getHp() <= 0 ) {
			die();
			System.out.println( "경험치가 " + getExp() + "만큼 상승합니다.");
		}
		
	}
	
	
	
}
