package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;



import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import org.junit.Test;

public class Testing {

	@Test
	public void serialize() {
		Employee emp = new Employee("Juan", "Ramos Mejia", 2);
		Gson gson = new Gson();
		String json = gson.toJson(emp);
		try {
	    	  FileOutputStream fileOut = new FileOutputStream("D:\\documentos\\Desktop\\Nuevo documento de texto.txt");
	    	  ObjectOutputStream out = new ObjectOutputStream(fileOut);
	    	  out.writeObject(json);
	    	  out.close();
	    	  fileOut.close();
	    } catch (IOException i) {
	    	  i.printStackTrace();
	    }
	}

	 @Test
	 public void dou() {
		 Employee emp = new Employee("Anima", "San Justo", 1);
		 Gson gson = new Gson();
		 String json = gson.toJson(emp);
		 try
			{
			    String filename= "D:\\documentos\\Desktop\\Nuevo documento de texto.txt";
//			    OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(filename), "UTF8");
			    FileWriter fos = new FileWriter(filename,true); //the true will append the new data
			    fos.write(json);//appends the string to the file
			    fos.close();
//			    fw.close();
			}
		 catch(IOException ioe)
			{
			    System.err.println("IOException: " + ioe.getMessage());
			}
	 }
	 
	 
	 //SEGUIR CON ESTO
//	 @Test
//	 public void deserializeFile() {
//		 File input = new File("D:\\documentos\\Desktop\\Nuevo documento de texto.json");
//		 String name = null;
//		 try {
//			 JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
//			 JsonObject fileObject = fileElement.getAsJsonObject();
//			 
//			 name = fileObject.get("name").getAsString();
//		 } catch(FileNotFoundException e) {
//			 e.printStackTrace();
//		 }
//		 System.out.println(name);
//	 
//	 }
	 
}


