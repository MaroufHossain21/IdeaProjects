public class Robot {


    String name;
    String color;
    int weight;

    Robot(String givenName, String givenColor, int givenWeight) {
        this.name = givenName;
        this.color = givenColor;
        this.weight = givenWeight;
    }

    void introduceSelf() {
        System.out.println("My name is " + this.name);
        System.out.println("My Color is " + this.color);
        System.out.println("My Weight is " + this.weight);
    }

}