/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Som Raj
 */
public class recent {
    PrintWriter printWriter ;
    
    
    
    
    
    
    
    
    public recent(File files){
        File file = new File("e:\\jpadconfig.txt");
        String filename=files.toString();
          try {
            printWriter = new PrintWriter (file);
            printWriter.println (filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    printWriter.close ();  
	
                    
    }

    recent(int noOfline) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
