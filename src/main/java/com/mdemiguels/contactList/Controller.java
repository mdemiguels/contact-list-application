package com.mdemiguels.contactList;

import com.mdemiguels.contactList.data.ContactRepository;
import com.mdemiguels.contactList.model.Contact;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;
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
    TextField txtId, txtName, txtEmail, txtPhone;
    @FXML
    Button btnAdd, btnUpdate, btnDelete;
    @FXML
    Label lblContacts, lblWarning;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list();
    }

    public void list() {
        List<Contact> contacts = (List<Contact>) contactRepository.findAll();
        listView.getItems().clear();
        listView.getItems().addAll(FXCollections.observableList(contacts));

        lblContacts.setText(String.valueOf(contactRepository.count()));
    }

    @FXML
    public void add() {

        if(txtName.getText().isEmpty()) {
            lblWarning.setText("Name is required");
            return;
        }

        Contact contact = new Contact();
        contact.setName(txtName.getText());
        contact.setEmail(txtEmail.getText());
        contact.setPhone(txtPhone.getText());
        contactRepository.save(contact);

        list();
        clear();
    }

    @FXML
    private void clear() {
        txtId.clear();
        txtName.clear();
        txtEmail.clear();
        txtPhone.clear();
        lblWarning.setText("");
    }

}
