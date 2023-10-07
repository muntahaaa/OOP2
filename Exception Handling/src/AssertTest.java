import java.util.Scanner;
public class AssertTest {
    public static void main(String args[]){
        Scanner s=new Scanner (System.in);
        System.out.println("enter a  number between 0 and 10");
        int number=s.nextInt();
        assert(number>=0 && number<=10): "bad number "+ number;
        System.out.printf("you entered %d\n",number);
    }
}
