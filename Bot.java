import java.awt.*;
import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        // Crea el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, ¿Cómo te llamas?");
        String name = scanner.nextLine();

        // Recoge el dato
        System.out.println("Hola " + name + ", soy FemBot, ¿De qué ciudad eres?");
        String location = scanner.nextLine();

        // Recoge el dato
        System.out.println("He escuchado que " + location + " es un encanto. Yo nací en Oracle city.");

        System.out.println("\n¿Cuántos años tienes?");
        byte edad = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Entonces me dices que tienes " + edad + " años. Yo tengo 400 años.");
        double ratio = 400.0 / edad;
        System.out.println("Eso quiere decir que soy " + ratio + " veces más vieja que tú.");

        System.out.println("Basta de hablar de mí misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");
        String language = scanner.nextLine();

        System.out.println(language + ", ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");
        scanner.close();
    }
}
        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

