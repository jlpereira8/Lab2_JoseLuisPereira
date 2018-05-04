package lab2_joseluispereira;

/*
primero podrá elaborar exámenes, los cuales constan de un nombre de clase, preguntas, respuestas (estará vacío hasta que los estudiantes lo
resuelvan, nombre del alumno, fecha). Como segunda opción podrá revisar los exámenes, en donde
podrá elegir que examen revisar, podrá visualizar todas las preguntas del examen y sus respectivas
respuestas y darle una nota al estudiante que realizo ese examen, la nota consta de un nombre de
estudiante, nombre de la clase y una calificación. (Cabe resaltar que si el estudiante ya había realizado
un examen de esa clase previamente, la nota de le deberá sumar a la nota obtenida en los primeros
exámenes). Finalmente podrá ver las notas que todos los alumnos tienen en todas las clases de las
cuales han hecho exámenes. Y también se podrá modificar cualquier nota de cualquier estudiante en
cualquier clase.

 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import lab2_joseluispereira.Alumnos;

public class Lab2_JoseLuisPereira {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        ArrayList<Alumnos> user = new ArrayList<>();

        int des1 = 0, des2 = 0, des3 = 0, des4 = 0, des5 = 0, des6 = 0;
        String resp1, preg1;
        Alumnos actual = null;
        while (des2 != 4) {
            System.out.println("*******MENU*******");
            System.out.println("1) Administracion");
            System.out.println("2) Crear Cuenta");
            System.out.println("3) LogIn");
            System.out.println("Ingrese su opcion");
            int des = lea.nextInt();
            switch (des) {
                case 1:
                    Admin();
                    break;
                case 2:
                    System.out.println("Ingrese nombre");
                    String nom = lea.next();
                    System.out.println("Ingrese numero de cuenta");
                    String cuenta = lea.next();
                    System.out.println("Ingrese fecha");
                    String fe = lea.next();
                    System.out.println("Ingrese su edad");
                    int ed = lea.nextInt();
                    System.out.println("Ingrese su Ciudad ");
                    String ci = lea.next();
                    System.out.println("Ingrese su Nacionalidad");
                    String na = lea.next();
                    System.out.println("Ingrese su ID");
                    String ID = lea.next();
                    System.out.println("Ingrese su nombre de Usario");
                    String us = lea.next();
                    System.out.println("Ingrese su contrasena");
                    String pas = lea.next();
                    user.add(new Alumnos(nom, cuenta, fe, ed, ci, na, ID, us, pas));
                    break;
                case 3:
                    System.out.println("Ingrese usuario: ");
                    String CompareUs = lea.next();
                    System.out.println("Ingrese contraseña:");
                    String contra = lea.next();
                    for (Alumnos x : user) {
                        if (CompareUs.equals(x.getUser()) && contra.equals(x.getPass())) {
                            cc();
                        } else {
                            System.out.println("Usuario no valido");
                        }
                    }
                    break;
                case 4:
                    des2 = 4;
                    break;
            }
        }

    }

    public static void Admin() {
        ArrayList<String> resps = new ArrayList<>();
        ArrayList<String> pregs = new ArrayList<>();
        String es, es2;
        System.out.println("1) Crear Examen");
        System.out.println("2) Revisar Examen");
        System.out.println("3) Ver notas");
        System.out.println("4) Revisar Notas");
        System.out.println("Ingrese su desicion");
        int red = lea.nextInt();
        switch (red) {
            case 1:
                System.out.println("Ingrese el numero de preguntas de su examen ");
                int max = lea.nextInt();
                for (int i = 0; i < max * 2; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Ingrese pregunta");
                        es = lea.next();
                        pregs.add(es);
                    } else {
                        System.out.println("Ingrese respuesta");
                        es2 = lea.next();
                        resps.add(es2);
                    }
                }
                System.out.println("PREGUNTAS");
                for (int i = 1; i < pregs.size()+1; i++) {
                    System.out.println(i+") " + pregs.get(i) + "]");
                }
                System.out.println("RESPUESTAS");
                for (int i = 1; i < resps.size()+1; i++) {
                    System.out.println(i+") " + resps.get(i) + "]");
                }
                System.out.println("");
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }
    }

    public static void cc() {
        System.out.println("1) Ver Datos");
        System.out.println("2) Modificar Datos");
        System.out.println("3) Realizar Examenes");
        System.out.println("4) Ver Notas");
        System.out.println("Ingrese su desicion");
        int g = lea.nextInt();
        switch (g) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }
    }
}
