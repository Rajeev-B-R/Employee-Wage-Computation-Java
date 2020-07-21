public class EmpWageComp 
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
    
    public static int calcEmpWage()
	{
		int empHrs=0;
		int totalEmpHrs=0;
		int workingDays=0;
		int totalEmpWage=0;
		System.out.println("Company : "+company);
		
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
			System.out.println("Day : "+workingDays+"  Employee Hours : "+empHrs+"  Employee wage : "+empWage);
		}
		totalEmpWage=totalEmpHrs*wagePerHr;
		System.out.println();
		System.out.println("Total Hours : "+totalEmpHrs+"	 Total Wage : "+totalEmpWage);
		System.out.println();
		return totalEmpWage;
	}
	
    public static void main(String[] args)
	{
		EmpWageComp company1 = new EmpWageComp("More", 20, 8, 100, 20);
		company1.calcEmpWage();
		EmpWageComp company2 = new EmpWageComp("A-Plus", 18, 7, 95, 18);
		company2.calcEmpWage();
		EmpWageComp company3 = new EmpWageComp("Behtar", 16, 6, 90, 16);
		company3.calcEmpWage();
	}
}
