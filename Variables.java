public class Variables{

  public static void main(String[] args){

    /*
    * Byte = min (-128) --- 127 max, Default 0
    * Short = min (-32,768)--- 32,767 max, "0"
    * int =  min - 2,147,483,648 --- 2,147,483,647 max, "0"
    * long =  min -2^63 --- 2^63 -1 max , "0"
    */
    byte byteVariable = 118;
    System.out.println("Byte Value = " + byteVariable);

    short shortVariable = 1118;
    System.out.println("Short Value = " + shortVariable);

    int integerVariable = 111118;
    System.out.println("Integer Value = " + integerVariable);

    /*
    *float Default: 0.0 f
    *double Default: 0.0d
    *boolean -- false and true, Default: false
    *char min 0 --- 65,535 short for character
    */

    float floatVariable = 18.8f;
    System.out.println("Float Value = " + floatVariable);

    double doubleVariable = 18.88;
    System.out.println("Double Value = " + doubleVariable);

    boolean booleanVariable = true;
    System.out.println("Boolean Value = " + booleanVariable);

    char charVariable = 'm';
    System.out.println("Char Value = " + charVariable);



  }


}
