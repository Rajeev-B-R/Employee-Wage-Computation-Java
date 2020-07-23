import java.util.*;
class EmpWageComp 
{
	private static final int isPartTime = 1;
	private static final int isFullTime = 2;
	private static final int fullDayHr = 8;

	private static String company;
	private static int wagePerHr;
	private static int maxHrsInMonth;
	private static int totalWorkingDays;
	private static int empWage;
	private static int record;

	public static HashMap<Integer, Integer> compWage = new HashMap<Integer, Integer>();
	public static ArrayList<Integer> company1 = new ArrayList <Integer>();
	public static ArrayList<Integer> company2 = new ArrayList <Integer>();
	public static HashMap<String, Integer> compMonthWage = new HashMap<>();
		
	EmpWageComp(String company, int wagePerHr, int maxHrsInMonth, int totalWorkingDays) 
	{
		this.company=company;
		this.wagePerHr = wagePerHr;
		this.maxHrsInMonth = maxHrsInMonth;
		this.totalWorkingDays = totalWorkingDays;
	}

	public String getCompany() 
	{
		return this.company;
	}

	public static int empDailyWage() 
	{
		empWage = fullDayHr * wagePerHr;
		return empWage;
	}

	public static int empMonthWage() 
	{
		int empWage = 0;
		int empHrs = 0; 
		int totalEmpHrs = 0;
		int workingDays = 0;
		int fullDayHr = 8;
		int totalEmpWage = 0;
		while ( totalEmpHrs <= maxHrsInMonth && workingDays <= totalWorkingDays )
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) 
			{
				case isFullTime:
					empHrs = fullDayHr;
					break;
				case isPartTime:
					empHrs = fullDayHr / 2;
					break;
				default:
					empHrs = 0;
					break;
			}
			totalEmpHrs += empHrs;
			workingDays++;
			empWage = wagePerHr * empHrs;
			if(company=="More")
				company1.add(empWage);
			else 
				company2.add(empWage);
			totalEmpWage += empWage;
		}
		return totalEmpWage;
	}

	public static void printWage() 
	{
		for (int i: compWage.keySet())
			System.out.println("Daily Wage:"+i+" Total Wage:"+compWage.get(i));
	}

	public static void printcompWage() 
	{
		System.out.println(company1);
		System.out.println(company2);
	}
	
	public static void putTotalWage() 
	{
		int a=empMonthWage();
		compMonthWage.put(company, a);
		compWage.put(empDailyWage(), a);
		record++;
	}
	
	public static void getTotalWage(String company) 
	{
		System.out.println(company+" : "+compMonthWage.get(company));
	}
}

public class EmpWage 
{
	
	public static void main(String args[])
	{
		
		EmpWageComp company1 = new EmpWageComp("More", 20, 100, 20);
		company1.putTotalWage();
		EmpWageComp company2 = new EmpWageComp("A-Plus", 18, 95, 18);
		company2.putTotalWage();
		company2.printWage();
		company2.printcompWage();
		company2.getTotalWage("A-Plus");
	}
}
