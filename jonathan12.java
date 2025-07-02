import java.util.Scanner;

public class jonathan12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String cidade,nomeMaior,nomeMenor;
        double veiculos,acidentes=0,menor=0,maior=0;
        double somaAcidentes=0,somaVeiculos=0,mediaVeiculos=0,razao=0;
        double somaAcidentes200=0,mediaAcidentes200=0,quantidade200=0;

        for (int i=1;i<=5;i++){
            System.out.println("Digite o nome da cidade: ");
            cidade = sc.nextLine();
            System.out.println("Digite a quantidade de veiculos da cidade "+ cidade +": ");
            veiculos = sc.nextDouble();
            System.out.println("Digite o numero de acidentes da cidade "+ acidentes +": ");
            acidentes = sc.nextDouble();
            sc.nextLine();//limpar buffer de memória
            somaAcidentes += acidentes;
            somaVeiculos += veiculos;

            if (veiculos < 200){
                somaAcidentes200 += acidentes;
                quantidade200++;
            }
            if (i ==1){
                maior = acidentes;
                nomeMaior = cidade;
                menor = acidentes;
                nomeMenor = cidade;
            }
            else {
                if (acidentes > maior){
                    maior = acidentes;
                    nomeMaior = cidade;
                }
                if (acidentes < menor){
                    menor = acidentes;
                    nomeMenor = cidade;
                }
            }
        }
        razao = somaAcidentes/somaVeiculos;
        mediaVeiculos = somaVeiculos/5;
        System.out.println("O maior acidente foi: "+maior);
        System.out.println("O menor acidente foi: "+menor);
        System.out.println("A razão entre quantidade de acidente :"+razao);
        System.out.println("A media de veiculos nas 5 cidades é: "+mediaVeiculos);
        if (quantidade200!=0){
            mediaAcidentes200 = somaAcidentes200/quantidade200;
            System.out.println("A media de acidentes na cidade"+mediaAcidentes200+"é : ");
        }
        else {
            System.out.println("Não tem cidades com menos de 200 acidente!");
        }
    }
}
