
public class Skate extends Veiculo {
    private String marca;
    private String tipoRodas;

    // Construtor da classe Skate
    public Skate(String modelo, int anoFabricacao, String marca, String tipoRodas) {
        super(modelo, anoFabricacao);
        this.marca = marca;
        this.tipoRodas = tipoRodas;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(String tipoRodas) {
        this.tipoRodas = tipoRodas;
    }

    // Sobrescrita do método gerarComandoInsert
    @Override
    public String gerarComandoInsert() {
        return "INSERT INTO Skate (modelo, anoFabricacao, marca, tipoRodas) VALUES ('"
                + getModelo() + "', " + getAnoFabricacao() + ", '" + marca + "', '" + tipoRodas + "');";
    }
}
