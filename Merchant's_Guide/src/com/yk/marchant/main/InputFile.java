package com.yk.marchant.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	
	// new single InputParse class
	private static InputFile instance=null;
    public static InputFile getInstance(){
        if(instance==null){
            synchronized(InputFile.class){
                if(instance==null){
                    instance=new InputFile();
                }
            }
        }
        return instance;
    }
    private InputFile(){}
    
    // get the input file
	public BufferedReader getInput() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return new BufferedReader(new FileReader("D:\\SampleInput.txt"));
	}
    
	// Parse input File
    public void parseInputFile() throws IOException{
    	BufferedReader br = getInput();
    	String currentLine;
    	OutputFile outputParse = new OutputFile();
    	while((currentLine = br.readLine()) != null){
    		outputParse.parseCurrentLine(currentLine);
    	}
    	
    	//call the output mothod of OutputParse, output the result
    	outputParse.getOutput();
    }
}
