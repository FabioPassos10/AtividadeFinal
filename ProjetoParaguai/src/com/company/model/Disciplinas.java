package com.company.model;

public class Disciplinas {
    private String NomeMateria;
    private String Professor;
    private int NumSala;

    public static void get() {
    }

    public String getNomeMateria() {
        return NomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        NomeMateria = nomeMateria;
    }

    public String getProfessor() {
        return Professor;
    }

    public void setProfessor(String professor) {
        Professor = professor;
    }

    public int getNumSala() {
        return NumSala;
    }

    public void setNumSala(int numSala) {
        NumSala = numSala;
    }

    @Override
    public String toString() {
        return "Disciplinas{" +
                "NomeMateria='" + NomeMateria + '\'' +
                ", Professor='" + Professor + '\'' +
                ", NumSala=" + NumSala +
                '}';
    }
}
