public class Lampada{
  String tipo;
  String marca;
  double preco;
  
  public static void main(String[] args) {
    Lampada comprarLampada = new Lampada();
    comprarLampada.tipo = "FLuorescente";
    comprarLampada.marca = "Tachibara";
    comprarLampada.preco = 8.30;

    System.out.println(comprarLampada.tipo);
    System.out.println(comprarLampada.marca);
    System.out.println(comprarLampada.preco);
  }
}