/**
      FECHA MARTES 9 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :  CALCULAR LA CANTIDAD DE SEGUNDOS que QUE ESTAN INCLUIDOS EN EL NUMERO DE HORAS,
        MINUTOS Y SEGUNDOS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 
 */
public class Operaciones {
    private int horas;
    private int minutos;
    private int segundos;

    public Operaciones(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public int calcularH (int horas){
        int tiempo1;
        
        tiempo1 =horas*3600;
        
        return tiempo1;
    }
    public int calcularM (int minutos){
        int tiempo2;
        
        tiempo2 =minutos*60;
        
        return tiempo2;
    }
    public int calcularS (int segundos){
        int tiempo3;
        
        tiempo3 =segundos*1;
        
        return tiempo3;
    }
    public int totalOp(int tiempo1,int tiempo2,int tiempo3){
        int total;
        
        total=tiempo1+tiempo2+tiempo3;
        
        return total;
    }
    
    public void imprimirV(int total){
        
        System.out.println(""+total);
    }
}
