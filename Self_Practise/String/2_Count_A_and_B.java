package Self_Practise.String;
import java.util.Scanner;

class countAB
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your String ");
        String str = scan.nextLine();

        int count1 = 0;
        int count2 =0;

        for(int i = 0 ;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch =='A')
            {
                count1++;
            }
            else if(ch == 'B')
                count2++;
        }
        System.out.println("Count of A: " +count1);
        System.out.println("Count of B: " +count2);
        scan.close();
    }
}