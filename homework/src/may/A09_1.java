package may;
import java.lang.*;
import java.util.*;
public class A09_1 {
	public static void main(String[] args) {
		
//		1~99 6�� ����� ���� 7�� ����� ������ ���� ���� ���Ͻÿ� 
		
		
		
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
		System.out.println("6�� ���"+count);
		System.out.println("7�� ���"+count2);
		
		System.out.println(count + count2);
	}

}
