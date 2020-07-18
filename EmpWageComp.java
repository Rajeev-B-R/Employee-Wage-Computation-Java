public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int empCheck = (int)Math.floor(Math.random() * 10 ) % 3;
		int dailyWage = 0;
		int empHrs=0;
		
		switch (empCheck)
		{
		case 0:
			empHrs=0;
			break;
		case 1:
			empHrs=8;
			break;
		case 2:
			empHrs=16;
			break;
		}
		dailyWage=wagePerHr*empHrs;
		System.out.println("Daily wage of Employee:" + dailyWage);
        }
}
