package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;


public class Streams {
	
	
	@Test
	public void getNameUpperCase() {
	
	
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("Welcome to Black Parade");
	names.add("First Date");
	names.add("Dear Maria, Count me in");
	names.add("Welcome to my Life");
	names.add("American Idiot");
	names.add("All I Want");
	
	//names.stream().filter(s -> s.endsWith("e")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
	
	
	//print names which have first letter as A with uppercase and sorted
	names.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).sorted().forEach(s -> System.out.println(s));
}
	
	@Test
	public void getUniqueNumber() {
		List<Integer> values = Arrays.asList(1,2,1,3,3,2,4,5,6);
		
		List<Integer> resultValues = values.stream().distinct().sorted().collect(Collectors.toList());
	}
	
}