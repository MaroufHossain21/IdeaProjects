public class IPhoneX{
//Class is the plan of IPhoneX
// Send to china to build IPhoneX

//      myIPhoneX = by using new keyword, you invoke constructor to sreate myIPhoneX
//  IPhoneX() = constructor--> same as class with ();
//  IPhoneX myIPhoneX = new IPhoneX();
//  Declaration of object
IPhoneX myIPhoneX;
// Create it --> Assign value
//myIPhoneX= new IPhoneX();

// Main method of application.
//JVM only understand whatever is inside main method or any method with relationship with the main method.
public static void main(String[] args){
    IPhoneX myIPhoneX = new IPhoneX();
    //Calling using myIPhoneX
    //By doing this we have created relationship with main method and call() method.
    myIPhoneX.call();

  }

//Method  does some job
// Function = method
// Name of the function is call
  public void call(){

    System.out.println("This method can make a call");


  }

}
