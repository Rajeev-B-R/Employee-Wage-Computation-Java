public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int dailyWage = 0;
		int empHrs=0;
		int totalWage=0;
		int totalWorkingHrs = 0;
		int totalWorkingDays = 0;
		
		while(totalWorkingHrs <= 100 && totalWorkingDays < 20)
		{
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10)%3;
			switch (empCheck)
			{
				case 0:
					empHrs=0;
					break;
				case 1:
					empHrs=4;
					break;
				case 2:
					empHrs=8;
					break;
			}
			
			totalWorkingHrs+=empHrs;
			System.out.println("Day: " +totalWorkingDays+   "Employee Hours: "+empHrs);
		}
		totalWage=totalWorkingHrs*wagePerHr;
		System.out.println("Total wage of employee:"+totalWage);
		
	}

}
