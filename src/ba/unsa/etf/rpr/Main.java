package ba.unsa.etf.rpr.tutorijal1;
import java.util.Scanner;


public class Main {

    public static int sumaCifara(int n){
        int suma = 0;
        while (n != 0){
            suma = suma + (n % 10);
            n = n / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
	// write your code here
        int n;
        System.out.println("Unesite n: ");
        Scanner ulaz= new Scanner(System.in);
        n = ulaz.nextInt();
        for(int i=2; i<n; i++){
            if(i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }


    }
}
