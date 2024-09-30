package Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		
		
		solution();
		
		
	}
	
	private static List<Integer> solution() {
		List<Integer> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = scan.nextInt();
		
		if(-10000000 > x || x > 10000000) {
			System.out.println("x값은 -10000000이상 10000000이하여야 합니다.");
			return null;
		}
		
		System.out.print("n값 입력 : ");
		int n = scan.nextInt();
		
		if(n < 1 || n > 1000) {
			System.out.println("n값은 1000 이하인 자연수여야 합니다.");
			return null;
		}
		
		System.out.println("x = " + x);
		System.out.println("n = " + n);
		
		int temp = 0;
		
		for(int i = 0 ; i < n ; i++) {
			temp += x;
			list.add(temp);
		}
		
		System.out.println(list);
		
		return list;
	}

}
