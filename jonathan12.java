import java.util.Scanner;

public class jonathan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL_CIDADES = 5;

        String cidadeMaiorAcidente = "", cidadeMenorAcidente = "";
        int maiorAcidente = Integer.MIN_VALUE;
        int menorAcidente = Integer.MAX_VALUE;

        int somaVeiculos = 0;
        int somaAcidentes = 0;

        for (int i = 1; i <= TOTAL_CIDADES; i++) {
            System.out.println("\nCidade " + i + ":");

            System.out.print("Nome da cidade: ");
            String nome = sc.nextLine();

            System.out.print("Número de veículos: ");
            int veiculos = sc.nextInt();

            System.out.print("Número de acidentes de trânsito: ");
            int acidentes = sc.nextInt();
            sc.nextLine(); 

            somaVeiculos += veiculos;
            somaAcidentes += acidentes;

            if (acidentes > maiorAcidente) {
                maiorAcidente = acidentes;
                cidadeMaiorAcidente = nome;
            }

            if (acidentes < menorAcidente) {
                menorAcidente = acidentes;
                cidadeMenorAcidente = nome;
            }
        }

        double mediaAcidentes = (double) somaAcidentes / TOTAL_CIDADES;
        
        System.out.println("Cidade com maior número de acidentes: " + cidadeMaiorAcidente + " (" + maiorAcidente + " acidentes)");
        System.out.println("Cidade com menor número de acidentes: " + cidadeMenorAcidente + " (" + menorAcidente + " acidentes)");
        System.out.println("Soma total de veículos nas 5 cidades: " + somaVeiculos);
        System.out.printf("Média de acidentes entre as 5 cidades: %.2f\n", mediaAcidentes);

        sc.close();
    }
}
