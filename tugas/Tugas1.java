import java.util.Scanner;

public class Tugas1 {
	 public static void main(String[] args)
	 {
	 	int nilai1, nilai2;
	 	Scanner sc = new Scanner (System.in);

	 	System.out.print("Masukan Nilai1: ");
	 	nilai1 = sc.nextInt();
	 	System.out.print("Masukan Nilai2: ");
	 	nilai2 = sc.nextInt();

	 	if (nilai1 > nilai2) {
	 		System.out.println(nilai1+" Ini adalah Nilai Terbesar");
	 	}

	 }
}
