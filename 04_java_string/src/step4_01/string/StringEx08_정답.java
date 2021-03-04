package step4_01.string;


//2021.03.03 19:17 ~ 19:21
public class StringEx08_정답 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
		
		for (int i = 0; i < score.length; i++) {
			
			str += name[i] + "/";
			
			if ( i != score.length - 1) str += Integer.toString(score[i]) + ",";
			else str += Integer.toString(score[i]);
			
		}
		
		System.out.println(str);
		
		
				
		
		

	}

}
