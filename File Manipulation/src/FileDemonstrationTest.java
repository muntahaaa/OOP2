import java.util.Scanner;
public class FileDemonstrationTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        FileDemonstration application=new FileDemonstration();

        System.out.println("enter file or directory name here:");
        application.analyzePath(input.nextLine());

    }

}
