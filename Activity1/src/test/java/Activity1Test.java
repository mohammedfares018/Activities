import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Activity1Test {
	@Test
	public void tripletExists1() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,7,1,2,15};
		assertEquals(2,act.checkForSum3(a,18));
	}
	
	@Test
	public void tripletExists2() {
		Activity1 act=new Activity1();
		int b[]=new int[]{4,8,2,9,1};
		assertEquals(2,act.checkForSum3(b,14));
	}
	
	@Test
	public void noTripletExists1() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,8,1,2,16};
		assertEquals(0,act.checkForSum3(a,18));
	}
	
	@Test
	public void noPairExists1() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,7,1,2,15};
		int b[]=new int[]{-1,0,0};
		assertArrayEquals(b,act.checkForSum2(a,18)); 
	}
	
	@Test
	public void pairExists() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,7,1,2,15};
		int b[]=new int[]{1,6,7};
		assertArrayEquals(b,act.checkForSum2(a,13)); 
	}
	
	@Test
	public void numberOfElementsLessThanTwo() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,7,1,2,15};
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->act.compute(-1,13,a));
		assertEquals("Number less than two",exception.getMessage()); 
	}
	
	@Test
	public void noPairExists2() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,7,1,2,15};
		assertEquals("No two elements sum to 14",act.compute(6,14,a)); 
	}
	
	@Test
	public void noTripletExists2() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,10,7};
		assertEquals("No triplets sum to 15",act.compute(3,15,a)); 
	}
	
	@Test
	public void noPairOrTripletsExists() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,7};
		assertEquals("No pairs or triplets sum to 15",act.compute(3,15,a)); 
	}
	
	@Test
	public void resultExists() {
		Activity1 act=new Activity1();
		int a[]=new int[]{5,6,4,10};
		assertEquals("Result exists",act.compute(4,15,a)); 
	}
}