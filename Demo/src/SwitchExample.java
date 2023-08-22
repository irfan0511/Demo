/* class SwitchExample{
	public static void main(String args[]){
		int number=10;
		switch(number){
			case 10: System.out.println("10");
			break;
			case 20: System.out.println("20");
			break;
			case 30: System.out.println("30");
			break;
			default: System.out.println("Not is 10,20 or 30");		
			
		}
	}
} */


class SwitchExample{
	public static void main(String arg[]){
			int month= 7;
			String monthString="";
			switch(month){
				case 1: monthString="1 - January";
				break;
				case 2: monthString="2 - February";
				break;
				case 3: monthString="3 - March";
				break;
				case 4: monthString="4 - April";
				break;
				case 5: monthString="5 - May";
				break;
				case 6: monthString="6 - June";
				break;
				case 7: monthString="7 - July";
				break;
				case 8: monthString="8 - August";
				break;
				case 9: monthString="9 - September";
				break;
				case 10: monthString="10 - October";
				break;
				case 11: monthString="11 - November";
				break;
				case 12: monthString="12 - December";
				break;
			}
			System.out.println(monthString);
			
	}
}