import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno:");
        Scanner pega = new Scanner(System.in);
        aluno.setNome(pega.nextLine());
        System.out.println("Digite a primeira nota:");
        aluno.setNota1(pega.nextDouble());
        System.out.println("Digite a segunda nota:");
        aluno.setNota2(pega.nextDouble());
        System.out.println("Digite a terceira nota:");
        aluno.setNota3(pega.nextDouble());
        System.out.println("Imprimindo...");
        aluno.lista();
    }
}
