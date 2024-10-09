// Main.java
public class Main {
    public static void main(String[] args) {
        // Criando objetos para teste
        Automovel automovel = new Automovel("Fusca", 1975, 4, "Hidráulico", true);
        Motocicleta moto = new Motocicleta("Harley", 2020, 1200, 110);
        Caminhao caminhao = new Caminhao("Volvo FH", 2018, 6, 30000);
        Bicicleta bike = new Bicicleta("Caloi", 2021, "Caloi", "Alumínio", 21, true);
        Skate skate = new Skate("Tony Hawk", 2019, "Tony Hawk", "Poliuretano");

        // Testando os métodos
        System.out.println(automovel.gerarComandoInsert());
        System.out.println(moto.gerarComandoInsert());
        System.out.println(caminhao.gerarComandoInsert());
        System.out.println(bike.gerarComandoInsert());
        System.out.println(skate.gerarComandoInsert());



        // feito para retornar "INSERT INTO Motocicleta (modelo, anoFabricacao, cilindradas, torque)"  formato padrão de um comando INSERT INTO em SQL, caso seja necessario jogar para um banco de dados 
    }
}
