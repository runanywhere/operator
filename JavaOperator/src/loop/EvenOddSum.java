package loop;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : for-loop + if 결합예제
 * */
public class EvenOddSum {
	/*
	 * 
	 * 입력 받은 수(1)부터 입력받은 
	 * 수(10)까지의 수 중에서 
	 * 각각 짝수의 합과 홀수의 합을
	 * 분리해서 출력하시오.
	 * */
	
	public void calc() {
		int a=0, b=0, evenSum=0, oddSum=0; // 지변 초기화
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값을 입력하세요");
		a = scanner.nextInt();
		System.out.println("한계값을 입력하세요");
		b = scanner.nextInt();
		
		// 오더가 범위내에서 연산 값의 출력이라면
		for (int i = a; i <= b; i++) {
			if ((i % 2) == 0) {  // a 와 b 상수 // i 인덱스 변수
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		// 홀수 if(input%2==1)
		// else
		
		System.out.println(a+" 부터 "+b+" 까지의 정수 중에서\n"
				+ "짝수의 합은 "+evenSum+" 이고 \n"
				+ "홀수의 합은 "+oddSum+" 이다.");
	}
	
}
