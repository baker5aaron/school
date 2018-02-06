
public class assign5 {

	public static void main(String[] args) {
		
		
		int x = 4;
		int y = 5;
		System.out.println(mult(x,y));
		System.out.println(palindrome("adogaoda"));
		System.out.println(moreConsonants("chotch",0));

	}

	public static int mult(int n, int m)
	{
		if(m == 0)
			return 0;
		else
			return n + mult(n,(m-1));
	}
	
	public static boolean palindrome(String word)
	{
		if (word.length() == 0 || word.length() == 1)
			return true;
		else if(word.charAt(0) == word.charAt(word.length()-1))
			return palindrome(word.substring(1, word.length()-1));
		else
			return false;
	}
	
	public static boolean moreConsonants(String word, int count)
	{
		if (word.length() == 0) {
			if (count > -1)
				return false;
			else
				return true;
		}
		
		else 
			 switch(word.charAt(0)) {
	         case 'a':
	        	 count++;
	         case 'e':
	        	 count++;
	         case 'i':
	        	 count++;
	         case 'o':
	        	 count++;
	         case 'u':
	             count++;
	         default:
	        	 count--;
	     }
		
		return moreConsonants(word.substring(1), count);
	}
}
