public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		int isFullTime = 1;
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		if (empCheck == isFullTime)
			System.out.println("Employee present");
		else
			System.out.println("Employee absent");

        }

}
