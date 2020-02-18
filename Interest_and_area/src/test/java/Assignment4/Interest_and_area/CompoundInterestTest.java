package Assignment4.Interest_and_area;

import junit.framework.TestCase;

public class CompoundInterestTest extends TestCase 
{
	CompoundInterest ci=new CompoundInterest(1200,2,1);

	public void testCompoundIntrest()
	{
		assertEquals(24.0, ci.calculateCI());
	}
}
