
public class Misc {

	public static void main(String[] args) {
		
		//System.out.println(getNumber(6));
		System.out.println(f5(5,3));
		System.out.println(f6(72,8));
	

	}
	
	public static double f(double x) { return g(x) + Math.sqrt(h(x)); } 
	public static double g(double x) { return 4 * h(x); } 
	public static double h(double x) { return x * x + k(x) - 1; } 
	public static double k(double x) { return 2 * (x + 1); }
	public static double getNumber(double n) {return Math.pow(Math.sqrt(n), 2) - n;}
	
	public static int f5(int x, int y) {
		int z = 0;
		for(int i = x; i > 0; i >>=1) {
			if(i%2 == 1) {
				z += y;
			}
			y <<= 1;
		}
		return z;
	}
	
	public static int f6(int x, int y) {
		int q = 0;
		y = y << 16;
		
		for (int i = 0; i <= 16; i++, y >>=1) {
			q <<= 1;
			if(x >= y) {
				q++;
				x -= y;
			}
		}
		return q;
	}

}
