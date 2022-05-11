/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author kampu
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;

    @FXML
    private ComboBox<?> cbpenerbit;

    @FXML
    private DatePicker dpterbit;

    @FXML
    private ToggleGroup kind;

    @FXML
    private RadioButton rdFiksi;

    @FXML
    private RadioButton rdNonfiksi;

    @FXML
    private RadioButton rdPengetahuan;

    @FXML
    private TextField tfHarga;

    @FXML
    private TextField tfID;

    @FXML
    private TextField tfNama;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
//        label.setText("Hello World!");
        System.out.println(tfID.getText());
        System.out.println(tfNama.getText());
        System.out.println(dpterbit.getValue().toString());
        String jenis="";
        if (rdPengetahuan.isSelected())
           jenis=rdPengetahuan.getText();
        if (rdFiksi.isSelected())
           jenis=rdFiksi.getText();
        if (rdNonfiksi.isSelected())
           jenis=rdNonfiksi.getText();
        
        System.out.println(jenis);
        System.out.println(cbpenerbit.getValue().toString());
    }
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Gramedia");
        list.add("Erlangga");
        list.add("Yusdistira");
        
        ObservableList items = FXCollections.observableArrayList(list);
        
        cbpenerbit.setItems(items);
    }    
    
}
