package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		//need to find a way to increase the length while looping. 
		for(int i = 0; i < input.length(); i++)
		{
			
			input.substring(i);
		}
		return input;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
		for (int i = 0; i < input.length(); )
		{
			//reverse the string
			for(i = input.length()-1; i < input.length(); i--)
			{
				//find the last character and the first characters
				if(input.substring(i, i+4).equals(input.substring(i, i - 4)))
				{
					return input; 
				}
			}
			
			
		}
		
		return input;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		//need to put in an or statement to achieve the second result. 
		if(a / b == b / c)
		{
			return true;
		}
		else
		{
			return false; 
		}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		
		//String input = ""; 
		int n = 3; 
		
		for(int i = 0; i < input.length(); i++)
		{
			// if input equals the first and last character
			if(input.substring(i) != null && input.substring(i, i-1) != null)
			{
				//
				input.substring(i, i-n);
			}
		
		}
		return input;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		
		for(int i = 0; i < input.length(); i++)
		{
			//convert the string to lower case; 
			input.substring(i).toLowerCase();
			
			//if the substring i ends with dev.
			if(input.substring(i).endsWith("dev"))
			{
				return true; 
			}
			else 
			{
		
				return false;
			}
		}
		return false; 
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		int count = 0; 
		
		for(int i = 0; i < input.length(); i++)
		{
			if(input.substring(i, i+1).equals(input.substring(i+1, i+2)))
			{
				count = count+1; 
				
			}
		}
		return count;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		
		int count = 0;
		
		for(int i = 0; i < arg1.length(); i++)
		{
			//it is not equals as that will grab if the words has aa. Needs a not equals statement. 
			if(arg1.substring(i, i+1).toLowerCase().equals(arg1.substring(i+1, i+2).toLowerCase()))
			{
				count = count + 1;
			}
		}

	
		
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		//arg1 = 30;
		String response = ""; 
		boolean istrue = false; 
		

		for(arg1 = 0; arg1 <= 100; arg1++)
		{
			
			if((arg1%3) == 0)
			{
				istrue = true; 
				if(istrue == true && (arg1%3) == 0)
				{
					response = "fizz";
				}
				
				else
				{
					istrue = false; 

					if((arg1%5) == 0)
					{
						istrue = true;
						
						if(istrue == true && (arg1%5) == 0)
						{
							response = "buzz";
						}
						
						else
						{
							istrue = false; 
						
							if((arg1%5) == 0 && (arg1%3)==0)
							{
								istrue = true; 
								if(istrue = true && (arg1%5) == 0 && (arg1%3)==0)
								{
									response = "fizzbuzz";
								}
							}
							
							else 
							{
								istrue = false; 
								continue;
							}
						}
					}
			

				}
			}
		}
		return response; 
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		
		int highestval = 0;;
		//for loop runs the string 
		for(int i = 0; i < arg1.length(); i++)
		{
			//splits the string
			arg1.split(arg1, i);
			if(arg1.isEmpty())
			{
				
			}
			
			else
			{
				highestval = i + i; 
			}
			
		}
		return highestval;
		
	}
	
	
}
