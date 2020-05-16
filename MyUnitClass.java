package MyPackage;

public class MyUnitClass {
	
public String ConvocationManagement(int credithours,float gpa,int semester) {
	String var="Null";
	
		if(gpa<2 && semester>13 || semester>13 && credithours<152)
			{
			var= "not applicable";
			}
		else if(gpa>=2 && gpa<=4 && semester>=8 && semester<=14 && credithours>152)
		{
			var= "Qualified";
		}
			else if(semester<8 || gpa<2 || credithours<152)
			{
				var= "disqualified";
			}
	
	return var; 
}


public int scholarships(int position, boolean PGC,float GPA)
{
	int var=0;
	if(position==1)
	{
		var=75;
	}
	else if(position==2)
	{
		var=50;
	}
	else if(position==3)
	{
		var=25;
	}
	else if(position<3 && GPA>=2.5 && PGC == true)
	{
		var=25;
	}
	else {
		var=0;
	}
	return var;
}


	public int feetax(int feecharges,int buscharges)
	{
		if((feecharges+buscharges)>100000 &&(feecharges+buscharges)<150000)
		{
			return 10000;
		}
		else if ((feecharges+buscharges)>=150000 &&(feecharges+buscharges)<200000)
		{
			return 15000;
		}
		else if ((feecharges+buscharges)>=200000 &&(feecharges+buscharges)<300000)
		{
			return 20000;
		}
		else if ((feecharges+buscharges)>=300000)
		{
			return 30000;
		}
		else {
			return 0;
		}
	}
}
