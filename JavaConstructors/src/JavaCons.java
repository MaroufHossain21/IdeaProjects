public class JavaCons {

        public static void main(String[] args){

            JavaConstructors c1 = new JavaConstructors();

            c1.setModel("Benz");
            System.out.println(c1.getModel());

            System.out.println(c1.needForSpeed);
            System.out.println(c1.gearShift);


            System.out.println("*****************");


            JavaConstructors c2 = new JavaConstructors(15,1);
            System.out.println(c2.needForSpeed);
            System.out.println(c2.gearShift);

        }



    }



