package strings;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String reverse = "";
		int i = s.length()-1;
		
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') {
				i--;
			}
			int j = i;
			if(i<0) break;
			while(i>=0 & s.charAt(i)!=' ') {
				i--;
			}
			if(reverse.isEmpty()) {
				reverse = reverse.concat(s.substring(i+1, j+1));
			}else {
				reverse = reverse.concat(" " + s.substring(i+1, j+1));
			}
		}
		
		System.out.println(reverse);
	}

}
