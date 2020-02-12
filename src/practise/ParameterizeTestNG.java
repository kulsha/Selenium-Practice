package practise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterizeTestNG {

	@Parameters({"suite level"})
	@Test
	public void firstTest(String param)
	{
		System.out.println(param);
	}
	
	@Parameters({"test level"})
	@Test
	public void secondTest(String param)
	{
		System.out.println(param);
	}
	
	@Parameters({"suite level" , "test level"})
	@Test
	public void thirdTest(String suiteParam , String testParam)
	{
		System.out.println(suiteParam + "*********" +testParam);
	}
	
	
}
