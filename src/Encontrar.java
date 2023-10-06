import javax.swing.JOptionPane;
public class Encontrar {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Erick","123456","erick@email.com");
        AchadoPerdido achadoPerdido = new AchadoPerdido("Iphone 12","Iphone prateado","eletronico","perdido");
        achadoPerdido.setUsuario(usuario);
        JOptionPane.showMessageDialog(null, achadoPerdido.buscarTitulos(achadoPerdido.getTitulo()));

        achadoPerdido.visualizarDetalhes();

    }

}
