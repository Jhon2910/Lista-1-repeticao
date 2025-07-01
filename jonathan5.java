import java.util.Scanner;

public class jonathan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0 ;

        for (int     n = 1; n <10; n++){
            soma += n;
            double media = (double) soma / 10;
            System.out.println("A soma dos 10 primeiros numeros é: "+ n + " + " + (n+1) + " = " + soma);
            System.out.println("A media é : "+ media);
        }
        sc.close();
        }

    }//nao acabei
