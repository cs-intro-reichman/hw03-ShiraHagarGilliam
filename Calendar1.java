public class Calendar1 {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;
	static int nDaysInMonth = 31;
	
	public static void main(String args[]) {
		int debugDaysCounter = 0;
		int sundaysCount = 0;
	 	while (year < 2000) {
			System.out.print(dayOfMonth + "/" + month + "/" + year);
			if(dayOfWeek == 1) {
				System.out.print(" sunday");
				if(dayOfMonth == 1) {
					sundaysCount++;
				}
			}
			System.out.println("");
			advance();
			debugDaysCounter++;
			if (debugDaysCounter == 36500) {
				break;
			}
		}
		System.out.print("During the 20th century, " + sundaysCount + " Sundays fell on the first day of the month");
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