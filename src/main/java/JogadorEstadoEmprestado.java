

public class JogadorEstadoEmprestado extends JogadorEstado{
    private JogadorEstadoEmprestado() {};
    private static JogadorEstadoEmprestado instance = new JogadorEstadoEmprestado();
    public static JogadorEstadoEmprestado getInstance(){return instance;}
    public String getEstado(){return "Emprestado";}


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
