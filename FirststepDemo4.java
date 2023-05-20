package org.primitive.elementary.first;

public class FirststepDemo4 {

	public static void main(String[] args) {
		
		
		
		//float var1 = 3.14; //컴파일 에러
		float var2 = 3.14f;
		double var3 = 3.14;

		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:" + var5); /* double 타입인 var5가 
		 										float 타입인 var4 보다
		 										2배 이상 정밀한 값을 출력한다.*/
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6:"+var6);
		System.out.println("var7:"+var7);
		System.out.println("var8:"+var8);
		
		System.out.println("===============================================");
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
			
		} else {
			System.out.println("시작합니다.");
		}
		
		System.out.println("===============================================");
		
		byte a = 10;
		int b = a;
		
		System.out.println(b);
		
		byte byteValue = 10;
		int intValue =byteValue;
		
		System.out.println(intValue);
		
		long longValue = 5000000000L;
		float floatValue = longValue;    //5.0E9f로 저장됨
		double doubleValue = longValue;  //5.0E9로 저장
		
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		char charValue = 'A';
		int intValue_1 = charValue;
		
		System.out.println(intValue_1); //65 출력
		
		byte byteValue_1 =65;
		char charValue_1 = byteValue; //Type mismatch: cannot convert from byte to char
		
	}
	

}
