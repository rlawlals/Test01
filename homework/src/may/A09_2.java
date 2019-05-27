package may;
import java.lang.*;
import java.util.*;
public class A09_2 {
	public static void main(String[] args) {
//		게임 아이템을 사려고 합니다 3% 확률로 "전설 장비" 7%확률로 "영웅장비" 15%확률로 "레어장비" 나머지는 "일반장비" 입니다 
//		한번 살때마다 금액이 2배씩 비싸집니다 (첫구매 금액은 3원이니다)
//		10번을 구매한다고 했을때 총 결제 금액과 등급별 획득 갯수를 구하시오.
		
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
			System.out.println(size+"번구매시"+money+"원");
			
		
		System.out.println("총금액" + total);
		System.out.println("전설장비"+count1);	
		System.out.println("영웅장비"+count2);	
		System.out.println("레어장비"+count3);	
		System.out.println("일반장비"+count4);	

	
	
	}

}
