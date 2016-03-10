public class DadoNombres {
    static int num;
    static String[] Nombres ={"Pepe","Tífani","Andrea","Julian","Norma","Adrián"};
    public static void main(String[] args) {
        dameUnNombre();
    }
    /**
     * Método que da un nombre y no se que mas xDDDD Eso es un arrayyyyy o.o
     */
    public static void dameUnNombre(){
        
        System.out.println("El numero es: ");
        num= (int) (Math.random()*6);
        System.out.print(num);
        System.out.print(Nombres[num]);
    }
}
