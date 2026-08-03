<h1 align="center">📒 Agenda de Contactos - Hackathon Java</h1>

<p align="center">
    <img src="https://img.shields.io/badge/Versión-1.0.0-901e28?style=for-the-badge" alt="Version">
    <img src="https://img.shields.io/badge/Estado-Finalizado-d9bc9a?style=for-the-badge&logoColor=black" alt="Status">
    <img src="https://img.shields.io/badge/Tecnología-Java-8f9476?style=for-the-badge&logo=openjdk&logoColor=white" alt="Tech">
</p>

<p align="center">
    <i>Aplicación interactiva de consola desarrollada en Java para la gestión, control y administración de una agenda telefónica mediante estructuras de datos y Programación Orientada a Objetos.</i>
</p>

---

# 🎯 Misión del Proyecto

Desarrollar una aplicación de consola que permita gestionar una agenda de contactos de manera eficiente.

### Características principales

- Cada contacto posee un **nombre** y un **teléfono**.
- Dos contactos se consideran iguales cuando tienen el mismo nombre (sin distinguir mayúsculas y minúsculas).
- La agenda utiliza colecciones de Java para almacenar la información.
- Puede crearse indicando una capacidad personalizada o utilizar la capacidad predeterminada de **10 contactos**.

---

# ⚙️ Funcionalidades

La aplicación cuenta con un menú interactivo desde consola para administrar la agenda.

<table align="center" width="100%">
<tr>

<td width="50%" valign="top">

### 📥 Gestión de contactos

- `añadirContacto(Contacto contacto)`
- `buscaContacto(String nombre)`
- `eliminarContacto(Contacto contacto)`

</td>

<td width="50%" valign="top">

### 📊 Consultas

- `listarContactos()`
- `existeContacto(Contacto contacto)`
- `agendaLlena()`
- `espaciosLibres()`

</td>

</tr>
</table>

---

# 🛠️ Tecnologías Utilizadas

<div align="center">

| Lenguaje | Herramientas |
|:---:|:---:|
| <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/> | <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white"/><br><img src="https://img.shields.io/badge/Terminal-4D4D4D?style=for-the-badge&logo=windows-terminal&logoColor=white"/> |

</div>

<p align="center">
<i>Implementado utilizando Programación Orientada a Objetos (POO), colecciones de Java y secuencias ANSI para mejorar la experiencia visual en consola.</i>
</p>

---

# 📂 Estructura del Proyecto

```text
Agenda-Hakathon2/
└── src/
    └── org/
        └── generation/
            └── hakathon2/
                ├── agenda/
                ├── contact/
                ├── exceptions/
                ├── main/
                ├── service/
                └── style/
```

---

# 💻 Instalación y Ejecución

## 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/DIEGOELIASLOPEZ/Agenda-Hakathon2.git
```

## 2️⃣ Entrar al proyecto

```bash
cd Agenda-Hakathon2/src
```

---

## 3️⃣ Compilar el proyecto

### 🪟 Windows (PowerShell)

```powershell
javac -encoding UTF-8 (Get-ChildItem -Recurse -Filter *.java).FullName
```

### 🪟 Windows (CMD)

```cmd
for /R %f in (*.java) do @echo %f > sources.txt
javac -encoding UTF-8 @sources.txt
del sources.txt
```

### 🍎 macOS / 🐧 Linux

```bash
find . -name "*.java" > sources.txt
javac -encoding UTF-8 @sources.txt
rm sources.txt
```

---

## 4️⃣ Ejecutar la aplicación

### 🪟 Windows (PowerShell)

```powershell
java "-Dfile.encoding=UTF-8" org.generation.hakathon2.main.Main
```

### 🪟 Windows (CMD)

```cmd
java -Dfile.encoding=UTF-8 org.generation.hakathon2.main.Main
```

### 🍎 macOS / 🐧 Linux

```bash
java -Dfile.encoding=UTF-8 org.generation.hakathon2.main.Main
```
---

# 👨‍💻 Autores

**Diego Elías López Martínez**

---

<p align="center">
⭐ Si este proyecto te resultó útil, considera dejar una estrella al repositorio.
</p>
