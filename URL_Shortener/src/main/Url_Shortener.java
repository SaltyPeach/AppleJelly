package main;
import hash.*; 

public class Url_Shortener {

	public static void main (String[] args) {
		
		
		//Check the argument for validity.
		
		//will use arguments from the command line to take in a URL for now.
		if (args.length == 0) {
			System.out.println("Please put in an URL");
		}
		else if (args.length != 1) {
			//TODO create a valid URL checker.
			//TODO eventually make it so that it can take multiple URLs?
			StringBuilder builder = new StringBuilder();
			for(String s : args) {
			    builder.append(s);
			}
			String str = builder.toString();
			System.out.println("Not valid: "+ str);
		}
		
		//Create a unique hash URL.
		
		
		
	}
	
	
}
