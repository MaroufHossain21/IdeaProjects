public class JavaClassClass {

    public static void main (String[] args){

        JavaClass benz = new JavaClass();
        benz.setMake("Benz");
        System.out.println(benz.getMake());

        JavaClass beamer = new JavaClass();
        beamer.setModel("760Li");
        System.out.println(beamer.getModel());

        JavaClass camry = new JavaClass();
        camry.setColor("Alpine White");
        System.out.println(camry.getColor());

        benz.setYear(2020);
        System.out.println(benz.getYear());

    }


}


