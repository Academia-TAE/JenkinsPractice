public class Main {
    public static void main(String[] args) {
        String nombreVariable = System.getenv("NOMBRE_VARIABLE");

        if (nombreVariable != null) {
            System.out.println("El valor de la variable de entorno es: " + nombreVariable);
            
            // Crear un objeto y asignarle un valor
            MiObjeto objeto = new MiObjeto();
            objeto.setValor(42);
            System.out.println("El valor del objeto es: " + objeto.getValor());
        } else {
            System.out.println("La variable de entorno no está definida.");
        }
    }
}

class MiObjeto {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
