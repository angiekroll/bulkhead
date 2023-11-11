# PATRON ARQUITECTONICO BULKHEAD - DIPLOMADO EN ARQUITECTURA DE SOFTWARE 
# GRUPO 1

## Contenido
[Patron BulkHead](#bulkHead)

[Tecnologias](#tecnologias)

[Instalacion](#instalacion)

[Integrantes](#integrantes)

### <a name="ejercicio1"></a>
## BulkHead

El patrón Bulkhead es como dividir un barco en compartimentos (mamparos). En desarrollo de software, 
significa dividir un sistema en partes independientes para evitar que un fallo en una sección afecte a otras. 

si algo sale mal en alguna parte de la aplicación, las demás partes siguen funcionando sin problemas.

## Beneficios:

* Resilencia: Protege el sistema contra fallos en una parte específica.
* Aislamiento: Evita que un problema se propague a otras partes del sistema.
* Mejora del Rendimiento: Controla la concurrencia y mejora la estabilidad.


### <a name="tecnologias"></a>
## Tecnologias

* Java 17 (JDK 17)
  * [JDK Development Kit 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

### <a name="instalacion"></a>
## Instalacion

Para la istalación del proyecto:
-Clone el proyecto ejecutando el siguiente comando:
```bash
git clone git@github.com:angiekroll/bulkhead.git
```
- Abra el proyecto utilizando su IDE favorito. Asegúrese de lanzar dos instancias del proyecto en puertos diferentes, ya que, para este ejercicio, hemos incorporado en el mismo proyecto tanto los controladores del cliente como del servidor.
- Click Aquí para ver los pasos a seguir para configurar dos instancias en IntelliJ IDEA
- Ejecute la clase principal "Main" de cada instancia.


La ULR del proyecto es
- https://github.com/angiekroll/bulkhead

### <a name="integrantes"></a>
## Integrantes
- Angela Carolina Castillo Rodríguez
- Daniel Sebastian Leal Rodríguez
- Eliana Katherine Guerrero Guerrero
- Edward Augusto Ramirez Rodriguez
- Guillermo Danel Pulecio Gonzalez
- Juan Andres Perez Trejos
