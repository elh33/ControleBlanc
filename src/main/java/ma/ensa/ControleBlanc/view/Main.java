package ma.ensa.ControleBlanc.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ma.ensa.ControleBlanc.dao.MembreDao;
import ma.ensa.ControleBlanc.dao.impl.MembreDaoImpl;
import ma.ensa.ControleBlanc.models.Membre;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Création des composants
        TextField nomField = new TextField();
        nomField.setPromptText("Nom");
        TextField prenomField = new TextField();
        prenomField.setPromptText("Prénom");
        TextField emailField = new TextField();
        emailField.setPromptText("Email");
        TextField phoneField = new TextField();
        phoneField.setPromptText("Téléphone");
        Button insererButton = new Button("Insérer");

        // Mise en page des composants
        VBox root = new VBox(20, nomField, prenomField, emailField, phoneField, insererButton);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(40));

        // Création et configuration de la scène
        Scene scene = new Scene(root, 400, 350);
        scene.getStylesheets().add("styles.css");
        primaryStage.setTitle("Ajouter un nouveau membre");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Gestion de l'événement du bouton "Insérer"
        insererButton.setOnAction(event -> {
            String identifiant = java.util.UUID.randomUUID().toString();
            Membre membre = new Membre(
                    identifiant,
                    nomField.getText(),
                    prenomField.getText(),
                    emailField.getText(),
                    phoneField.getText()
            );

            MembreDao membreDao = new MembreDaoImpl();
            membreDao.insere(membre);

            // Réinitialiser les champs
            nomField.clear();
            prenomField.clear();
            emailField.clear();
            phoneField.clear();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}