package com.kh.animal.run;

import java.util.Scanner;

import com.kh.animal.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		PlayerManager pm = new PlayerManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("플레이어 이름을 입력 : ");
		String name = sc.nextLine();
		
		pm.startGame(name);

	}

}
