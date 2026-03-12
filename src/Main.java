import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===Registrar novo membro===");

        System.out.print("Digite um id para o membro: ");
        int membroId = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o email do membro: ");
        String email = sc.nextLine();

        Membro m = new Membro(membroId, nome,  email);
        System.out.println("Membro " + nome + " possui id: " + membroId + " e email: " + email);
        System.out.println("Cadastrado com sucesso!");

        System.out.println(" ");

        System.out.println("===Registrar novo livro===");
        System.out.print("Digite o id do livro: ");
        int livroId = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o titulo: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o autor: ");
        String autor = sc.nextLine();

        Livro l = new Livro(livroId, titulo, autor);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(l);
        System.out.print("Deseja remover o livro? (s/n): ");
        String resposta = sc.nextLine();
        sc.close();

        if (resposta.equalsIgnoreCase("s")) {
            biblioteca.removerLivro(l);
        }


    }
}