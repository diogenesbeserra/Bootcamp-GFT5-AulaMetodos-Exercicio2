public class Quadrilatero {
    public static void Area(float lado){    
        System.out.println("Área do quadradro: " + (lado*lado));
    }
    public static void Area(float largura, float altura ){    
        System.out.println("Área do retângulo: " + (largura * altura));
    }
    public static void Area(float ladoMaior, float ladoMenor, float altura){    
        System.out.println("Área do trapézio: " + ((ladoMaior+ladoMenor)*altura)/2);
    }    
}
