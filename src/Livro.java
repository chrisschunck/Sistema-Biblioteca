import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int livroId;
    private String titulo;
    private String autor;
    private boolean emprestado;



    public Livro(int id, String titulo, String autor) {
        this.livroId = id;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }


    public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getId() {
            return livroId;
        }
    @Override
    public String toString() {
        return "Livro [ID=" + livroId + ", Título=" + titulo + ", Autor=" + autor + "]";
    }

}
