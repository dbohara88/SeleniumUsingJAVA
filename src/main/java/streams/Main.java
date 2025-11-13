package streams;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Tim");
		names.add("Test");
		names.add("Tom");
		names.add("Apple");
		names.add("Deepak");
		names.add("Welcome to Black Parade");
		
		Long counts = names.stream().filter(s -> s.startsWith("T")).count();
		
		System.out.println(counts);
			
		
		names.stream().filter(s -> s.length()>4).forEach(s->System.out.println(s));;
		
	
	}

}
