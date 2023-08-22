/* class SwitchVowelExample{
	public static void main(String args[]){
		char ch = 'O';
		switch(ch){
			case 'a': System.out.println("Vowel");
			break;
			case 'e': System.out.println("Vowel");
			break;
			case 'i': System.out.println("Vowel");
			break;
			case 'o': System.out.println("Vowel");
			break;
			case 'u': System.out.println("Vowel");
			break;
			case 'A': System.out.println("Vowel");
			break;
			case 'E': System.out.println("Vowel");
			break;
			case 'I': System.out.println("Vowel");
			break;
			case 'O': System.out.println("Vowel");
			break;
			case 'U': System.out.println("Vowel");
			break;
			default: System.out.println("Consonant");
			
		}
		
		
	}
} */


/* class SwitchVowelExample{
	public static void main(String args[]){
		char ch = 'E';
		switch(ch){
			case 'a': System.out.println("Vowel");
			case 'e': System.out.println("Vowel");
			case 'i': System.out.println("Vowel");
			case 'o': System.out.println("Vowel");
			case 'u': System.out.println("Vowel");
			case 'A': System.out.println("Vowel");
			case 'E': System.out.println("Vowel");
			case 'I': System.out.println("Vowel");
			case 'O': System.out.println("Vowel");
			case 'U': System.out.println("Vowel");
			default: System.out.println("Consonant");
			
		}
		
		
	}
} */


class SwitchVowelExample{
	public static void main(String args[]){
	String levelString="Expert";  
    int level=0; 
    switch(levelString){  
    case "Beginner": level=1;  
    break;    
    case "Intermediate": level=2;  
    break;    
    case "Expert": level=3;  
    break;    
    default: level=0;  
    break;  
    }    
    System.out.println("Your Level is: "+level);  
	}
}