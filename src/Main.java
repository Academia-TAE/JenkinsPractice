public class Main {
    public static void main(String[] args) {
        String nombreVariable = System.getenv("NOMBRE_VARIABLE");

        if (nombreVariable != null) {
            System.out.println("El valor de la variable de entorno es: " + nombreVariable);
        } else {
            System.out.println("La variable de entorno no está definida.");
        }
    }
}
