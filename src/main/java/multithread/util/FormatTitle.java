package multithread.util;

import java.util.Scanner;

public class FormatTitle {

	public static String format(String title) {
		String re = title.trim().toLowerCase().replaceAll("\\s+", "_")
				.replaceAll("[^a-zA-Z0-9_]", "");
		System.out.println(re);
		return re;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		FormatTitle.format(title);
	}
}
