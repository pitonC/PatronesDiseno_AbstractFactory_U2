# PatronesDiseno_AbstractFactory_U2

## Actividad de Evidencia 1 — Unidad 2: Patrón Abstract Factory

### Descripción

Este proyecto implementa el **Patrón de Diseño Abstract Factory** en Java.

El patrón **Abstract Factory** provee una interfaz para crear familias de objetos relacionados o dependientes **sin especificar sus clases concretas**. Permite que el código cliente sea independiente de cómo se crean, componen y representan los productos.

### Ejemplo: Fábrica de Componentes GUI

El ejemplo modela la creación de componentes de interfaz gráfica (`Button` y `Checkbox`) para dos familias/plataformas distintas: **Windows** y **macOS**.

### Estructura del Proyecto

```
src/
├── Main.java                              # Punto de entrada / demostración
└── abstractfactory/
    ├── products/
    │   ├── Button.java                    # Producto Abstracto
    │   ├── Checkbox.java                  # Producto Abstracto
    │   ├── WindowsButton.java             # Producto Concreto (Windows)
    │   ├── MacButton.java                 # Producto Concreto (Mac)
    │   ├── WindowsCheckbox.java           # Producto Concreto (Windows)
    │   └── MacCheckbox.java               # Producto Concreto (Mac)
    ├── factories/
    │   ├── GUIFactory.java                # Fábrica Abstracta
    │   ├── WindowsFactory.java            # Fábrica Concreta (Windows)
    │   └── MacFactory.java                # Fábrica Concreta (Mac)
    └── client/
        └── Application.java               # Cliente
```

### Diagrama de Clases

```
           «interface»
           GUIFactory
          /          \
 WindowsFactory    MacFactory
     |    |            |    |
     v    v            v    v
 WinBtn WinCbx     MacBtn MacCbx

  «interface»      «interface»
    Button           Checkbox
      ^                 ^
  WindowsButton    WindowsCheckbox
  MacButton        MacCheckbox
```

### Participantes

| Rol                  | Clase/Interfaz          |
|----------------------|-------------------------|
| Fábrica Abstracta    | `GUIFactory`            |
| Fábrica Concreta     | `WindowsFactory`        |
| Fábrica Concreta     | `MacFactory`            |
| Producto Abstracto   | `Button`                |
| Producto Abstracto   | `Checkbox`              |
| Producto Concreto    | `WindowsButton`         |
| Producto Concreto    | `MacButton`             |
| Producto Concreto    | `WindowsCheckbox`       |
| Producto Concreto    | `MacCheckbox`           |
| Cliente              | `Application`           |

### Compilación y Ejecución

Desde la raíz del proyecto:

```bash
# Compilar
javac -d out src/abstractfactory/products/*.java \
             src/abstractfactory/factories/*.java \
             src/abstractfactory/client/*.java \
             src/Main.java

# Ejecutar
java -cp out Main
```

### Salida Esperada

```
=== Patrón de Diseño: Abstract Factory ===

Sistema operativo detectado: macOS/Linux

--- Renderizando interfaz gráfica ---
[Mac] Renderizando botón con estilo macOS.
[Mac] Renderizando checkbox con estilo macOS.

--- Interactuando con la interfaz gráfica ---
[Mac] Botón presionado: ejecutando acción estilo macOS.
[Mac] Checkbox activado/desactivado: acción estilo macOS.

--- Demostración con ambas fábricas ---

>> Usando WindowsFactory:
--- Renderizando interfaz gráfica ---
[Windows] Renderizando botón con estilo Windows.
[Windows] Renderizando checkbox con estilo Windows.

--- Interactuando con la interfaz gráfica ---
[Windows] Botón presionado: ejecutando acción estilo Windows.
[Windows] Checkbox activado/desactivado: acción estilo Windows.

>> Usando MacFactory:
--- Renderizando interfaz gráfica ---
[Mac] Renderizando botón con estilo macOS.
[Mac] Renderizando checkbox con estilo macOS.

--- Interactuando con la interfaz gráfica ---
[Mac] Botón presionado: ejecutando acción estilo macOS.
[Mac] Checkbox activado/desactivado: acción estilo macOS.
```

### Ventajas del Patrón Abstract Factory

- **Compatibilidad** entre productos de la misma familia está garantizada.
- **Principio Abierto/Cerrado**: agregar nuevas familias (ej. Linux) no requiere modificar el cliente.
- **Principio de Inversión de Dependencias**: el cliente depende de abstracciones, no de clases concretas.
