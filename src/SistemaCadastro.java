import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);



        double media = 0;
        double total = 0;

        System.out.println("Quantos alunos deseja cadastrar: ");
        int cadastrar = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[cadastrar];
        Double[] notas = new Double[cadastrar];
        String[] situacao = new String[cadastrar];

        for(int i = 0; i < cadastrar; i++) {
            System.out.println("Nome do aluno: ");
            nomes[i] = scanner.nextLine();

            System.out.println("Nota do aluno: ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();

            total += notas[i];

            if (notas[i] >= 6) {
                situacao[i] = "Aprovado";
            } else {
                situacao[i] = "Reprovado";
            }
        }

        media = total / cadastrar;

        System.out.println("================== RELATÓRIO DE ALUNOS =====================");

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(String.format("Aluno: %s | Nota: %.2f | Situação: %s", nomes[i].toUpperCase(), notas[i], situacao[i]));
        }

        System.out.println(String.format("Media de todas as notas %.2f",media));


    }
}