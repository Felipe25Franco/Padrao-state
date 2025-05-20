

public class JogadorEstadoLivre extends JogadorEstado{
    private JogadorEstadoLivre() {};
    private static JogadorEstadoLivre instance = new JogadorEstadoLivre();
    public static JogadorEstadoLivre getInstance(){return instance;}
    public String getEstado(){return "Livre";}
    public boolean contratar(Jogador jogador){
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        return true;
    }
}
