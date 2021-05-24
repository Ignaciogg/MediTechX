import com.google.gson.Gson;

import java.io.*;
import java.util.Scanner;

public class Administrador extends Persona {

    //Constructores
    public Administrador(String email, String dni, String nombre, String apellidos, String fechaNacimiento, String genero) {
        super(email, dni, nombre, apellidos, fechaNacimiento, genero);
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

    public void escribirLogin(Persona nuevo){
        Gson gson = new Gson();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ficheros/login.jsonl",true));
            bw.newLine();
            bw.append(gson.toJson(nuevo));
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void escribirPersona(Persona nuevo, String ruta){
        Gson gson = new Gson();
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
            bw.write(gson.toJson(nuevo));
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //FUNCIONES UTILIZADAS EN 1) CREAR NUEVO USUARIO
    public void generarAdministrador(){
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el email:");
        String email = input.nextLine();
        //GENERAR AUTOMATICO Y MANDAR POR CORREO
        System.out.print("Introduce la contraseña:");
        String contraseña = input.nextLine();
        System.out.print("Introduce el dni:");
        String dni = input.nextLine();
        System.out.print("Introduce el nombre:");
        String nombre = input.nextLine();
        System.out.print("Introduce los apellidos:");
        String apellidos = input.nextLine();
        System.out.print("Introduce la fecha de nacimiento:");
        String fechaNacimiento = input.nextLine();
        System.out.print("Introduce el género:");
        String genero = input.nextLine();

        String ruta = "src/ficheros/Administradores/" + dni + ".jsonl";

        escribirLogin(new Persona(email,contraseña,dni,"1"));
        escribirPersona(new Administrador(email,dni,nombre,apellidos,fechaNacimiento,genero),ruta);
    }

    public void generarMedico(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el email:");
        String email = input.nextLine();
        //GENERAR AUTOMATICO Y MANDAR POR CORREO
        System.out.print("Introduce la contraseña:");
        String contraseña = input.nextLine();
        System.out.print("Introduce el dni:");
        String dni = input.nextLine();
        System.out.print("Introduce el nombre:");
        String nombre = input.nextLine();
        System.out.print("Introduce los apellidos:");
        String apellidos = input.nextLine();
        System.out.print("Introduce la fecha de nacimiento:");
        String fechaNacimiento = input.nextLine();
        System.out.print("Introduce el género:");
        String genero = input.nextLine();
        System.out.print("Introduce el nº de la Seguridad Social:");
        int no_seguridad_social = input.nextInt();
        System.out.print("Introduce el nº de colegialo:");
        int no_colegialo = input.nextInt();
        String ruta = "src/ficheros/Medicos/" + dni + ".jsonl";
        escribirLogin(new Persona(email,contraseña,dni,"2"));
        escribirPersona(new Medico(email,dni,nombre,apellidos,fechaNacimiento,genero, no_seguridad_social, no_colegialo),ruta);
    }

    public void generarPaciente(){
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el email:");
        String email = input.nextLine();
        //GENERAR AUTOMATICO Y MANDAR POR CORREO
        System.out.print("Introduce la contraseña:");
        String contraseña = input.nextLine();
        System.out.print("Introduce el dni:");
        String dni = input.nextLine();
        System.out.print("Introduce el nombre:");
        String nombre = input.nextLine();
        System.out.print("Introduce los apellidos:");
        String apellidos = input.nextLine();
        System.out.print("Introduce la fecha de nacimiento:");
        String fechaNacimiento = input.nextLine();
        System.out.print("Introduce el género:");
        String genero = input.nextLine();
        System.out.print("Introduce la altura:");
        Double altura = input.nextDouble();
        System.out.print("Introduce el peso:");
        Double peso = input.nextDouble();
        System.out.print("Introduce las patologías:");
        String patologías = input.nextLine();
        System.out.print("Introduce las alergias:");
        String alergias = input.nextLine();
        System.out.print("Introduce el grupo sanguíneo:");
        String grupo_sanguineo = input.nextLine();

        String ruta = "src/ficheros/Pacientes/" + dni + ".jsonl";

        escribirLogin(new Persona(email,contraseña,dni,"3"));
        escribirPersona(new Paciente(email,dni,nombre,apellidos,fechaNacimiento,genero,altura,peso,patologías,alergias,grupo_sanguineo),ruta);
    }

    public void generarRecepcionista(){
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce el email:");
        String email = input.nextLine();
        //GENERAR AUTOMATICO Y MANDAR POR CORREO
        System.out.print("Introduce la contraseña:");
        String contraseña = input.nextLine();
        System.out.print("Introduce el dni:");
        String dni = input.nextLine();
        System.out.print("Introduce el nombre:");
        String nombre = input.nextLine();
        System.out.print("Introduce los apellidos:");
        String apellidos = input.nextLine();
        System.out.print("Introduce la fecha de nacimiento:");
        String fechaNacimiento = input.nextLine();
        System.out.print("Introduce el género:");
        String genero = input.nextLine();
        System.out.print("Introduce número de la seguridad social");
        int no_seguridad_social = input.nextInt();
        String ruta = "src/ficheros/Recepcionistas/" + dni + ".jsonl";
        escribirLogin(new Persona(email,contraseña,dni,"4"));
        escribirPersona(new Recepcionista(email,dni,nombre,apellidos,fechaNacimiento,genero,no_seguridad_social),ruta);
    }

    public void CrearUsuario(){
        Scanner input = new Scanner(System.in);
        String menuCU = "0";
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
            switch (menuCU = input.nextLine()) {
                case "1":
                    generarAdministrador();
                    break;
                case "2":
                    generarMedico();
                    break;
                case "3":
                    generarPaciente();
                    break;
                case "4":
                    generarRecepcionista();
                    break;
                case "5":
                    System.out.println("Elegiste salir \n");
                    break;
                default:
                    System.out.print("Introduce una opcion correcta: ");
            }
        }while (!menuCU.equals("5"));
    }

    //FUNCIONES UTILIZADAS EN 2/3) MODIFICAR/ELIMINAR USUARIO
    public Persona buscarUsuario(String dni){
        Gson gson = new Gson();
        Persona persona = null;
        boolean encontrado = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/ficheros/Login.jsonl"));
            String linea;
            while ((linea = br.readLine()) != null && encontrado == false) {
                persona = gson.fromJson(linea, Persona.class);
                if (persona.getDni().toLowerCase().equals(dni)) {
                    encontrado = true;
                }
            }
            br.close();
        }catch (IOException e){
            System.out.println(e);
        }
        return persona;
    }

    public Persona cargarUsuario(String ruta, int tipo){
        Gson gson = new Gson();
        Persona persona = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;
            linea = br.readLine();
            switch (tipo){
                case 1:
                    persona = gson.fromJson(linea, Administrador.class);
                    break;
                case 2:
                    persona = gson.fromJson(linea, Medico.class);
                    break;
                case 3:
                    persona = gson.fromJson(linea, Paciente.class);
                    break;
                case 4:
                    persona = gson.fromJson(linea, Recepcionista.class);
                    break;
            }
            br.close();
        }catch (IOException e){
            System.out.println(e);
        }
        return persona;
    }

