import java.util.Scanner;

class Registration {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name");

    
    String name = myObj.nextLine();
    System.out.println("Enter surname");
    String surname = myObj.nextLine();
    
    System.out.println("Enter student number");
    int number = myObj.nextInt();
    System.out.println("Enter cintact details");
    int contactNumber = myObj.nextInt();
    
    if (contactNumber < 10) {
  System.out.println("Enter 10 digit number");
int contactNumber = myObj.nextInt()
} 

    int streetNo = myObj.nextInt();
    System.out.println("Enter Street Name");
    String streetName = myObj.nextLine();
    System.out.println("Enter Town");
    String town = myObj.nextLine();
    System.out.println("Enter City");
    String city = myObj.nextLine();
    System.out.println("Enter Post Code");
    int postCode = myObj.nextInt();
    
    if (contactNumber < 4 ){

  System.out.println("Enter 4 digit Postal Code");
int postCode = myObj.nextInt()
} 

    
    System.out.println("Student name: \n" + name + surname+
       "Student number: \n" + "Contact Number: \n");
       
    System.out.println(contactNumber);
    
    System.out.println(" \n Adress:" + streetNo +" " + streetName+
       "\n" + town + "\n"+ city+"\n" +postCode);
       
      
    
  }
}
