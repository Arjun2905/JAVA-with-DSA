package strings;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// METHOD 1 :
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the both strings :");
//		String a = scan.nextLine();
//		String b = scan.nextLine();
//		boolean isAnagram = false;
//		int al[] = new int[265];
//		int bl[] = new int[256];
//		if (a.length() == b.length()) {
//			isAnagram = true;
//			for(char c: a.toCharArray()) {
//				int index = (int) c;
//				al[index]++;
//			}
//			
//			for(char c: b.toCharArray()) {
//				int index = (int) c;
//				bl[index]++;
//			}
//			
//			for(int i=0;i<256;i++) {
//				if(al[i]!=bl[i]) {
//					isAnagram = false;
//					break;
//				}
//			}
//		}
		
		// METHOD 2 :
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the both strings :");
		String a = scan.nextLine();
		String b = scan.nextLine();
		boolean isAnagram = false;
		int al[] = new int[265];
		if (a.length() == b.length()) {
			isAnagram = true;
			for(char c: a.toCharArray()) {
				int index = (int) c;
				al[index]++;
			}
			
			for(char c: b.toCharArray()) {
				int index = (int) c;
				al[index]--;
			}
			
			for(int i=0;i<256;i++) {
				if(al[i]!= 0) {
					isAnagram = false;
					break;
				}
			}
		}
		if(isAnagram==true) {
			System.out.println("Both strings are Anagram");
		}else {
			System.out.println("Both strings are not Anagram");
		}
	}

}
