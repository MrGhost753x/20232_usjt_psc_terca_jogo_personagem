import java.util.Random;
public class JogoV3 {
    public static void main(String[] args) throws Exception {
        var cacador = new Personagem("Jonhsson");
        var gerador = new Random();
        for ( ; ;){ 
            //sortear um número entre 1, 2 e 3
            int oQueFazer = gerador.nextInt(3) + 1;
            //se for 1, o personagem caça
            //se for 2, o personagem dorme
            //se for 3, o personagem come
            switch(oQueFazer){
                case 1:
                cacador.cacar();
                break;
                case 2:
                cacador.dormir();
                break;
                case 3:
                cacador.comer();
                break;
            }
            cacador.exibirEstado();
            System.out.println("*****************************");
            Thread.sleep(8000);
        }
    }    
}
