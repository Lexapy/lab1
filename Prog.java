import static java.lang.Math.*;


public class Prog {

	public static double rnd(double start, double end) {
	    return (double) ((Math.random() * (end - start)) + start);
	}


	public static void main(String[] args) {
		long[] c = new long[10];
		for (int i = 0; i < 10; ++i) {
			c[i] = i * 2 + 5;
		}

		double[] x = new double[10];
		for (int i = 0; i < 10; ++i) {
			x[i] = rnd(-15, 9);
		}

		double[][] a = new double[10][10];
		for (int i = 0; i < 10; ++i) {
			for (int j = 0; j < 10; ++j) {
				double s = x[j];

				switch ((int) c[i]) {
					case 21:
						a[i][j] = cos(pow(pow(E, s) * (1 - tan(s)), 2));
						break;
					case 5, 7, 13, 15, 23:
						a[i][j] = tan(tan(cos(s)));
						break;
					default:
						double s1 = pow(asin(cos(s)), 0.5 * (log(pow(tan(s), 2)) - 1));
						double s2 = 0.5 / log(pow(PI + abs(s), s));

						a[i][j] = pow(pow(pow(pow((1/3 + s) / s, 3) / (pow(s, PI / s) + 1), 3), s2), s1);
				}
			}
		}

		for (double[] array : a) {
			for (double el : array) {
				System.out.printf("%-12.4f", el);
			}
			System.out.println();
		}


	}
}