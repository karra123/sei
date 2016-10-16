# sei
sei code test

Build

“mvn clean package” - Please execute this command from where this project’s pom.xml file is located. This will generate single jar file with all the project classes and required libraries. This file is created under project’s target folder. This jar is versioned to be 1.0.


Run

“java -jar target\sei-1.0.jar” - Please run the program using this command. Please make sure you provide correct path to the jar file.


Testing

Automatic testing is done through using TestNG testing framework. Some positive and negative test cases are provided to demonstrate how I can accomplish testing. The test cases provided here are not complete and only demonstrate how automated testing can be done.


Logging

I have included the required slf4j and log back libraries in the pom.xml. Since the code is very little, I have not added any log statements. If required we can add the statements very quickly.

The following are three methods for de-duping an array of integers. They are accepts int [] as parameter and returns int[]. But the idea is straight forward and hence can be easily changed / extended to accept / return other types like IntStream or Integer[].

1)	public synchronized int[] getDeDupedIntegers(int [] array){}
    - This method uses HashSet to de-dupe integers from the input array and return distinct numbers as array.
    - The order of numbers (occurring in output array) cannot be relied on for this method. It does not guarantee that the order will         remain constant over time.
    - Note that HashSet implementation is not Thread safe, hence making this method synchronized makes it thread safe.
    - The output array elements are not in any sort order.

2)	public synchronized int[] getDeDupedIntegersWithOrder(int [] array){}
    - This method uses LinkedHashSet to de-dupe integers from the input array and return distinct numbers as array.
    - The order in which elements were inserted into the set (insertion-order) is retained.
    - Note that LinkedHashSet implementation is not Thread safe, hence making this method synchronized makes it thread safe.
    - The output array elements are not in any sort order.
	
3)	public synchronized int[] getDeDupedIntegersSorted(int [] array){}
    - This method uses TreeSet to de-dupe integers from the input array and return distinct numbers as array.
    - Note that TreeSet implementation is not Thread safe, hence making this method synchronized makes it thread safe.
    - The output array elements are sorted in ascending order.




