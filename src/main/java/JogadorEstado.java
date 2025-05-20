

public abstract class JogadorEstado {
    public abstract String getEstado();

    public boolean livre(Jogador jogador){return false;}
    public boolean contratar(Jogador jogador){return false;}
    public boolean emprestar(Jogador jogador){return false;}
    public boolean convocar(Jogador jogador){return false;}
    public boolean vender(Jogador jogador){return false;}
}
