package org.araujo;

public class Lampada {

    private int id;
    private String status;

    public Lampada(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void ligarLampada() {
        this.status = "Lâmpada ligada";
    }

    public void desligarLampada() {
        this.status = "Lâmpada desligada";
    }
}
