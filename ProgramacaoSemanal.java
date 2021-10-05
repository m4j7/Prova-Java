package com.company;
import java.util.ArrayList;
import java.util.List;

public class ProgramacaoSemanal {

    private List<CadastrarFilmes> filmes = new ArrayList<CadastrarFilmes>();
    private int horarioDeExibiçao;
    private int mes;
    private int IdDaSemana;


    public ProgramacaoSemanal(int horarioDeExibiçao, int mes, int idDaSemana) {
        this.horarioDeExibiçao = horarioDeExibiçao;
        this.mes = mes;
        IdDaSemana = idDaSemana;
    }

    public List<CadastrarFilmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<CadastrarFilmes> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "ProgramacaoSemanal{" +
                "filmes=" + filmes +
                ", horarioDeExibiçao=" + horarioDeExibiçao +
                ", mes=" + mes +
                ", IdDaSemana=" + IdDaSemana +
                '}';
    }
}





