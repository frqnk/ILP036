package ExercicioHerança1;

public class Carro extends Veiculo {
    private String placa;

    public String setPlaca(String placa) {
        return this.placa = placa;
    }
    public String getPlaca() {
        return placa;
    }

    public void ligar() {}
    public void desligar() {}
    public void acelerar() {}
}
