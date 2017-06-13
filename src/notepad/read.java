package notepad;

import java.io.*;

import javax.swing.*;

public class read {
FileReader in;
BufferedReader reader;
JFileChooser jfi;
String dbz,text="",ar;
JFileChooser fchoose;
public read(JTextArea area){
	// TODO Auto-generated constructor stub
	if(fchoose==null)
	fchoose = new JFileChooser("e:\\");
	fchoose.setDialogTitle("Select Files for reading");
	fchoose.setSelectedFile(null);
	int fr =fchoose.showOpenDialog(null);
	if(fr!=JFileChooser.APPROVE_OPTION){
		return;
	}
	File file = fchoose.getSelectedFile();
	try{
		in = new FileReader(file);
		reader = new BufferedReader(in);
		while(true){
			dbz = reader.readLine();
			if(dbz==null)
				break;
			text=(text+dbz+'\n');
		}
		area.setText(text);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

