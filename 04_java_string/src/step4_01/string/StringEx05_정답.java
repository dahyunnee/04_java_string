package step4_01.string;


//2021.03.02 21:03 ~ 21:08
public class StringEx05_정답 {

	public static void main(String[] args) {
		
		int thisYear = 2021;
		
		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 33세
		
		String strAge = jumin.substring(0,2);
		
		int age = thisYear - ( Integer.parseInt(strAge) + 1900 ) + 1;
		System.out.println(age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		
		//int gender = Integer.parseInt(jumin.substring(7,8));
		int gender = jumin.charAt(7);
		
		if (gender == 1) System.out.println("남성");
		else System.out.println("여성");
	}

}
