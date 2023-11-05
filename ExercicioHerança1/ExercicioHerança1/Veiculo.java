package ExercicioHerança1;

public class Veiculo {
    private String marca;
    private String modelo;

    public String setMarca(String marca) {
        return this.marca = marca;
    }
    public String setModelo(String modelo) {
        return this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void acelerar() {}
}
