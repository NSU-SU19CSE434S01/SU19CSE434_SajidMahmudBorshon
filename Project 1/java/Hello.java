import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.lang.*;

public class Hello
{
	public static void main(String[] args)
	{
        String name = "**************"; 
        String html = "<!DOCTYPE html><html><head><title>Cv Online</title></head><body><div class=\"margin\"><div class=\"space\">	<h1><u>Curriculum Vitae</u></h1><img src=\"pp.JPG\">	<h2><u>PERSONAL INFO</u></h2>	<p>NAME:</p>	<p>AGE:</p>	<p>SEX:</p> <p>ADDRESS:</p> <p>NATIONALITY:</p> <p>RELIGION:</p> <p>CONTACT NO:</p> <p>EMAIL:</p> <br> <br> <h2><u>EDUCATION</u></h2> <table> <tr> <th>School</th> <th>Year</th> <th>GPA</th> </tr> <tr> <td>.</td> <td>.</td> <td>.</td> </tr> <tr> <th>College</th> <th>Year</th> <th>GPA</th> </tr> <tr> <td>.</td> <td>.</td> <td>.</td> </tr><tr> <th>University</th> <th>Year</th> <th>CGPA</th> </tr> <tr> <td>.</td> <td>.</td> <td>.</td> </tr> </table> <br> <br> <h2><u>FAMILY</u></h2> <table> <tr> <th>Farher's Name:</th> <th>Occupation</th> </tr> <tr> <td>.</td> <td>.</td> </tr> <tr> <th>Mother's Name:</th> <th>Occupation</th> </tr> <tr> <td>.</td> <td>.</td> </tr> </table> <br> <br> <footer>&copy; SAJID MAHUD BORSHON - 1510947642</footer> </div> </div> </body> </html>";
        int index = 197;
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
