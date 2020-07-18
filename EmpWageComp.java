public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		int isFullTime = 1;
		int isPartTime = 2;
		int fullDayHr = 16;
		int partTimeHr = 8;
		int wagePerHr = 20;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		int dailyWage = 0;
		
		if (empCheck == isFullTime) {

			System.out.println("Employee -> Full time present");
			dailyWage = wagePerHr*fullDayHr;
		}
		else if (empCheck == isPartTime) {

                        System.out.println("Employee -> Part time present");
                        dailyWage = wagePerHr*partTimeHr;
                }
		else {
			System.out.println("Employee absent");
		}
		System.out.println("Daily wage of Employee:" + dailyWage);
        }
}
