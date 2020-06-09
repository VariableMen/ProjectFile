package com.kh.animal.controller;

import java.util.Scanner;

import com.kh.animal.model.vo.Animal;
import com.kh.animal.model.vo.Chicken;
import com.kh.animal.model.vo.Lion;
import com.kh.animal.model.vo.Player;
import com.kh.animal.model.vo.Tiger;

public class PlayerManager {
	
	Scanner sc = new Scanner(System.in);
	
	int power; int hp;
	
	public void startGame(String name) {
		boolean isTrue = true;
		
		Player p = new Player(name);
		
		do {
			power = p.getPower();
			System.out.println(name + "님께서 들어오셨습니다.");

			System.out.println("========= 게임 메뉴 ===========");
			System.out.println("1. 플레이어 정보보기");
			System.out.println("2. 동물의숲 입장");
			System.out.println("9. 게임종료하기");
			
			System.out.print("행동을 선택하세요 : ");
			String choose = sc.nextLine();
			
			switch(choose) {
			case "1" : /*stat(name);*/ 
			
			p.status();
			System.out.println("=======" + name + "님의 정보창입니다.=======");
			System.out.println("공격력 : " + p.getPower());
			System.out.println("체력 : " + p.getHp());
			System.out.println("경험치 : " + p.getExp());
			System.out.println("레벨 : " + p.getLevel());
			System.out.println();
			System.out.print("돌아갈까요?(y) : ");
			String exit = sc.nextLine();
			
			switch(exit) {
			case "y" : break;
			case "Y" : break;
			}
			
			break;
			///////////////////////////////////////////////////////////////////////////
			case "2" : /*dongmul(name); */
			
			boolean isTrue2 = true;
			
			int count = 1;
			do {
				
				power = p.getPower();
				
				for(int o = 0; o < count; o++) {
					System.out.println(name + "님께서 동물의숲에 들어오셨습니다.");	
				}

				System.out.println("========= 게임 메뉴 ===========");
				System.out.println("1. 닭이랑 싸우기");
				System.out.println("2. 호랑이랑 싸우기");
				System.out.println("3. 사자랑 싸우기");
				System.out.println("9. 그만싸우고 돌아가기");
				
				System.out.print("싸울 상대를 고르세요 : ");
				String choose2 = sc.nextLine();
				
				switch(choose2) {
				case "1" :  
					//exp,hp,power,name
					Animal c = new Chicken(100,100,"닭");
					c.cry();
					
					//닭 공격
					if( c instanceof Chicken) {
						((Chicken)c).attack();
						
						((Chicken)c).hit();
					}
					
					for(int d = 0; d < 1; d++) {
						hp = p.getHp() - ((Chicken)c).getPower();
						p.setHp(hp);
					}
					
					if(p.getHp() <= 0) {
						p.die();
						return;
					}
					
					
					for(int i = ((Chicken) c).getHp(); i > 0; i -= power) {
						if(c instanceof Chicken) {
							((Chicken)c).hit();
						}
					}
					
					//플레이어 경험치 증가
					p.setExp(p.getExp() + ((Chicken) c).getExp());
					
					if(p.getExp() >= p.getMaxExp() ) {
						p.levelUp();
					}
					
					break;
					
				case "2" :  
					Animal t = new Tiger(200,200,"호랑이");
					t.cry();
					
					//호랑이 공격
					if( t instanceof Tiger) {
						((Tiger)t).attack();
						((Tiger)t).hit();
					}
					
					for(int d = 0; d < 1; d++) {
						hp = p.getHp() - ((Tiger)t).getPower();
						p.setHp(hp);
					}
					
					if(p.getHp() <= 0) {
						p.die();
						return;
					}
					
					for(int i = ((Tiger) t).getHp(); i > 0; i -= power) {
						if(t instanceof Tiger) {
							((Tiger)t).hit();
						}
					}
					
					//플레이어 경험치 증가
					p.setExp(p.getExp() + ((Tiger) t).getExp());
					
					if(p.getExp() >= p.getMaxExp() ) {
						p.levelUp();
					}
					
					break;
					
				case "3" :  
					Animal l = new Lion(300,300,"사자");
					l.cry();
					
					//사자 공격
					if( l instanceof Lion) {
						((Lion)l).attack();
						((Lion)l).hit();
					}
					
					
					for(int d = 0; d < 1; d++) {
						hp = p.getHp() - ((Lion)l).getPower();
						p.setHp(hp);
					}
					
					if(p.getHp() <= 0) {
						p.die();
						return;
					}
					
					for(int i = ((Lion) l).getHp(); i > 0; i -= power) {
						if(l instanceof Lion) {
							((Lion)l).hit();
						}
					}
					
					//플레이어 경험치 증가
					p.setExp(p.getExp() + ((Lion) l).getExp());
					
					if(p.getExp() >= p.getMaxExp() ) {
						p.levelUp();
					}
					
					break;
					
				case "9" : hp = p.getMaxHp();
					p.setHp(hp);
					isTrue2 = false;break;
				}
				
			} while(isTrue2);
			
			
			
			break;
			
			case "9" : isTrue = false; return;
			}
			

			
		} while(isTrue);
		
	}
/*	
	//power , hp , exp , level
	public void stat(String name) {
		Player p = new Player(name);
		p.status();
		System.out.println("=======" + name + "님의 정보창입니다.=======");
		System.out.println("공격력 : " + p.getPower());
		System.out.println("체력 : " + p.getHp());
		System.out.println("경험치 : " + p.getExp());
		System.out.println("레벨 : " + p.getLevel());
		System.out.println();
		System.out.print("돌아갈까요?(y) : ");
		String exit = sc.nextLine();
		
		switch(exit) {
		case "y" : return;
		case "Y" : return;
		}
		
	}
	
	public void dongmul(String name) {
		boolean isTrue = true;
		
		int count = 1;
		do {
			Player p = new Player(name);
			power = p.getPower();
			
			for(int o = 0; o < count; o++) {
				System.out.println(name + "님께서 동물의숲에 들어오셨습니다.");	
			}

			System.out.println("========= 게임 메뉴 ===========");
			System.out.println("1. 닭이랑 싸우기");
			System.out.println("2. 호랑이랑 싸우기");
			System.out.println("3. 사자랑 싸우기");
			System.out.println("9. 그만싸우고 돌아가기");
			
			System.out.print("싸울 상대를 고르세요 : ");
			String choose = sc.nextLine();
			
			switch(choose) {
			case "1" :  
				//exp,hp,power,name
				Animal c = new Chicken(100,100,"닭");
				c.cry();
				
				//닭 공격
				if( c instanceof Chicken) {
					((Chicken)c).hit();
				}
				
				for(int i = ((Chicken) c).getHp(); i > 0; i -= power) {
					if(c instanceof Chicken) {
						((Chicken)c).hit();
					}
				}
				
				//플레이어 경험치 증가
				p.setExp(p.getExp() + ((Chicken) c).getExp());
				
				if(p.getExp() >= p.getMaxExp() ) {
					p.levelUp();
				}
				
				break;
				
			case "2" :  
				Animal t = new Tiger(200,200,"호랑이");
				t.cry();
				
				//호랑이 공격
				if( t instanceof Tiger) {
					((Tiger)t).hit();
				}
				
				for(int i = ((Tiger) t).getHp(); i > 0; i -= power) {
					if(t instanceof Tiger) {
						((Tiger)t).hit();
					}
				}
				
				//플레이어 경험치 증가
				p.setExp(p.getExp() + ((Tiger) t).getExp());
				
				if(p.getExp() >= p.getMaxExp() ) {
					p.levelUp();
				}
				
				break;
				
			case "3" :  
				Animal l = new Lion(300,300,"사자");
				l.cry();
				
				//사자 공격
				if( l instanceof Lion) {
					((Lion)l).hit();
				}
				
				for(int i = ((Lion) l).getHp(); i > 0; i -= power) {
					if(l instanceof Lion) {
						((Lion)l).hit();
					}
				}
				
				//플레이어 경험치 증가
				p.setExp(p.getExp() + ((Lion) l).getExp());
				
				if(p.getExp() >= p.getMaxExp() ) {
					p.levelUp();
				}
				
				break;
				
			case "9" : isTrue = false; return;
			}
			
		} while(isTrue);
		
		
		
	}
	*/
}
