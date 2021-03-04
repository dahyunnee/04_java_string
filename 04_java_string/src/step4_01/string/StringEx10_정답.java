package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

//2021.03.03 19:29 ~ 19:37
public class StringEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		System.out.println("제시어 : " + start);
		
		while(true) {
			
			System.out.print("입력 : ");
			String inputAnswer = scan.next();
			
			if (inputAnswer.equals("quit")) break;	//while문 빠져나옴
			
			//첫글자 추출
			char inputlastWord = inputAnswer.charAt(0);
			//마지막 글자 추출
			char prevLastword = start.charAt(start.length() - 1);
			
			if ( inputlastWord != prevLastword ) {
				
				System.out.println("땡. 다시 입력");
				continue;
			}
			
			else {
				
				start = inputAnswer;
				System.out.println("제시어 : " + start);
			}
			
		}

	}

}
