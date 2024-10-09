// Bicicleta.java
public class Bicicleta extends Veiculo {
    private String marca;
    private String material;
    private int qtdMarchas;
    private boolean amortecedor;

    // Construtor da classe Bicicleta
    public Bicicleta(String modelo, int anoFabricacao, String marca, String material, int qtdMarchas, boolean amortecedor) {
        super(modelo, anoFabricacao);
        this.marca = marca;
        this.material = material;
        this.qtdMarchas = qtdMarchas;
        this.amortecedor = amortecedor;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public boolean isAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(boolean amortecedor) {
        this.amortecedor = amortecedor;
    }

    // Sobrescrita do método gerarComandoInsert
    @Override
    public String gerarComandoInsert() {
        return "INSERT INTO Bicicleta (modelo, anoFabricacao, marca, material, qtdMarchas, amortecedor) VALUES ('"
                + getModelo() + "', " + getAnoFabricacao() + ", '" + marca + "', '" + material + "', " + qtdMarchas + ", " + amortecedor + ");";
    }
}
