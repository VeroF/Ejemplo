public class DadoNombres {
    static int num;
    static String[] Nombres ={"Pepe","Tífani","Andrea","Julian","Norma","Adrián"};
    public static void main(String[] args) {
        dameUnNombre();
    }
    /**
     * Método que da un nombre y no se que mas xDDDD Eso es un arrayyyyy o.o
     * @version no se cual ya
     */
    public static void dameUnNombre(){  
        
        System.out.println("El numero es: ");
        num= (int) (Math.random()*6);
        System.out.print(num);
        System.out.print(Nombres[num]);
    }
    
    
    public static boolean esPrimo(int num){
        
        int cont = 1;
        boolean ok;
        if (num == 0 || num == 1)
            ok = false;
        else if (num == 2)
            ok = true;
        else {
            do {
                cont++;
                ok = num % cont != 0;
            } while (ok && cont < num / 2);
        }
        return ok;
    }
}
