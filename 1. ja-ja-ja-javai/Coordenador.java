public class Coordenador {
    private String ramal;
    private String cargaHoraria;

    public Coordenador(String ramal, String cargaHoraria) {
        this.ramal = ramal;
        this.cargaHoraria = cargaHoraria;
    }

    public void ExibeInformações() {
        System.out.println("ramal "+ramal);
        System.out.println("cargaHoraria "+cargaHoraria);
    }
}