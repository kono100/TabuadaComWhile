package tabuadacomwhile;
import java.util.Scanner;
public class TabuadaComWhile {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1, y;
        int resposta;
        System.out.print("Qual tabuada deseja ? ");
        y = sc.nextInt();
        System.out.print("\n");
        while (x >= 1 && x <= 10) {

            resposta = x * y;

            System.out.println(y + " X " + x + " = " + resposta);
            x++;
        }
    }
}