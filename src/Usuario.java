public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private AchadoPerdido achadoPerdido;

    public Usuario(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AchadoPerdido getAchadoPerdido() {
        return achadoPerdido;
    }

    public void setAchadoPerdido(AchadoPerdido achadoPerdido) {
        this.achadoPerdido = achadoPerdido;
    }
}
