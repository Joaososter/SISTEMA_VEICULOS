
public class Automovel extends Veiculo {
    private int qtdMaxPassageiros;
    private String tipoFreio;
    private boolean airbag;

    // Construtor da classe Automovel
    public Automovel(String modelo, int anoFabricacao, int qtdMaxPassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao);  // Chama o construtor da superclasse
        this.qtdMaxPassageiros = qtdMaxPassageiros;
        this.tipoFreio = tipoFreio;
        this.airbag = airbag;
    }

    // Getters e setters
    public int getQtdMaxPassageiros() {
        return qtdMaxPassageiros;
    }

    public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
        this.qtdMaxPassageiros = qtdMaxPassageiros;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    // Sobrescrita do método gerarComandoInsert
    @Override
    public String gerarComandoInsert() {
        return "INSERT INTO Automovel (modelo, anoFabricacao, qtdMaxPassageiros, tipoFreio, airbag) VALUES ('"
                + getModelo() + "', " + getAnoFabricacao() + ", " + qtdMaxPassageiros + ", '" + tipoFreio + "', " + airbag + ");";
    }
}
