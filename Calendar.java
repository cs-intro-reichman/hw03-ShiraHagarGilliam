public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;
	static int nDaysInMonth = 31;
	
	public static void main(String args[]) {
		int givenYear = Integer.parseInt(args[0]);
	 	while (year < givenYear) {
			advance();
		} 
		while (year == givenYear) {
			System.out.print(dayOfMonth + "/" + month + "/" + year);
			if(dayOfWeek == 1) {
				System.out.print(" sunday");
			}
				advance();
				System.out.println("");
		}
	}
	
	 private static void advance() {
		 dayOfWeek++;
		 if(dayOfWeek > 7) {
			 dayOfWeek = 1;
		 }
		 dayOfMonth++;
		 if(dayOfMonth > nDaysInMonth) {
			 month++;
			 dayOfMonth = 1;
			 if(month > 12) {
				 year++;
				 month = 1;
			 }
		 }
		 nDaysInMonth = nDaysInMonth(month, year);
	 }
	 
	public static boolean isLeapYear(int year) {
	  if((year % 400) == 0) {
		  return true;
	  } else if(((year % 4) == 0) && ((year % 100) != 0)) {
		  return true;
	    }
	  return false;
	}
	 
	private static int nDaysInMonth(int month, int year) {
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		} else if(month == 2) {
			if(isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}		
		return 31;
	}
}