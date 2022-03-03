package day17;

import java.util.Arrays;

public class Ex1705 {
	public static void main(String[] args) {
		int[] arr = new int[5]; //유효한 인덱스 번호 : 0 ~ 4
		for(int i = 0; i < 6; i++) {
			arr[i] = i*10;
		}
		System.out.println(Arrays.toString(arr)); //i = 5일경우 예외 글 발생, 하지만 빨간밑줄 발생x -> 12번 행은 실행되지 않음.
												  //즉 9번 행에서 실행이 금지됨.
	}
}

//ArrayIndexOutOfBoundsException 즉 배열의 인덱스가 범위를 벗어났다!