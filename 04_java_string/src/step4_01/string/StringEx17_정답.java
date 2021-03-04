package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */

//2021.03.03 20:44 ~ 20:49
public class StringEx17_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		String[] arrayofText = text.split(" ");
		arrayofText[arrayofText.length - 1] = "short";
		
		for (int i = 0; i < arrayofText.length; i++) {
			
			if (arrayofText[i].equals(word)) {
				
				System.out.print("바꿀 단어 입력 : ");
				arrayofText[i] = scan.next();
				
				break;
			}
			
			if (i == arrayofText.length - 1 && !arrayofText[i].equals(word)) {
				
				System.out.println("존재하지 않는 단어입니다.");
			}
		}
		
		arrayofText[arrayofText.length - 1] += ".";
		
		for (int i = 0; i < arrayofText.length; i++) {
			
			System.out.print(arrayofText[i] + " ");
		}
		
	}

}
