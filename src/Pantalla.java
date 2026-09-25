public class Pantalla {
    private String titulo;
    private String cabecera;
    private String contenido;
    private String botonPrincipal;

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo () {
        return (this.titulo);
    }

    public void setCabecera (String cabecera) {
        this.cabecera = cabecera;
    }

    public String getCabecera () {
        return (this.cabecera);
    }

    public void setContenido (String contenido) {
        this.contenido = contenido;
    }

    public String getContenido () {
        return (this.contenido);
    }

    public void setBotonPrincipal (String botonPrincipal) {
        this.botonPrincipal = botonPrincipal;
    }

    public String getBotonPrincipal () {
        return (this.botonPrincipal);
    }

    public void mostrar() {
        System.out.println("---Pantalla---");
        System.out.println("Título: " + this.titulo);
        System.out.println("Cabecera: " + this.cabecera);
        System.out.println("Contenido: " + this.contenido);
        System.out.println("Botón principal: " + this.botonPrincipal);
    }
}
