package poo.typesdata.arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne =new int[5];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        arrayOne[3] = 4;
        arrayOne[4] = 5;
        for(int i : arrayOne){
            System.out.println(i);
        }

        int[] arrayTwo = { 1, 2, 3, 4, 5 };

        String[] arrayNames = {
                "Joas",
                "Maria",
                "Pedro",
                "Ana",
                "Jose"
        };

        System.out.println("length of arrayNames is " + arrayNames.length);

        for(String name : arrayNames){
            System.out.println("name actually " + name);
        }

        String endName = "";
        for(int i = 0; i < arrayNames.length; i++){
            System.out.println("name actually " + arrayNames[i] + "in position: " + i);
            endName = arrayNames[i];
        }
        System.out.println(endName);

        int[][] arrayBidi = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 5;
        arrayBidi[1][1] = 6;
        arrayBidi[1][2] = 7;
        arrayBidi[1][3] = 8;

        for(int i = 0; i < arrayBidi.length; i++){
            System.out.println("Value of i: " + i);
            for(int j = 0; j < arrayBidi[i].length; j++){
                System.out.println("I am in i = " + i + " j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

        for(int[] array : arrayBidi){
            for(int i : array){
                System.out.println(i);
            }
        }
    }
}
