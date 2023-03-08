package exercices;

public class GatoPolicia extends Gato{
    private String comisaria;

    public GatoPolicia(String nombre, int edad, String comisaria)
            throws GatoException {
        super(nombre, edad);
        this.comisaria = comisaria;
    }
}
