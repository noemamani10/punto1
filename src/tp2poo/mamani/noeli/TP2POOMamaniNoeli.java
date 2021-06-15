
package tp2poo.mamani.noeli;

import java.util.Scanner;


public class TP2POOMamaniNoeli {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        int op=0;
        do {
                System.out.println("*****Menu*****");
                System.out.println("1) Mayor ");
                System.out.println("2) Palabra ");
                System.out.println("3) Segundos ");
                System.out.println("4) Matriz ");
                System.out.println("5) Salir ");
                System.out.print("Ingrese una opcion: ");
                op = leer.nextInt(); 
                switch(op){
                    case 1:
                        
                        int num1,num2,num3;
                        int nummayor;
                        System.out.println("Ingrese 3 numeros enteros");
                          num1=leer.nextInt();
                          num2=leer.nextInt();
                          num3=leer.nextInt();
                          nummayor=num1>num2?num1:num2;
                          nummayor=nummayor>num3?nummayor:num3;
                          System.out.println("El n° mayor es: "+nummayor);
                        break;
                    case 2:
                       int vocales = 0,consonantes = 0, totalCons,total;
                       String palabra;
                       boolean bandera = true;
                       do{
                        System.out.println("Ingrese una Letra 'Precione la Barra Espaciadora Para Salir'");
                        palabra = leer.nextLine();
                        for (int i = 0; i < palabra.length(); i++) {
                            if (palabra.charAt(i) == ' ') {
                                --consonantes;                       
                                bandera = false;
                            }
                        }
                        for (int i = 0; i < palabra.length(); i++) {
                            consonantes++;
                        }
                        for (int i = 0; i < palabra.length(); i++) {
                            if ((palabra.charAt(i) == 'a')|| (palabra.charAt(i) == 'A') ||
                               (palabra.charAt(i) == 'e') || (palabra.charAt(i) == 'E') ||
                               (palabra.charAt(i) == 'i') || (palabra.charAt(i) == 'I') ||
                               (palabra.charAt(i) == 'o') || (palabra.charAt(i) == 'O') ||
                               (palabra.charAt(i) == 'u') || (palabra.charAt(i) == 'U')){
                                vocales++;
                            }
                        }
                         totalCons = consonantes - vocales;
                         total = totalCons + vocales;
                    }while(bandera == true);
                      System.out.println("El total de letras es de: " + total);
                      System.out.println("Total de consonantes: " + totalCons);
                      System.out.println("Total de vocales: " + vocales);
                    break;
                    case 3:
                        int hora,minutos,segundos;
                        boolean tiempo = true;
                        do{
                        System.out.print("Ingrese hora: ");
                          hora=leer.nextInt();
                          if (hora>=1 && hora<= 24){
                              tiempo = false;
                          }else{
                              System.out.println("la hora ingresada no es valida");
                          }
                          }while(tiempo == true);
                       do{
                         System.out.print("Ingrese los minutos: ");
                         minutos = leer.nextInt();
                        if (minutos >= 0 && minutos <= 59) {
                            tiempo = true;
                        }else{
                            System.out.println("Los minutos ingresados no son validos");
                        }
                    }while(tiempo == false);
                     do{
                         System.out.print("Ingrese los segundos: ");
                         segundos = leer.nextInt();
                        if (segundos >= 0 && segundos <= 59) {
                            tiempo = false;
                        }else{
                            System.out.println("Porfavor Ingrese Segundos validos");
                        }
                    }while(tiempo == true);
                    System.out.println("La hora ingresada es: " + hora + ":" + minutos + ":" + segundos);
                    if(segundos == 0 && minutos == 0){
                        minutos = 59;
                        segundos = 59;
                        --hora;
                    }else if (segundos == 0){
                        segundos = 59;
                        --minutos;
                    }else{
                        --segundos;
                    }
                    System.out.println("Menos un segundo: "+ hora + ":" + minutos + ":" + segundos);
                    break;
                    case 4:
                        int matriz[][],nroFila,nroCol;
                        System.out.println("ingrese el numero de filas: ");
                        nroFila = leer.nextInt();
                        System.out.println("ingrese el numero de columnas: ");
                        nroCol = leer.nextInt();
                        matriz = new int [nroFila] [nroCol];
                        for (int i = 0; i < nroFila; i++) {
                            for (int j = 0; j < nroCol; j++) {
                                System.out.print("Matriz [" + i +"]" + "[" + j +"]: ");
                            matriz [i] [j] = leer.nextInt();
                        }
                    }       
                    System.out.println("Matriz A");
                    for (int i = 0; i < nroFila; i++) {
                        for (int j = 0; j < nroCol; j++) {
                            System.out.print(" [ "+ matriz [i][j]+" ] ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("Matriz Resultado");
                    for (int i = 0; i < nroFila; i++) {
                        for (int j = 0; j < nroCol; j++) {
                            if(matriz [i][j] == 0){
                                System.out.print("[ "+ matriz [i][j]+ " ]");
                            }else{
                                System.out.print("[ocup]");
                            }
                        }
                        System.out.println(" ");
                    }
                        break;
                     case 5:
                        System.out.println("termino la ejecucion");
                        break;
                     default:
                        System.out.println("Opcion Incorrecta\n");                        
                }
        } while (op !=5);
    }
    
}
