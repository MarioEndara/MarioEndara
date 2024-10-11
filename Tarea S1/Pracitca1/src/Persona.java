import java.util.Scanner;
public class Persona {
    String nombre, genero;
    int edad;

    public Persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Mi nombre es "+nombre+ " soy de genero "+genero+ " y mi edad es de "+edad);
    }

    public static void main(String[] args) {
    Persona estudiante=new Persona("Marcelo","Masculino", 21);
    Persona autoridad=new Persona("Miribelle","Femenino", 35);
    estudiante.presentarse();
    autoridad.presentarse();
    }
}
