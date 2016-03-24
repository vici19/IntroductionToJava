import java.util.Scanner;
public class PrintCharTriangleMyWay {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        char c;
        for(int i = 0; i < a; i++)
        {
            for(int j=0; j< i ; j++)
            {
                c = 'a';
                c +=j;
                System.out.print(c + " ");
            }
            System.out.println();
        }

        for(int i = a; i > 0; i--)
        {
            for(int j=0; j< i ; j++)
            {
                c = 'a';
                c +=j;
                System.out.print(c + " ");
            }
            System.out.println();
        }




    }

}
