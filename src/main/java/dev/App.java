package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String titre = ResourceBundle.getBundle("application").getString("titre");
    	String a = FigletFont.convertOneLine(titre);
        System.out.println( a );
        
        System.out.println("environnement : "+ResourceBundle.getBundle("application").getString("environnement"));
    }
}
