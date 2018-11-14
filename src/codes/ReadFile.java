/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 17111238
 */
public class ReadFile {
    
    private static ReadFile rf = null;
    private File file;
 
    private ReadFile(){
        file = null;
    }
    
    public static ReadFile getInstance() {
        if (rf == null) {
            rf = new ReadFile();
        }
        return rf;
    }
    
    private void read() throws FileNotFoundException{
        try (Scanner sc = new Scanner(getFile())) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void init(File file) throws FileNotFoundException {
        this.file = file;
        this.read();
    }

    public File getFile() {
        return file;
    }
}
