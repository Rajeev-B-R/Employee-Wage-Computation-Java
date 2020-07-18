public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		int isFullTime = 1;
		int fullDayHr = 8;
		int wagePerHr = 20;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		int dailyWage = 0;
		
		if (empCheck == isFullTime) {

			System.out.println("Employee present");
			dailyWage = wagePerHr*fullDayHr;
		}
		else {
			System.out.println("Employee absent");
		}
		System.out.println("Daily wage of Employee:" + dailyWage);

        }

}
