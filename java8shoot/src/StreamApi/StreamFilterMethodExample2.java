package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethodExample2 {
    
	
	public static void main(String [] args) {
		//find the name with start with r
		
		List<String>  names = Arrays.asList("rushikesh","sachin","rohan","roshan","kishan");
		StreamFilterMethodExample2 streamFilterMethodExample2 = new  StreamFilterMethodExample2();
		List<String> namesWithStartR = streamFilterMethodExample2.getNamesWithStartR(names);
		System.out.println(namesWithStartR);
		
	}
	
	public List<String> getNamesWithStartR(List<String> names) {
		if (names==null) {
			throw new IllegalArgumentException("mathod parameter should not me empty");
		}
		return names.stream().filter(name -> name.toLowerCase().startsWith("r")).collect(Collectors.toList());

	}
	
}
