package Task22_2;

public class Runn {
	public static int[] trans(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] % 2;
		}
		return a;
	}

	public static void main(String[] args) {
		int a[] = { 2,5,5,2,2 };
		int[] b = trans(a);
		int x = 0;
		int y = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 0) {
				x++;
			} else {
				y++;
			}
		}
		if (b.length % 2 == 0) {
			if (x % 2 == 0 || y % 2 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else {
			if (x % 2 == 1 && y % 2 == 0 || y % 2 == 1 && x % 2 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}
}
