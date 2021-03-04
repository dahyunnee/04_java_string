package step4_01.string;


/*
 * 
 *  문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  - 학생 정보와 성적이 담긴 데이터
 * 	student => 1.id 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 *  
 * */


public class StringEx20_테스트문제 {

	public static void main(String[] args) {
			
		String [][] students = {
								{"제임스 고슬링","신촌","1001"}, 
								{"스티브워즈니악","강남","1002" },
								{"데니스리치" ,"대치", "1003"}, 
								{"팀버너스리" , "강동","1004"}
							   };
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};		
		
		int maxScore = 0;
		int maxStudent = 0;
		
		for (int i = 0; i < students.length; i++) {
			
			int sumofScore = 0;
			
			for (int j = 1; j < score.length;) {
				
				if (students[2].equals(score[0])) {		//번호 일치하는 경우
					
					j += 4;
					sumofScore += Integer.parseInt(score[j][2]); 
				}
				else j ++;
				
			}
			
			if (maxScore < sumofScore ) {			//과목 다 더해지면 비교해야함!!!!!!
				
				
				maxScore = sumofScore;
				maxStudent = Integer.parseInt(students[i][2]);
			}
		}
		
		
		
	}

}
