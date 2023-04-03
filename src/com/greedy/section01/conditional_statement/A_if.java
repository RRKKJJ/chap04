package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class A_if {

	/**
	 * <pre>
	 * 단독 if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 *   정수 짝수 여부 판단 확인용
	 *   </pre>
	 */
	public void testSimpleIfStatement() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한 개를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();

	}

	/**
	 * <pre>
	 * 중첩 if 구문 흐름을 확인하기 위한 용도
	 * 양의 정수 짝수인지 여부 판단 확인용
	 */
	public void testNestedIfStatement() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한 개를 입력하세요");
		
		int num = sc.nextInt();
		
		if (num > 0) {
			
			if (num % 2 == 0) {
				
				System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
				
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
		
 }
}
