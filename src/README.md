# Tree-Stock - Árbol Binario de Búsqueda en Java

Sistema de inventario desarrollado en Java para aplicar el concepto de **árbol binario de búsqueda (ABB)** mediante nodos manuales y recursividad.

## Objetivo

Comprender cómo funciona un árbol binario de búsqueda y aplicarlo en un sistema de inventario sencillo que permita:

- Registrar productos
- Mostrar el inventario ordenado
- Buscar un producto por ID

## Estructura del proyecto

El proyecto está dividido estrictamente en tres clases:

- `Producto.java` → representa cada nodo del árbol
- `ArbolInventario.java` → contiene la lógica recursiva del árbol
- `Main.java` → contiene el menú interactivo

## Concepto aplicado

En un árbol binario de búsqueda:

- los valores menores se ubican a la izquierda
- los valores mayores se ubican a la derecha

Esto permite que la búsqueda sea rápida y que el recorrido **inorden** muestre los datos ordenados.

## Métodos principales

### Insertar
Ubica un producto según su ID usando recursividad.

### Buscar
Localiza un producto comparando el ID ingresado con el nodo actual.

### Recorrido inorden
Muestra el inventario ordenado de menor a mayor.

## Cómo ejecutar

Abrir la terminal dentro de la carpeta `src` y ejecutar:

```bash
javac *.java
java Main
```

## Ejemplo de uso

1. Registrar un producto con ID y nombre
2. Mostrar inventario
3. Buscar un producto por ID

## Capturas de pantalla

Agrega aquí capturas de:

- menú principal
- inserción de producto
- búsqueda de producto
- recorrido inorden

## Video de sustentación

Agrega aquí el enlace del video individual de sustentación:

- **Link del video:** `PEGAR_ENLACE_AQUI`

## Repositorio GitHub

Agrega aquí el enlace del repositorio público:

- **Repositorio:** `PEGAR_ENLACE_AQUI`

## Autor

Proyecto académico de estructuras de datos.
