package exercicios.oo.part02;

public class InstanciaObjeto {

    public static void main(String[] args) {
        Carro carro = new Carro("gol", "vw", 2000);

        carro.setVariante("Brasileira");

        System.out.println("Modelo: " + carro.getModelo() +
                "\nMarca: " + carro.getMarca() +
                "\nAno: " + carro.getAno() +
                "\nVariante: " + carro.getVariante());
    }
}
