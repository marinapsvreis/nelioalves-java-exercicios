package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		System.out.println();
		
		List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStr);
	}
	
	public static void printList(List<?> list) {
		//nao pode dar list.add()
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
