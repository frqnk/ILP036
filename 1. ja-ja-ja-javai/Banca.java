public class Banca {
    private String data;
    private String parecer;

    public Banca(String data, String parecer) {
        this.data = data;
        this.parecer = parecer;
    }

    public void ExibeInformações() {
        System.out.println("data "+data);
        System.out.println("parecer "+parecer);
    }
}