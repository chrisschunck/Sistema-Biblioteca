import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro);
    }

    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro);
        } else {
            System.out.println("Livro não encontrado na biblioteca.");
        }
    }

    public void listarLivros() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
    public void registrarEmprestimo(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            System.out.println("Livro emprestado: " + livro);
        } else {
            System.out.println("Livro já está emprestado!");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livro.isEmprestado()) {
            livro.devolver();
            System.out.println("Livro devolvido: " + livro);
        } else {
            System.out.println("Livro não estava emprestado.");
        }
    }

}

