package com.yk.marchant.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputParse {
	
	// new single InputParse class
	private static InputParse instance=null;
    public static InputParse getInstance(){
        if(instance==null){
            synchronized(InputParse.class){
                if(instance==null){
                    instance=new InputParse();
                }
            }
        }
        return instance;
    }
    private InputParse(){}
    
    // get the input file
	public BufferedReader getInput() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return new BufferedReader(new FileReader("D:\\SampleInput.txt"));
	}
    
	// Parse input File
    public void parseInputFile() throws IOException{
    	BufferedReader br = getInput();
    	String currentLine;
    	OutputParse outputParse = new OutputParse();
    	while((currentLine = br.readLine()) != null){
    		outputParse.parseCurrentLine(currentLine);
    	}
    	
    	//call the output mothod of OutputParse, output the result
    	outputParse.getOutput();
    }
}
