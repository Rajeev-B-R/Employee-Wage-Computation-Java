import java.util.*;
class EmpWageComp 
{
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	
    	private static String company;
	private static int fullDayHr;
	private static int wagePerHr;
	private static int maxHrsInMonth;
	private static int totalWorkingDays;
	
	EmpWageComp(String company, int wagePerHr, int fullDayHr, int maxHrsInMonth, int totalWorkingDays)
	{
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.fullDayHr = fullDayHr;
		this.maxHrsInMonth = maxHrsInMonth;
		this.totalWorkingDays = totalWorkingDays;
	}
    
    	public String getCompany() 
	{
		return this.company;
	}    
    
    	public static int calcEmpWage()
	{
		int empHrs=0;
		int totalEmpHrs=0;
		int workingDays=0;
		int totalEmpWage=0;

		while(totalEmpHrs<=maxHrsInMonth && workingDays<totalWorkingDays)
		{
			int empWage=0;
			workingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case isPartTime:
					empHrs=fullDayHr/2;
					break;
				case isFullTime:
					empHrs=fullDayHr;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			empWage=empHrs*wagePerHr;
		}
		totalEmpWage=totalEmpHrs*wagePerHr;
		return totalEmpWage;
	}
}

public class EmpWage 
{
	public static EmpWageComp compWage[] = new EmpWageComp[3];	
    	public static void main(String[] args)
	{
	    	compWage[0] = new EmpWageComp("More", 20, 8, 100, 20);
		System.out.println(compWage[0].getCompany()+" : "+compWage[0].calcEmpWage());
		compWage[1] = new EmpWageComp("A-Plus", 18, 7, 95, 18);
		System.out.println(compWage[1].getCompany()+" : "+compWage[1].calcEmpWage());
		compWage[2] = new EmpWageComp("Behtar", 16, 6, 90, 16);
		System.out.println(compWage[2].getCompany()+" : "+compWage[2].calcEmpWage());
	}
}
