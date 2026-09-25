//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PantallaBuilder perfilBuilder = new PerfilBuilder();
        DirectorPantalla director = new DirectorPantalla(perfilBuilder);
        director.construirPantalla();
        Pantalla pantallaPerfil = perfilBuilder.getPantalla();
        pantallaPerfil.mostrar();

        System.out.println("\n\n");

        PantallaBuilder ajustesBuilder = new AjustesBuilder();
        director.setBuilder(ajustesBuilder);
        director.construirPantalla();
        Pantalla pantallaAjustes = ajustesBuilder.getPantalla();
        pantallaAjustes.mostrar();
    }
}