/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.util.ArrayList;

/**
 *
 * @author iseeds
 */
public class Memory {
    
    private static Memory instance = null;
    private ArrayList<String> datas;
    private ArrayList<String> instructions;
    
    private Memory(){
        datas = new ArrayList();
        instructions = new ArrayList();
    }
    
    public static Memory getInstance() {
        if (instance == null) {
            instance = new Memory();
        }
        return instance;
    }
    
    public void addData(String data){
        datas.add(data);
    }
    
    public void addInstruction(String instruction){
        instructions.add(instruction);
    }
    
    /**
     * @return the datas
     */
    public ArrayList<String> getDatas() {
        return datas;
    }

    /**
     * @return the instructions
     */
    public ArrayList<String> getInstructions() {
        return instructions;
    }
}

