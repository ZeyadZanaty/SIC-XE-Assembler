package com.company;

/**
 * Created by zeyadzanaty on 4/12/17.
 */
public class Instruction  {

    private string name;
    private int opcode;
    private int format;


    public string getName (){
        return name;
    }

    public int getOpCode(){
        return opcode;
    }

    public int getFormat(){
        return format;
    }

    public void setName(string instructionName){
        this.name = instructionName;
    }

    public void setOpCode (int operationCode){
        this.opcode = operationCode;
    }
    public void setFormat (int formatNumber){
        this.format = formatNumber;
    }


}
