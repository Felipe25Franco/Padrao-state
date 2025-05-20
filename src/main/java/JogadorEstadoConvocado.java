

public class JogadorEstadoConvocado extends JogadorEstado{
    private JogadorEstadoConvocado() {};
    private static JogadorEstadoConvocado instance = new JogadorEstadoConvocado();
    public static JogadorEstadoConvocado getInstance(){return instance;}
    public String getEstado(){return "Convocado";}
}
