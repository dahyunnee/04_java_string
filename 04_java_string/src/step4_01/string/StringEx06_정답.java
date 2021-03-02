package step4_01.string;

//# 문자열 1차원



//2021.03.02 21:08 ~ 21:13

public class StringEx06_정답 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		int[] arr = new int[3];
		
		String[] scoreArray = str.split("/");
		
		int sumofScore = 0;
		
		for (int i = 0; i < scoreArray.length; i++) {
			
			int score = Integer.parseInt(scoreArray[i]);
			sumofScore += score;
			
		}
		
		System.out.println("총점 : " + sumofScore);
		
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for (int i = 0; i < scores.length; i++) {
			
			String str1 = "";
			
			if ( i == scores.length - 1) {
				str1 = scores[i] + "";
			}
			else str1 = scores[i] + "/";
			text += str1;
		}

		System.out.println(text);

	}

}
