# Sistema Académico - Gestión de Calificaciones

Sistema de gestión académica desarrollado en Java, que permite registrar las calificaciones de un grupo de alumnos, calcular sus promedios y generar un informe general de resultados.

## Características

- Registro de calificaciones de múltiples alumnos.
- Almacenamiento de notas mediante matrices bidimensionales.
- Validación de notas dentro del rango permitido (0 a 10).
- Control de entradas no numéricas.
- Cálculo de suma total de calificaciones por alumno.
- Cálculo del promedio individual.
- Generación de un informe de calificaciones en consola.
- Cálculo del promedio general del curso.
- Presentación de resultados mediante tablas formateadas.

## Tecnologías utilizadas

- Java 17+
- Scanner
- Arrays unidimensionales y matrices bidimensionales.
- Estructuras de repetición (`for`, `while`).
- Estructuras condicionales (`if`).
- Manejo de excepciones (`try-catch`).
- Métodos y parámetros.
- Formateo de salida mediante `printf`.

## Configuración del sistema

El programa trabaja con una cantidad fija de alumnos y calificaciones:

| Parámetro           | Valor |
| ------------------- | ----: |
| Cantidad de alumnos |     4 |
| Notas por alumno    |     3 |
| Nota mínima         |     0 |
| Nota máxima         |    10 |

## Funcionamiento

1. Se solicita el ingreso de las calificaciones de cada alumno.
2. Se validan las notas ingresadas.
3. Se almacenan los valores en una matriz bidimensional.
4. Se calcula la suma total de las notas de cada alumno.
5. Se obtiene el promedio individual.
6. Se genera una tabla con las calificaciones y resultados.
7. Se calcula y muestra el promedio general del curso.

## Ejecución

Clonar el repositorio:

```bash
git clone https://github.com/ImBenja/SistemaEstudiantil
```

Ingresar al directorio del proyecto:

```bash
cd SistemaEstudiantil
```

Compilar:

```bash
javac App.java
```

Ejecutar:

```bash
java App
```

## Objetivo del proyecto

Este proyecto fue desarrollado con fines educativos para fortalecer los conocimientos de lógica de programación y fundamentos de Java, trabajando principalmente con matrices bidimensionales, arrays, estructuras de repetición, validaciones, métodos y procesamiento de datos.

## Autor

Desarrollado como parte de mi aprendizaje y práctica en Java.
