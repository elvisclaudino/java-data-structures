package Vetor.teste;

import java.util.Objects;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNome().equals(contato.getNome()) && getTelefone().equals(contato.getTelefone()) && getEmail().equals(contato.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getTelefone(), getEmail());
    }

    public Contato(String nome, String telefone, String email) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
