package com.company;

public class CadastrarFilmes {
    private String nomeDoFilme;
    private int classificação;
    private String gênero;
    private int duração;
    private int diaDeEstreia;
    private int diaDaUltimaExibição;


    @Override
    public String toString() {
        return "CadastrarFilmes{" +
                "nomeDoFilme='" + nomeDoFilme + '\'' +
                ", classificação=" + classificação +
                ", gênero='" + gênero + '\'' +
                ", duração=" + duração +
                ", diaDeEstreia=" + diaDeEstreia +
                ", diaDaUltimaExibição=" + diaDaUltimaExibição +
                '}';
    }

    public CadastrarFilmes(String nomeDoFilme, int classificação, String gênero, int duração, int diaDeEstreia, int diaDaUltimaExibição) {
        this.nomeDoFilme = nomeDoFilme;
        this.classificação = classificação;
        this.gênero = gênero;
        this.duração = duração;
        this.diaDeEstreia = diaDeEstreia;
        this.diaDaUltimaExibição = diaDaUltimaExibição;




        }

    }

