public class Personagem {
    
    public String nome;
    public String classe;
    public int nivel = 1;
    public int vida = 100;
    public int mana;
    public int forca;
    public int dano;


    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        inicializarPersonagem();
    }

    public void inicializarPersonagem() {
        switch(classe.toLowerCase()) {
            case "mago":
                forca = 10;
                mana = 100;
                break;
            case "gnomo":
                forca = 30;
                break;   
        }
    }

    public void atacar() {
        switch(classe.toLowerCase()) {
            case "mago":
                System.out.println(nome + " ataca com sua vara mágica.");
                break;
            case "gnomo":
                System.out.println(nome + " ataca com sua espada.");
                break;
          
        }
    }


    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida atual: " + vida);
    }


    public void usarHabilidadeEspecial() {
        switch(classe.toLowerCase()) {
            case "mago":
              if (mana >= 20) {
                 mana -= 20;
                 System.out.println(nome + " lançou um feitiço poderoso! Mana restante: " + mana);
                } else {
                  System.out.println(nome + " não tem mana suficiente para usar a habilidade especial.");
                }
                break;
            case "gnomo":
                System.out.println(nome + " usou Golpe Poderoso! Força aumentada temporariamente.");
                forca += 5;
                break;
        
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome + " | Classe: " + classe + " | Nivel: " + nivel + " | Vida: " + vida + " | Força: " + forca + (classe.equals("mago") ? " | Mana: " + mana : ""));
    }
    public void subirNivel() {
        nivel++;
        vida += 10;
        mana += 10; 
        forca += 1; 
        System.out.println(nome + " subiu de nivel! Agora está no nível " + nivel + ".");
    }
    public void desenharPersonagem() {
  switch (classe.toLowerCase()) {
        case "mago":
          
            System.out.println(" {^ ^}  ");
            System.out.println("   | }  ");
            System.out.println("   | ");
            System.out.println("  / /");
            break;
        case "gnomo":
            System.out.println(" {^ ^ }  ");
            System.out.println("   | "); 
            System.out.println(" / | / ");
            System.out.println(" /    / ");
            break;
       
}
    }
}
  

    