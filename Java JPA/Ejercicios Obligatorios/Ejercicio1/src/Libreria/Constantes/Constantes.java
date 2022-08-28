package Libreria.Constantes;

public class Constantes {

    //-------------------------------------------------------------Constantes----------------------------------------------------------------
    public static final String ID_INVALIDO = "El ID ingresado es invalido";
    public static final String NOMBRE_INVALIDO = "El nombre ingresado es invalido";
    public static final String AUTOR_NO_DISPONIBLE = "El autor que usted está buscando no está disponible o está dado de baja";
    public static final String AUTOR_DISPONIBLE = "El autor que usted está buscando ya se encuentra disponible o está dado de alta";
    public static final String BAJA_AUTOR_EXITOSA = "El autor que usted ha seleccionado ha sido dado de baja exitosamente";
    public static final String ALTA_AUTOR_EXITOSA = "El autor que usted ha seleccionado ha sido dado de alta exitosamente";
    public static final String EDITORIAL_NO_DISPONIBLE = "La editorial que usted está buscando no está disponible o está dada de baja";
    public static final String EDITORIAL_DISPONIBLE = "La editorial que usted está buscnado ya se encuentra dispoible o está dada de alta";
    public static final String BAJA_EDITORIAL_EXITOSA = "La editorial que usted ha seleccionado ha sido dada de baja exitosamente";
    public static final String ALTA_EDITORIAL_EXITOSA = "La editorial que usted ha seleccionado ha sido alta de baja exitosamente";
    public static final String LIBRO_NO_ENCONTRADO = "El libro que usted ha seleccionado no se encuentra";
    public static final String LIBRO_ELIMINADO = "Libro eliminado exitosamente";
    //-------------------------------------------------------------OPCIONES MENU-------------------------------------------------------------
    public static final String INGRESE_OPCION = "Ingrese una opción";
    public static final String SALIDA = "Usted salió del sistema";
    public static final String OPCION_INCORRECTA = "La opción ingresada es incorrecta";
    public static final String VOLVER_MENU_PRINCIPAL = "Volver al menu principal";
    //-------------------------------------------------------------QUERYS EDITORIAL----------------------------------------------------------
    public static final String OBTENER_TODAS_LAS_EDITORIALES = "SELECT e FROM editorial e";
    public static final String OBTENER_EDITORIAL_POR_ID = "SELECT e FROM editorial e WHERE e.id LIKE :id";
    public static final String OBTENER_EDITORIAL_POR_NOMBRE = "SELECT e FROM editorial e WHERE e.nombre LIKE :nombre";
    //Verificar Query CONTAR_EDITORIALES
    public static final String CONTAR_EDITORIALES = "SELECT COUNT(e) FROM editorial";
    //-------------------------------------------------------------QUERYS AUTOR--------------------------------------------------------------
    //Verificar Query CONTAR_AUTORES
    public static final String CONTAR_AUTORES = "SELECT COUNT(a) FROM autor";
    public static final String OBTENER_TODOS_LOS_AUTORES = "SELECT a FROM autor a";
    public static final String OBTENER_AUTOR_POR_ID = "SELECT a FROM autor a WHERE a.id LIKE :id";
    public static final String OBTENER_AUTOR_POR_NOMBRE = "SELECT a FROM autor a WHERE a.nombre LIKE :nombre";
    //-------------------------------------------------------------QUERYS LIBRO--------------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_LIBROS = "SELECT l FROM libro l";
    //Verificar Query OBTENER_LIBRO_POR_EDITORIAL
    public static final String OBTENER_LIBRO_POR_EDITORIAL = "SELECT l FROM libro WHERE l.EDITORIAL_id_editorial.nombre LIKE :nombre";
    //Verificar Query OBTENER_LIBRO_POR_AUTOR
    public static final String OBTENER_LIBRO_POR_AUTOR = "SELECT l FROM libro l WHERE l.AUTOR_id_autor.nombre LIKE :nombre";
    public static final String OBTENER_LIBRO_POR_ISBN = "SELECT l FROM libro l WHERE l.isbn LIKE :isbn";
    public static final String OBTENER_LIBRO_POR_TITULO = "SELECT l FROM libro l WHERE l.titulo LIKE :titulo";
    //-------------------------------------------------------------MENUS---------------------------------------------------------------------
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

}
