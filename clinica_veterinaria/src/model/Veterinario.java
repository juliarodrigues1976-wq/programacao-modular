package clinica_veterinaria.src.model;

public class Veterinario {
    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;

    private Veterinario(String nome, String cpf, String especialidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
