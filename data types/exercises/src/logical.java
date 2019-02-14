class Logical
 {
    public static void main(String[] args)
     {
    	
    	int number1 = 2, number2 = 5, number3 = 9;
    	boolean result;
    	result = (number1 > number2) || (number3 > number1);
    	System.out.println(result);	
    	result = (number1 > number2) && (number3 > number1);
    	System.out.println(result);
    }
    }