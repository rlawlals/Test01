package may;
import java.lang.*;
import java.util.*;
public class A09_1 {
	public static void main(String[] args) {
		
//		1~99 6의 배수의 개수 7의 배수의 개수를 더한 값을 구하시오 
		
		
		
		int count = 0;
		int count2 = 0;
		
		for (int i =1;i < 100; i++) {
			if(i%6==0) {
				count++;
			}
		}		
		
		for (int i = 1;i < 100; i++) {
			if(i%7==0) {
				count2++;
			}
		}
		System.out.println("6의 배수"+count);
		System.out.println("7의 배수"+count2);
		
		System.out.println(count + count2);
	}

}
