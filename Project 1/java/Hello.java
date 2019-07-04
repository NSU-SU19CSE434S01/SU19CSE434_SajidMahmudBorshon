import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.lang.*;

public class Hello
{
	public static void main(String[] args)
	{
        String name = "Borshon"; 
        String html = "<h1>this is the: </h1>";
        int index = 15;
        String finalHTML = new String();

        for(int i = 0; i < html.length(); i++)
        {
            finalHTML += html.charAt(i);

            if(i == index)
            {
                finalHTML += name;
            }
        }
		
		File f= new File("D:\\nameHTML.html");
		try
		{
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(finalHTML);
            bw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
	}
}
