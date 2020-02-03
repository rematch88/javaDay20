package javaday20;

import java.util.Scanner;

public class java0203 {

	public static void main(String[] args) {
		System.out.println("Java로 exe 만들기");
		//실행 파일을 만들었을 때 콘솔화면을 유지하기 위해서는 입력받는 문장을 추가합니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("아무키나 누르면 종료 됩니다.");
		sc.nextLine();
		sc.close();

	}

}
