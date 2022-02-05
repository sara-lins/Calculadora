package br.com.dio.sara;

import java.util.Objects;

public class Moto {
    private String nome;
    private String cor;
    private int ano;
    private int modelo;

    public Moto() {
    }

    public Moto(String nome, String cor, int ano, int modelo) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moto moto = (Moto) o;
        return ano == moto.ano && modelo == moto.modelo && Objects.equals(nome, moto.nome) && Objects.equals(cor, moto.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, ano, modelo);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", modelo=" + modelo +
                '}';
    }
}
