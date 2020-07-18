public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int dailyWage = 0;
		int empHrs=0;
		int totalWage=0;
	
		for(int i=0; i<20; i++) {
			int empCheck = (int)Math.floor(Math.random() * 10 ) % 3;
			System.out.println(empCheck);
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
			totalWage=totalWage+dailyWage;
        	}
		System.out.println("Total wage of Employee:" + totalWage);
	}
}
