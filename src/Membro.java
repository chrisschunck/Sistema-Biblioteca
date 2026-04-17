class Membro {
    private int membroId;
    private String nome;
    private String email;

    public Membro(int id, String nome, String email) {
        this.membroId = id;
        this.nome = nome;
        this.email = email;
    }

        public int getId() {
            return membroId;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }
    }

public String toString() {
    return "
        "Membroid =" membroid +
        ", nome =" nome + 
        ", email =" email"
}
