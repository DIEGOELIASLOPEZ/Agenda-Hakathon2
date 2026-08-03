<h1 align="center">Agenda de Contactos - Hackathon Java</h1>

<p align="center">
    <img src="https://img.shields.io/badge/Versi%C3%B3n-1.0.0-901e28?style=for-the-badge" alt="Version">
    <img src="https://img.shields.io/badge/Estado-Finalizado-d9bc9a?style=for-the-badge&logoColor=black" alt="Status">
    <img src="https://img.shields.io/badge/Tecnolog%C3%ADa-Java-8f9476?style=for-the-badge&logo=openjdk&logoColor=white" alt="Tech">
</p>

<p align="center">
    <i>Aplicación interactiva de consola desarrollada en Java para la gestión, control y optimización de agendas telefónicas con manejo dinámico de datos.</i>
</p>

<hr style="border: 1px solid #ae825b;">

## 🎯 Misión del Proyecto

Crea un sistema interactivo por consola que permita gestionar una agenda telefónica eficientemente, cumpliendo con los siguientes requerimientos fundamentales:

* **Estructura del Contacto:** Un contacto está definido por un `nombre` y un `teléfono`.
* **Criterio de Igualdad:** Un contacto se considera igual a otro cuando sus nombres coinciden (ignora mayúsculas/minúsculas).
* **Colección / Estructura de Datos:** La agenda de contactos está formada por un conjunto de contactos gestionado bajo colecciones optimizadas en Java.
* **Capacidad Flexible:** Se puede instanciar indicando un tamaño personalizado o utilizar un tamaño predeterminado por defecto (10 contactos).

---

## ⚙️ Métodos y Funcionalidades de la Agenda

La aplicación incluye un **menú interactivo en consola** que permite probar y validar todas las funcionalidades del sistema:

<table align="center" width="100%">
<tr>
<td width="50%" valign="top">
<b>📥 Operaciones de Contacto</b><br><br>
<ul>
    <li><b><code>añadirContacto(Contacto c)</code>:</b> Añade un contacto a la agenda. Si la agenda está llena, lo notifica por pantalla. Evita duplicados (mismo nombre).</li>
    <li><b><code>buscaContacto(String nombre)</code>:</b> Busca un contacto por su nombre y muestra su teléfono asociado.</li>
    <li><b><code>eliminarContacto(Contacto c)</code>:</b> Elimina el contacto de la agenda e indica si la operación fue exitosa.</li>
</ul>
</td>
<td width="50%" valign="top">
<b>📊 Estado y Consultas</b><br><br>
<ul>
    <li><b><code>listarContactos()</code>:</b> Muestra la lista completa de contactos en la agenda.</li>
    <li><b><code>existeContacto(Contacto c)</code>:</b> Verifica si un contacto existe o no.</li>
    <li><b><code>agendaLlena()</code>:</b> Indica si la agenda ha alcanzado su capacidad máxima.</li>
    <li><b><code>espaciosLibres()</code>:</b> Consulta cuántos contactos más se pueden registrar.</li>
</ul>
</td>
</tr>
</table>

---

## 🛠️ Herramientas de Construcción (Tech Stack)

<div align="center">

| ☕ Lenguaje Principal | 💻 Entorno y Herramientas |
| :---: | :---: |
| <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" /> | <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" /><br/><img src="https://img.shields.io/badge/Terminal_/_Console-4D4D4D?style=for-the-badge&logo=windows-terminal&logoColor=white" /> |

</div>

<p align="center">
    <i>Desarrollado bajo principios de Programación Orientada a Objetos (POO), manejo de estructuras de datos y secuencias de escape ANSI para interfaz visual en consola.</i>
</p>

---

## 📂 Arquitectura del Directorio

```text
Agenda/
└── src/
    └── org/
        └── generation/
            └── hakathon2/
                ├── agenda/       # Lógica del HashMap / Array de la Agenda
                ├── contact/      # Clase Modelo Contacto
                ├── exceptions/   # Manejo de excepciones personalizadas
                ├── main/         # Punto de entrada (Main.java)
                ├── service/      # Servicios y lógica de negocio
                └── style/        # Estilos, colores ANSI y formato de consola
```
---
## 💻 Instalación y Ejecución desde Terminal

Sigue estos pasos para clonar, compilar y ejecutar el proyecto directamente en tu equipo:

### 1️⃣ Clonar el Repositorio
```git clone https://github.com/DIEGOELIASLOPEZ/Agenda-Hakathon2.git```
### 2️⃣ Navegar a la carpeta src
```cd Agenda/src```
3️⃣ Compilar el Proyecto
Windows (PowerShell):
```javac -encoding UTF-8 (Get-ChildItem -Recurse -Filter *.java).FullName```

PowerShell
```javac -encoding UTF-8 (Get-ChildItem -Recurse -Filter *.java).FullName```
macOS / Linux / Windows CMD:

4️⃣ Ejecutar la Aplicación
Windows (PowerShell):

PowerShell
```java "-Dfile.encoding=UTF-8" org.generation.hakathon2.main.Main```
macOS / Linux / Windows CMD:

```java -Dfile.encoding=UTF-8 org.generation.hakathon2.main.Main```
