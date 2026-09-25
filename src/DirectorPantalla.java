import java.util.Objects;

public class DirectorPantalla {
    private PantallaBuilder builder;

    public DirectorPantalla (PantallaBuilder builder) {
        this.builder = Objects.requireNonNull(builder, "El builder no puede ser null");
    }
    public void construirPantalla () {
        builder.construirTitulo();
        builder.construirCabecera();
        builder.construirContenido();
        builder.construirBoton();
    }

    public void setBuilder(PantallaBuilder builder) {
        this.builder = Objects.requireNonNull( builder,"El builder no puede ser null");
    }
}
