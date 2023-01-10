package org.araujo;

public class TarefaDesligarLampada implements Tarefa {

    private Lampada lampada;

    public TarefaDesligarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.desligarLampada();
    }

    public void reverter() {
        this.lampada.ligarLampada();
    }
}
