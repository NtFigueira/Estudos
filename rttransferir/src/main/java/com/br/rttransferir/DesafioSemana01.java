package com.br.rttransferir;

import java.util.Scanner;

public class DesafioSemana01 {
    public static void main(String[] args) {
        Scanner respostaNome = new Scanner(System.in);
        System.out.print("Digite o seu nome:");
        String nome = respostaNome.nextLine();

        Scanner diaNascimento = new Scanner(System.in);
        System.out.print("Digite o dia do seu nascimento:");
       int  dataDia = diaNascimento.nextInt();

        Scanner mesNascimento = new Scanner(System.in);
        System.out.print("Digite o mês do seu Nascimento:");
        int dataMes = mesNascimento.nextInt();

        Scanner anoNascimento = new Scanner(System.in);
        System.out.print("Digite o ano do seu Nascimento:");
        int dataANo = anoNascimento.nextInt();

        System.out.println("Bem Vindo, " + nome);

        String aries = "Áries: Tão impulsivo, quanto sensivel. Desculpas pela sinceridade, fica calmo.";
        String touro= " Touro: Se a vida fosse um filme seria 'Beber, comer e dormir'. Gosta de uma vida boa, estilo touro Ferdinando";
        String gemeos = " Gemêos: Decidiu? Hoje vai ser 8 ou 80? Se falar pelos cotovelos fosse uma verdade seria a Sheeva do Mk";
        String cancer = " Câncer: Lindinho, não se preocupa. Não, não precisa chorar. Ah, já chorou ";
        String leao = "Leão: A miss dos signos, exibidos que só";
        String virgem = "Virgem: A certinha, tudo tem que estar perfeitamente no seu lugar, por isso acho que é virgem, até hoje esperando o príncipe. ";
        String libra = "Libra: Acham que tudo tem que estar equilibrado, se contar uma coisa, com certeza ele vai dizer que já passou por isso e dividir o peso";
        String escorpiao = "Escorpião: Esses adoram viver ao estilo simba: Rindo na cara do perigo.";
        String sagitario = " Sagitariao: Alguém disse compras?! O Signo da herdeira";
        String capricornio = "Capricornio: Aqui é onde está o ouro, trabalhadores excelentes, dinheiro e sucesso é o sobrenome dele";
        String aquario = "Aquário: o mundinho deles é o que importa, tá tudo bem está tudo bom.";
        String peixes = "Peixes: Literalmente vivem no mundo da lua. Ei, cuidado para não tropeçar.";

        System.out.println(dataDia +"/"+ dataMes + "/" + dataANo);

        String signo = "";
        if ((dataDia > 0 && dataDia < 31) && (dataMes > 0 && dataMes < 12 )) {
            System.out.println("O seu Signo é: ");
             if (dataDia >= 21 && dataMes == 3 || dataDia <= 20 && dataMes == 4) {
                signo = aries;
            } else if (dataDia >= 21 && dataMes == 4 || dataDia <= 20 && dataMes == 5) {
                signo = touro;
            } else if (dataDia >= 21 && dataMes == 5 || dataDia <= 20 && dataMes == 6) {
                signo = gemeos;
            } else if (dataDia >= 21 && dataMes == 6 || dataDia <= 20 && dataMes == 7) {
                signo = cancer;
            } else if (dataDia >= 21 && dataMes == 7 || dataDia <= 20 && dataMes == 8) {
                signo = leao;
            } else if (dataDia >= 21 && dataMes == 8 || dataDia <= 20 && dataMes == 9) {
                signo = virgem;
            } else if (dataDia >= 21 && dataMes == 9 || dataDia <= 20 && dataMes == 10) {
                signo = libra;
            } else if (dataDia >= 21 && dataMes == 10 || dataDia <= 20 && dataMes == 11) {
                signo = escorpiao;
            } else if (dataDia >= 21 && dataMes == 11 || dataDia <= 20 && dataMes == 12) {
                signo = sagitario;
            } else if (dataDia >= 21 && dataMes == 12 || dataDia <= 20 && dataMes == 1) {
                signo = capricornio;
            } else if (dataDia >= 21 && dataMes == 1 || dataDia <= 20 && dataMes == 2) {
                signo = aquario;
            } else if (dataDia >= 21 && dataMes == 2 || dataDia <= 20 && dataMes == 3) {
                signo = peixes;
            } else {
                System.out.println("A data está errada. Exemplo : dia= 1 ; mes= 5 e ano= 1991");
                ;
            }
        }
          System.out.println(signo);

        respostaNome.close();
        diaNascimento.close();
        mesNascimento.close();
        anoNascimento.close();

    }

}

