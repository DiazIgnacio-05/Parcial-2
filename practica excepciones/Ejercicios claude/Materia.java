public class Materia{
    private String materia;
    private int cupo;
    public Materia(String materia,int cupo){
        this.materia=materia;
        this.cupo=cupo;
    }
    public String getMateria(){return materia;}
    public int getCupo(){return cupo;}
    public void ocuparLugar() { cupo--; }
}