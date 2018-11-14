/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipssimulator;

import codes.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

/**
 *
 * @author 17111238
 */
public class FXMLDocumentController implements Initializable {
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    void openFile(ActionEvent event) throws FileNotFoundException {
         FileChooser fileChooser = new FileChooser();
         FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("MIPS files (*.asm)", "*.asm");
         
         fileChooser.getExtensionFilters().add(extFilter);
         File file = fileChooser.showOpenDialog(null);
         
         if (file != null) {
            ReadFile.getInstance().init(file);
         }
    }
    
    @FXML
    void closeApp(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

}
