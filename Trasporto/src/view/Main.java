package view;

import model.Cliente;
import model.Viagem;
import model.Caminhoneiro;
import model.Carreta;

public class Main {
    public static void main(String[] args) {
        Carreta carreta1 = new Carreta("Carreta ct-7000");
        Caminhoneiro caminhoneiro1 = new Caminhoneiro("João Alves", "12345678901234", "12345678900");
        Viagem viagem1 = new Viagem("São Paulo", 4.5, 350);
        Cliente cliente1 = new Cliente("Pedro", caminhoneiro1, viagem1, carreta1);
        
        viagem1.calcularViagem();
        cliente1.visualizarViagem();
    }
}