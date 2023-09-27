public class JogoV1 {
  public static void main(String[] args) {
    var p = new Personagem();
    p.nome = "John";
    p.cacar();
    p.comer();
    p.dormir();
    int a = 2;
    // a++;
    // ++a;
    System.out.println(a++);
    System.out.println(++a);
  }
}
