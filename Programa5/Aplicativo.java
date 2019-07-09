import java.util.Scanner;

/**
        FECHA MARTES 9 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :  CALCULAR LA CANTIDAD DE SEGUNDOS que QUE ESTAN INCLUIDOS EN EL NUMERO DE HORAS,
        MINUTOS Y SEGUNDOS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas=0,minutos=0,segundos=0,tiempo1=0,tiempo2=0,tiempo3=0,total=0;
        Operaciones obj1= new Operaciones(horas, minutos, segundos);
        
        
        horas=obj1.getHoras();
        minutos=obj1.getMinutos();
        segundos=obj1.getSegundos();
        
        System.out.println("Diguite cantidad de horas :");
        horas=entrada.nextInt();
        System.out.println("Diguite cantidad de minutos :");
        minutos=entrada.nextInt();
        System.out.println("Diguite cantidad de segundos :");
        segundos=entrada.nextInt();
        
        tiempo1=obj1.calcularH(horas);
        tiempo2=obj1.calcularM(minutos);
        tiempo3=obj1.calcularS(segundos);
        total=obj1.totalOp(tiempo1, tiempo2, tiempo3);
        obj1.imprimirV(total);
    }
    
}
