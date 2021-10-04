
public class Paciente {

	private String rg;
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private Endereco endereco;

    public Paciente(String nomeCompleto, String cpf, String telefone, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return String.format("Nome do paciente: %s\nTelefone: %s\tEndereço: %s", this.nomeCompleto, this.telefone,
                this.endereco.toString());
    }

}

