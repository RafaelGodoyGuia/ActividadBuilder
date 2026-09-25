# Actividad: Patrón de Diseño Builder

Este repositorio contiene la implementación práctica de la actividad sobre el patrón de diseño creacional **Builder** en Java. El objetivo principal es desacoplar el proceso de construcción de un objeto complejo (en este caso, una `Pantalla` de interfaz de usuario) de su representación particular, permitiendo que el mismo proceso de construcción pueda producir diferentes representaciones.

---

## 📌 1. Patrón Builder (GoF)

### Objetivo
Construir objetos complejos paso a paso guiados por un director, separando la lógica y el orden de ensamblado de los datos específicos que componen cada tipo de pantalla (`Perfil` y `Ajustes`).

---

### 🧩 Estructura y Componentes del Patrón

El diseño se compone de las partes fundamentales definidas por la especificación clásica del *Gang of Four* (GoF):

1. **Producto (`Pantalla`)**:
   Representa el objeto complejo resultante de la construcción. Contiene los elementos de la interfaz (`titulo`, `cabecera`, `contenido`, `botonPrincipal`), sus respectivos getters/setters y el método de visualización `mostrar()`.

2. **Builder Abstracto (`PantallaBuilder`)**:
   Interfaz que declara los pasos estándar necesarios para construir cualquier pantalla:
   ```java
   public interface PantallaBuilder {
       public void construirTitulo();
       public void construirCabecera();
       public void construirContenido();
       public void construirBoton();
       public Pantalla getPantalla();
   }
   ```

3. **Builders Concretos (`PerfilBuilder` y `AjustesBuilder`)**:
   Implementaciones que construyen y ensamblan las partes del producto concreto:
   * **Gestión de Ciclo de Vida y Reseteo (`reset`)**: Cada builder administra una instancia interna de `Pantalla` y, al entregarla en `getPantalla()`, reinicializa su estado interno para permitir reutilizaciones limpias sin fugas de estado mutable (*aliasing*).
   * **Ensamblado especializado**: Cada builder asigna sus propios textos y componentes temáticos a la pantalla.

4. **Director (`DirectorPantalla`)**:
   Clase responsable de orquestar la secuencia ordenada de montaje (la "receta"):
   ```java
   public void construirPantalla() {
       builder.construirTitulo();
       builder.construirCabecera();
       builder.construirContenido();
       builder.construirBoton();
   }
   ```
   * Permite inyectar el builder mediante constructor o cambiarlo en tiempo de ejecución a través de `setBuilder(PantallaBuilder builder)`, validando la no nulidad mediante `Objects.requireNonNull`.

5. **Cliente (`Main`)**:
   Configura el builder deseado, se lo entrega al director para orquestar la creación, recupera el producto final y lo muestra por consola.

---

### 💡 Principios de Diseño y Buenas Prácticas Aplicadas

* **Principio de Responsabilidad Única (SRP)**:
  * `DirectorPantalla` solo conoce el orden del algoritmo de construcción.
  * Los builders concretos solo conocen cómo ensamblar los datos de cada pantalla.
  * `Pantalla` solo se encarga de almacenar y mostrar su estado.
* **Principio Abierto/Cerrado (OCP)**: Se pueden añadir nuevas pantallas (como `LoginBuilder` o `DashboardBuilder`) creando nuevas clases que implementen `PantallaBuilder`, sin tocar el `Director` ni el código existente.
* **Principio de Inversión de Dependencias (DIP)**: `DirectorPantalla` depende de la abstracción `PantallaBuilder`, nunca de implementaciones concretas.

---

## 🚀 Compilación y Ejecución

Para compilar y ejecutar el proyecto desde la terminal:

```bash
# Compilar las clases en el directorio out
javac src/*.java -d out

# Ejecutar la clase principal
java -cp out Main
```

---
*Readme escrito por Antigravity CLI sobre el proyecto de Rafael Godoy Guía*
