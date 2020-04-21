
public class JavaRobot {
    public static void main(String[] args) {
//        Robot robot1 = new Robot();
//        robot1.name = "Tom";
//        robot1.color = "red";
//        robot1.weight = 30;
//
//        Robot robot2 = new Robot();
//        robot2.name = "Jerry";
//        robot2.color = "blue";
//        robot2.weight = 40;

        Robot robot1 = new Robot("Shah", "Red", 150);
        Robot robot2 = new Robot("Rukh", "Blue", 250);

        robot1.introduceSelf();
        robot2.introduceSelf();
    }
}

