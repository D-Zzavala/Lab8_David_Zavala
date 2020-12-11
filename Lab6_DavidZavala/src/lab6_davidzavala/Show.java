package lab6_davidzavala;

public class Show {

    private String Nombre;
    private int Puntuacion;
    private int Año;
    private String Tipo;
    private String Genero;

    public Show() {
    }

    public Show(String Nombre, int Puntuacion, int Año, String Tipo, String Genero) {
        this.Nombre = Nombre;
        this.Puntuacion = Puntuacion;
        this.Año = Año;
        this.Tipo = Tipo;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int Puntuacion) {
        this.Puntuacion = Puntuacion;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Puntuacion: " + Puntuacion + ", A\u00f1o: " + Año + ", Tipo: " + Tipo + ", Genero: " + Genero;
    }
    
    
}
