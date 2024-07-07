package com.mdemiguels.contactList;

import com.mdemiguels.contactList.data.ContactRepository;
import com.mdemiguels.contactList.model.Contact;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Controller implements Initializable {

    private final ContactRepository contactRepository;

    public Controller(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @FXML
    AnchorPane anchorPane;
    @FXML
    ListView<Contact> listView;
    @FXML
    TextField txtId;
    @FXML
    TextField txtName;
    @FXML
    TextField txtEmail;
    @FXML
    TextField txtPhone;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

}
