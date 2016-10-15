package sei;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeDup {
	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
			20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
			13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

	public int[] getDeDupedIntegers(int [] array){
		return IntStream.of(array).boxed().collect(Collectors.toSet()).stream().mapToInt(i->i).toArray();
	}

	public int[] getDeDupedIntegersWithOrder(int [] array){
		return IntStream.of(array).boxed().collect(Collectors.toCollection(LinkedHashSet::new)).stream().mapToInt(i->i).toArray();		
	}
	
	public int[] getDeDupedIntegersSorted(int [] array){
		return IntStream.of(array).boxed().collect(Collectors.toCollection(TreeSet::new)).stream().mapToInt(i->i).toArray();		
	}

	public static void main(String [] args){
		DeDup dd = new DeDup();
		System.out.println("DeDeuped Integer Array");
		Arrays.stream(dd.getDeDupedIntegers(dd.randomIntegers)).forEach(e -> System.out.printf("%d ", e));
		System.out.println("\nDeDeuped Integer Array with Order");
		Arrays.stream(dd.getDeDupedIntegersWithOrder(dd.randomIntegers)).forEach(e -> System.out.printf("%d ", e));
		System.out.println("\nDeDeuped Integer Array Sorted");
		Arrays.stream(dd.getDeDupedIntegersSorted(dd.randomIntegers)).forEach(e -> System.out.printf("%d ", e));
	}

}
