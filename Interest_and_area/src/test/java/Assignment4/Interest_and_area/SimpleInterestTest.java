package Assignment4.Interest_and_area;

import junit.framework.TestCase;

public class SimpleInterestTest extends TestCase 
{
	SimpleInterest si=new SimpleInterest(100,13.5,2);

	public void testSimpleIntrest()
	{
		assertEquals(27.0, si.calculateSI());
	}
}
