package it.polito.tdp.spellchecker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tsp.spellchecker.model.Dictionary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SpellCheckerController {
	Dictionary model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> BottoneLingue;

    @FXML
    private TextField TextInsert;

    @FXML
    private Button TastoSpellCheck;

    @FXML
    private TextArea TextShow;

    @FXML
    private Button TastoClearText;

    @FXML
    void ChooseLanguage(ActionEvent event) {
     if(BottoneLingue.getValue().contains("English")) {
    	 model.loadDictionary("English");
    	 if(BottoneLingue.getValue().contains("Italian")) {
    		 model.loadDictionary("Italian");
    	 }
     }
    }

    @FXML
    void InserisciTesto(ActionEvent event) {

    }

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BottoneLingue != null : "fx:id=\"BottoneLingue\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert TextInsert != null : "fx:id=\"TextInsert\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert TastoSpellCheck != null : "fx:id=\"TastoSpellCheck\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert TextShow != null : "fx:id=\"TextShow\" was not injected: check your FXML file 'SpellChecker.fxml'.";
        assert TastoClearText != null : "fx:id=\"TastoClearText\" was not injected: check your FXML file 'SpellChecker.fxml'.";

    }

	public void setModel(Dictionary model) {
		this.model= model;
	}
    
}

