# java-10day
월요일/

		for(int i = 1 ; i <= 100 ; i++ ) {
			
			if (i%5==0 && i%7==0) {
				
				System.out.println(i);

			}

		}
		
//		1
//		22
//		333
//		4444
//		55555
//		666666
//		7777777
		
		System.out.println("문2)");
		
		int num = 7;
		
		for(int i = 1 ;i<=num ;i++ ) {
			
			for( int j = 1 ; j <= i ; j++  ) {			              
				
				System.out.print(i);
			}
			
			System.out.println();
			
		}
		
		int intVal = 128;
		System.out.println(intVal);

		byte byteVal = (byte)intVal;
		System.out.println(byteVal);
		
//		System.out.println("숫자를 입력 하세요");
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		
//		for(int i=1; i<= num; i++) {
//			for(int j = 1; j<=i; j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		sc.close();
	

		
		System.out.println("당신의 이름을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.println("나이를 입력하세요");
		
		String age = sc.next();
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + "입니다." );
		
		System.out.println("전화번호를 입력하세요");
		
		String phoneNumber = sc.next();
		
		System.out.println("당신의 전화번호는 " + phoneNumber + "입니다." );
		
		sc.close();
		
