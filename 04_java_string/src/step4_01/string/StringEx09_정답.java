package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*
 * # 타자연습 게임[1단계]
 * 
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예)
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 * 문제 : jsp
 */

//2021.03.03 19:22 ~ 19:28
public class StringEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for (int i = 0; i < words.length; i++) {	
			
			int randomNumber = rand.nextInt(words.length);
			
			if (words[randomNumber].equals(" ")) {	//중복되는 경우 제외
				
				i--;
				continue;
			}
			
			while(true) {
				
				System.out.println("문제 : " + words[randomNumber]);
				System.out.print("입력 : ");
				
				String inputAnswer = scan.next();
				
				if (inputAnswer.equals(words[randomNumber])){
					
					words[randomNumber] = " ";
					break;
				}
				
			}
			
			
		}
		

		scan.close();
	}

}
