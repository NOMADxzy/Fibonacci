
public class Fibonacci {
	public static int of(int n) {
		if(n==1||n==2)
		{
			return 1;
		}
		else
		{
			return Fibonacci.of(n-1)+Fibonacci.of(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=1;
		while(Fibonacci.of(n)<=200)
		{
			System.out.println(Fibonacci.of(n));
			n++;
		}

	}

}