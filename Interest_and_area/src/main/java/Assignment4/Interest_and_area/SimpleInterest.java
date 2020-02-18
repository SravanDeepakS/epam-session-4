package Assignment4.Interest_and_area;

public class SimpleInterest 
{
	double principle;
	int years;
	double rate;
	public SimpleInterest(double principle,double rate,int years)
	{
		this.principle=principle;
		this.rate=rate;
		this.years=years;
	}
	public double calculateSI()
	{
		double result;
		result=(principle*years*rate);
		result=result/100;
		return result;
	}
}
