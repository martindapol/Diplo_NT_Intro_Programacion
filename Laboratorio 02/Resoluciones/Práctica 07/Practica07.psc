Algoritmo Practica07
	Definir num,centena,decena,unidad Como Entero
	// Entrada:
	Escribir 'Ingresar un número entero de 3 cifras: '
	Leer num
	// Proceso:
	centena <- trunc(num/100)
	decena <- trunc((num MOD 100)/10)
	unidad <- trunc((num MOD 100) MOD 10)
	// Salidas:
	Escribir 'Centena: ',centena
	Escribir 'Decena: ',decena
	Escribir 'Unidad: ',unidad
FinAlgoritmo

