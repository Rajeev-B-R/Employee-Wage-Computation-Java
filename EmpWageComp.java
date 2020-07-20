public class EmpWageComp {

        public static void main(String[] args) {

                System.out.println("**********Welcome to Employee Wage Computation Problem**********");
		public static final int ispartTime=1;
		public static final int isFullTime=2;
		public static final int wagePerHr=20;
		public static final int maxWorkingDays=20;
		public static final int maxHrsInMonth=100;
    
		public static int calcEmpWage()
		{
			int empHrs=0;
			int totalWorkingHrs=0;
			int totalWorkingDays=0;
			int totalWage=0;
		
			while(totalWorkingHrs<=maxHrsInMonth && totalWorkingDays<maxWorkingDays)
			{
				int empWage=0;
				totalWorkingDays++;
				int empCheck=(int) Math.floor(Math.random()*10)%3;
				switch(empCheck)
				{
					case ispartTime:
						empHrs=4;
						break;
					case isFullTime:
						empHrs=8;
						break;
					default:
						empHrs=0;
				}
				totalWorkingHrs+=empHrs;
				empWage=empHrs*wagePerHr;
				System.out.println("Day:"+totalWorkingDays+"  Employee Hours:"+empHrs+"  Employee wage: "+empWage);
			}
			totalWage=totalWorkingHrs*wagePerHr;
			System.out.println();
			System.out.println("Total Employee Hours:"+totalWorkingHrs+"	 Total Employee Wage:"+totalWage);
			return totalWage;
		}

	public static void main(String[] args)
	{
		calcEmpWage();
	}
}

