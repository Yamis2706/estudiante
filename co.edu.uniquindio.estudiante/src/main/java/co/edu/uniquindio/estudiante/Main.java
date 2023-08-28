package co.edu.uniquindio.estudiante;

//Importación clase Estudiante
import co.edu.uniquindio.estudiante.model.Estudiante;

//Creación clase Main
public class Main {

    public static int ganaronCurso = 0;
    public static int perdieronCurso = 0;
    public static int CantidadEstudiantesNotaMayor4 = 0;

    public static void main(String[] args) {

        //Declaración primer método (no tiene parámetros)
        crearEstudiante();
    }

    //Método para Creación de Estudiantes e instancias
    private static void crearEstudiante(){

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setEdad(17);
        estudiante1.setCorreo("juan@mail.com");
        estudiante1.setSemestre(3);
        estudiante1.setNota1(3.0);
        estudiante1.setNota2(3.5);
        estudiante1.setNota3(4.5);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Maria");
        estudiante2.setEdad(15);
        estudiante2.setCorreo("pepita@mail.com");
        estudiante2.setSemestre(1);
        estudiante2.setNota1(2.0);
        estudiante2.setNota2(2.5);
        estudiante2.setNota3(4.5);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pepe");
        estudiante3.setEdad(20);
        estudiante3.setCorreo("pepe@mail.com");
        estudiante3.setSemestre(4);
        estudiante3.setNota1(4.0);
        estudiante3.setNota2(2.5);
        estudiante3.setNota3(4.5);

        //Declaración de métodos con sus respectivos parámetros
        double definitivaEstudiante1 = calcularDefinitivaEstudiante(estudiante1.getNota1(), estudiante1.getNota2(),
                estudiante1.getNota3());

        double definitivaEstudiante2 = calcularDefinitivaEstudiante(estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3());

        double definitivaEstudiante3 = calcularDefinitivaEstudiante(estudiante3.getNota1(), estudiante3.getNota2(),
                estudiante3.getNota3());

        System.out.println("La nota definitiva del estudiante " + estudiante1.getNombre() +
                " es: " + definitivaEstudiante1);
        System.out.println("La nota definitiva del estudiante " + estudiante2.getNombre() +
                " es: " + definitivaEstudiante2);
        System.out.println("La nota definitiva del estudiante " + estudiante3.getNombre() +
                " es: " + definitivaEstudiante3);

        calcularPromedioCurso(estudiante1, estudiante2, estudiante3);
        calcularPromedioEdad(estudiante1, estudiante2, estudiante3);
        calcularPromedioNota1(estudiante1, estudiante2, estudiante3);
        calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3);
        calcularNotaMenorCurso(estudiante1, estudiante2, estudiante3);

        System.out.println(aprobacionCurso(definitivaEstudiante1, estudiante1.getNombre()));
        System.out.println(aprobacionCurso(definitivaEstudiante2, estudiante2.getNombre()));
        System.out.println(aprobacionCurso(definitivaEstudiante3, estudiante3.getNombre()));

        calcularPorcentajeGanaronCurso(ganaronCurso);
        calcularPorcentajePerdieronCurso(perdieronCurso);
        obtenerEstudianteNotaMayor4(estudiante1.getNombre(), estudiante1.getNota1(), estudiante1.getNota2(),
                estudiante1.getNota3());
        obtenerEstudianteNotaMayor4(estudiante2.getNombre(), estudiante2.getNota1(), estudiante2.getNota2(),
                estudiante2.getNota3());
        obtenerEstudianteNotaMayor4(estudiante3.getNombre(), estudiante3.getNota1(), estudiante3.getNota2(),
                estudiante3.getNota3());
        cantidadEstudiantesNotasMayor4();

