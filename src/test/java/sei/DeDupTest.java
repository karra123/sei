package sei;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DeDupTest {
	
	private static int[] array = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
			20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
			13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	private static int[] dedup_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,10000,16,17,18,19,20,85,86,25,26,34,43,45};
	private static int[] order_array = {1,2,34,25,45,3,26,85,4,86,43,10000,11,16,19,18,9,20,17,8,15,6,5,10,14,12,13,7};
	private static int[] sorted_array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,34,43,45,85,86,10000};
	
	@Test(dataProvider = "successCasesDeDup")
	public void testSuccessDeDup(int[] arr, int[] result) {
		DeDup dd = new DeDup();
		Assert.assertEquals(dd.getDeDupedIntegers(arr), result);
	}
	@DataProvider(name = "successCasesDeDup")
	private static Object[][] getSuccessCasesDeDup() {
		return new Object[][]{{array, dedup_array}};
	}
	
	@Test(dataProvider = "failureCasesDeDup")
	public void testFailureDeDup(int[] arr, int[] result) {
		DeDup dd = new DeDup();
		boolean exception = false;
		try {
			dd.getDeDupedIntegers(arr);
		}
		catch (Exception e){
			exception = true;
		}
		Assert.assertEquals(exception, true);
	}
	@DataProvider(name = "failureCasesDeDup")
	private static Object[][] getFailureCasesDeDup() {
		return new Object[][]{{null, dedup_array}};
	}
	
	
	@Test(dataProvider = "successCasesDeDupOrder")
	public void testSuccessDeDupOrder(int[] arr, int[] result) {
		DeDup dd = new DeDup();
		Assert.assertEquals(dd.getDeDupedIntegersWithOrder(arr), result);
	}
	@DataProvider(name = "successCasesDeDupOrder")
	private static Object[][] getSuccessCasesDeDupOrder() {
		return new Object[][]{{array, order_array}};
	}
	
	@Test(dataProvider = "successCasesDeDupSorted")
	public void testSuccessDeDupSorted(int[] arr, int[] result) {
		DeDup dd = new DeDup();
		Assert.assertEquals(dd.getDeDupedIntegersSorted(arr), result);
	}
	@DataProvider(name = "successCasesDeDupSorted")
	private static Object[][] getSuccessCasesDeDupSorted() {
		return new Object[][]{{array, sorted_array}};
	}
	  
}
