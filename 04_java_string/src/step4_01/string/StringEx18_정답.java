package step4_01.string;

import java.util.Random;
import java.util.Scanner;

/*

	# 영어단어 맞추기  
	
	1) 영어단어가 전부 * 로 표시된다. 
	2) 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
	3) 만약에 같은 철자가 여러개면 한번에 벗겨진다. 
	4) 전부 벗겨지거나 맞추면 종료 

*/

//2021.03.03 21:00 ~  21:35
public class StringEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int score = 100;
		String word = "performance";			// e -> 1,10 r -> 2, 5
		String meaning = "공연";
		int size = word.length();
		char[] check = new char[size];  // 힌트 체크를 통해서 확인할수있다.
		boolean isCorrect = false;
		
		
		for (int i = 0; i < check.length; i++) {
			
			check[i] = '*';
		}
		
		while (true) {
			
			if (isCorrect == true) break;
			
			String strCheck = "";
			for (int i =0; i< size; i++) {
				
				System.out.print(check[i]);
				strCheck += check[i];
				
			}
			
			System.out.println();
			if (strCheck.equals(word)) break;
			
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			
			System.out.println();
			
			System.out.print("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			
			if (me.length() != word.length()) {			//글자수 자체가 맞지 않는 경우
				
				while(true) {
					
					int randomIndex = rand.nextInt(word.length());
					
					if (randomIndex == 1 || randomIndex == 10) {		//e인 경우
						
						if (check[randomIndex] == '*') {
							
							check[1] = word.charAt(randomIndex);
							check[10] = word.charAt(randomIndex);
							
							break;
						}
						else continue;
					}
					
					else if(randomIndex == 2 || randomIndex == 5) {		//r인 경우
						
						if (check[randomIndex] == '*') {
							
							check[2] = word.charAt(randomIndex);
							check[5] = word.charAt(randomIndex);
							
							
							break;
						}
						else continue;
					}
					else {
						
						if (check[randomIndex] != '*') continue;
					}
					
				
					check[randomIndex] = word.charAt(randomIndex);
					break;
				
							
				}
				
				score -= 5;
				continue;	
				
			}
			
			
			for (int i = 0; i < me.length(); i++) {		//글자수는 일치하는 경우
				
				if (me.charAt(i) != word.charAt(i)) {		//글자수는 일치하는데 틀림
					
					while(true) {
						
						int randomIndex = rand.nextInt(word.length());
						
						if (randomIndex == 1 || randomIndex == 10) {		//e인 경우
							
							if (check[randomIndex] == '*') {
								
								check[1] = word.charAt(randomIndex);
								check[10] = word.charAt(randomIndex);
								
								break;
							}
							else continue;
						}
						
						else if(randomIndex == 2 || randomIndex == 5) {		//r인 경우
							
							if (check[randomIndex] == '*') {
								
								check[2] = word.charAt(randomIndex);
								check[5] = word.charAt(randomIndex);
								
								break;
							}
							else continue;
						}
						
						else {
							
							if (check[randomIndex] != '*') continue;
						}
						
					
						check[randomIndex] = word.charAt(randomIndex);
						break;
					}
					
					score -= 5;
					break;
				}
				
				
				if (i == me.length() - 1 && me.charAt(i) == word.charAt(i)) {		//정답인경우
					
					System.out.println("정답");
					
					for (int j = 0; j < check.length; j++) {		
						
						check[j] = word.charAt(j);
					}
					
					isCorrect = true;
					
				}
			}
			
			
		}
		
		System.out.println("점수는 " + score + "입니다. ");

	}

}
