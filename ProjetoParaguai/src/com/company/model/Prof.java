package com.company.model;

public class Prof {
    private int cod;
    private String nome;
    private String email;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Prof{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


