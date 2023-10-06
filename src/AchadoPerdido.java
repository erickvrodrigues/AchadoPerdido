import javax.swing.JOptionPane;
public class AchadoPerdido  implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;

    private String status;

    private Usuario usuario;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;

        this.tipo = tipo;


        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String buscarTitulos(String titulo){
        String retorno = "";
        retorno = getTitulo() +", "+getDescricao()+", "+getLocal_achado();
        return retorno;
    };
    public void visualizarDetalhes(){
        String mensagem = "";
        mensagem = getTitulo()+", "+getFoto()+", "+getLocal_achado()+", "+getTipo()+", "+getStatus();
        JOptionPane.showMessageDialog(null, mensagem);
    };

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
