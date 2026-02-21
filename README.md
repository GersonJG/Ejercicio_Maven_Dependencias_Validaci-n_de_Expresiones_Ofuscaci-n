# Ejercicio Maven_Dependencias_Validaci-n_de_Expresiones_Ofuscacion
## Arquitectura del Proyecto: 
- umg.edu.gt.data-structure.stack
- stackHandler
- Evidencia

## umg.edu.gt.data-structure.stack
Este project contiene los métodos qe permite crear pilas de manera local sin utilizar la libreria "Stack" de internet. Este package contiene 3 clases: 1. Node - 2. Stack y 3. SymbolValidator
Cada uno cumple una función diferente.

# Node 
<img width="361" height="268" alt="image" src="https://github.com/user-attachments/assets/715ca0fe-a46f-4d75-96f4-06aff761c0e4" />

En esta class se definen las propiedades que tendrán los nodos creados en la pila.

# Stack
<img width="644" height="581" alt="image" src="https://github.com/user-attachments/assets/e652e558-eece-4768-93a0-5c732111fc76" />

En este class se definen los metodos y funcionalidad que tendrá la pila como pop, push, peek para trabajar con los nodos en cada pila.

# SymbolValidator
<img width="749" height="543" alt="image" src="https://github.com/user-attachments/assets/c9413189-b096-4075-bd4f-986b62d43472" />

Este class contiene funciones que permite hacer una validación acerca de la entrada  y salida de elementos en la pila para resolver el problema de los signos de apertura y cierre.

## Stackhandler
<img width="767" height="573" alt="image" src="https://github.com/user-attachments/assets/f741cd6a-2b81-4457-89bb-bc603f8edf70" />

Es un pequeño programa que permite realizar validaciones de cadenas de caracteres enfocado en evaluar si una cada tiene una apertura y un cierre correcto dependiende de los simbolos "()", "{}" y "[]".

## Indicaciones de Instalación
# Paso 1:
Instala la libreria de manera local utilizando 
``` bash 
cd.data-structure.stack
mvn clean install
```
# Paso 2:
Instala el programa principal del stackhandlder
``` bash
cd ---/stackhandler
mvn clean package
```
# Paso 3:
El programa también puede ser ejecutado de la terminal utilizando comandos como:
``` bash
java -jar target/stackHandler-1.0.0-jar-with-dependencies.jar //Sin ningun argumento propio
java -jar target/stackHandler-1.0.0-jar-with-dependencies.jar "(a+b)*[c-d]" // agregando un elemento (String) propio
```

## Ofuscación 
El archivo del proyecto que se encuentra ofuscado fue realizado con la tecnología de YGuard. Puede ser decompilado con ingenieria inversa usando herramientas como CRF como lo hice en mi caso. 
Como se puede ver en las evidencia la ofuscación cambia como se pueden ver las variables a la hora de decompilar el proyecto, haciendo más complejo decifrar el sentido de cada una, pero en mi opinion con proyectos tan sencillos como este no afecta mucho debido a que se puede entender facilmente el uso de cada una de las variables en el codigo. Igualmente la ejecucion no tiene ningun problema por lo que
puede convertirse en una buena practica util para mantener a salvo nuestra propiedad intelectual.
También es posible ejecutar el archivo ofuscado sin decompilar desde la terminal y sigue funcionando de manera correcta como el ejemplo en las evidencias o luego de instalarlo utilizando el comando.
``` bash
java -jar target/stackHandler-1.0.0-jar-with-dependencies_obf.jar "(a+b)" //Con un elemento propio
``` 






