import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nombre ");
        String name = scanner.nextLine();
        System.out.println(" Apellido ");
        String surname = scanner.nextLine();
        System.out.println(" Nombre de usuario ");
        String user = scanner.nextLine();
        System.out.println(" Contraseña ");
        String password = scanner.nextLine();
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola + nombre + <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("\nHola " + name + " " + surname + ", tu nombre de usuario es " + user +  " y tu contraseña es " + password + ", gracias por registrarte.");

        }
    }