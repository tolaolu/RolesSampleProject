/*
This project displays all roles(that has been preset in code) and it has a
combobox where when u click on a role n click select button it displays whats
clicked in d console.
Project also has a drop down that when u click, it displays whatever u 
clicked in d dropdown inside a label. 
Project also can add a new role, and it adds it to the list of 
already available roles.The 3 nice features here are really good. 
 */
package rolessampleproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class FXMLController implements Initializable {

    @FXML
    private ComboBox<String> roleComboBox;

    ObservableList<String> list = FXCollections.observableArrayList("Owner", "Manager",
            "Sec", "Clerk");
    @FXML
    private Label resultLabel;
    @FXML
    private Button addItemsBtn;
    @FXML
    private ListView<String> listView;
    @FXML
    private Button selectBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        roleComboBox.setItems(list);
        listView.setItems(list);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    @FXML
    private void onComboChange(ActionEvent event) {
        resultLabel.setText(roleComboBox.getValue());
        // the code above will make anything u select in the dropdown to show in the label above the 
        //combo box.
    }

    @FXML
    private void onButtonPress(ActionEvent event) {
        // here, we want to add roles into the combobox every time
        // the button is pressed. Henc:
        roleComboBox.getItems().addAll("User1", "User2", "User3");
        // tell the sys to get text instead of presetting this users above.
        // add a textbox to get text
    }

    @FXML
    private void onSelectBtnPress(ActionEvent event) {

        ObservableList<String> names; 
        names = listView.getSelectionModel().getSelectedItems();
        for (String name : names) {
            System.out.println(" " + name);
        }
    }

}
