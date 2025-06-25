package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ
        LogicaClasificacion lg = new LogicaClasificacion();
        Queue<String> entrada = new LinkedList<>(Arrays.asList("Ana", "Luis", "Pedro"));     

        System.out.println("Cola original [Ana, Luis, Pedro, ] | " + lg.invertirColaNombres(entrada));

        

    }
}
