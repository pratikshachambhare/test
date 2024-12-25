 class Demo{

	 void demoarray()
	 {
		
		 int age[]=new int[3];
		// float sal[]=new float[6];
		 //String name[]={"Pratiksha","Sakshi","Yamu"};
		 //value assign
		 age[0]=18;
		 age[1]=20;
		 age[2]=25;
		 
		 System.out.println(age[0]);
		 System.out.println(age[1]);
		 System.out.println(age[2]);
		// age[5]=20;
		 //sal[2]=100.00f;
		// name[1]="pratiksha";
		// for(int i=0;i<3;i++)
		// {
			// System.out.println(age[i]);
		 //}
		 for(int ages:age){
			 System.out.println(ages);//for each
		 }
		 
		 int n=0;
		 while(n<3)
		 {
			 System.out.println(age[n]);
			 n++;
		 }
		// System.out.println(name[1]);
		// System.out.println(name[0]);
		
	 }
	 
	 void multiarray()
	 {
		 int multi[][]=new int[4][2];
		 int multia[][]={{10,20,30},{20,40,60}};
		 
		 System.out.println(multia[0][0]);//10
		 System.out.println(multia[0][1]);//20
		 System.out.println(multia[0][2]);//30
		 
		 System.out.println(multia[1][0]);
		 System.out.println(multia[1][1]);
		 System.out.println(multia[1][2]);
		 
		 System.out.println(multia.length);
		 System.out.println(multi.length);
		 
		 for(int i=0;i<multia.length;i++)
		 {
			 for(int j=0;j<multia[i]. length;j++)
			 {
			 System.out.println(multia[i][j]);
			 }
		 }
	 }
	
}
public class Arrays_1 {

	public static void main(String[] args) {
	Demo d=new Demo();
	d.multiarray();
	//d.demoarray();

	}

}
