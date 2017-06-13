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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Som Raj
 */
public class saveas {
    
    private PrintWriter printWriter;
    public saveas(JTextArea area){
        	  JFileChooser choice = new JFileChooser("e:\\");
        	  choice.setDialogTitle("Save to...");
          File  file = new File("Untitled.txt");
            while(true){
            choice.setSelectedFile(file);
            int str = choice.showSaveDialog(null);
            if(str!=JFileChooser.APPROVE_OPTION)
            	return;
            file = choice.getSelectedFile();
            if(file.exists()){
            JOptionPane.showMessageDialog(null,"File Exists");
            continue;
            }
            else
            	break;
        	  }
			String text = area.getText().toString();
                        
                        
                        

String os = System.getProperty("os.name");


//fuck you windows,why cant you growup and use what other OSes use for end of line
if(os.contains("Windows")){
    
                        text=text.replace("\n", "\r\n");
}




                        
                      
        try {
            printWriter = new PrintWriter (file);
            printWriter.println (text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(saveas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    printWriter.close ();  
	
                    recent rc= new recent(file);
    
    
    }
}
