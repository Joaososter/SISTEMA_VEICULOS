
public class Motocicleta extends Veiculo {
    private int cilindradas;
    private int torque;

    // Construtor da classe Motocicleta
    public Motocicleta(String modelo, int anoFabricacao, int cilindradas, int torque) {
        super(modelo, anoFabricacao);
        this.cilindradas = cilindradas;
        this.torque = torque;
    }

    // Getters e setters
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    // Sobrescrita do método gerarComandoInsert
    @Override
    public String gerarComandoInsert() {
        return "INSERT INTO Motocicleta (modelo, anoFabricacao, cilindradas, torque) VALUES ('"
                + getModelo() + "', " + getAnoFabricacao() + ", " + cilindradas + ", " + torque + ");";
    }
}
