 public class Rpg{
     public static void main(String[] args) {
       Personagem Jose = new Personagem("Jose", "gnomo");
       Personagem Gabriel = new Personagem("Gabriel", "mago");


        Jose.atacar();
        Gabriel.atacar();

        Jose.receberDano(15);
        Gabriel.receberDano(20);

        Jose.usarHabilidadeEspecial();
        Gabriel.usarHabilidadeEspecial();

        Jose.subirNivel();
        Gabriel.subirNivel();

    
        Jose.mostrarStatus();
        Gabriel.mostrarStatus();

        Jose.desenharPersonagem();



        Gabriel.desenharPersonagem();


       
   
 }
 
    }