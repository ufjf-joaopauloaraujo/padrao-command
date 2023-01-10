package org.araujo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControladorTest {

    Controlador controlador;
    Lampada lampada;

    @BeforeEach
    void setUp() {
        controlador = new Controlador();
        lampada = new Lampada(1);
    }

    @Test
    void deveLigarLampada() {
        Tarefa ligarLampada = new TarefaLigarLampada(lampada);
        controlador.executarTarefa(ligarLampada);

        assertEquals("Lâmpada ligada", lampada.getStatus());
    }

    @Test
    void deveDesligarLampada() {
        Tarefa apagarLampada = new TarefaDesligarLampada(lampada);
        controlador.executarTarefa(apagarLampada);

        assertEquals("Lâmpada desligada", lampada.getStatus());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa ligarLampada = new TarefaLigarLampada(lampada);
        Tarefa apagarLampada = new TarefaDesligarLampada(lampada);

        controlador.executarTarefa(ligarLampada);
        controlador.executarTarefa(apagarLampada);

        controlador.cancelarUltimaTarefa();

        assertEquals("Lâmpada ligada", lampada.getStatus());
    }

}