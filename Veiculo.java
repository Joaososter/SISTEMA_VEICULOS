public abstract class Veiculo {      //classe base veiculo
    private String modelo;
    private int anoFabricacao;
    
    public Veiculo(String modelo, int anoFabricacao) {  // construtor da classe veiculo
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public int getAnoFabricacao() {
    return anoFabricacao;
}

public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
}

// Método abstrato que deverá ser sobrescrito nas subclasses
public abstract String gerarComandoInsert();

}

