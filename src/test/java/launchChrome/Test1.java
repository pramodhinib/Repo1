package launchChrome;

import org.testng.annotations.Test;

public class Test1 {

	
		@Test(priority=2)
		public void Test1() {
			System.out.println("Test1");
		}
		
		
		@Test(priority=1)
		public void Test2() {
			System.out.println("Test2");
		}
	

}
