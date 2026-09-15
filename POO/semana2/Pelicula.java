public class MainPelicula {
    public static void main(String[] args) {

        //Creación del objeto de la clase Pelicula
        Pelicula objPelicula1 = new Pelicula();
        Pelicula objPelicula2 = new Pelicula();

        objPelicula1.setTitulo("Inception");
        objPelicula1.setGenero("Ciencia ficcion");
        objPelicula1.setDuracion(148);
        objPelicula1.setFechaEstreno("2010-07-16");

        objPelicula2.setTitulo("Coco");
        objPelicula2.setGenero("Animacion");
        objPelicula2.setDuracion(105);
        objPelicula2.setFechaEstreno("2017-10-27");

        //Mostrar la información del objeto 1 (objPelicula1)
        System.out.println(objPelicula1.getTitulo());
        System.out.println(objPelicula1.getGenero());
        System.out.println(objPelicula1.getDuracion());
        System.out.println(objPelicula1.getFechaEstreno());

        //Mostrar la información del objeto 2 (objPelicula2)
        System.out.println(objPelicula2.getTitulo());
        System.out.println(objPelicula2.getGenero());
        System.out.println(objPelicula2.getDuracion());
        System.out.println(objPelicula2.getFechaEstreno());
    }
}