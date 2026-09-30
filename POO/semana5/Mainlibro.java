package POO.semana5;

public class Mainlibro {
    public static void main(String[] args) {
        // creacion de los 5 libros
        libro objlibro1 = new libro("El principito", "Antoine de Saint-Exupéry", 1943, "978-0156027381", true);
        libro objlibro2 = new libro("1984", "George Orwell", 1948, "978-0451524935", true);
        libro objlibro3 = new libro("To Kill a Mockingbird", "Harper Lee", 1960, "978-0061120084", true);
        libro objlibro4 = new libro("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-0743273565", true);
        libro objlibro5 = new libro("Pride and Prejudice", "Jane Austen", 1813, "978-0141439518", true);

        // Mostrar la información de cada libro
        System.out.println(objlibro1);
        System.out.println(objlibro2);
        System.out.println(objlibro3);
        System.out.println(objlibro4);
        System.out.println(objlibro5);

        // Mostrar solo el titulo del libro 2
        System.out.println(objlibro2.getTitulo());

        //Cambiar el isbn del libro 5
        objlibro5.setDisponible(false);
        System.out.println(objlibro5);

        //Verificar si el libro3 esta disponible
        System.out.println(objlibro3.estaDisponible()); // true

        //prestar el libro 3
        objlibro3.prestar();
        System.out.println("¿El Libro 3 está disponible después de prestarlo? " + objlibro3.estaDisponible()); //false

        //Devolver el libro 3
        objlibro3.devolver();
        System.out.println("¿El Libro 3 está disponible después de devolverlo? " + objlibro3.estaDisponible()); //true
    }


}
