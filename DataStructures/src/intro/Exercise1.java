package intro;

import java.util.Scanner;

public class Exercise1 {

	public static  <T> T replace (T[] list, int index, T newValue) {
		T oldValue = list[index];
		list[index] = newValue;
		return oldValue;
	}
	
	public static <T> void replace (T[] list, T oldValue, T newValue) {
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(oldValue)) {
				list[i] = newValue;
				break;
			}
		}
	}
	
	public static <T> void replaceAll (T[] list, T oldValue, T newValue) {
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(oldValue)) {
				list[i] = newValue;
			}
		}
	}
	public static <T> void printarr(T[] array) {
		int i = 0;
		for(T x : array) {
			System.out.printf("%s", x);
			if(i + 1< array.length) {
				System.out.printf(", ");
			}
			i++;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		String [] names = { "Ann", "Beth", "Cara", "Dan", "Jack", "Ann", "Leo", "Sam"};
		printarr(names);
		System.out.printf("Enter a new name: ");
		Scanner in = new Scanner(System.in);
		String input = in.next();
		System.out.printf("Enter the index you would like to replace: ");
		int idx = in.nextInt();
		String old = replace(names, idx, input);
		System.out.printf("%s%n", old);
		printarr(names);
		System.out.printf("Enter a name you would like to replace: ");
		String name = in.next();
		replace(names, name, input);
		printarr(names);
		System.out.printf("Enter a new name you would like to replace: ");
		name = in.next();
		replaceAll(names, name, input);
		printarr(names);
		in.close();
	}

}
