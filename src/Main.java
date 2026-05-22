import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===Registrar novo membro===");

        System.out.print("Digite um id para o membro: ");
        int membroId = scanner.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do membro: ");
        String email = scanner.nextLine();

        Membro membro = new Membro(membroId, nome,  email);
        System.out.println("Membro " + nome + " possui id: " + membroId + " e email: " + email);
        System.out.println("Cadastrado com sucesso!");

        System.out.println(" ");

        System.out.println("===Registrar novo livro===");
        System.out.print("Digite o id do livro: ");
        int livroId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();

        Livro livro = new Livro(livroId, titulo, autor);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro);
        System.out.print("Deseja remover o livro? (s/n): ");
        String resposta = scanner.nextLine();
        scanner.close();

        if (resposta.equalsIgnoreCase("s")) {
            biblioteca.removerLivro(l);
        }


    }
}
