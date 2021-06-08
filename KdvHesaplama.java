import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args){

        double  kdv, money, kdvMoney, kdvTutar;

        Scanner inp = new Scanner(System.in);

        System.out.println("Please login your money : ");
        money = inp.nextDouble();

        kdv = 0<money && money<=1000 ? 0.18 : 0.08;

        kdvTutar = money * kdv;
        kdvMoney = money + kdvTutar;

        System.out.println("Price without KDV : " + money);
        System.out.println("Price with KDV : " + kdvMoney);
        System.out.println("Price of KDV : " + kdvTutar);
        System.out.println("Current KDV : " + kdv);
    }
}
