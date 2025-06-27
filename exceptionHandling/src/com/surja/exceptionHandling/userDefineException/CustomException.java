package com.surja.exceptionHandling.userDefineException;

class CustomException extends  Exception{
    public CustomException(){
        super("Unknown error occured ! ");
    }
    public CustomException(String text){
        super(text);
    }

}
