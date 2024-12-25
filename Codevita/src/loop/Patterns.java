package loop;

public class Patterns {

	public static void main(String[] args) {
		int n=4;
		int m=5;
		//solid rectangle
//		//outer loop
//		for(int i=1;i<=n;i++){
//			//inner loop
//			for(int j=1;j<=m;j++){
//			System.out.print(" * ");
//			}
//			System.out.println();
//		}
		//hollow rectangle
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=m;j++){
//				if(i==1 ||j==1 ||i==n ||j==m){
//					System.out.print(" * ");
//				}
//				else{
//					System.out.print("   ");
//				}
//				
//				
//			}
//			System.out.println();
//		}
		
		//half pyramid
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
//		
		
		//inverted half pyrammid
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
