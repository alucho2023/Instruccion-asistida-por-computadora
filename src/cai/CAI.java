package cai;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * UNIVERSIDAD TÉCNICA DE MANABÍ
 *
 * @author Segundo Wilfrido Alucho 
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 */

public class CAI {

    private int correcto;
    private int dificultad;
    private int respuesta;
    private int tipo;
    private int estrespuesta;
    private int num1;
    private int num2;

    public CAI() {
        this.correcto = 0;
        this.dificultad = 0;
        this.respuesta = 0;
        this.tipo = 0;
        this.estrespuesta = 0;
        this.num1 = 0;
        this.num2 = 0;

    }

    public CAI(int correcto, int dificultad, int respuesta, int estrespuesta, int tipo, int num1, int num2) {
        this.correcto = correcto;
        this.dificultad = dificultad;
        this.respuesta = respuesta;
        this.estrespuesta = estrespuesta;
        this.tipo = tipo;
        this.num1 = num1;
        this.num2 = num2;

    }

    public int getCorrecto() {
        return correcto;
    }

    public void setCorrecto(int correcto) {
        this.correcto = correcto;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getEstrespuesta() {
        return estrespuesta;
    }

    public void setEstrespuesta(int estrespuesta) {
        this.estrespuesta = estrespuesta;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void instruccionespc() {

        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("                    INSTRUCCION ASISTIDA POR COMPUTADORA -CAI-(+,-,*,/)");
            System.out.println("Ingrese el NIVEL DE DIFICULTAD (1, 2, 3 o 4): ");
            System.out.println("(1 significa que el programa utilizara solo numeros de un digito en los problemas; ");
            System.out.println("un nivel 2 significa que el programa utilizara numeros de dos digitos maximo, y asi en lo sucesivo)");
            dificultad = input.nextInt();
            System.out.println("Ingrese el tipo de problema aritmetico (1 para suma, 2 para resta, 3 para multiplicacion, 4 para division o 5 para mezcla): ");
            System.out.println("1. SUMA (+)");
            System.out.println("2. RESTA (-)");
            System.out.println("3. MULTIPLICACION (*)");
            System.out.println("4. DIVISION (/)");
            System.out.println("5. MISCELANEA (Mezcla de todas las operaciones)");
                        tipo = input.nextInt();
            int mNum = 0;

            switch (dificultad) {
                case 1:
                    mNum = 10;
                    break;
                case 2:
                    mNum = 100;
                    break;
                case 3:
                    mNum = 1000;
                    break;
                case 4:
                    mNum = 10000;
                    break;
            }

            for (int i = 0; i < 10; i++) {
                int num1 = random.nextInt(mNum);
                int num2 = random.nextInt(mNum);

                
                switch (tipo) {
                    case 1:
                        respuesta = num1 + num2;
                        System.out.printf("¿Cuanto es %d + %d? ", num1, num2);
                        break;
                    case 2:
                        respuesta = num1 - num2;
                        System.out.printf("¿Cuanto es %d - %d? ", num1, num2);
                        break;
                    case 3:
                        respuesta = num1 * num2;
                        System.out.printf("¿Cuanto es %d x %d? ", num1, num2);
                        break;
                    case 4:
                        respuesta = num1 / num2;
                        System.out.printf("¿Cuanto es %d / %d? ", num1, num2);
                        break;
                    case 5:
                        respuesta = ((num1 + num2) * (num1 - num2)) / num1;
                        System.out.printf("Cuanto es (%d + %d) * (%d - %d) / %d%% ?", num1, num2, num1, num2, num1);

                        break;
                    default:
                        respuesta = 0;
                }

                

}

    