        calcularNotaMaximaEst1(estudiante1);
        calcularNotaMaximaEst2(estudiante2);
        calcularNotaMaximaEst3(estudiante3);
        defEstudiante1(estudiante1);
        defEstudiante2(estudiante2);
        defEstudiante3(estudiante3);
        calcularNotaMaxEst1(estudiante1);
        calcularNotaMaxEst2(estudiante2);
        calcularNotaMaxEst3(estudiante3);
        calcularNotaMinimaEst1(estudiante1);
        calcularNotaMinimaEst2(estudiante2);
        calcularNotaMinimaEst3(estudiante3);
    }

    //Método para calcular la nota definitiva del estudiante
    public static double calcularDefinitivaEstudiante(double nota1, double nota2, double nota3){

        double notaDefinitiva = (nota1 + nota2 + nota3) / 3;
        return notaDefinitiva;
    }

    //Método para calcular el promedio del curso
    private static void calcularPromedioCurso(Estudiante estudiante1, Estudiante estudiante2,
                                              Estudiante estudiante3){

        double promCurso = 0;
        promCurso = (defEstudiante1(estudiante1) + defEstudiante2(estudiante2) + defEstudiante3(estudiante3)) / 3;

        System.out.println("El promedio del curso es: " + promCurso);
    }

    //Método para calcular el promedio de edad de los estudiantes
    private static void calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2,
                                             Estudiante estudiante3) {

        double promEdad = 0;
        promEdad = (Double.valueOf(estudiante1.getEdad()) + Double.valueOf(estudiante2.getEdad())
                + Double.valueOf(estudiante3.getEdad())) / 3;

        System.out.println("El Promedio de edad de los estudiantes es: " + promEdad);
    }

    //Método para calcular el promedio de la nota 1 de los estudiantes
    private static void calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2,
                                              Estudiante estudiante3) {

        double promNota1 = 0;
        promNota1 = (estudiante1.getNota1() + estudiante2.getNota1() + estudiante3.getNota1()) / 3;

        System.out.println("El Promedio de la nota 1 de los estudiantes en el curso es: " + promNota1);
    }

    //Método para calcular la nota mayor del curso
    private static void calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2,
                                                  Estudiante estudiante3) {

        double notaMaxEst1 = calcularNotaMaxEst1(estudiante1);
        double notaMaxEst2 = calcularNotaMaxEst2(estudiante2);
        double notaMaxEst3 = calcularNotaMaxEst3(estudiante3);
        double notaMayorCurso = notaMaxEst1;

        if (notaMaxEst2 > notaMayorCurso) {
            notaMayorCurso = notaMaxEst2;
        }
        if(notaMaxEst3 > notaMayorCurso){
            notaMayorCurso = notaMaxEst3;
        }

        System.out.println("La nota mayor del curso es: " + notaMayorCurso);
    }

    //Método para calcular la nota menor del curso
    private static void calcularNotaMenorCurso(Estudiante estudiante1, Estudiante estudiante2,
                                               Estudiante estudiante3) {

        double notaMinimaEst1 = calcularNotaMinimaEst1(estudiante1);
        double notaMinimaEst2 = calcularNotaMinimaEst2(estudiante2);
        double notaMinimaEst3 = calcularNotaMinimaEst3(estudiante3);
        double notaMenorCurso = notaMinimaEst1;

        if (notaMinimaEst2 < notaMenorCurso) {
            notaMenorCurso = notaMinimaEst2;
        }
        if(notaMinimaEst3 < notaMenorCurso){
            notaMenorCurso = notaMinimaEst3;
        }

        System.out.println("La nota menor del curso es: " + notaMenorCurso);
    }

    //Método para calcular los estudiantes que aprobaron el curso
    public static String aprobacionCurso(double defEstudiante, String nombreEstudiante){

        if (defEstudiante >= 3.0){
            ganaronCurso += 1;
            return "El estudiante " + nombreEstudiante + " aprobó el curso";
        }else {
            perdieronCurso +=1;
            return "El estudiante " + nombreEstudiante + " no aprobó el curso";
        }
    }

    //Método para calcular el porcentaje de los estudiantes que ganaron el curso
    public static double calcularPorcentajeGanaronCurso(int ganaronCurso){

        double porcentajeGanaronCurso = (ganaronCurso * 100) / 3;

        System.out.println("El porcentaje de estudiantes que ganaron el curso es: " +
                porcentajeGanaronCurso + "%");
        return porcentajeGanaronCurso;
    }

    //Método para calcular el porcentaje de los estudiantes que perdieron el curso
    public static double calcularPorcentajePerdieronCurso(int perdieronCurso){

        double porcentajeperdieronCurso = (perdieronCurso * 100) / 3;

        System.out.println("El porcentaje de estudiantes que perdieron el curso es: " +
                porcentajeperdieronCurso + "%");
        return porcentajeperdieronCurso;
    }

    //Método para obtener el nombre del estudiante con todas las notas mayores o iguales a 4.0
    public static String obtenerEstudianteNotaMayor4(String nombre, double nota1,double nota2, double nota3){

        if (nota1 >= 4 && nota2 >= 4 && nota3 >= 4){
            CantidadEstudiantesNotaMayor4 += 1;

            System.out.println("El estudiante " + nombre + " tiene todas las notas mayores o iguales a: 4.0");
            return "El estudiante " + nombre + " tiene todas las notas mayores o iguales a: 4.0";
        }
        return null;
    }

    //Método para calcular cuando ningún estudiante tiene todas las notas mayores o iguales a 4.0
    public static String cantidadEstudiantesNotasMayor4(){

        if (CantidadEstudiantesNotaMayor4 == 0){

            System.out.println("No se encontró estudiante con todas las notas mayores o iguales a: 4.0");
            return "No se encontró estudiante con todas las notas mayores o iguales a: 4.0";
        }
        System.out.println("hay " + CantidadEstudiantesNotaMayor4 + " con todas las notas mayores o iguales a: 4.0");
        return "hay " + CantidadEstudiantesNotaMayor4 + " con todas las notas mayores o iguales a: 4.0";
    }

    //Método para calcular la nota máxima del estudiante 1
    private static void calcularNotaMaximaEst1(Estudiante estudiante1) {

        double notaMaximaEst1 = estudiante1.getNota1();
        if (estudiante1.getNota2() > notaMaximaEst1) {
            notaMaximaEst1 = estudiante1.getNota2();
        }
        if(estudiante1.getNota3() > notaMaximaEst1) {
            notaMaximaEst1 = estudiante1.getNota3();
        }
        System.out.println(" La nota máxima del estudiante 1 es: " + notaMaximaEst1);
    }

    //Método para calcular la nota máxima del estudiante 2
    private static void calcularNotaMaximaEst2(Estudiante estudiante2) {

        double notaMaximaEst2 = estudiante2.getNota1();
        if (estudiante2.getNota2() > notaMaximaEst2) {
            notaMaximaEst2 = estudiante2.getNota2();
        }
        if(estudiante2.getNota3() > notaMaximaEst2) {
            notaMaximaEst2 = estudiante2.getNota3();
        }
        System.out.println(" La nota máxima del estudiante 2 es: " + notaMaximaEst2);
    }

    //Método para calcular la nota máxima del estudiante 3
    private static void calcularNotaMaximaEst3(Estudiante estudiante3) {

        double notaMaximaEst3 = estudiante3.getNota1();
        if (estudiante3.getNota2() > notaMaximaEst3) {
            notaMaximaEst3 = estudiante3.getNota2();
        }
        if (estudiante3.getNota3() > notaMaximaEst3) {
            notaMaximaEst3 = estudiante3.getNota3();
        }
        System.out.println(" La nota máxima del estudiante 3 es: " + notaMaximaEst3);
    }

    //Método para calcular el promedio de notas del estudiante 1
    private static double defEstudiante1(Estudiante estudiante1){

        double defEstudiante1 = 0;
        defEstudiante1 = (estudiante1.getNota1() + estudiante1.getNota2() + estudiante1.getNota3()) / 3;
        return defEstudiante1;
    }

    //Método para calcular el promedio de notas del estudiante 2
    private static double defEstudiante2(Estudiante estudiante2){

        double defEstudiante2 = 0;
        defEstudiante2 = (estudiante2.getNota1() + estudiante2.getNota2() + estudiante2.getNota3()) / 3;
        return defEstudiante2;
    }

    //Método para calcular el promedio de notas del estudiante 3
    private static double defEstudiante3(Estudiante estudiante3){

        double defEstudiante3 = 0;
        defEstudiante3 = (estudiante3.getNota1() + estudiante3.getNota2() + estudiante3.getNota3()) / 3;
        return defEstudiante3;
    }

    //Método para calcular la nota máxima del estudiante 1
    private static double calcularNotaMaxEst1(Estudiante estudiante1) {

        double notaMaxEst1 = estudiante1.getNota1();
        if (estudiante1.getNota2() > notaMaxEst1) {
            notaMaxEst1 = estudiante1.getNota2();
        }
        if(estudiante1.getNota3() > notaMaxEst1) {
            notaMaxEst1 = estudiante1.getNota3();
        }
        return notaMaxEst1;
    }

    //Método para calcular la nota máxima del estudiante 2
    private static double calcularNotaMaxEst2(Estudiante estudiante2) {

        double notaMaxEst2 = estudiante2.getNota1();
        if (estudiante2.getNota2() > notaMaxEst2) {
            notaMaxEst2 = estudiante2.getNota2();
        }
        if(estudiante2.getNota3() > notaMaxEst2) {
            notaMaxEst2 = estudiante2.getNota3();
        }
        return notaMaxEst2;
    }

    //Método para calcular la nota máxima del estudiante 3
    private static double calcularNotaMaxEst3(Estudiante estudiante3) {

        double notaMaxEst3 = estudiante3.getNota1();
        if (estudiante3.getNota2() > notaMaxEst3) {
            notaMaxEst3 = estudiante3.getNota2();
        }
        if (estudiante3.getNota3() > notaMaxEst3) {
            notaMaxEst3 = estudiante3.getNota3();
        }
        return notaMaxEst3;
    }

    //Método para calcular la nota mínima del estudiante 1
    private static double calcularNotaMinimaEst1(Estudiante estudiante1) {

        double notaMinimaEst1 = estudiante1.getNota1();
        if (estudiante1.getNota2() < notaMinimaEst1) {
            notaMinimaEst1 = estudiante1.getNota2();
        }
        if(estudiante1.getNota3() < notaMinimaEst1) {
            notaMinimaEst1 = estudiante1.getNota3();
        }
        return notaMinimaEst1;
    }

    //Método para calcular la nota mínima del estudiante 2
    private static double calcularNotaMinimaEst2(Estudiante estudiante2) {

        double notaMinimaEst2 = estudiante2.getNota1();
        if (estudiante2.getNota2() < notaMinimaEst2) {
            notaMinimaEst2 = estudiante2.getNota2();
        }
        if(estudiante2.getNota3() < notaMinimaEst2) {
            notaMinimaEst2 = estudiante2.getNota3();
        }
        return notaMinimaEst2;
    }

    //Método para calcular la nota mínima del estudiante 3
    private static double calcularNotaMinimaEst3(Estudiante estudiante3) {

        double notaMinimaEst3 = estudiante3.getNota1();
        if (estudiante3.getNota2() < notaMinimaEst3) {
            notaMinimaEst3 = estudiante3.getNota2();
        }
        if(estudiante3.getNota3() < notaMinimaEst3) {
            notaMinimaEst3 = estudiante3.getNota3();
        }
        return notaMinimaEst3;
    }
}