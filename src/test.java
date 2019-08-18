
public class test {
	public static void main (String args[]) {
		String s = "1234567";
		int io =0;
		for (int i =0; i < s.length(); i++)
			io += Character.getNumericValue(s.charAt(i));
		System.out.println(io);
		//System.out.println(Character.getNumericValue(s.charAt(i)));
	}

}
