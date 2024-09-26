package com.campusdual.classroom;

public class Exercise18 {

    public static void main(String[] args) {

    }

    //Crea y inicializa un array
    public static int[] createAndInitializeArray(int index) {

        //Se crea el array
        int[] arrayInt = new int[index];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }

        return arrayInt;
    }

    //Recorre el array y lo imprime por pantalla
    public static void showInlineArray(int[] array) {

        //StringBuilder para guardar los numeros del array
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {

            sb.append(array[i]);

            if (i < array.length - 1) sb.append(" ");

        }
        System.out.println(sb);

    }
}
