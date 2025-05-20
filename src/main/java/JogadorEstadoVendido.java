

public class JogadorEstadoVendido extends JogadorEstado{
    private JogadorEstadoVendido() {};
    private static JogadorEstadoVendido instance = new JogadorEstadoVendido();
    public static JogadorEstadoVendido getInstance() {return instance;}
    public String getEstado() {return "Vendido";}
}
