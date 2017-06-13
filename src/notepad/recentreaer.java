/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Som Raj
 */
public class recentreaer {
    public  recentreaer(){
  FileReader in;
BufferedReader reader;
JFileChooser jfi;
String dbz,text="",ar;
int noOfline=0;
   
   
	File file = new File("e:\\jpadconfig.txt");
	try{
		in = new FileReader(file);
		reader = new BufferedReader(in);
		while(true){
			dbz = reader.readLine();
			if(dbz==null)
				break;
                        noOfline++;
			
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        recent rec=new recent(noOfline);
}

}
