package step4_01.string;

//문제) 아래의 데이터는  각각의 회원이 물건을 구입했을때마다 기록한 내용이다.
//		 데이터를 아래와 같이 출력 하시요 (각 회원별 구입 총합 )	
/*
  =====================
	10001 김철수 2670
	10002 이영희 1950
	10003 유재석 4080
	10004 박명수 7130
   =====================		  
 */


public class StringEx22_테스트문제 {

	public static void main(String[] args) {
		
		String data = "10001/김철수/600\n";
		data += "10002/이영희/800\n";
		data += "10001/김철수/1400\n";
		data += "10003/유재석/780\n";
		data += "10002/이영희/950\n";
		data += "10004/박명수/330\n";
		data += "10001/김철수/670\n";
		data += "10003/유재석/3300\n";
		data += "10002/이영희/200\n";
		data += "10004/박명수/6800\n";
		
		
		String[] dataArray = data.split("\n");
		
		String[][] customerArray = new String[4][3];
		int customerIndex = 0;
		
		
		for (int i = 0; i < dataArray.length; i++) {
			
			
			String[] dataarrayStr = dataArray[i].split("/");
			
			//dataarrayStr[0] = 10002 
			// [1] = 이영희
			// [2] = 800
			
			
			for (int j = 0; j < customerArray.length; j++) {
				
				if ( dataarrayStr[0].equals(customerArray[j][0])) {		//customer 정보 존재하는 경우
					
					
					int sumofMoney = Integer.parseInt(customerArray[j][2]) + Integer.parseInt(dataarrayStr[2]);
					customerArray[j][2] = Integer.toString(sumofMoney); 
							
					break;
					
				}
				
				if (j == customerArray.length - 1) {
					
					customerArray[customerIndex][0] = dataarrayStr[0];	//row에 추가
					customerArray[customerIndex][1] = dataarrayStr[1];
					customerArray[customerIndex ++][2] = dataarrayStr[2];
							
					
				}
				
				
			}
			
		}
		
		System.out.println("====================================");
		System.out.println();
		
		for (int i = 0; i < customerArray.length; i++) {
			
			System.out.print("    ");
			
			for (int j = 0; j < customerArray[i].length; j++) {
				
				System.out.print(customerArray[i][j] + "    ");
				
			}
			
			System.out.println("\n");
			
		}
		
		System.out.println("====================================");
		

	}

}
