Utilizamos la librería de java cup.jar para generar un analizador sintáctico ascendente
este tipo de analizadores no se pueden generar manualmente ya que cada vez que se diera 
un cambio en la gramática habría que generar unas tablas de análisis. La herramienta CUP automatiza el proceso. 

Necesitamos un archivo de extensión '.cup' en el que definiremos la gramática a analizar, definiremos los terminales 
(clases léxicas), no terminales y reglas de la gramática.

Después con el archivo 'cup.jar' ejecutaremos la siguiente orden en consola:

	java -cp cup.jar java_cup.Main analizadorCUP.cup

O esta si queremos un nombre concreto para la clase del analizador y unidades léxicas.

	Java –cp cup.jar java_cup.Main –parser <nombre del parser> -symbols <nombre de la
	clase con las constantes para las clases léxicas> -nopositions <archivo cup> 

Con esto obtendremos el analizador sintáctico ascendente.

Para el analizador léxico utilizaremos la herramienta de la práctica 2: JLex.
El procedimiento es exactamente el mismo, solo hay que añadir la siguiente linea
al archivo de extension '.lex': %cup. Esto adaptará el resultado al uso de Java CUP.

Después como en la práctica 2 una vez tengamos el archivo jlex.jar y el archivo de extension .lex donde
definiremos los tokens a analizar por el analizador léxico, en la consola ejecutaremos la siguiente orden:

	java -cp jlex.jar JLex.Main anlexico.l

El cual nos devolverá la clase del analizador léxico.