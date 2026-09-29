package clinica_veterinaria.src.model;

import java.util.ArrayList;

public class Sala {
    private String numero;
    private String bloco;
    private int capacidadeMax;
    private String tipo;
    private Veterinario veterinario;
    private ArrayList<Atendimento> atendimentos;

    private Sala(String numero, String bloco, int capacidadeMax, String tipo, Veterinario veterinario, ArrayList<Atendimento> atendimentos) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMax = capacidadeMax;
        this.tipo = tipo;
        this.veterinario = veterinario;
        this.atendimentos = atendimentos;
    }

    public String getNumero() {
        return numero;
    }

    public String getBloco() {
        return bloco;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setAtendimentos(ArrayList<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
}
