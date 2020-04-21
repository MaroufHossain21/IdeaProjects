public class JavaClass {

    //Car
    private String color;
    private String make;
    private String model;
    private int year;




        public String getModel () {
            return model;
        }

        public void setModel (String model){
            this.model = model;
        }

        public String getColor () {
            return color;
        }

        public void setColor (String color){
            this.color = color;
        }

        public void needForSpeed () {
            System.out.println("The need for speed");

        }

        public void setMake (String make){
            this.make = make;
        }

        public String getMake () {
            return this.make;
        }

        public int getYear(){
            return year;
            }


            public void setYear(int year) {
                if (year > 2018) {
                    this.year = year;
                } else {
                    System.out.println("2018 or better :) ");
                }
        }
    }





