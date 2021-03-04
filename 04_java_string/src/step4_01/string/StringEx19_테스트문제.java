package step4_01.string;

/*
 * 
 * 문제) 전체 성적(총점)이 1등인 학생 이름 출력
 * 
 *  학생 정보와 성적이 담긴 데이터 이다 
 * 	student => 1.이름 2.주소 3.번호
 *  score   => 1.번호 2.국어 3.수학 4.영어 점수
 *  
 *  
 * */

public class StringEx19_테스트문제 {

	public static void main(String[] args) {
		
		String [][] students = {
								 {"제임스 고슬링","신촌","1001"}, 
								 {"스티브워즈니악","강남","1002" },
								 {"데니스리치" ,"대치", "1003"}, 
								 {"팀버너스리" , "강동","1004"}
							  };
		
		String[][] scores = {
								{"1001" ,"100" ,"20" , "30"},
								{"1002" ,"10" ,"60" , "60"},
								{"1003" ,"23" ,"63" , "31"},
								{"1004" ,"45" ,"30" , "35"},
							};

		 
		
		
		int maxScore = 0;
		int maxStudent = 0;
		
		for (int i = 0; i < students.length; i++) {
			
			int sumofScore = 0;
			
			for (int j = 0; j < scores.length; j++) {		
				
				if (students[i][2].equals(scores[i][0])) {	//학생번호가 일치하는 경우
					//총점 계산
					sumofScore += Integer.parseInt(scores[i][1]) + Integer.parseInt(scores[i][2]) + Integer.parseInt(scores[i][3]) ;
					break;
				}
					
			}
			
			if (maxScore < sumofScore) {		//최고점과 비교
				
				maxScore = sumofScore;
				maxStudent = Integer.parseInt(students[i][2]);
			}
			
		}
		
		
		System.out.println("총점이 1등인 학생은 " + maxStudent + "이고 총점은 "  + maxScore + "입니다. ");

	}

}
