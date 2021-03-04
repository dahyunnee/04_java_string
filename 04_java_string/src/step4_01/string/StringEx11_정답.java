package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */


//2021.03.03 19:38 ~ 19:54
public class StringEx11_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];	//100개의 항목 가능
		for(int i=0; i<items.length; i++) {	//각 항목마다 카테고리 + 아이템
			items[i][0] = "";
			items[i][1] = "";
		}
		
		//int itemCount = 0;
		int categCount = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			
			System.out.print(": ");
			int sel = scan.nextInt();
			
			if	    (sel == 1) {
				
				for (int i = 0; i < items.length; i++) {
					
					if ( items[i][0].equals("") ) {
						
						break;
					}
					else categCount ++;
			
				}
				
				if (categCount > items.length) {
					
					System.out.println("카테고리 개수 초과");
					continue;
					
				}
				
				
				System.out.print("카테고리를 입력하세요 : ");
				String inputCateg = scan.next();
				
				items[categCount][0] += inputCateg;
				
				
			}
			else if (sel == 2) {
				
				int categIndex = -1;
				
				System.out.print("추가하실 아이템의 카테고리를 입력하세요");
				String inputCateg = scan.next();
				
				for (int i = 0; i < items.length; i++) {
					
					if ( inputCateg.equals(items[i][0])) {
						
						categIndex = i;
						break;
					}
				}
				
				if (categIndex == -1) {
					
					System.out.println("카테고리가 존재하지 않습니다.");
					continue;
				}
				
				System.out.print("아이템을 입력하세요 ");
				String inputItem = scan.next();
				
				items[categIndex][1] += inputItem + "/";
				
			}
			else if (sel == 3) {
				
				for (int i = 0; i < items.length; i++) {
					
					if (items[i][0].equals("")) {
						
						break;
					}
					
					System.out.println(Arrays.toString(items[i]));
				}
			}
			
			System.out.println();
			
		}



	}

}
