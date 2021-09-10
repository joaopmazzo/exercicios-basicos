package exercicios.oo.part01;

public class Pessoa {
    public int QtdPessoas = 3;

    public int getQtdPessoas() {
        return QtdPessoas;
    }

    public String pessoasDentroDoCarro() {
        return "Tem " + getQtdPessoas() + " pessoas dentro do carro!";
    }
}
