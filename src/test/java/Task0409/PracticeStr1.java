package Task0409;

public class PracticeStr1 {

	public static void main(String[] args) {
		
		
		//CONCATENATION
		
		String str = "Next solar eclipse is 2044 wont pass";
		String str2 = "..but the next one is in 2026";
		System.out.println("Print String: " + str);
		String concat = str.concat(str2);
		System.out.println("Print String: " + concat);
		
		int a=10;
		int b=5;
		String c="10";
		
		System.out.println("Print a+b: " + (a+b));// 15 arthimatic operator
		System.out.println("Print a+c: " + (a+c));// 1010 concatination operatior
//	
//		String d = null;
//		String str3 = str.concat(d);
//		System.out.println("Print str3: " + str3);
//		
		
		
		//java.lang.NullPointerException
		
		String numStr = "34500";
		int cost = 100;
		
		int innum = Integer.parseInt(numStr);
		int totalCost = innum+cost;
		System.out.println("Print value of parsing string to interger: " + totalCost);
		
		//sub string " Hello world"
		//subStrRe= subStr.substring(int beginIndex);
		
		
		String subStr = "Hello World";
		
		String subStrRe= subStr.substring(4);
		
		
		System.out.println("Substring of the string :" + subStrRe);
		
		//beginIndex =inclusive
		//lastIndex = exclusive
		//strStr.subStr.substring(beginIndex,endIndex)
		
		String subStrRe1= subStr.substring(4,8);
		System.out.println("Substring of the string for begin and last :" + subStrRe1);
		
		
		//lower case toLowerCase
		
		String lowerca="ANITA";
		
		String lowe = lowerca.toLowerCase();
		System.out.println("Printing string lower case :" + lowe);
		
		//uppercase
		System.out.println("Printing string as upper case :" +lowe.toUpperCase());
		
		//trim function -trim the leading and trailing spaces
		
		String strTrim = "****Welcome to Java Class****";
		String trimOp= strTrim.trim();
		
		System.out.println("trim IP " + strTrim);
		System.out.println("trim Op " + strTrim.trim());
		System.out.println("");
		
		//still work pending need to go over the video and continue
		
		
		//
		
		
		
		
		
		
		
		
		

	}

}
