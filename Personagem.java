public class Personagem{
  //variáveis de instância
  //instância é sinônimo de objeto
  String nome;
  private int energia = 10;
  private int fome = 0;
  private int sono = 0;
  private int item = 0;
  
  //construtor padrão
  Personagem(){
    System.out.println("Construindo um personagem");
  }
  Personagem(int energia, int fome, int sono){
    if (energia >= 0 && energia <= 10)
     this.energia = energia;
    this.fome = fome > 10 || fome < 0 ? this.fome : fome;
    if (sono >= 0 && sono <= 10)
      this.sono = sono;
  }

  Personagem(String nome){
    this.nome = nome;
  }
  //tipo de retorno
  //nome
  //lista de parâmetros
  //corpo
  void cacar(){
    if (energia >= 2){
      energia = energia - 2; // energia -= 2;
      item = item + 1;
      System.out.println(nome + " caçando");
    }
    else{
      System.out.println(nome + " sem energia para caçar");
    }
    fome = Math.min(fome + 1, 10);
    sono = sono + 1 > 10 ? 10 : sono + 1;
  }
  void comer(){
    if (fome >= 1 && item >=1){
      System.out.printf("%s comendo\n", nome);
      --fome;
      energia = Math.min(energia + 1, 10);
    }
    else{
      System.out.println(nome + " sem fome");
    }
  }

  void dormir(){
    if (sono >= 1){
      System.out.print(nome + " dormindo\n");
      sono--;
      energia = energia + 1 <= 10 ? energia + 1 : 10;
    }
    else{
      System.out.println(nome + " sem sono");
    }
  }

  void exibirEstado(){
    System.out.printf(
      "%s: e: %d, f: %d, s: %d\n",
      nome,
      energia,
      fome,
      sono,
      item
    );
  }
}




