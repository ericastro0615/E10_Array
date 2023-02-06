/*
        Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
        ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
        0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
        20.*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double [] arregloA = new double[12];
        double [] arregloB = new double [6];

        rellenoArray(arregloA);
        mostrarArray(arregloA);
        ordenamientoArray ( arregloA);
        System.out.println("array ordenado");
        mostrarArray(arregloA);
        System.out.println("En arreglo B:");
        Arrays.fill(arregloB, 0.5);
        System.arraycopy(arregloA, 0, arregloB, 0, arregloB.length/2 );

        mostrarArray(arregloB);

    }


    //relleno de array
    public static void rellenoArray(double arregloA []) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (Math.random()) * 50;
        }
    }
        //impresion de array
    public static void mostrarArray (double arregloA []) {
        System.out.println("Array: ");
  /*      for (int i = 0; i < arregloA.length; i++) {
            System.out.print( "|" + arregloA [i] + "|" );
        }*/
        for (double i: arregloA  ) {
            System.out.println( "|" + i + "|" );
        }
        }


       public static void ordenamientoArray (double arregloA []) {
           Arrays.sort(arregloA, 0, (arregloA.length) );

       }



    }


