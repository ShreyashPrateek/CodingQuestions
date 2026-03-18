package Self_Practise.String;

import java.util.Scanner;

public class SwapCase {
    public static void main(String []args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your String ");
        String str = scan.nextLine();
        System.out.println(str);

        String s = "";

        for(int i = 0 ; i<str.length();i++)
        {
            char ch = str.charAt(i);
            
            if(Character.isUpperCase(ch))
            {
                s = s + Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                s = s + Character.toUpperCase(ch);
            }
            else
                s = s + ch;
        }
        System.out.println("Swapped string is : "+s );

        scan.close();
    }
}
