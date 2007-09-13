/*
 * English.java
 * 
 * Created on 4/Set/2007, 11:22:39
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package languages;

import components.*;
import exceptions.*;
import units.Dictionary;
import java.util.Enumeration;

/**
 *
 * @author Luís
 */
public class German extends Dictionary{
    public German(){
        status = "In Development";
        language = "German";
        authors = new String[10];
        authors[0] = "B Biglari";
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
        entry[31] = "Error beim schreiben der Einstellungsdatei";
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
        //Language menu
        entry[47] = "Sprache";
        entry[48] = "Status";
        entry[49] = "Sprache �bernehmen";
        entry[50] = "Applikation neustarten um ver�nderungen zu �bernehmen";
        //Tree
        entry[51] = "Arbeitsbereich";
        //Toolbar
        entry[52] = "Skript Hinzuf�gen";
        //Menu
        entry[53] = "Alle Projekte Speichern";
        //New Project Wizard
        entry[54] = "W�hle den typ des Projekts";
        entry[55] = "Neues Projekt";
        entry[56] = "Spiele";
        entry[57] = "Pakete";
        entry[58] = "Lehres Spiel";
        entry[59] = "Lehres Paket";
        entry[60] = "Projekt Name";
        entry[61] = "Organisiertes Paket";
        entry[62] = "Verl�ngerung";
        entry[63] = "Lehre Verl�ngerung";
        entry[64] = "Graphiken";
        entry[65] = "Start in full-screen mode";
        entry[66] = "Allaubt dem Benutzer das Zimmer zu verkleinern";
        entry[67] = "Male keine Grenze im Fenstermodus";
        entry[68] = "Zeige keine Kn�pfe im Fensteruntertitel";
        entry[69] = "Maus Anzeigen";
        entry[70] = "FPS in der Fenster Anzeige anzeigen";
        entry[71] = "Aufl�sung";
        entry[72] = "Die Aufl�sung des Schirms setzen";
        entry[73] = "Farbtiefe";
        entry[74] = "Keine �nderungen";
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Enumeration keys() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Enumeration elements() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object get(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object put(Object key, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object remove(Object key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
