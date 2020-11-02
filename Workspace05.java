package com.naver.erp;

public class Workspace05 {

	public static void main(String[] args) {

		
//문제 1) 주사위 형태
// Math.random() 로 정수값 생성하기
System.out.println("문제1)");

	int num = (int)(Math.random()*6)+1;

		
	System.out.println(num);
		
//문제 2)	1~45숫자를 6번 돌리면 로또 번호 생성기(for문으로)
System.out.println("문제2)");

	for(int i = 1; i<=6 ; i++) {
		
		int num1 = (int)(Math.random()*45)+1;
		
		System.out.println(num1);
		}
	
//문제 3)배열 6개를 만들어서 담고 출력 로또번호 생성
System.out.println("문제3)");

	  int[] lottoNum = new int[6];
		
	  for ( int i = 0 ; i<lottoNum.length ; i++ ) {
		  
		  lottoNum[i] = (int) (Math.random()*45 + 1);
		  
	  }
	
	  for ( int i = 0 ; i<lottoNum.length ; i++) {
		  System.out.print(lottoNum[i] + "\t");
	  }
		System.out.print("\n");
		
//문제 4) 배열 2개를 선언하고 동일한지 비교하시오
System.out.println("문제4)");
	
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = {11,23,31};
		
		//코드작성
		if (leftArray.length == rightArray.length ) {
			
			System.out.println("두 배열의 크기가 같습니다.");
		}else {
			System.out.println("두 배열의 크기가 다릅니다.");
		
		}
		
		for (int i=0 ; i<leftArray.length ; i++ ) {
			
			
			if (leftArray[i] == rightArray[i]) {
				
				
			}else {
				System.out.println((i+1) + "번째 배열원소가 다릅니다.");
				
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
