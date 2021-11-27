
public class OccurenceChar {

	public static void main(String[] args) {
		String str="engineering";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='i') {
				count++;
			}
			
		}
		System.out.println("occurenec of e "+count);
		
	}

}
