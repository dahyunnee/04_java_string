package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

//2021.03.03 20:33 ~ 20:41
public class StringEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		int numberofNum = 0;
		boolean isNum = false;
		
		for (int i = 0; i < text.length(); i++) {
			
			char numberOrchar = text.charAt(i);
			
			
			if ( numberOrchar >= '0' && numberOrchar <= '9') {
				
				numberofNum ++;
				isNum = true;
				
			}
			
		}
		
		if ( numberofNum == text.length()) System.out.println("숫자만 있음");
		else if ( isNum == true) System.out.println("숫자와 문자 둘다 존재");
		else if ( isNum == false ) System.out.println("문자만 존재");
	}

}
