import java.util.Scanner;
public class GhettoNumbersMyWay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String kurva = s.next();
        String[] m ={"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};
        int i,temp;
        for(i = 0; i<kurva.length(); i++)
        {
            temp=Character.getNumericValue(kurva.charAt(i));
            System.out.print(m[temp]);

        }


    }

}
