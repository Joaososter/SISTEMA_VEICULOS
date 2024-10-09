
public class Caminhao extends Veiculo {
    private int qtdEixos;
    private int pesoBruto;

    // Construtor da classe Caminhao
    public Caminhao(String modelo, int anoFabricacao, int qtdEixos, int pesoBruto) {
        super(modelo, anoFabricacao);
        this.qtdEixos = qtdEixos;
        this.pesoBruto = pesoBruto;
    }

    // Getters e setters
    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public int getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(int pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    // Sobrescrita do método gerarComandoInsert
    @Override
    public String gerarComandoInsert() {
        return "INSERT INTO Caminhao (modelo, anoFabricacao, qtdEixos, pesoBruto) VALUES ('"
                + getModelo() + "', " + getAnoFabricacao() + ", " + qtdEixos + ", " + pesoBruto + ");";
    }
}

