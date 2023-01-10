package org.araujo;

public class TarefaLigarLampada implements Tarefa {

    private Lampada lampada;

    public TarefaLigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public void executar() {
        this.lampada.ligarLampada();
    }

    public void reverter() {
        this.lampada.desligarLampada();
    }
}
