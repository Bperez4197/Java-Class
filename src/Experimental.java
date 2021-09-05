
public class Experimental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int height = 3;
		     int width = 4;

		  //   for(int i = 0; i < height * width; i++){
		  //     System.out.print("*");
		  //     if(i % width == 0){
		  //       System.out.print("\n");
		  //     }
		  //   }
		  // }
		  
		int row = 0;
		for(int i = 0; i < height * width; i++)
		{
		   System.out.print("*");
		   if( ++row >= width ) {
		      row = 0;
		      System.out.println();
		   }
		}
	}

}
