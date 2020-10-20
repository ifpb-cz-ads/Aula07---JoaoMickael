public class Questao02pg109{
    public static void main(String args[]) {
      String frase3;
      String frase4;
      
      frase3 = new String("Testando igualdade!");
      frase4 = frase3;
      
      System.out.println("Frase 3: "+frase3);
      System.out.println("Frase 4: "+frase4);
      System.out.println("Frase 3 e Frase 4 possuem a mesma referência? R: "+(frase3==frase4));
    }
}