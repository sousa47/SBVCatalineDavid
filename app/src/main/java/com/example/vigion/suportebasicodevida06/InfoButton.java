package com.example.vigion.suportebasicodevida06;

/**
 * Created by Catalin on 22/02/2015.
 */
public class InfoButton {
    private String nome;
    private int iconID;

    public InfoButton(String nome, int iconID) {
        this.nome = nome;
        this.iconID = iconID;
    }

    public int getIconID() {
        return iconID;
    }

    public String getNome() {
        return nome;
    }
}
