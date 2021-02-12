import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int mid = n / 2;

		for (int i = n / 2; i < n; i++) {

			for (int j = n / 2; j <= i; j++) {
				System.out.print(s.charAt(j) + " ");
			}

			if (i == n - 1) {
				for (int t = 0; t < n / 2; t++) {
					System.out.println();
					for (int j = n / 2; j < n; j++) {
						System.out.print(s.charAt(j) + " ");
					}
					for (int k = 0; k <= t; k++)
						System.out.print(s.charAt(k) + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
