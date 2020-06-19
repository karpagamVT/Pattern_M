package PatPro;

public class M {

	public static void main(String[] args) {
		for (int i = 0; i <7; i++) {
			for (int j =0; j <7; j++) {
				if(j==0||j==6||((i==j)&&(j>0&&j<4))||(i==1&&j==5)||(i==2&&j==4))  
				{
					System.out.print("*"+" ");
				} else {
					System.out.print("  ");
				}
			} 
			System.out.println();
		}

	}

}