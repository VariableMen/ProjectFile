package com.kh.animal.run;

import java.util.Scanner;

import com.kh.animal.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		PlayerManager pm = new PlayerManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�÷��̾� �̸��� �Է� : ");
		String name = sc.nextLine();
		
		pm.startGame(name);

	}

}
