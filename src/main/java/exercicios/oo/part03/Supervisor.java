package exercicios.oo.part03;

public class Supervisor extends Funcionario {

    public double calculaImposto() {
        return this.getSalario() * 0.05;
    }
}
