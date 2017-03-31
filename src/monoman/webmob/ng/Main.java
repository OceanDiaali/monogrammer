
package monoman.webmob.ng;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		String name,first,middle,last,space = " ",monogram;
		
		//input the full name
		name = JOptionPane.showInputDialog(null,
				"Enter your full name(First,Middle,Last):");
		
		//extract from the 3 names
		first = name.substring(0,name.indexOf(space));
		name = name.substring(name.indexOf(space)+1,name.length());
		
		middle = name.substring(0,name.indexOf(space));
		last = name.substring(name.indexOf(space)+1,name.length());
		
		//gratuitous message to user
		JOptionPane.showMessageDialog(null, "Hello,"
		              +first.substring(0).toUpperCase()
				          +".Processing your monogram..\nPress OK");
		//get the initials as monogram
		monogram = first.substring(0, 1)
				     + middle.substring(0, 1)
				       + last.substring(0, 1);
		//output monogram
		JOptionPane.showMessageDialog(null, "Your monogram is: "
		                     +monogram.toUpperCase()+"!");

	}

}
