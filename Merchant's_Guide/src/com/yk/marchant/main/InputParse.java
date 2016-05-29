package com.yk.marchant.main;

public class InputParse {
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
}
