import java.util.Scanner;

public class jonathan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de n primeiros numeros: ");
        int soma = 0;

        for (int n = sc.nextInt();n > 0;n++){
            soma+=1;
            double media = (double) soma/n;
            System.out.println("A soma é: "+n+" + "+n+" = "+ soma);
            System.out.println("A media é: "+ media);
        }
        sc.close();
        }
    }//nao terminei
