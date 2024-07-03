package com.mdemiguels.contactList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContactListApplication extends Application {

	ConfigurableApplicationContext context;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {

		context = SpringApplication.run(ContactListApplication.class);

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/mdemiguels/contactList/ContactListApplication.fxml"));
		fxmlLoader.setControllerFactory(context::getBean);

		Scene scene = new Scene(fxmlLoader.load());

		stage.setTitle("Contact List Application");
		stage.setScene(scene);
		stage.show();

	}
}
