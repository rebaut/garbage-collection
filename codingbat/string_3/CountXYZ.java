package string_3;

public class CountXYZ {
	public static void main(String[] args) {
		System.out.println(countYZ_method("DAY abc XYZ"));
		//some changes
	}
	
	public static int countYZ_method(String str) {
		int counterYZ = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if((str.substring(i,i+1).toLowerCase().equals("y") || str.substring(i,i+1).toLowerCase().equals("z")))
				counterYZ = (i == str.length() - 1 || !Character.isLetter(str.charAt(i+1))) ? counterYZ + 1 : counterYZ;
		}		
		return counterYZ;
	}
}
