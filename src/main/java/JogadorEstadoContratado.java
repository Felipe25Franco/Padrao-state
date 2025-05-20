

public class JogadorEstadoContratado extends JogadorEstado{
    private JogadorEstadoContratado() {};
    private static JogadorEstadoContratado instance = new JogadorEstadoContratado();
    public static JogadorEstadoContratado getInstance(){return instance;}
    public String getEstado(){return "Contratado";}

    public boolean emprestar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        return true;
    }
    public boolean vender(Jogador jogador) {
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        return true;
    }

    public boolean convocar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        return true;
    }

    public boolean livre(Jogador jogador) {
        jogador.setEstado(JogadorEstadoLivre.getInstance());
        return true;
    }
}
