
public class FIbonacci {

	public static void main(String[] args) {
	int n0=0,n1=1;
	int sum=0;
	for(int i=0;i<=5;i++)
	{
		sum=n0+n1;
		n0=n1;
		n1=sum;
		System.out.println(sum);
	}


	}

}
