package exercicios.oo.part03;

public class Gerente extends Funcionario {

    public double calculaImposto() {
        return this.getSalario() * 0.1;
    }
}
