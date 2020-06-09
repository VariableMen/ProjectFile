package com.kh.animal.model.vo;

public class Player{

	private int power = 10;
	private int hp = 100;
	private int maxHp = 100;
	private int exp = 0;
	private int maxExp = 100;
	private int level = 1;
	private String name;
	
	public Player( String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public void attack() {
		System.out.println(getName() + "가 공격합니다.");
	}

	public void die() {
		System.out.println(getName() + "가 죽었습니다.");
	}

	//power , hp , exp , level
	public void levelUp() {
		System.out.println(getName() + "가 레벨 " + getLevel() + "로 업했습니다.");
		setPower(getPower() + 2);
		setMaxHp(getMaxHp() + 10);
		setHp(getHp() + 10);
		setExp(getExp() * 2);
		setLevel(getLevel() + 1);
		setMaxExp(getMaxExp() * 3);
		
	}
	
	public void status() {
	
			getPower();
			getHp();
			getExp();
			getLevel();
			getMaxExp();

		
	}
	
}
