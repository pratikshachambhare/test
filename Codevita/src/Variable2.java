
public class Variable2 {
	static int a=10;//static 
	void fun()
	{
		int b=20;//local
		System.out.println(a+" "+b);
		++a;++b;
	}

	public static void main(String[] args) {
		Variable2 vr=new Variable2();
		vr.fun();
		vr.fun();

	}

}
