

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class JogadorTest {
    Jogador jogador;

    @BeforeEach
    public void setUp(){jogador = new Jogador();}

    // Jogador Contratado

    @Test
    public void deveEmprestarJogadorContratado() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertTrue(jogador.emprestar());
        assertEquals(JogadorEstadoEmprestado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveVenderJogadorContratado() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertTrue(jogador.vender());
        assertEquals(JogadorEstadoVendido.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveConvocarJogadorContratado() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertTrue(jogador.convocar());
        assertEquals(JogadorEstadoConvocado.getInstance(), jogador.getEstado());
    }
    @Test
    public void deveLivrarJogadorContratado() {
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertTrue(jogador.livre());
        assertEquals(JogadorEstadoLivre.getInstance(), jogador.getEstado());
    }
    @Test
    public void naoDeveContratarJogadorContratado(){
        jogador.setEstado(JogadorEstadoContratado.getInstance());
        assertFalse(jogador.contratar());
    }


    // Jogador Livre

    @Test
    public void deveContratarJogadorLivre() {
        jogador.setEstado(JogadorEstadoLivre.getInstance());
        assertTrue(jogador.contratar());
        assertEquals(JogadorEstadoContratado.getInstance(),jogador.getEstado());
    }
    @Test
    public void naoDeveEmprestarJogadorLivre(){
        jogador.setEstado(JogadorEstadoLivre.getInstance());
        assertFalse(jogador.emprestar());
    }
    @Test
    public void naoDeveConvocarJogadorLivre(){
        jogador.setEstado(JogadorEstadoLivre.getInstance());
        assertFalse(jogador.emprestar());
    }
    @Test
    public void naoDeveVenderJogadorLivre(){
        jogador.setEstado(JogadorEstadoLivre.getInstance());
        assertFalse(jogador.vender());
    }
    @Test
    public void naoDeveLivrarJogadorLivre(){
        jogador.setEstado(JogadorEstadoLivre.getInstance());
        assertFalse(jogador.livre());
    }

    // Jogador Emprestado

    @Test
    public void deveVenderJogadorEmprestado() {
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        assertTrue(jogador.vender());
        assertEquals(JogadorEstadoVendido.getInstance(),jogador.getEstado());
    }
    @Test
    public void deveConvocarJogadorEmprestado() {
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        assertTrue(jogador.convocar());
        assertEquals(JogadorEstadoConvocado.getInstance(),jogador.getEstado());
    }
    @Test
    public void deveLivrarJogadorEmprestado() {
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        assertTrue(jogador.livre());
        assertEquals(JogadorEstadoLivre.getInstance(),jogador.getEstado());
    }
    @Test
    public void naoDeveContratarJogadorEmprestado(){
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        assertFalse(jogador.contratar());
    }
    @Test
    public void naoDeveEmprestarJogadorEmprestado(){
        jogador.setEstado(JogadorEstadoEmprestado.getInstance());
        assertFalse(jogador.emprestar());
    }

    // Jogador Convocado

    @Test
    public void naoDeveContratarJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.contratar());
    }
    @Test
    public void naoConvocarDeveJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.convocar());
    }
    @Test
    public void naoEmprestarDeveJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.emprestar());
    }
    @Test
    public void naoDeveLivrarJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.livre());
    }
    @Test
    public void naoDeveVenderJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.vender());
    }

    // Jogador Vendido

    @Test
    public void naoDeveContratarJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.contratar());
    }
    @Test
    public void naoConvocarDeveJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.convocar());
    }
    @Test
    public void naoEmprestarDeveJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.emprestar());
    }
    @Test
    public void naoDeveLivrarJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.livre());
    }
    @Test
    public void naoDeveVenderJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.vender());
    }
}
