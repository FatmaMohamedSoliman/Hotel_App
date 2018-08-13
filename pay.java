import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Formatter;
import java.util.FormatterClosedException;
import static javax.script.ScriptEngine.NAME;
import static javax.swing.Action.NAME;
import static sun.security.x509.IssuerAlternativeNameExtension.NAME;
public class pay extends information 
{    
    public  pay (){
    super();
    }
    public void input ()throws IOException
    {
      
         File f=new File("m.txt");
        FileOutputStream OutputStream = new FileOutputStream(f);
        OutputStream.write(super.getname().getBytes());
         OutputStream.write("          ".getBytes());
        OutputStream.write(super.getpass().getBytes());
        OutputStream.write("          ".getBytes());
        OutputStream.write(super.getemail().getBytes());
        OutputStream.close();
    }

}