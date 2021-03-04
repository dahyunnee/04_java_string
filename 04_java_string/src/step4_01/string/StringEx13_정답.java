package step4_01.string;

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)


//2021.03.03 20:21 ~ 20:30

public class StringEx13_정답 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		
		for (int i = 0; i < names.length; i++) {
			
			int maxDifference = 0;
			int minIndex = i;
			
			for (int j = i+1; j < names.length; j++) {
			
				if ( names[j].compareTo(names[i]) < maxDifference ) {
					
					maxDifference = names[j].compareTo(names[i]);	// 음수 -> j가 더 작음
					minIndex = j;
					
				}
			}
			
			if ( minIndex != i) {
				
				String temp = names[i];
				names[i] = names[minIndex];
				names[minIndex] = temp;
			}
			
			
		}
		
		System.out.println(Arrays.toString(names));

	}

}
