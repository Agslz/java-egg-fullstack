package Libreria.Constantes;

public class Constantes {

    //-------------------------------------------------------------MENUS-------------------------------------------------------------
    public static final String OPCIONES_MENU_PRINCIPAL = "\nOpciones Disponibles"
            + "\n1. Ir al Menu de Autor"
            + "\n2. Ir al Menu de Libro"
            + "\n3. Ir al Menu de Editorial"
            + "\n4. Salir ";

    public static final String OPCIONES_MENU_AUTOR = "\nOpciones Disponibles"
            + "\n1.Crear un nuevo autor"
            + "\n2.Mostrar todos los autores"
            + "\n3.Buscar un autor usando su ID"
            + "\n4.Buscar un autor usando su nombre"
            + "\n5.Modificar un autor usando su ID"
            + "\n6.Dar de alta a un autor"
            + "\n7.Dar de baja a un autor"
            + "\n8.Volver al menu principal";

    public static final String OPCIONES_MENU_LIBRO = "\nOpciones Disponibles"
            + "\n1.Crear un nuevo libro"
            + "\n2.Mostrar todos los libros"
            + "\n3.Buscar un libro usando su ISBN"
            + "\n4.Buscar un libro usando su nombre"
            + "\n5.Mostrar todos los libros publicados por un autor"
            + "\n6.Mostrar todos los libros publicados por una editorial"
            + "\n7.Prestar un libro"
            + "\n8.Regresar un libro"
            + "\n9.Volver al menu principal";

    public static final String OPCIONES_MENU_EDITORIAL = "\nOpciones Disponibles"
            + "\n1.Crear una editorial"
            + "\n2.Mostrar todas las editoriales"
            + "\n3.Buscar una editorial usando su ID"
            + "\n4.Buscar una editorial usando su nombre"
            + "\n5.Modificar una editorial usando su ID"
            + "\n6.Dar de alta una editorial"
            + "\n7.Dar de baja una editorial"
            + "\n8.Volver al menu principal";

    //-------------------------------------------------------------MENUS-------------------------------------------------------------
    public static final String INGRESE_OPCION = "Ingrese una opción";
    public static final String SALIDA = "Usted salió del sistema";
    public static final String OPCION_INCORRECTA = "La opción ingresada es incorrecta";
    public static final String VOLVER_MENU_PRINCIPAL = "Volver al menu principal";
    //-------------------------------------------------------------QUERYS EDITORIAL-------------------------------------------------------------
    public static final String OBTENER_TODAS_LAS_EDITORIALES = "SELECT e FROM editorial e";
    public static final String OBTENER_EDITORIAL_POR_ID = "SELECT e FROM editorial e WHERE e.id LIKE :id";
    public static final String OBTENER_EDITORIAL_POR_NOMBRE = "SELECT e FROM editorial e WHERE e.nombre LIKE :nombre";
    //-------------------------------------------------------------QUERYS AUTOR-------------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_AUTORES = "SELECT a FROM autor a";
    public static final String OBTENER_AUTOR_POR_ID = "SELECT a FROM autor a WHERE a.id LIKE :id";
    public static final String OBTENER_AUTOR_POR_NOMBRE = "SELECT a FROM autor a WHERE a.nombre LIKE :nombre";
    //-------------------------------------------------------------QUERYS LIBRO-------------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_LIBROS = "SELECT l FROM libro l";
    //Verificar Query OBTENER_LIBRO_POR_EDITORIAL
    public static final String OBTENER_LIBRO_POR_EDITORIAL = "SELECT l FROM libro l WHERE l.AUTOR_id_autor LIKE :nombre";
    //Verificar Query OBTENER_LIBRO_POR_AUTOR
    public static final String OBTENER_LIBRO_POR_AUTOR = "SELECT l FROM libor WHERE l.EDITORIAL_id_editorial LIKE :nombre"; 
    public static final String OBTENER_LIBRO_POR_ISBN = "SELECT l FROM libro l WHERE l.isbn LIKE :isbn";
    public static final String OBTENER_LIBRO_POR_TITULO = "SELECT l FROM libro l WHERE l.titulo LIKE :titulo";

}
