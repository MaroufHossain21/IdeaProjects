public class AddingMethods {
    public static void main(String[] args) {
        String studentName = "Boosie";
        int score = 90;
        String grade;
        if (score >= 90 && score <= 100){
            grade = "A";
        } else if (score >= 80 && score < 90){
            grade = "B";
        } else if (score >=70 && score < 80){
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is: " + grade);

        /*
        11 lines of code for each students.
        I have 4 students so i wrote 44 line of code.
        what if you have 100 students? 100*11= 1100 lines of code.
        what does this mean than? is this useful to write the code this way?
        The Answer is "No".
        This is where Methods come into play. It saves time and we write less code
         */

        studentName = "Fabolous";
        score = 88;
        if (score >= 90 && score < 100){
            grade = "A";
        } else if(score >= 80 && score< 90){
            grade = "B";
        } else if (score>= 70 && score< 80){
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName + " is: " + grade);

        String studentName2 = "French Montana";
        score = 95;
        if (score >= 90 && score<100){
            grade= "A";
        } else if (score>= 80 && score<90){
            grade = "B";
        } else if (score>= 70 && score<80){
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName2 + " is: " + grade);

        String studentName3 = "Tory Lanez";
        score = 55;
        if (score>= 90 && score<100){
            grade = "A";
        } else if (score>= 80 && score<90){
            grade = "B";
        } else if (score>=70 && score<80){
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade of " + studentName3 + " is: " + grade);

        String studentName4 = "2Chainz";
        score = 49;
        if (score>= 90 && score<100){
            grade = "A";
        } else if (score>= 80 && score<90){
            grade = "B";
        } else if (score>=70 && score<80){
            grade = "C";
        } else if (score>=60 && score<69) {
            grade = "D";
        } else if(score>=50 && score<59) {
            grade = "F";
        }else {
                grade = "Please put down the phone and pick up a F*****ng book";
            }

        System.out.println("Grade of " + studentName4 + " is: " + grade);

    }

}

