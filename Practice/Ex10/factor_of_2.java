package Ex10;

public class factor_of_2 {
	public static void main(String[] args) {
		int n = 256;
		System.out.print(isFactor(n));
	}

	public static boolean isFactor(int n) {
		if (n % 2 == 0){
			if (n / 2 == 1){
				return true;
			}
			else {
				return isFactor(n / 2);
			}
		}
		else {
			return false;
		}
	}
}
