package string_3;

public class EqualIsNot {

	public static void main(String[] args) {
		System.out.println(equalIsNot_method("isnotis"));
	}
	
	public static boolean equalIsNot_method(String str) {
		int isCounter = 0;
		int notCounter = 0;
		int ending = 2;
		
		if(str.endsWith("is"))
		{
			ending = 1;
		}
		
		for(int i = 0; i < str.length() - ending; i++)
		{
			if(str.substring(i, i+2).equals("is"))
			{
				isCounter++;  
			} 
			else if(str.substring(i, i+3).equals("not"))
			{
				notCounter++; 
			}
		}
		System.out.println(isCounter+" "+notCounter);
		return isCounter == notCounter;
	}
}
