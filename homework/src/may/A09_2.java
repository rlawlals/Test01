package may;
import java.lang.*;
import java.util.*;
public class A09_2 {
	public static void main(String[] args) {
//		���� �������� ����� �մϴ� 3% Ȯ���� "���� ���" 7%Ȯ���� "�������" 15%Ȯ���� "�������" �������� "�Ϲ����" �Դϴ� 
//		�ѹ� �춧���� �ݾ��� 2�辿 ������ϴ� (ù���� �ݾ��� 3���̴ϴ�)
//		10���� �����Ѵٰ� ������ �� ���� �ݾװ� ��޺� ȹ�� ������ ���Ͻÿ�.
		
		Random r = new Random();
		
		int size = 10;
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		int money = 3;
		int total = 0;
		
			for (int i=1; i < size; i++) {
				int a = r.nextInt(100)+1;
						if(a <= 3) {						
							count1++;
						}
						else if(a <= 7) {						
							count2++;
						}
						else if(a <= 15) {						
							count3++;
						}
						else {					
							count4++;
						}		 
						
						total += money;
						money *= 2; 
			}
			System.out.println(size+"�����Ž�"+money+"��");
			
		
		System.out.println("�ѱݾ�" + total);
		System.out.println("�������"+count1);	
		System.out.println("�������"+count2);	
		System.out.println("�������"+count3);	
		System.out.println("�Ϲ����"+count4);	

	
	
	}

}
