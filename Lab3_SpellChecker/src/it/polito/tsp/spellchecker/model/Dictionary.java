package it.polito.tsp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dictionary { //modello dell'applicazione
	 List<String> WordList = new ArrayList<String>();

	 public void loadDictionary(String language) {
		  try {
			  FileReader fr = new FileReader("rsc/"+language+".txt");
			  BufferedReader br = new BufferedReader(fr);
			  String word;
			 String  Campi[]=null;
			  while((word = br.readLine())!= null) {
				  Campi= word.split("\n");  
			  }
			  for(int i = 0 ; i< Campi.length;i++) {
				  WordList.add(Campi[i]);
			  }
			  br.close();
		  } catch (IOException e) {
			  System.out.println("Errore in lettura File");
		  }
	 }
	 
		 
	 
	 public List<RichWord> spellCheckText(List<String> InputTextList){
		 List<RichWord>ListaRichWordCorrette = new ArrayList<RichWord>();
		 for(String s : InputTextList) {
			 if(WordList.contains(s)) {
				 ListaRichWordCorrette.add(new RichWord(s,true));
			 }
			 else
				 ListaRichWordCorrette.add(new RichWord(s,false));
		 }
		 return ListaRichWordCorrette;
	 }
	 
	 
}
