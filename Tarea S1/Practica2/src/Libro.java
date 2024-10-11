import java.util.Scanner;
public class Libro {
    String titulo, autor;
    int paginaCount;

    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    public void infoLibro() {
        System.out.println("El titulo del libro es "+titulo+ ", su autor es "+autor+ " y tiene "+paginaCount+ " paginas");
    }

    public static void main(String[] args) {
        Libro drama =new Libro("Cien años de soledad","Gabriel Garcia Marquez", 496);
        Libro aventura=new Libro("El señor de los anillos","George Orwell", 382);
        Libro suspenso =new Libro("Crime y Castigo","Fiodor Dostoyevski", 324);
        drama.infoLibro();
        aventura.infoLibro();
        suspenso.infoLibro();
    }
}