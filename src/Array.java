import java.util.ArrayList;
import java.util.Scanner;

public class Array extends Program {


	   private static String name;

	    public void setName(String pName)
	    {
	        name = pName;
	    }

	    public String getName()
	    {

	        return name;
	    }


	


void mi() {

    Scanner input=new Scanner(System.in); {

	ArrayList<Array> players = new ArrayList<Array>();
	int il_za�;

	System.out.println("Potwierdz liczb� os�b (Prosz� poda� numer)");
	il_za� = input.nextInt();


	for(int i = 0; i < il_za�; i++)
	{
	    System.out.print("Imi� uczetnika " + (i + 1) + "?");
	    String name = input.next();
	    Array plr = new Array();
	    plr.setName(name);
	    players.add(plr);
}}
}
}


