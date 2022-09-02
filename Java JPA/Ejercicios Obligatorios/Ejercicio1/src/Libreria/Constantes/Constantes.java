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
    public static final String ALTA_EDITORIAL_EXITOSA = "La editorial que usted ha seleccionado ha sido dada de alta exitosamente";
    public static final String LIBRO_NO_ENCONTRADO = "El libro que usted ha seleccionado no se encuentra";
    public static final String LIBRO_ELIMINADO = "Libro eliminado exitosamente";
    public static final String ERROR = "Ocurrió un error";
    public static final String INGRESE_NOMBRE_AUTOR = "Ingrese el nombre del autor";
    public static final String AUTOR_NO_ENCONTRADO = "No se encontró el autor";
    public static final String INGRESE_AUTOR_ID = "Ingrese el ID del autor";
    public static final String AUTOR_ANADIDO = "Autor añadido con exito";
    public static final String PREGUNTA_AUTOR_DISPONIBLE = "El autor se encuentra disponible? (S/N)";
    public static final String PREGUNTA_EDITORIAL_DISPONIBLE = "La editorial se encuentra disponible? (S/N)";
    public static final String EDITORIAL_ANADIDA = "Editorial añadida con exito";
    public static final String INGRESE_NOMBRE_EDITORIAL = "Ingrese el nombre de la editorial";
    public static final String INGRESE_EDITORIAL_ID = "Ingrese el ID de la editorial";
    public static final String EDITORIAL_NO_ENCONTADA = "No se encontró la editorial";
    public static final String LIBRO_ANADIDO = "Libro añadido con exito";
    public static final String INGRESE_ISBN = "Ingrese el ISBN del libro";
    public static final String ISBN_INVALIDO = "El ISBN ingresado es invalido";
    public static final String INGRESE_TITULO = "Ingrese el titulo del libro";
    public static final String TITULO_LIBRO_INVALIDO = "El titulo ingresado es invalido";
    public static final String INGRESE_ANIO_LANZAMIENTO = "Ingrese el año de lanzamiento del libro";
    public static final String INGRESE_COPIAS_LIBROS = "Ingrese cuantas copias tiene el libro";
    public static final String LIBROS_AGOTADOS = "Libro agotado";
    public static final String LIBRO_PRESTADO = "Libro prestado con exito!";
    public static final String LIBROS_LLENOS = "Error. Capacidad de libros a devolver alcanzada";
    public static final String LIBRO_DEVUELTO = "Libro devuelto con exito";
    public static final String AUTOR_MODIFICADO = "Autor modificado exitosamente";
    public static final String CLIENTE_ANADIDO = "Cliente añadido correctamente";
    public static final String CLIENTE_NO_ENCONTRADO = "No se encontró al cliente";
    public static final String CLIENTE_ELIMINADO = "Cliente eliminado con exito";
    public static final String CLIENTE_MODIFICADO = "Cliente modificado con exito";
    public static final String INGRESE_NOMBRE_CLIENTE = "Ingrese el nombre del cliente";
    public static final String INGRESE_ID_CLIENTE = "Ingrese la ID del cliente";
    public static final String INGRESE_ID_CLIENTE_ELIMINAR = "Ingrese la ID del cliente a eliminar";
    public static final String INGRESE_APELLIDO_CLIENTE = "Ingrese el apellido del cliente";
    public static final String INGRESE_TELEFONO_CLIENTE = "Ingrese el telefono del cliente";
    public static final String INGRESE_DOCUMENTO_CLIENTE = "Ingrese el documento del cliente";
    public static final String DNI_INVALIDO = "El DNI ingresado es invalido";
    public static final String PRESTAMO_INVALIDO = "El cliente ya tiene un prestamo pendiente";
    public static final String PRESTAMO_NO_DISPONIBLE = "Usted no posee ningun prestamo";
    public static final String PRESTAMO_NO_ENCONTRADO = "No se encontró un Cliente con prestamos";
    public static final String INGRESE_NOMBRE_LIBRO = "Ingrese el nombre del libro";
    //-------------------------------------------------------------OPCIONES MENU-------------------------------------------------------------
    public static final String INGRESE_OPCION = "Ingrese una opción";
    public static final String SALIDA = "Usted salió del sistema";
    public static final String OPCION_INCORRECTA = "La opción ingresada es incorrecta";
    public static final String VOLVER_MENU_PRINCIPAL = "Volver al menu principal";
    //-------------------------------------------------------------QUERYS CLIENTE----------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_CLIENTES = "SELECT c FROM Cliente c";
    public static final String OBTENER_CLIENTE_POR_ID = "SELECT c FROM Cliente c WHERE c.id LIKE :id";
    public static final String OBTENER_CLIENTE_POR_NOMBRE = "SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre";
    public static final String OBTENER_CLIENTE_POR_DNI = "SELECT c FROM Cliente c WHERE c.DNI LIKE :DNI";
    //-------------------------------------------------------------QUERYS PRESTAMO----------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_PRESTAMOS = "SELECT p FROM Prestamo p";
    public static final String OBTENER_PRESTAMO_POR_DNI = "SELECT p FROM Prestamo p WHERE p.cliente.DNI LIKE :DNI";
    public static final String OBTENER_PRESTAMO_POR_NOMBRE_LIBRO = "SELECT p FROM Prestamo p WHERE p.libro.titulo LIKE :titulo";
    //-------------------------------------------------------------QUERYS EDITORIAL----------------------------------------------------------
    public static final String OBTENER_TODAS_LAS_EDITORIALES = "SELECT e FROM Editorial e WHERE e.alta = true";
    public static final String OBTENER_EDITORIAL_POR_ID = "SELECT e FROM Editorial e WHERE e.id LIKE :id";
    public static final String OBTENER_EDITORIAL_POR_NOMBRE = "SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre";
    //-------------------------------------------------------------QUERYS AUTOR--------------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_AUTORES = "SELECT a FROM Autor a WHERE a.alta = true";
    public static final String OBTENER_AUTOR_POR_ID = "SELECT a FROM Autor a WHERE a.id LIKE :id";
    public static final String OBTENER_AUTOR_POR_NOMBRE = "SELECT a FROM Autor a WHERE a.nombre LIKE :nombre";
    //-------------------------------------------------------------QUERYS LIBRO--------------------------------------------------------------
    public static final String OBTENER_TODOS_LOS_LIBROS = "SELECT l FROM Libro l";
    public static final String OBTENER_LIBRO_POR_EDITORIAL = "SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre";
    public static final String OBTENER_LIBRO_POR_AUTOR = "SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre";
    public static final String OBTENER_LIBRO_POR_ISBN = "SELECT l FROM Libro l WHERE l.isbn LIKE :isbn";
    public static final String OBTENER_LIBRO_POR_TITULO = "SELECT l FROM Libro l WHERE l.titulo LIKE :titulo";
    //-------------------------------------------------------------MENUS---------------------------------------------------------------------
    public static final String OPCIONES_MENU_PRINCIPAL = "\nOpciones Disponibles"
            + "\n1. Ir al Menu de Autor"
            + "\n2. Ir al Menu de Libro"
            + "\n3. Ir al Menu de Editorial"
            + "\n4. Ir al Menu de Cliente"
            + "\n5. Ir al Menu de Prestamos"
            + "\n6. Salir ";

    public static final String OPCIONES_MENU_AUTOR = "\nOpciones Disponibles"
            + "\n1.Crear un nuevo autor"
            + "\n2.Mostrar todos los autores disponibles"
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

    public static final String OPCIONES_MENU_CLIENTE = "\nOpciones Disponibles"
            + "\n1.Ingresar un cliente"
            + "\n2.Mostrar todos los clientes"
            + "\n3.Buscar un cliente usando su nombre"
            + "\n4.Buscar un cliente usando su ID"
            + "\n5.Modificar un cliente usando su ID"
            + "\n6.Volver al menu principal";

    public static final String OPCIONES_MENU_PRESTAMO = "\nOpciones Disponibles"
            + "\n1.Mostrar todos los prestamos"
            + "\n2.Buscar una prestamo usando el DNI del cliente"
            + "\n3.Pedir un libro"
            + "\n4.Devolver un libro"
            + "\n5.Volver al menu principal";

}
