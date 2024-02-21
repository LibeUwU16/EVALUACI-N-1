/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_asignatura;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave, nombre, carrera;
        int creditos, ht, hp;
        boolean tipoMat;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura");
        clave = captu.nextLine();
        System.out.println("Introduce la nombre de la asignatura");
        nombre = captu.nextLine();
        System.out.println("Introduce la carrera de la asignatura");
        carrera = captu.nextLine();
        System.out.println("Introduce los créditos de la asignatura");
        creditos = captu.nextInt();
        System.out.println("Introduce las horas teoricas de la asignatura");
        ht = captu.nextInt();
        System.out.println("Introduce las horas de practica de la asignatura");
        hp = captu.nextInt();
        System.out.println("Introduce el tipo de asignatura");
        tipoMat = captu.nextBoolean();
        
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(ht);
        System.out.println(hp);
        System.out.println(tipoMat);
    }
    
}
