public class JavaConstructors {
    private String model;
    int needForSpeed;
    int gearShift;

    public JavaConstructors(){
    this.needForSpeed = 81;
    this.gearShift = 5;
        System.out.println("Constructor without arguments");

    }

    public JavaConstructors(int needForSpeed, int gearShift){
        this.needForSpeed = needForSpeed;
        this.gearShift = gearShift;
        System.out.println("w/out arguments");

    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }


}

