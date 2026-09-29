package clinica_veterinaria.src.model;

import java.time.LocalDateTime;

import clinica_veterinaria.utils.StatusAtendimento;

public class Atendimento {
    private String codigo;
    private String nomeAnimal;
    private String nomeTutor;
    private LocalDateTime dataCompleta;
    private StatusAtendimento status;
    private String observacoes;
    private Procedimento procedimento;

    public Atendimento(String codigo, String nomeAnimal, String nomeTutor, LocalDateTime dataCompleta,
            StatusAtendimento status, String observacoes, Procedimento procedimento) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.nomeTutor = nomeTutor;
        this.dataCompleta = dataCompleta;
        this.status = status;
        this.observacoes = observacoes;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public LocalDateTime getDataCompleta() {
        return dataCompleta;
    }

    public StatusAtendimento getStatus() {
        return status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setNomeTutor(String nomeTutor) {
        this.nomeTutor = nomeTutor;
    }

    public void setDataCompleta(LocalDateTime dataCompleta) {
        this.dataCompleta = dataCompleta;
    }

    public void setStatus(StatusAtendimento status) {
        this.status = status;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
}

