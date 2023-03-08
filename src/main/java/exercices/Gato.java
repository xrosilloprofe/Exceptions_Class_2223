package exercices;

/**
 * Implementa una clase Gato con los atributos nombre y edad, un constructor con parámetros,
 *  *   los getters y setters, además del método toString() para mostrar los datos de un gato.
 *  *   El nombre de un gato debe tener al menos 3 caracteres y la edad no puede ser negativa.
 *  *   Por ello, tanto en el constructor como en los setters, deberás comprobar que los valores sean válidos
 *  *   y lanzar una ‘Exception’ si no lo son.
 */
public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad)  throws GatoException {
        if(nombre.length()<3)
            throw new GatoException("Nombre de gato incorrecto");
        if(edad<0)
            throw new GatoException("Edad del gato incorrecta");
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws GatoException {
        if(nombre.length()<3)
            throw new GatoException("Nombre de gato incorrecto");
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws GatoException {
        this.edad = edad;
        if(edad<0)
            throw new GatoException("Edad del gato incorrecta");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
