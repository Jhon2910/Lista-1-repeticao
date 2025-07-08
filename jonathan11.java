import java.util.Scanner;

public class jonathan11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n > 0) {
            int i = 0;
            double soma = 0;
            double maiorNota = Double.MIN_VALUE;
            double menorNota = Double.MAX_VALUE;
            String alunoMaiorNota = "";
            String alunoMenorNota = "";

            while (i < n) {
                System.out.print("Digite o nome do " + (i + 1) + "º aluno: ");
                String nome = sc.nextLine();

                System.out.print("Digite a nota do " + nome + ": ");
                double nota = sc.nextDouble();
                sc.nextLine();

                soma += nota;

                if (nota > maiorNota) {
                    maiorNota = nota;
                    alunoMaiorNota = nome;
                }

                if (nota < menorNota) {
                    menorNota = nota;
                    alunoMenorNota = nome;
                }

                i++;
            }

            double media = soma / n;
            
            System.out.println("Maior nota: " + maiorNota + " (Aluno: " + alunoMaiorNota + ")");
            System.out.println("Menor nota: " + menorNota + " (Aluno: " + alunoMenorNota + ")");
            System.out.println("Soma das notas: " + soma);
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Por favor, insira um número positivo de alunos!");
        }

        sc.close();
    }
}
