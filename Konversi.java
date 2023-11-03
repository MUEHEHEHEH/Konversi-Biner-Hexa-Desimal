import java.util.Scanner;

// Jason Surya Wijaya
// 235150207111055

public class Konversi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Biner -> Desimal");
        System.out.println("2. Desimal -> Biner");
        System.out.println("3. Biner -> Hexa");
        System.out.println("4. Hexa -> Biner");
        System.out.println("5. Desimal -> Hexa");
        System.out.println("6. Hexa -> Desimal");
        System.out.print("Pilihan Anda? : ");

        char pick = sc.next().charAt(0);
        String biner;
        int Desimal = 0;
        String Hexa;
        int up = 0;

        switch (pick) {

            case '1':

                System.out.print("Masukkan nilai Biner : ");
                biner = sc.next();

                for (int i = biner.length() - 1; i >= 0; i--) {
                    if (biner.charAt(i) == '1') {
                        Desimal += Math.pow(2, up);
                    }
                    up++;
                }

                System.out.print("Hasil Konversi Biner ke Desimal : " + Desimal + "\n");
                break;

            case '2':

                System.out.print("Masukkan nilai Desimal : ");
                Desimal = sc.nextInt();
                biner = "";
                while (Desimal > 0) {
                    biner += (Desimal % 2 == 0) ? "0" : "1";
                    Desimal /= 2;
                }

                String reversed = new StringBuilder(biner).reverse().toString();
                System.out.println("Hasil Konversi Desimal ke Biner : " + reversed + "\n");
                break;

            case '3':

                System.out.print("Masukkan nilai Biner : ");
                biner = sc.next();
                for (int i = biner.length() - 1; i >= 0; i--) {
                    if (biner.charAt(i) == '1') {
                        Desimal += Math.pow(2, up);
                    }
                    up++;
                }
                Hexa = Integer.toHexString(Desimal);
                Hexa = Hexa.toUpperCase();
                System.out.print("Hasil Konversi Biner ke Hexa: " + Hexa + "\n");
                break;

            case '4':

                System.out.print("Masukkan nilai Hexa : ");
                Hexa = sc.next();
                String binary = Integer.toBinaryString(Integer.parseInt(Hexa, 16));
                System.out.print("Hasil Konversi Hexa ke Biner: " + binary + "\n");
                break;

            case '5':

                System.out.print("Masukkan nilai Desimal : ");
                Desimal = sc.nextInt();
                Hexa = Integer.toHexString(Desimal).toUpperCase();
                System.out.print("Hasil Konversi Desimal ke Hexa: " + Hexa + "\n");
                break;

            case '6':

                System.out.print("Masukkan nilai Hexa : ");
                Hexa = sc.next();
                Desimal = Integer.parseInt(Hexa, 16);
                System.out.print("Hasil Konversi Hexa ke Desimal : " + Desimal + "\n");
                break;

            default:

                System.out.println("ERROR");
        }

    }
}
