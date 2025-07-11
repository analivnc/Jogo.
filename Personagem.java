public class Personagem{
    public String nome;
    public String classe;
    public int nivel = 0;
    public int vida = 100;
    public int mana;
    public int forca;
    public int dano;

    public class Personagem(){
      switch(Personagem) {
        case "mago"
        forca = 10
        mana = 100
        break;
        case "guerreiro"
        forca = 30
        mana = 50
        break;
        case "arqueiro"
        forca = 60
        mana = 70
        break;
      }
    }
    //Exibe uma mensagem personalizada do ataque conforme a classe.
    public void atacar(){
        switch(atacar){
            case "mago"
            System.out.println("mago ataca com sua espada");
             case "guerreiro"
             break;
            System.out.println("guerreiro ataca com sua espada");
             case "arqueiro"
             break;
            System.out.println("arqueiro ataca com sua espada");
            break;
 }
    }

    public void receberDano(int dano){
       vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
        }

    public void usarHabilidadeEspecial(){
        switch(classe){
            case "mago"
            System.out.println(+nome"Ataca com espada");
            break;
            case"guerreiro"
            System.out.println(+nome "Ataca com golpe poderoso");
            break;
            case"arqueiro"
             System.out.println(+nome "Ataca com arco");

        }


    }

    public void mostrarStatus(){
        

    }

    public void subirNivel(){

    }