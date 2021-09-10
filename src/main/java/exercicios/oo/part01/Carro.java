package exercicios.oo.part01;

import javax.swing.*;

public class Carro {
    public static void main(String[] args) {
        Pessoa Pessoas = new Pessoa();

        System.out.println(Pessoas.pessoasDentroDoCarro());

        String escolha = JOptionPane.showInputDialog("1 - adicionar" +
                " 2 - remover");

        int convecaoEscolha = Integer.parseInt(escolha);

        if (convecaoEscolha == 1) {
            Pessoas.QtdPessoas = Pessoas.QtdPessoas + 1;
            System.out.println(Pessoas.pessoasDentroDoCarro());
        } else {
            Pessoas.QtdPessoas = Pessoas.QtdPessoas - 1;
            System.out.println(Pessoas.pessoasDentroDoCarro());
        }
    }
}
