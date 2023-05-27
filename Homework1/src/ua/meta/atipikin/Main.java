package ua.meta.atipikin;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 12;
		int d = 13;
		int e = 14;
		int f = 15;
		
		// обчислимо число ACDC в шістнадцятковій системі
		
		int result = (int) (c + d * 16 + c * Math.pow(16.0, 2.0) + a * Math.pow(16.0, 3.0));
		System.out.println(result);

	}

}
