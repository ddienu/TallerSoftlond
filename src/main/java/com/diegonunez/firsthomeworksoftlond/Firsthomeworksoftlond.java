/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.diegonunez.firsthomeworksoftlond;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ddienu
 */
public class Firsthomeworksoftlond {

    public static void main(String[] args) {
        /*1. Realiza un programa que solicite al usuario dos números enteros
        y muestre su suma, resta, multiplicación y división.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer valor entero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Ingrese el segundo valor entero: ");
        int num2 = scan.nextInt();
        
        scan.close();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("La resta de los valores es: " + resta);
        System.out.println("La multiplicación de los valores es: "
        + multiplicacion);
        System.out.println("La división de los valores es: " + division);*/

 /*2. Escribe un programa que pida al usuario un número entero y determine 
        si es par o impar.
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num1 = scan.nextInt();
        
        scan.close();
        
        if( num1 % 2 == 0){
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número es impar");
        }*/
 /*3. Crea un programa que calcule y muestre el área y el 
        perímetro de un círculo. El usuario debe proporcionar 
        el radio del círculo.
 
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo en cm: ");
        double radio = scan.nextDouble();
 
        scan.close();
 
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
 
        double perimetro = 2 * Math.PI * radio;
        String perimetro2Decimales = formatoDecimal.format(perimetro);
 
        double area = Math.PI * (Math.pow(radio, 2));
        String area2Decimales = formatoDecimal.format(area);
 
        System.out.println("El area del círculo es: " + area2Decimales + " cm^2");
 
        System.out.println("El perímetro del círculo es: " + perimetro2Decimales + " cm");*/
 /*4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();
        
        scan.close();
 
        String resultado = ( edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
 
        System.out.println(resultado);*/

 /*5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
    
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingrese el primer número: ");
        int num1 = scan.nextInt();
 
        System.out.println("Ingrese el segundo número: ");
        int num2 = scan.nextInt();
 
        scan.close();
 
        String resultado = "";
        
        if( num1 > num2 ){
            resultado = "El " + num1 + " es el mayor";
        }else if ( num1 == num2){
            resultado = "Los números son iguales";
        }else{
            resultado = "El " + num2 + " es el mayor";
        }
        
        System.out.println(resultado);
         */
 /*6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingrese un número: ");
        int num = scan.nextInt();
 
        String resultado = "";
 
        scan.close();
        
        if( num > 0){
            resultado = "El número es positivo";
        }else if( num < 0 ){
            resultado = "El número es negativo";
        }else{
            resultado = "El número es igual a cero";
        }
        
        System.out.println(resultado);
         */
 /*7. Crea un programa que pida al usuario un número entero positivo y muestre 
su tabla de multiplicar hasta el 10.
 
Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num = scan.nextInt();
 
        scan.close();
        
        for( int i = 1; i <= 10; i++ ){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
         */
 /*8. Realiza un programa que simule un juego de adivinar un número.
El programa debe generar un número aleatorio entre 1 y 100, 
y el usuario debe adivinarlo. El programa debe indicar si el número 
ingresado es mayor o menor que el número a adivinar.
 
     Scanner scan = new Scanner(System.in);
    
    int randomNumber = (int)Math.round(Math.random() * 100);
    System.out.println("Ingrese un número de 1 a 100: ");
    int userNumber  = 0;
    
    String resultado = "";
 
    scan.close();
    
    while ( userNumber != randomNumber)
    {
    userNumber = scan.nextInt();
    
    resultado = ( randomNumber > userNumber) ? "El número ingresado es menor" 
                                             : "El número ingresado es mayor";
    
    if ( userNumber == randomNumber)
    {
        System.out.println("Felicidades, encontraste el número.");
        break;
    }
        System.out.println(resultado);
    }
         */
 /*9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
     Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int num = scan.nextInt();
 
        scan.close();
        
        int factorial = 1;
        
        for ( int i = num; i >= 1; i--)
        {
            
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
         */
 /*10. Crea un programa que muestre los primeros 20 números de la 
serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores
para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
 
  ArrayList<Integer> fibonacciNums = new ArrayList<Integer>(); 
 
 int firstNumber = 0;
 int secondNumber = 1;
 
 int fibonacciLength = 20;
 
 scan.close();
 
 for( int i = 1; i <= fibonacciLength; i++)
 {
     fibonacciNums.add( firstNumber );
     int nextNumber = firstNumber + secondNumber;
     firstNumber = secondNumber;
     secondNumber = nextNumber;
 }
 
    System.out.println(fibonacciNums);

         */
 /*11. Escribe un programa que calcule el área de un triángulo utilizando la 
fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.
 
 Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer lado en cm: ");
        double ladoUno = scan.nextDouble();
        
        System.out.println("Ingrese el valor del segundo lado en cm: ");
        double ladoDos = scan.nextDouble();
        
        System.out.println("Ingrese el valor del tercer lado en cm: ");
        double ladoTres = scan.nextDouble();
 
        scan.close();
        
        double semiPerimetro = (ladoUno + ladoDos + ladoTres)/2;
        
        double area = Math.sqrt( (semiPerimetro * ( semiPerimetro - ladoUno)) 
        * ( semiPerimetro - ladoDos) * ( semiPerimetro - ladoTres) );
        
        DecimalFormat formatDecimal = new DecimalFormat("#.##");
        String areaTwoDecimals = formatDecimal.format( area );
        
        
        System.out.println("El área del triángulo es: " + areaTwoDecimals + " cm^2");
         */
 /*12. Realiza un programa que pida al usuario un número entero y determine 
si es un número primo o no
 
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        int num = scan.nextInt();

        String resultado = "";

        int count = 0;
        
        scan.close();
 
        if (num == 0 || num == 1) {
            resultado = num + " no es número primo";
        } else {
            for (int i = num; i >= 1; i--) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count > 2) {
                resultado = num + " no es un número primo";
            } else {
                resultado = num + " es un número primo";
            }
        }
        System.out.println(resultado);
 
         */
 /*13. Pide al usuario un número decimal y muestra su valor redondeado
a un número específico de decimales
 
  Scanner scan = new Scanner(System.in);
 
        System.out.println("Ingresa un número decimal: ");
        double num = scan.nextDouble();
        
        System.out.println("Ingresa el número de decimales que deseas: ");
        int decimals = scan.nextInt();
        
        scan.close();
 
        String argumento = "";
        switch ( decimals ){
            case 1: argumento = "#.#";
            break;
            case 2: argumento = "#.##";
            break;
            case 3: argumento = "#.###";
            break;
            case 4: argumento = "#.####";
            break;
            case 5: argumento = "#.#####";
            break;
            default: argumento = "#.##";
            break;
        }
        
        DecimalFormat numDecimals = new DecimalFormat( argumento );
        
        String numFiltered = numDecimals.format( num );
        
        System.out.println(num + " con " + decimals + " número(s) "
                + "decimal(es), es: " + numFiltered);
         */
 /*14. Escribe un programa que solicite al usuario un número entero positivo y 
verifique si es un número perfecto. Un número perfecto es aquel cuya suma 
de sus divisores propios (excluyendo al propio número) es igual al número.
 
         Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo: ");
        int num = scan.nextInt();

        int sum = 0;

        String resultado = "";
 
        scan.close();

        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num == sum) {
            resultado = "Es un número perfecto";
        } else {
            resultado = "No es un número perfecto";
        }

        System.out.println(resultado);

         */
 /*15. Crea un programa que pida al usuario un número entero y determine si 
es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda 
a derecha que de derecha a izquierda.
 
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        String num = scan.nextLine();
        
        String invertedNum = "";
        
        String resultado = "";
 
        scan.close();
        
        for( int i = num.length() - 1; i >= 0; i--){
            char letterByLetter = num.charAt(i);
            invertedNum += letterByLetter;
        }
        
        if( num.equals(invertedNum)){
            resultado = num + " es un número capicúa";
        }else{
            resultado = num + " no es un número capicúa";
        }
        
        System.out.println( resultado );

         */
 /*16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta
un número dado ingresado por el usuario.
 
         ArrayList<Integer> fibonacciNums = new ArrayList<Integer>();

        int firstNumber = 0;
        int secondNumber = 1;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el número limite para la serie de fibonacci: ");
        int fibonacciLength = scan.nextInt();
 
        scan.close();

        for (int i = 1; i <= fibonacciLength; i++) {
            fibonacciNums.add(firstNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        System.out.println(fibonacciNums);
         */
 /*17. Pide al usuario dos números enteros y muestra todos los números primos 
que se encuentran en ese rango.
 
         Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero(límite inferior): ");
        int numUno = scan.nextInt();

        System.out.println("Ingrese el segundo número entero(límite superior): ");
        int numDos = scan.nextInt();

        ArrayList<Integer> numPrimos = new ArrayList<Integer>();
        
        scan.close();

        for (int i = numUno; i < numDos; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                numPrimos.add(i);
            }
        }
        System.out.println(numPrimos);
         */
 /*18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que 
contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la 
clase Math para generar números aleatorios y la clase String para manipular 
la contraseña.
 
 //Método para generar una letra aleatoria
 public static String generarLetra(){
            Random randomLetter = new Random();
            char ch = (char)(randomLetter.nextInt(26) + 'A');
            return Character.toString( ch);
        }
 //Método para genera un número aleatorio de 10 a 99
    public static int generarNumero(){
            Random random = new Random();
            int num = random.nextInt(90) + 10;
            return num;
        }
    //Método que genera la contraseña
    public static String generarContraseña(){
        return (generarLetra()
         + generarLetra().toLowerCase() +
        generarNumero() +
        generarLetra() + 
        generarLetra().toLowerCase() +
        generarNumero());
        
    }
 
    System.out.println(generarContraseña());
         */
 /*19. Escribe un programa que solicite al usuario su nombre y luego 
lo imprima en mayúsculas y minúsculas 

    Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = scan.nextLine();
        scan.close();
 
        String uppercaseName = name.toUpperCase();
        String lowercaseName = name.toLowerCase();

        System.out.println("El nombre en mayúsculas es: " + uppercaseName);
        System.out.println("El nombre en minúsculas es: " + lowercaseName);
         */
 /*20. Realiza un programa que solicite al usuario una cadena y luego 
invierta su orden 
 
 Scanner scan = new Scanner( System.in);

        System.out.println("Ingrese una palabra: ");
        String word = scan.nextLine();

        String invertedWord = "";
 
        scan.close();

        for (int i = word.length() - 1; i >= 0; i--) {
            char letterByLetter = word.charAt(i);
            invertedWord += letterByLetter;
        }

        System.out.println(invertedWord);
 
         */
 /*21. Pide al usuario una cadena y muestra cuántas veces aparece una letra 
específica en ella 
 
 Scanner scan = new Scanner( System.in );
    
        System.out.println("Ingrese una palabra: ");
        String word = scan.nextLine();

        System.out.println("Ingrese la letra que desea buscar: ");
        char letter = scan.next().charAt(0);

        int count = 0;
 
        scan.close();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("El número de veces que aparece la letra " + letter
                + " en la palabra " + word + " es: " + count);
         */
 /*22. Escribe un programa que solicite al usuario una frase y verifique si 
es un palíndromo (se lee igual de izquierda a derecha que de 
derecha a izquierda)
 
 Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String phrase = scan.nextLine();

        String phraseWithoutBlanks = phrase.replace(" ", "");

        String invertedPhrase = "";

        String result = "";
 
        scan.close();

        for (int i = phraseWithoutBlanks.length() - 1; i >= 0; i--) {
            invertedPhrase += phraseWithoutBlanks.charAt(i);
        }

        if (phraseWithoutBlanks.equals(invertedPhrase)) {
            result = "La frase " + phrase + " es un palíndromo";
        } else {
            result = "La frase " + phrase + " no es un palíndromo";
        }

        System.out.println(result);
    
         */
 /*23. Crea un programa que pida al usuario una oración y muestre cuántas 
palabras contiene.
 
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una oración: ");
        String phrase = scan.nextLine().trim();

        int count = 0;
 
        scan.close();

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("El número de palabras de la oración es: "
                + (count + 1));

         */
 /*24. Realiza un programa que solicite al usuario una cadena y reemplace 
todas las apariciones de una letra específica por otra
 
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una cadena: ");
        String input = scan.nextLine();

        System.out.println("Ingrese la letra que quisiera reemplazar: ");
        char letter = scan.next().charAt(0);

        System.out.println("Ingrese la letra por la que desea reemplazar la anterior: ");
        char replaceLetter = scan.next().charAt(0);

        String replacedString = "";

        scan.close();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
            if (input.charAt(i) != letter) {
                replacedString += input.charAt(i);
            } else {
                replacedString += replaceLetter;
            }
        }

        System.out.println(replacedString);
 
         */
 /*25. Pide al usuario una frase y muestra cada palabra por separado 
        Scanner scan = new Scanner ( System.in );
    
        System.out.println("Ingrese una frase: ");
        String phrase = scan.nextLine();

        String updatedPhrase = "";
 
        scan.close();

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != ' ') {
                updatedPhrase += phrase.charAt(i);
            } else {
                updatedPhrase += "\n";
            }
        }
        System.out.println(updatedPhrase);
    
         */

 /*26. Escribe un programa que pida al usuario una cadena y muestre cuántos 
caracteres tiene sin contar los espacios en blanco 

        Scanner scan = new Scanner ( System.in );

        System.out.println("Ingrese una cadena: ");
        String input = scan.nextLine();

        int count = 0;

        scan.close();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("El número de caracteres de la cadena sin espacios"
                + " es " + count);
         */

 /*27. Crea un programa que solicite al usuario una frase y luego muestre 
las palabras ordenadas alfabéticamente

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String input = scan.nextLine();

        String[] words = input.split(" ");

        Arrays.sort(words);

        String result = String.join(" ", words);

        System.out.println("Orden alfabético: " + result);
         */

 /*28. Suma de elementos: Escribe un programa que calcule la suma de todos 
los elementos en un arreglo de enteros.

        //Codigo que usa arraylist ingresando los datos que ingrese el usuario.

        Scanner scan = new Scanner( System.in );
    
        System.out.println("Ingrese un número: ");
        int numUno = scan.nextInt();
        
        System.out.println("Ingrese un número: ");
        int numDos = scan.nextInt();
        
        System.out.println("Ingrese un número: ");
        int numTres = scan.nextInt();
        
        System.out.println("Ingrese un número: ");
        int numCuatro= scan.nextInt();
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add( numUno );
        numbers.add( numDos );
        numbers.add( numTres );
        numbers.add( numCuatro );
        
        int sum = 0;
        
        
        for (int number : numbers){
            sum += number;
        }
        
        System.out.println("La suma de los números es: " + sum);

    //Codigo que crea el array y hace la suma de los elementos.

    int [] numbers = {6, 4, 5, 5};
    
    int sum = 0;
    
    
    for ( int number : numbers){
        sum += number;
    }
        
        System.out.println("La suma de los números del arreglo es: " + sum);
         */

 /*29. Encontrar el número más grande: Crea un programa que encuentre el número
más grande en un arreglo de enteros
 
         int[] numbers = {1, 6, 5, 4, 2, 10, 6, 9, 13, 11};

        //codigo con los métodos de los arrays.
        Arrays.sort(numbers);

        int numbersLength = numbers.length - 1;

        int biggestNumber = numbers[numbersLength];

        int temp = numbers[0];

        System.out.println("El número mayor del arreglo es: " + biggestNumber);

        //Código con iteración.
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                temp = numbers[i + 1];
            }
        }

        System.out.println("El número mayor del arreglo es: " + temp);
 
         */
 /*30. Eliminar duplicados: Diseña un programa que elimine los elementos
duplicados de un arreglo.
 
        int[] numbers = {1, 1, 1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8};

        ArrayList<Integer> numbersFiltered = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (!numbersFiltered.contains(numbers[i])) {
                numbersFiltered.add(numbers[i]);
            }
        }

        System.out.println(numbersFiltered);
         */
 /*31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
de manera ascendente.
 
 int[] numbers = {4, 7, 6, 3, 1, 9, 0};

        for (int i = 0; i < numbers.length; i++) {
            int temp = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

         */
 /*.Buscar un elemento: Escribe un programa que busque un número específico
en un arreglo y muestre su índice (o un mensaje si no se encuentra).
 
        int [] numbers = {1,2,3,4,5,6,7,8,9,0};
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el número que desea buscar: ");
        int numberLooked = scan.nextInt();

        int index = 0;

        String resultado = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberLooked) {
                index = i + 1;
            }
        }

        if (index == 0) {
            resultado = "El número " + numberLooked + " no se encuentra en el arreglo.";

        } else {
            resultado = "El número " + numberLooked + " se encuentra en el"
                    + " indice: " + (index);
        }

        System.out.println(resultado);

        scan.close();

         */
 /*Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
cada elemento en un arreglo.
 
         int[] numbers = {1, 2, 3, 4, 5, 2, 3, 4, 2, 5, 1, 3, 2,6,6,6,6,6,6,6,6};

        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> frequencyResult = new ArrayList<>();

        String resultado = "";

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            resultado = "El elemento " + numbers[i] + " se encuentra " + count
                    + " veces";

            result.add(resultado);
        }

        for (int i = 0; i < result.size(); i++) {
            if (!frequencyResult.contains(result.get(i))) {
                frequencyResult.add(result.get(i));
            }
        }

        String frequencyResultString = String.join("\n", frequencyResult);

        System.out.println(frequencyResultString);

         */
 
 /*34.Rotación de elementos: Implementa un programa que rote los elementos de
un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
 
         Scanner scan = new Scanner(System.in);

        String[] elementos = {"hola", "soy", "falcao", "greatest", "player"};
        
        System.out.println("Ingrese la posición del elemento a rotar: ");
        int index = scan.nextInt() - 1;

        System.out.println("Ingresa el número de posiciones que quieres"
                + " intercambiar el elemento: ");
        int posiciones = scan.nextInt();

        System.out.println("Ingrese la dirección a la que quiere desplazar el"
                + " elemento( derecha o izquierda ): ");
        String direccion = scan.next().trim().toLowerCase();

        if (direccion.contains("derecha")) {
            String temp = elementos[index];

            for (int i = index; i < index + posiciones; i++) {
                elementos[i] = elementos[i + 1];
            }

            elementos[index + posiciones] = temp;

            System.out.println(Arrays.toString(elementos));

        } else {
            String temp = elementos[index];

            for (int i = index; i < index - posiciones; i++) {
                elementos[i] = elementos[i - 1];
            }

            elementos[index - posiciones] = temp;

            System.out.println(Arrays.toString(elementos));
        }

*/
 
 /*35. Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
del 1 al 10. Usa para esto una matriz
 
 int[] multiplicador = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] multiplicando = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < multiplicador.length; i++) {
            System.out.println("Tabla del " + (i + 1));
            for (int j = 0; j < multiplicando.length; j++) {
                System.out.println(multiplicador[i] + " X " + multiplicando[j]
                        + " = " + (multiplicador[i] * multiplicando[j]));
            }
        }

*/
    }
}
