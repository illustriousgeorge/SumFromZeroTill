import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int num){
        int result = 0;
        for(int i = num; i > 0; i--) {
            result = result + i;
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo:");
        System.out.println(sumFromZeroTill(sc.nextInt()));
    }
}