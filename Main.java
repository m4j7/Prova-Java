package com.company;

public class Main {

    public static void main(String[] args) {

        CadastrarFilmes cf1 = new CadastrarFilmes("O senhor do amanha", 12, "Suspense",90, 2, 22);
        CadastrarFilmes cf2 = new CadastrarFilmes("O Preço do amanha", 14, "Ação",85, 1, 30);
        CadastrarFilmes cf3 = new CadastrarFilmes("Procurando Dori", 4, "Comedia",120, 5, 31);
        CadastrarFilmes cf4 = new CadastrarFilmes("As cronicas de narnia", 10, "Comedia",130, 6, 27);

        ProgramacaoSemanal Ps= new ProgramacaoSemanal(3,03,4);

        Ps.getFilmes().add(cf1);
        Ps.getFilmes().add(cf2);
        Ps.getFilmes().add(cf3);
        Ps.getFilmes().add(cf4);

        System.out.println();
        System.out.println(Ps);

        }
    }

