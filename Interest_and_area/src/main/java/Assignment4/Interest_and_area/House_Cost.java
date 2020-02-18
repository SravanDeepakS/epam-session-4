package Assignment4.Interest_and_area;


public class House_Cost 
{
	double area;
	double cost_per_sqmt;
	public House_Cost(double area,int standard,String automate)
	{
		this.area=area;
		switch(standard)
		{
			case 1:
				cost_per_sqmt=1200;
				break;
			case 2:
				cost_per_sqmt=1500;
				break;
			case 3:
				if(automate.equals("Yes"))
					cost_per_sqmt=2500;
				else
					cost_per_sqmt=1800;
				break;
		}
	}
	public double calculateCost()
	{
		double total;
		total=area*cost_per_sqmt;
		return total;
	}
}
