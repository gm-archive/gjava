/*
 * English.java
 * 
 * Created on 4/Set/2007, 11:22:39
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package languages;

import units.Dictionary;
import components.*;
import exceptions.*;

/**
 *
 * @author Luís
 */
public class German extends Dictionary{
    public German(){
        status = "In Development";
        language = "German";
        authors = new String[10];
        authors[0] = "Benjamin Biglari";
        //If you changed this language, add your name here.
        entry = new String[200];
        entry[0] = "Datei";
        entry[1] = "Bearbeiten";
        entry[2] = "Ansicht";
        entry[3] = "Kompilieren&Rennen";
        entry[4] = "Hilfe";
        entry[5] = "Neues Projekt";
        entry[6] = "Neue Datei";
        entry[7] = "Projekt �ffnen";
        entry[8] = "Speichern";
        entry[9] = "Speichern als";
        entry[10] = "Datei importieren";
        entry[11] = "Datei exportieren";
        entry[12] = "Projekt schlie�en";
        entry[13] = "Beenden";
        entry[14] = "Konsole kl�ren";
        entry[15] = "Sehen&F�hlen";
        entry[16] = "Anzeigemodus";
        entry[17] = "Native Ansicht";
        entry[18] = "Quer-Platform Ansicht";
        entry[19] = "Motif Ansicht";
        entry[20] = "Vorspr�nge";
        entry[21] = "Mehrfache Dokumentschnittstelle";
        entry[22] = "Bildschirmausgabekasten";
        entry[23] = "W�hle eine Sprache";
        entry[24] = "�ber";
        entry[25] = "Hilfe"; //The menu item, not the menu itself
        entry[26] = "Wilkommen!"; //Tab name
        entry[27] = "Hilfe!"; //Tab name
        entry[28] = "W�hle eine Sprache"; //Tab name
        entry[29] = "Fertig mit dem laden des Programs.";
        entry[30] = "Error bei der Entwickelung der Einstellungsdatei";
        entry[31] = "Error beim schreiben des Einstellungsdatei";
        entry[32] = "Error beim lesen des Einstellungsdateis";
        entry[33] = "Schlechte Einstellungsdatei struktur";
        entry[34] = "Einstellungsknoten verdoppelt";
        entry[35] = "Fehlende Einstellungseigenschaft";
        entry[36] = "Sprache nicht verf�gbar";
        entry[37] = "Wilkommen bei Aurora,";
        entry[38] = "die n�chste Generation des G-Creators.";
        //Toolbar
	entry[39] = "Neu"; 
	entry[40] = "�ffnen"; 
	entry[41] = "Speichern"; 
	entry[42] = "Speichern Als"; 
	entry[43] = "Sprite Hinzuf�gen";
	entry[44] = "Ton Hinzuf�gen"; 
	entry[45] = "Schauspieler Hinzuf�gen";
	entry[46] = "Szene Hinzuf�gen";   
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
}
