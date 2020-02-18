package Assignment4.Interest_and_area;


public class CompoundInterest 
{
	double principle;
	int years;
	double rate;
	public CompoundInterest(double principle,double rate,int years)
	{
		this.principle=principle;
		this.rate=rate;
		this.years=years;
	}
	public double calculateCI()
	{
		double result;
		result=principle*Math.pow((1+(rate/100)),years);
		result=result-principle;
		return result;
	}
}
