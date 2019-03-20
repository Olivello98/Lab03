package it.polito.tsp.spellchecker.model;


public class RichWord {
String word;
boolean Correct = true;
public RichWord(String word, boolean correct) {

	this.word = word;
	Correct = correct;
}
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public boolean isCorrect() {
	return Correct;
}
public void setCorrect(boolean correct) {
	Correct = correct;
}

 
 
}
