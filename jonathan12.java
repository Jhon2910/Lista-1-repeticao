import java.util.Scanner;

public class jonathan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_CIDADES = 5;

        String cidadeMaiorIndice = "", cidadeMenorIndice = "";
        double maiorIndice = Double.MIN_VALUE;
        double menorIndice = Double.MAX_VALUE;

        int somaVeiculos = 0;
        int somaAcidentesMenos200 = 0;
        int cidadesMenos200 = 0;

        System.out.println("== Levantamento de dados de trânsito em 5 cidades ==\n");

        for (int i = 1; i <= TOTAL_CIDADES; i++) {
            System.out.println("Cidade " + i + ":");

            System.out.print("Nome da cidade: ");
            String nome = sc.nextLine();

            System.out.print("Número de veículos: ");
            int veiculos = sc.nextInt();

            System.out.print("Número de acidentes: ");
            int acidentes = sc.nextInt();
            sc.nextLine(); 

            double indice = (double) acidentes / veiculos;

            System.out.printf("Índice de acidentes: %.4f\n\n", indice);

            somaVeiculos += veiculos;

            if (veiculos < 200) {
                somaAcidentesMenos200 += acidentes;
                cidadesMenos200++;
            }

            if (indice > maiorIndice) {
                maiorIndice = indice;
                cidadeMaiorIndice = nome;
            }

            if (indice < menorIndice) {
                menorIndice = indice;
                cidadeMenorIndice = nome;
            }
        }

        double mediaVeiculos = (double) somaVeiculos / TOTAL_CIDADES;
        double mediaAcidentesMenos200 = cidadesMenos200 > 0 ?
                (double) somaAcidentesMenos200 / cidadesMenos200 : 0;
        
        System.out.printf("Maior índice de acidentes: %.4f (Cidade: %s)\n", maiorIndice, cidadeMaiorIndice);
        System.out.printf("Menor índice de acidentes: %.4f (Cidade: %s)\n", menorIndice, cidadeMenorIndice);
        System.out.printf("Média de veículos nas 5 cidades: %.2f\n", mediaVeiculos);

        if (cidadesMenos200 > 0) {
            System.out.printf("Média de acidentes nas cidades com menos de 200 veículos: %.2f\n", mediaAcidentesMenos200);
        } else {
            System.out.println("Nenhuma cidade com menos de 200 veículos.");
        }

        sc.close();
    }
}
