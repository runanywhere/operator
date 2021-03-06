package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 형 배열에서 입력값 중 최대값 구하기
 * */
public class InputMax {
	public static void main(String[] args) {
		//선언부
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		// 배열선언및 초기화
		// 입력받으시고요
		// 비교로직은 if 문을 사용하세요
		int[] arr = new int[3];
		int max = 0; // 최대값을 담을 임의의 변수
		
		// 연산부
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		 
	}
}

