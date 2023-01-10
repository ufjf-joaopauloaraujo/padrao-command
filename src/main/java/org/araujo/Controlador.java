package org.araujo;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public void executarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (tarefas.size() != 0) {
            Tarefa tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.reverter();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }

}
