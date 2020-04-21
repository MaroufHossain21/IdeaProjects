import java.util.Arrays;

public class JavaArray {

    public static void main(String[] args){

        int [] intArray;
        intArray = new int [10];

        intArray[0] = 118;
        intArray[1] = 98;
        System.out.println("0 Index: " + intArray[0]);
        System.out.println("1st Index: " + intArray[1]);
        System.out.println("2nd Index: " + intArray[2]);


        String [] stringArray ={"Beamer","Benz", "Bentley"};
        System.out.println("0 Index: " + stringArray[0]);
        System.out.println("1st Index: " + stringArray[1]);
        System.out.println("2nd Index: " + stringArray[2]);

        int len1 = intArray.length;
        int len2 = stringArray.length;
        System.out.println("Integer Array Length: " + len1);
        System.out.println("String Array Length: " + len2);

        for (int i = 0; i < len1; i++ ){
            System.out.println(intArray[i]);
        }
        Arrays.sort(intArray);

        for (int i = 0; i < len1; i++ ) {
            System.out.println(intArray[i]);



        }

    }

}

