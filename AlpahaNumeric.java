
public class AlpahaNumeric {

	public static void main(String[] args) {
	String str=" sjds2@546756 '' effgfgdj124@@cdfe34@";
	String rep=str.replaceAll("[@,5]","");
	String rep1=str.replaceAll("[0-9, @,']", "");
	System.out.println(rep);
	System.out.println(rep1);
	
	}
	

}
