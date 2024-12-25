
public class Variables {
	static int x=10;//static
    int b=5;//instance
	public static void main(String[] args) {
		int a=20;//local
		Variables v=new Variables();
		System.out.println(a);
		System.out.println(Variables.x);
		System.out.println(v.b);
		

	}

}
