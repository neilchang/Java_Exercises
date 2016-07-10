package canMeasureWater;

public class canMeasureWaterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean measureable = canMeasureWater(2, 6, 5);
	}

	public static boolean canMeasureWater(int x, int y, int z) {
		int gcd = 1;

		/* find GCD */
		if (y > 0) {
			while ((x %= y) > 0 && (y %= x) > 0) {
			}
			gcd = x + y;
		}

		if (z % gcd == 0)
			return true;
		else
			return false;
	}

}
