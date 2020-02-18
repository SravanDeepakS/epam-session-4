package Assignment4.Interest_and_area;

import junit.framework.TestCase;

public class House_CostTest extends TestCase 
{
	House_Cost hc=new House_Cost(871.2,3,"Yes");

	public void testCompoundIntrest()
	{
		assertEquals(2178000.0, hc.calculateCost());
	}
}
