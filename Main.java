import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      while(true)
        {
        Scanner sc = new Scanner(System.in);
        int numberOfDays;
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();
       System.out.print("Enter a year: ");
         int year = sc.nextInt();
          String monthName;
        // Check if the month number is valid
        if (monthNumber > 0 && monthNumber <= 12) {
          //numberOfDays = 31;
          switch (monthNumber) {
            case 1:
              monthName="Jan";
              numberOfDays = 31;
              System.out.println(monthName +" "+ year + " has " + numberOfDays + " days");
                break;
            case 3:
              monthName="March";
              numberOfDays = 31;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");
                break;
            case 5:
              monthName="May";
              numberOfDays = 31;
              System.out.println(monthName +" "+ year + " has " + numberOfDays + " days");
                break;
            case 7:
              monthName ="July";
              numberOfDays = 31;
              System.out.println(monthName +" "+ year + " has " + numberOfDays + " days");
                break;
            case 8:
              monthName="Aug";
              numberOfDays = 31;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");
                break;
            case 10:
              monthName="May";
              numberOfDays = 31;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");
                break;
            case 12:
              monthName="Dec";
                numberOfDays = 31;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");
                break;
            case 2:
               monthName = "Feb";
               if((year%400==0)||(year%4==0 && year%100!=0))
               {numberOfDays = 29;
System.out.println(monthName + " "+ year+ " has " + numberOfDays + " days");
               }
              else{
                monthName = "Feb";
                numberOfDays=28;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");  
              }
                break;
              //numberOfDays = 30;
            case 4:
              monthName="April";
              numberOfDays = 30;
              System.out.println(monthName +" "+  year + " has " + numberOfDays + " days");
                break;
            case 6:
              monthName = "June";
              numberOfDays = 30;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");
                break;
            case 9:
              monthName="Sept";
              numberOfDays = 30;
              System.out.println(monthName +" "+ year + " has " + numberOfDays + " days");
                break;
            case 11:
                monthName = "Nov";
                numberOfDays = 30;
              System.out.println(monthName + " "+ year + " has " + numberOfDays + " days");
                break;
        }
        } else {
            System.out.println("Invalid Details");
        }

        }



      
    }
}

  