package week3;

public class codingAssignmentWeek3 {
	
	public static void main(String[] args) {
		
	
	
	//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	
	//a.Programmatically subtract the value of the first element in the array from the value in the last 
	//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
	int firstMinusLast = ages[ages.length - 1] - ages[0];
	System.out.println(firstMinusLast);
	
	//b.Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
	int[] ages2 = {50, 3, 9, 23, 64, 2, 8, 28, 93};
	int firstMinusLast2 = ages2[ages2.length - 1] - ages2[0];
	System.out.println(firstMinusLast2);
	
	//c.Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	int sum = 0;
	for (int i = 0; i < ages.length; i++) {
		sum += i;	
	}
	int averageAge = sum / ages.length;
	System.out.println(averageAge);
	
	//2.Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	//a.Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
	int totalChars = 0;
	for (String name : names) {
		totalChars += name.length();
	}
	System.out.println(totalChars / names.length);
	
	//b.Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	for (int j = 0; j < names.length; j++) {
		System.out.print(names[j] + " ");
	}
	System.out.println(" ");
	
	//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of 
	//each name to the nameLengths array.
	int nameChars = 0;
	int[] nameLengths = new int[names.length];
	 
	for (int k = 0; k < names.length; k++) {
		nameLengths[k] = names[k].length();
	}
	for(int index = 0; index < nameLengths.length; index++) {
		System.out.print(nameLengths[index] + " ");
	}
	
	System.out.println(" ");
	
	//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	int sumNameLength = 0;
	for (int index = 0; index < nameLengths.length; index++) {
		sumNameLength += nameLengths[index];
	}
	System.out.println(sumNameLength);
	
	//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. 
	//if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	System.out.println(repeatWord("string", 3));
	}
	
	
	//Methods Problems
	
	public static String repeatWord(String word , int n) {
		StringBuilder repeatedWord = new StringBuilder("");
		for(int index = 0; index < n; index++) {
			repeatedWord.append(word);
		}
		return repeatedWord.toString();
	}
	
	//8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name 
	//as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	//9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean greaterThanOneHundred(int[] intArr) {
		int hundred = 100;
		int arraySum = 0;
		for(int index = 0; index < intArr.length; index++) {
			arraySum += intArr[index];
		}
		if (arraySum > hundred) {
			return true;
		}
		return false;
		
	}
	
	//10.Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageOfDoubleArray(double[] doubles) {
		double arraySum = 0;
		double avg = 0;
		for(int index = 0; index < doubles.length; index++) {
		arraySum += doubles[index];	
		}
		avg = arraySum / doubles.length;
		return avg;
	}
	
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the 
	//first array is greater than the average of the elements in the second array.
	public static boolean firstIsGreater(double[] first, double[] second) {
		double firstArraySum = 0;
		double firstArrayAvg = 0;
		for(int index = 0; index < first.length; index++) {
			firstArraySum = first[index];
		}
		firstArrayAvg = firstArraySum / first.length;
		double secondArraySum = 0;
		double secondArrayAvg = 0;
		for(int index = 0; index < second.length; index++) {
			secondArraySum = second[index];
		}
		secondArrayAvg = secondArraySum / second.length;
		if(firstArrayAvg > secondArrayAvg) {
			return true;
		}
		return false;
	}
	
	//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns 
	//true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	//13.Can I go out tonight? This method determines if I can afford to go out tonight. 
	public static boolean canIParty(double moneyInPocket, double rentAndBills, double coverCharge, boolean workTomorrow) {
		if(moneyInPocket > (rentAndBills + coverCharge) && !workTomorrow ) {
			return true;
		}
		return false;
	}
	
}

