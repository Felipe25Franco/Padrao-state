

public class Jogador {
    private String nome;
    private JogadorEstado estado;

    public Jogador(){this.estado = JogadorEstadoLivre.getInstance();}

    public void setEstado(JogadorEstado estado){this.estado = estado;}
    public boolean contratar(){return estado.contratar(this);}
    public boolean emprestar(){return estado.emprestar(this);}
    public boolean convocar(){return estado.convocar(this);}
    public boolean vender(){return estado.vender(this);}
    public boolean livre(){return estado.livre(this);}

    public String getNomeEstado(){return estado.getEstado();}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado(){return estado;}
}
