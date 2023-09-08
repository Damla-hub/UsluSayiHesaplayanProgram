import java.util.Scanner;
public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int a,b,total=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("Üssünü giriniz:");
        b=input.nextInt();
        for(int i=1;i<=b;i++){
            total*=a;
        }
        System.out.print(a+" sayısının "+b+" üssü= "+total);

    }
}
