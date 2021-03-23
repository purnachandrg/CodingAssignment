package com.assessment.problem.reverse_string;


public class BinaryReversal {
	
	public static void main(String[] args) {
		 
		String positiveInteger = "10";  
		Reversal reverse = new Reversal();
		reverse.binaryReversal(positiveInteger);
	}

}
class Reversal{
	
	public void binaryReversal(String positiveInteger) {
		int number = Integer.parseInt(positiveInteger);
		if(number > 0) {
			String FormatedBinaryValue = String.format("%8s", Integer.toBinaryString(number)).replaceAll(" ", "0") ;
			System.out.println("Padded version of Integer : " + FormatedBinaryValue);
	        String reversedValue = new StringBuilder(FormatedBinaryValue).reverse().toString();
			System.out.println("revered binary version : " + reversedValue);
	        int decimalValue = Integer.parseInt(reversedValue,2);
	        System.out.println("Decimal Version Of reversed Binary : " +decimalValue);
		}
		else {
	        System.out.println("given String is not Positive Integer : " +number);

		}
	}
}

