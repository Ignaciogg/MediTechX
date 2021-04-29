import java.util.Scanner;

public class Paciente extends Persona{

    // Declaramos las variables de la clase
    private double altura;
    private double peso;
    private String patologías;
    private String alergias;
    private String grupo_sanguineo;



    // Constructor

    public Paciente(java.lang.String email, java.lang.String contraseña, java.lang.String dni, java.lang.String tipoUsuario, double altura, String patologías, String alergias, String grupo_sanguineo) {
        super(email, contraseña, dni, tipoUsuario);
        this.altura = altura;
        this.alergias = alergias;
        this.patologías = patologías;
        this.peso = peso;
        this.grupo_sanguineo = grupo_sanguineo;
    }



    // Getters and setters

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public java.lang.String getPatologías() {
        return patologías;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPatologías(java.lang.String patologías) {
        this.patologías = patologías;
    }

    public java.lang.String getAlergias() {
        return alergias;
    }

    public void setAlergias(java.lang.String alergias) {
        this.alergias = alergias;
    }

    public java.lang.String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(java.lang.String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

// Menú del paciente y sus respectivas funciones necesarias



    public void Menu_medico(){
        Scanner input = new Scanner(System.in);
        String menu = "0";
        do {
            System.out.println("\n\n\n----MENU ADMIN----");
            System.out.print(
                    "1 - Ver citas pendientes\n" +
                            "2 - Solicitar cita\n" +
                            "3 - Cancelar cita\n" +
                            "4 - Modificar cita\n" +
                            "5 - Ver resultados de consultas\n" +
                            "6 - Salir\n" +
                            "Introduce el número de la opcion que quieras realizar: "
            );
            switch (menu = input.nextLine()) {
                case "1":
                    mostrar_citas();
                    break;
                case "2":
                   solicitar_cita();
                    break;
                case "3":
                    cancelar_cita();
                    break;
                case "4":
                   modificar_citas();
                    break;
                case "5":
                    resultados_citas();
                    break;
                case "6":
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.print("Introduce una opcion correcta: ");
            }
        }while (!menu.equals("6"));
    }

    public void mostrar_citas{

    }
    public void solicitar_cita{

    }
    public void cancelar_cita{

    }
    public void modificar_citas{

    }
    public void resultados_citas{

    }

}
