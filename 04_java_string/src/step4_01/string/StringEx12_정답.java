package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */


//2021.03.03 20:00 ~ 20:20
public class StringEx12_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;
		
		int idIndex = -1;
		
		while(true) {
			
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				
				System.out.print("[ ID ] : ");
				String inputId = scan.next();
				
				for (int i = 0; i < ids.length; i++) {		
					
					if (inputId.equals(ids[i])) {	//id 존재하는 경우
						
						idIndex = i;
						break;
					}
				}
				
				if (idIndex == -1) {		//id 존재하지않음
					
					System.out.println("존재하지 않는 아이디입니다.");
					System.out.println();
					continue;
				}
				
				System.out.print("[ PW ] : ");
				String inputPw = scan.next();
				
				if ( !inputPw.equals(pws[idIndex]) ) {	//비밀번호 틀린경우
					
					System.out.println("비밀번호 오류.");
					System.out.println();
					idIndex = -1;
					continue;
					
				}
				
				else {	//비밀번호 맞는 경우
					
					System.out.println("로그인 성공");
					System.out.println();
				}
				
				
			}
			else if (sel == 2) {		//로그아웃
				
				System.out.println("로그아웃 성공");
				System.out.println();
				
				idIndex = -1;
				
			}
			else if (sel == 3) {		//아이템 품목 보여주기
				
				for (int i = 0; i < items.length; i++) {
					
					System.out.println(i + ") " + items[i]);
				}
				System.out.println();
				
			}
			else if (sel == 4) {		//장바구니
				
				
				if (idIndex == -1) {
					
					System.out.println("로그인을 먼저 해주세요");
					System.out.println();
					continue;
				}
				System.out.print("장바구니에 넣을 품목의 번호 선택");
				int intoBag = scan.nextInt();
				
				//번호 잘못 선택
				if (intoBag < 0 || intoBag >= items.length) {		
					
					System.out.println("잘못 선택하셨습니다.");
					System.out.println();
					continue;
				}
				
				//장바구니 넘치는 경우
				if (count > MAX_SIZE) {
					
					System.out.println("장바구니를 비워주세요");
					System.out.println();
					continue;
				}
				
				
				//장바구니에 저장
				jang[count][0] = idIndex;
				jang[count++][1] = intoBag; 
				
				
				System.out.println();
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}



	}

}