    public boolean eliminarUsuarioLogin(String dni){
        Gson gson = new Gson();
        Persona persona = null;
        File ficheroViejo = new File("src/ficheros/Login.jsonl");
        File ficheroNuevo = new File("src/ficheros/Login2.jsonl");
        try {
            FileReader fr = new FileReader(ficheroViejo);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(ficheroNuevo,true);
            BufferedWriter bw = new BufferedWriter(fw);
            String linea;
            while ((linea = br.readLine()) != null) {
                persona = gson.fromJson(linea, Persona.class);
                if (!persona.getDni().toLowerCase().equals(dni)) {
                    bw.append(gson.toJson(persona));
                    bw.flush();
                    bw.newLine();
                }
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
            if(ficheroViejo.delete()){
                if(ficheroNuevo.renameTo(new File("src/ficheros/login.jsonl"))){
                    return true;
                }
            }
            return false;
        }catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public void ModificarUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el DNI del usuario que quieres modificar: ");
        String DNI = input.nextLine();
        Persona personaLoginAntiguo = buscarUsuario(DNI);
        if(personaLoginAntiguo==null){
            System.out.println("No se ha encontrado ningún usuario con ese DNI");
        }else{
            Persona personaLoginNuevo = personaLoginAntiguo;
            String menu = "0";
            String ruta = "";
            Persona personaFicheroAntiguo;
            Persona personaFicheroNuevo;
            switch (personaLoginAntiguo.getGenero()) {
                case "1":
                    ruta = "src/ficheros/Administradores/"+personaLoginAntiguo.getDni()+".jsonl";
                    personaFicheroAntiguo = cargarUsuario(ruta,1);
                    personaFicheroNuevo = personaFicheroAntiguo;
                    do {
                        System.out.println("\n\n----Modificar a un administrador----");
                        System.out.print(
                            "1 - Email\n" +
                            "2 - Contraseña\n" +
                            "3 - DNI\n" +
                            "4 - Nombre\n" +
                            "5 - Apellidos\n" +
                            "6 - Fecha de nacimiento\n" +
                            "7 - Genero\n" +
                            "8 - Guardar y salir\n" +
                            "Introduce el número del dato que quieras modificar: "
                        );
                        switch (menu = input.nextLine()) {
                            case "1":
                                System.out.print("Introduce el nuevo email: ");
                                String email = input.nextLine();
                                //Comprobar formato email
                                personaFicheroNuevo.setEmail(email);
                                personaLoginNuevo.setEmail(email);
                                break;
                            case "2":
                                System.out.print("Introduce la nueva contraseña: ");
                                String contraseña = input.nextLine();
                                personaLoginNuevo.setContraseña(contraseña);
                                break;
                            case "3":
                                System.out.print("Introduce el nuevo dni: ");
                                String dni = input.nextLine();
                                personaFicheroNuevo.setDni(dni);
                                personaLoginNuevo.setDni(dni);
                                break;
                            case "4":
                                System.out.print("Introduce el nuevo nombre: ");
                                String nombre = input.nextLine();
                                personaFicheroNuevo.setNombre(nombre);
                                break;
                            case "5":
                                System.out.print("Introduce el nuevo apellido: ");
                                String apellido = input.nextLine();
                                personaFicheroNuevo.setApellidos(apellido);
                                break;
                            case "6":
                                System.out.print("Introduce la nueva fecha de nacimiento: ");
                                String fechaNacimiento = input.nextLine();
                                personaFicheroNuevo.setFechaNacimiento(fechaNacimiento);
                                break;
                            case "7":
                                System.out.print("Introduce el nuevo genero: ");
                                String genero = input.nextLine();
                                personaFicheroNuevo.setGenero(genero);
                                break;
                            case "8":
                                //Eliminar usuario
                                eliminarUsuarioLogin(personaLoginAntiguo.getDni());
                                File eliminar = new File(ruta);
                                eliminar.delete();
                                //guardar de nuevo
                                ruta = "src/ficheros/Administradores/"+personaFicheroNuevo.getDni()+".jsonl";
                                escribirLogin(personaLoginNuevo);
                                escribirPersona(personaFicheroNuevo,ruta);
                                break;
                            default:
                                System.out.println("Introduce una opción válida");
                        }
                    }while (!menu.equals("8"));
                    break;
                case "2":
                    ruta = "src/ficheros/Medicos/"+personaLoginAntiguo.getDni()+".jsonl";

                    break;
                case "3":
                    ruta = "src/ficheros/Pacientes/"+personaLoginAntiguo.getDni()+".jsonl";

                    break;
                case "4":
                    ruta = "src/ficheros/Recepcionista/"+personaLoginAntiguo.getDni()+".jsonl";

                    break;
            }

        }
    }

    public void EliminarUsuario(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el DNI del usuario que quieres modificar: ");
        String DNI = input.nextLine();
        Persona personaBuscada = buscarUsuario(DNI);

        if (personaBuscada != null){
            if(eliminarUsuarioLogin(DNI)){
                String ruta = "";
                switch (personaBuscada.getGenero()) {
                    case "1":
                        ruta = "src/ficheros/Administradores/" + personaBuscada.getDni() + ".jsonl";
                        break;
                    case "2":
                        ruta = "src/ficheros/Medicos/" + personaBuscada.getDni() + ".jsonl";
                        break;
                    case "3":
                        ruta = "src/ficheros/Pacientes/" + personaBuscada.getDni() + ".jsonl";
                        break;
                    case "4":
                        ruta = "src/ficheros/Recepcionista/" + personaBuscada.getDni() + ".jsonl";
                        break;
                }
                File fichero = new File(ruta);

                if(fichero.delete()){
                    System.out.println("El fichero del usuario se ha eliminado correctamente");
                }else {
                    System.out.println("Error al eliminar el fichero del usuario");
                }
            }else{
                System.out.println("Error al eliminar el usuario de la lista de login");
            }
        }else {
            System.out.println("No se ha encontrado ningun usuario con ese dni");
        }
    }

}
