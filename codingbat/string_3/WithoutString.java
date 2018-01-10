package string_3;

public class WithoutString {
	public static void main(String[] args) {
		System.out.println(withoutString_method("Hello there", "llo"));
	}
	public static String withoutString_method(String base, String remove) {
		StringBuffer sb = new StringBuffer(base);
		for(int i = 0; i < sb.length(); i++)
		{
			if(i + remove.length() <= sb.length() && sb.substring(i, i + remove.length()).equalsIgnoreCase(remove))
			{
				sb.replace(i, i+ remove.length(),"");
				i-=1;
			}
		}
		return sb.toString();
	}
}
