package step4_01.string;


//문자열 관련 메소드

public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "megait";
		System.out.println(str);
		System.out.println("=========================");
		
		// [1] : 문자열의 길이 => length()

		System.out.println(str.length());
		
		int size = str.length();
		System.out.println(size);
		
		System.out.println("=========================");
	
		// [2] : 문자 한 개 추출 (인덱싱) => charAt(index)
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		
		char ch = str.charAt(2);
		System.out.println(ch);
		
		System.out.println(str.charAt(str.length() - 1));
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
		}
		
		System.out.println("=========================");
		
		// [3] : 문자 여러 개 추출 (슬라이싱) => substring()
		
			//3-1) substring(index1 이상, index2 미만)
		
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(4, 6));
		
		System.out.println(str.substring(0, str.length()));
		
		String subStr = str.substring(2, 4);
		System.out.println(subStr);

		System.out.println();
		
			//3-2) substring(index1 부터 끝까지)
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));

		
		System.out.println("=========================");
		
		// [4] : 구분자로 잘라내기 => split("구분자")  - 배열의 형태로 리턴

		String str1 = "hello, java";
		String str2 = "hello java programming";
		String str3 = "hello@java@programming@megait";
		
		String[] temp = str1.split(",");
		
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println(); 
		
		
		temp = str2.split(" ");
		
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();

		
		temp = str3.split("@");
		
		System.out.println(temp.length);
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("=========================");
	
		
		// [5] : 문자열 비교 => compareTo()
		
		str1 = "ac";
		str2 = "dc";
		str3 = "ac";
		String str4 = "ad";
		
		System.out.println(str1.compareTo(str2));	//왼쪽값(기준값)이 작을 경우 음수가 반환된다.
		System.out.println(str2.compareTo(str1));	//왼쪽값(기준값)이 클 경우 양수가 반환된다.
		System.out.println(str1.compareTo(str3));	//양쪽값이 같을 경우 0이 반환된다.
		System.out.println(str1.compareTo(str4));
		
		
		
	}

}
