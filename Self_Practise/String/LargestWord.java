package Self_Practise.String;
import java.util.Scanner;

public class LargestWord {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();

        int count = 0;
        int ans = 0;

        for(int i = 0 ; i < str.length();i++)
        {
            char ch = str.charAt(i);

            if(Character.isLetter(ch))
            {
                count++;
            }
            else if(ch == ' ')
            {
                if(count > ans)
                {
                    ans = count;
                }
                count = 0;
            }
            // Check last word
            if(count > ans)
            {
                ans = count;
            }
        }
        System.out.println("Largest word count is : "+ans);
        scan.close();
    }
}
