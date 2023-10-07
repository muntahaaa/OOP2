import java.util.*;
public class CustomException {
    public static void main(String args[]){
        System.out.println("enter age ");
        Scanner s=new Scanner(System.in);
        int age= s.nextInt();
        try
        {
            checkAge(age);
        }
        catch(Exception e)
        {
            System.out.println("A problem :"+e.getMessage());
        }


    }

    static void checkAge(int age) throws AgeException{

            if(age<18)
            {
                throw new AgeException("you must be 18+ to vote");
            }
            else{
                System.out.println("you are signed up");
            }
        }
    }

