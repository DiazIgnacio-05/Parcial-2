

public class Inscripcion{
    private Materia[] materias;
    public Inscripcion(Materia[] materias){
        this.materias=materias;
    }
    public void inscribir(String nombre)throws MateriaInexistenteException,CupoCompletoException{
        for(Materia m : materias){
            if(m.getMateria().equals(nombre)){
                if(m.getCupo()== 0){
                    throw new CupoCompletoException("Sin cupo en: " + nombre);
                }
            m.ocuparLugar();
            System.out.println("Inscripto en " + nombre);
                return;
            }
        }
        throw new MateriaInexistenteException("No existe la materia " + nombre);
    }
}