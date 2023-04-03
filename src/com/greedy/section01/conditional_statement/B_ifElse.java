package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class B_ifElse {
	
	/**
	 * <pre>
	 * 단독 if-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 정수 홀수 짝수 판별용 기능 제공
	 * </pre>
	 */
	public void testSimpleIfElseStatement() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("입력하신 정수는 홀수입니다.");
			}
		
		else {
			System.out.println("입력하신 정수는 짝수입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	/**
	 * <pre>
	 * 중첩 If-else 구문 흐름을 확인하기 위한 용도의 메소드
	 * 정수에서 양수 음수 0 중 한가지 인지 판별용 기능 제공
	 */
	public void testNestedIfElseStatement() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num != 0) {
			
			if(num > 0) {
				System.out.println("입력하신 숫자는 양수입니다.");
			}
			else {
				System.out.println("입력하신 숫자는 음수입니다.");
			}
		}
		
		else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
	}

}
