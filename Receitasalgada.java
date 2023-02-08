public class Receitasalgada extends Receitas {

    public Receitasalgada(String nomedareceita,
    String tipodareceita,
    String duracaodareceita,
    String nacionalidadedareceita
    ) {
        super(nomedareceita,
        tipodareceita,
        duracaodareceita,
         nacionalidadedareceita
         );
    }
   
    public static void main(String[] args) {
    
        Receitasalgada Receitasalgada = new  Receitasalgada ("Empanado de Carne Moída", "aperitivo", "1 hora", "Argentina");
      Receitasalgada.nomedareceita();
}
}