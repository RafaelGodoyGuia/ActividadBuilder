public class PerfilBuilder implements PantallaBuilder{
    private Pantalla pantalla;

    public PerfilBuilder () {
        this.reset();
    }

    public void reset () {
        this.pantalla = new Pantalla();
    }

    @Override
    public void construirTitulo () {
        pantalla.setTitulo("Perfil");
    }
    @Override
    public void construirCabecera () {
        pantalla.setCabecera("Perfil del usuario");
    }
    @Override
    public void construirContenido () {
        pantalla.setContenido("Nombre - email - fotografía");
    }
    @Override
    public void construirBoton () {
        pantalla.setBotonPrincipal("Editar perfil");
    }
    @Override
    public Pantalla getPantalla () {
        Pantalla pantallaTerminada = this.pantalla;
        this.reset();
        return (pantallaTerminada);
    }
}
