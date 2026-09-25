public class AjustesBuilder implements PantallaBuilder {
    public Pantalla pantalla;

    public AjustesBuilder () {
        this.reset();
    }

    public void reset () {
        this.pantalla = new Pantalla();
    }
    @Override
    public void construirTitulo () {
        pantalla.setTitulo("Ajustes");
    }
    @Override
    public void construirCabecera () {
        pantalla.setCabecera("Configuración de la aplicación");
    }
    @Override
    public void construirContenido () {
        pantalla.setContenido("Idioma - Tema - Notificaciones");
    }
    @Override
    public void construirBoton () {
        pantalla.setBotonPrincipal("Guardar cambios");
    }
    @Override
    public Pantalla getPantalla () {
        Pantalla pantallaTerminada = this.pantalla;
        this.reset();
        return (pantallaTerminada);
    }
}
