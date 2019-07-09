/**
        FECHA MARTES 9 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :UN ALUMNO QUIERE SABER CUAL SERA SU CALIFICACION FINAL EN LA MATERIA DE ALGORITMOS
        SE COMPONE DE LOS SIGUIENTE :

        • 55% DEL PROMEDIO DE SUS 3 CALIFICACIONES .
        • 30% DE LA CALIFICACION DEL EXAMEN FINAL.
        • 15% DE LA CALIFICACION DE UN TRABAJO FINAL.
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO     
 */
public class Operaciones {
    float parcial1;
    float parcial2;
    float parcial3;
    float examen;
    float trabajo;

    public Operaciones(float parcial1, float parcial2, float parcial3, float examen, float trabajo) {
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.examen = examen;
        this.trabajo = trabajo;
    }

    public float getParcial1() {
        return parcial1;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public float getParcial2() {
        return parcial2;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float getParcial3() {
        return parcial3;
    }

    public void setParcial3(float parcial3) {
        this.parcial3 = parcial3;
    }

    public float getExamen() {
        return examen;
    }

    public void setExamen(float examen) {
        this.examen = examen;
    }

    public float getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(float trabajo) {
        this.trabajo = trabajo;
    }
    
    public float promedioParcial(float parcial1,float parcial2,float parcial3){
        float promedioP,pParcial;
        promedioP=(parcial1+parcial2+parcial3)/3;
        pParcial=promedioP*0.55f;
        return pParcial;
    }
    public float promedioExamen(float examen){
        float promedioE;
        
        promedioE=examen*0.30f;
        
        return promedioE;
    }
    public float promedioTrabajo(float trabajo){
        float promedioT=0;
        
        promedioT=trabajo*0.15f;
        
        return promedioT;
    }
    
    public float calificacionFinal(float pParcial,float promedioE,float promedioT){
        float promedioF;
        
        promedioF=pParcial+promedioE+promedioT;
        
        return promedioF;
    }
    public void imprimirR(float promedioF){
        
        System.out.println("promedio :"+promedioF);
    }
}
