package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMapMethodExample3 {
    
	private static Optional<Integer> max;

	public static void main(String[] args) {
		/**
		 * get all product price
		 */
		List<Product> products = Arrays.asList(
				new Product("mobile", 500.00, 1),
				new Product("table", 1000.00, 2),
				new Product("tv", 10000.00, 3),
				new Product("mouse", 100.00, 4)
				);
		List<Double> allProductPrice = products.stream().map((Product product)->product.getPrice()).collect(Collectors.toList());
		System.out.println(allProductPrice);
		
		
		  // max() method to get number int compare(T o1, T o2);
		List<Integer> numbers = Arrays.asList(1,5,8,9,10,11);
		 Optional<Integer> maxNumber = numbers.stream().max((Integer number1,Integer number2)-> number1.compareTo(number2));
		 Integer maxNumberResult = maxNumber.get();
		 System.out.println(maxNumberResult);
		 
		 //min method
		 
		 Optional<Integer> min = numbers.stream().min((Integer number1,Integer number2)-> number1.compareTo(number2));
		 Integer minNumber = min.get();
		 System.out.println(minNumber);
		 
		 //sorted method
		 
		 List<Product> sortedProductByPrice = products.stream().sorted((Product p1,Product p2)-> p2.getPrice().compareTo(p1.getPrice())).collect(Collectors.toList());
		 System.out.println(sortedProductByPrice);
		 
		 //find sum of the numbers  int applyAsInt(T value);
		 int sum = numbers.stream().mapToInt((Integer number)-> number).sum();
		 System.out.println(sum);
		 
	}
	
}
