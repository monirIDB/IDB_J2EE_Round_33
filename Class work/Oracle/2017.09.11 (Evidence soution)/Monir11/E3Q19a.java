public class E3Q19a{
	public static void main(String[] args){
		int p=8;
		int q=5;
		for(int i=0;i<5;i++){
			q--;
			for(int j=0; j<=p; j++){
				System.out.print("*");
			}
			System.out.println("");
			if(q==4){
					for(int k=0;k<1;k++){
						System.out.print(" ");
				}
			}
			if(q==3){
					for(int k=0;k<2;k++){
						System.out.print(" ");
				}
			}
			if(q==2){
					for(int k=0;k<3;k++){
						System.out.print(" ");
				}
			}
			if(q==1){
					for(int k=0;k<4;k++){
						System.out.print(" ");
				}
			}
			p-=2;
			
		}
	}
}