import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Administrador extends Persona {

    public Administrador(String email, String contraseña, String dni, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(email, contraseña, dni, nombre, apellidos, fechaNacimiento, genero);
    }

    public void Menu(){
        Scanner input = new Scanner(System.in);
        String menu = "0";
        do {
            System.out.println("\n\n\n----MENU ADMIN----");
            System.out.print(
                "1 - Dar de alta a un usuario\n" +
                "2 - Modificar a un usuario\n" +
                "3 - Eliminar a un usuario\n" +
                "4 - Salir\n" +
                "Introduce el número de la opcion que quieras realizar: "
            );
            switch (menu = input.nextLine()) {
                case "1":
                    CrearUsuario();
                    break;
                case "2":
                    ModificarUsuario();
                    break;
                case "3":
                    EliminarUsuario();
                    break;
                case "4":
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.print("Introduce una opcion correcta: ");
            }
        }while (!menu.equals("4"));
    }

    public static void EscribirEnFichero(String email, String contraseña, String dni, String nombre,
                                         String apellidos, String fechaNacimiento, String genero) {

        try {
            FileWriter DarAltaAdmin = new FileWriter((dni + ".jsonl"), false);
            DarAltaAdmin.write("{" + "'email': " + email + "," + "'contraseña': " + contraseña + "," +
                    "'dni': " + dni + "," + "'nombre': " + nombre + "," + "'apellidos': " + apellidos + "," +
                    "'fechaNacimiento': " + fechaNacimiento + "," + "'genero': " + genero + "}" + "\n");
            DarAltaAdmin.close();

        } catch (IOException e) {

            System.out.println("No se encontró el fichero");
        }
    }

    public void CrearUsuario(){
        Scanner input = new Scanner(System.in);
        String menuAD = "0";
        do {
            System.out.println("\n\n----Dar de alta a un usuario----");
            System.out.print(
                "1 - Admin\n" +
                "2 - Medico\n" +
                "3 - Paciente\n" +
                "4 - Recepcionista\n" +
                "5 - Salir\n" +
                "Introduce el número del usuario que quieras dar de alta: "
            );
            switch (menuAD = input.nextLine()) {
                case "1":
                    try {
                        System.out.println("Introduce el email:");
                        String email = input.nextLine();
                        System.out.println("Introduce la contraseña:");
                        String contraseña = input.nextLine();
                        System.out.println("Introduce el dni:");
                        String dni = input.nextLine();
                        System.out.println("Introduce el nombre:");
                        String nombre = input.nextLine();
                        System.out.println("Introduce los apellidos:");
                        String apellidos = input.nextLine();
                        System.out.println("Introduce la fecha de nacimiento:");
                        String fechaNacimiento = input.nextLine();
                        System.out.println("Introduce el género:");
                        String genero = input.nextLine();

                        EscribirEnFichero(email,contraseña,dni,nombre,apellidos,fechaNacimiento,genero);
                        System.out.println("Administrador agregado con exito!");

                    } catch (Exception e) {
                        System.out.println("Error al introducir un nuevo Administrador.");
                    }

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                default:
                    System.out.print("Introduce una opcion correcta: ");
            }
        }while (!menuAD.equals("5"));
    }


    public void ModificarUsuario(){

    }

    public void EliminarUsuario(){

    }
}
