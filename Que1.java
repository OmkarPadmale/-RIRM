package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Que1 
{
	public static boolean isValid(String s)
	{
	    
	    Pattern p = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$");
	 
	 
	    Matcher m = p.matcher(s);
	    return (m.find() && m.group().equals(s));
	}
	 
	
	public static void main(String[] args)
	{
	    String s = "1-212-456-7890";
	     
	    if (isValid(s))
	        System.out.println("Valid Number");    
	    else
	        System.out.println("Invalid Number");    
	}

}
