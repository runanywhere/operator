package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 형 배열 입력예제
 * */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0,avg=0;
		System.out.println("3개의 점수를 입력하세요");
		int[] arr = new int[3]; // 3개 숫자 저장 공간
		// 배열에 값을 입력하라고 하면 무조건 for CTRL + SPACE
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		// 입력된 값을 합산해 보세요
		for (int i = 0; i < arr.length; i++) {
		//	System.out.print(arr[i]+"\t");
			// 누적 공식
			sum += arr[i];
			
		}
	//	System.out.println("합 : "+sum);
		// 입려된 값의 평균을 내보세요.
		
		System.out.println("평균 :" + sum/arr.length);
		
	}
}
