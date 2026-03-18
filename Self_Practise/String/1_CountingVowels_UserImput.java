package Self_Practise.String;
import java.util.Scanner;

class CountingVowels
{
    public static void main(String[] args) 
    {
        int count = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your String ");
        String str = scan.nextLine();

        for(int i = 0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count ++;
            }
        }
        System.out.println("Count is : " +count);
    }
}