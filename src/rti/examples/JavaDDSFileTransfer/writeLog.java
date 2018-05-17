package rti.examples.JavaDDSFileTransfer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class writeLog {

	public void  writeOut(String str){
		try{
    		String data = str;

    		File file =new File("DDS.log");

    		//if file doesnt exists, then create it
    		if(!file.exists()){
    			file.createNewFile();
    		}

    		//true = append file
    		FileWriter fileWritter = new FileWriter(file.getName(),true);
    	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
    	        bufferWritter.write(data);
    	        bufferWritter.close();

	       

    	}catch(IOException e){
    		e.printStackTrace();
    	}
	}
}
