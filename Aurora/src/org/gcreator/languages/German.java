/*
 * German.java
 * 
 * Created on 18/Oct/2007,19:48:00
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.languages;

import org.gcreator.units.Dictionary;
import org.gcreator.components.*;
import org.gcreator.exceptions.*;
import org.gcreator.units.*;

/**
 *
 * @author Luís
 */
public class German extends Dictionary{
    public German(){
        status = "Finished";
        language = "German";
        authors = new String[10];
        authors[0] = "André Reichelt";
        //If you changed this language, add your name here.
        entry = new String[200];
        entry[0] = "Datei";
        entry[1] = "Bearbeiten";
        entry[2] = "Ansicht";
        entry[3] = "Kompilieren & Starten";
        entry[4] = "Hilfe";
        entry[5] = "Neues Projekt";
        entry[6] = "Neue Datei/Gruppe";
        entry[7] = "Projekt öffnen...";
        entry[8] = "Projekt speichern";
        entry[9] = "Projekt speichern als...";
        entry[10] = "Importieren...";
        entry[11] = "Exportieren...";
        entry[12] = "Projekt schließen";
        entry[13] = "Beenden";
        entry[14] = "Konsole leeren";
        entry[15] = "Look & Feel";
        entry[16] = "Anzeigemodus";
        entry[17] = "Systemeigener Stil";
        entry[18] = "Plattformübergreifender Stil";
        entry[19] = "Motif-Stil";
        entry[20] = "Tabs (Oben)";
        entry[21] = "Seperate Fenster";
        entry[22] = "Zeige Ausgabe-Box";
        entry[23] = "Sprache wählen...";
        entry[24] = "Über";
        entry[25] = "Hilfe"; //The menu item, not the menu itself
        entry[26] = "Herzlich Willkommen!"; //Tab name
        entry[27] = "Hilfe!"; //Tab name
        entry[28] = "Sprachauswahl"; //Tab name
        entry[29] = "Das Programm wurde vollständig geladen.";
        entry[30] = "Fehler bei der Erstellung der Einstellungsdatei";
        entry[31] = "Fehler beim Schreiben in die Einstellungsdatei";
        entry[32] = "Fehler beim Lesen aus der Einstellungsdatei";
        entry[33] = "Fehlerhafte Struktur der Einstellungsdatei";
        entry[34] = "Einstellung doppelt gesetzt";
        entry[35] = "Fehlende Einstellung in der Einstellungsdatei";
        entry[36] = "Sprache nicht verfügbar";
        entry[37] = "Herzlich Willkommen bei Aurora,";
        entry[38] = "die nächste Generation des G-Creators.";
        //Toolbar
	entry[39] = "Neues Projekt"; 
	entry[40] = "Öffnen"; 
	entry[41] = "Speichern"; 
	entry[42] = "Speichern Unter..."; 
	entry[43] = "Sprite hinzufügen";
	entry[44] = "Sound hinzufügen"; 
	entry[45] = "Actor hinzufügen";
	entry[46] = "Scene hinzufügen";
        //Language menu
        entry[47] = "Sprache";
        entry[48] = "Status";
        entry[49] = "Sprache Übernehmen";
        entry[50] = "Starten Sie das Programm neu, um die Änderungen zu übernehmen.";
        //Tree
        entry[51] = "Arbeitsplatz";
        //Toolbar
        entry[52] = "Klasse hinzufügen";
        //Menu
        entry[53] = "Speichere alle Projekte";
        //New Project Wizard
        entry[54] = "Bitte wählen Sie den Typ des Projekts aus";
        entry[55] = "Neues Projekt";
        entry[56] = "Spiele";
        entry[57] = "Pakete";
        entry[58] = "Leeres Spiel";
        entry[59] = "Leeres Paket";
        entry[60] = "Projektname";
        entry[61] = "Organisiertes Paket";
        entry[62] = "Erweiterungen";
        entry[63] = "Leere Erweiterung";
        entry[64] = "Grafiken";
        entry[65] = "Im Vollbild-Modus starten";
        entry[66] = "Der Spieler kann die Raum-Fenstergröße verändern";
        entry[67] = "Zeige keinen Rahmen im Fenstermodus";
        entry[68] = "Zeige keine Knöpfe in der Kopfzeile des Fensters";
        entry[69] = "Zeige den Mauszeiger";
        entry[70] = "Zeige die Bilder pro Sekunde (FPS) in der Kopfzeile des Fensters";
        entry[71] = "Auflösung";
        entry[72] = "Setze die Bildschirm-Auflösung";
        entry[73] = "Farbtiefe";
        entry[74] = "Keine Änderung";
        //View
        entry[75] = "Zeige die Toolbar";
        //Find
        entry[76] = "Finde"; //Title
        entry[77] = "Finde"; //Label
        entry[78] = "Text, der gesucht werden soll";
        entry[79] = "Finde"; //Button
        entry[80] = "Groß-/Kleinschreibung beachten"; 
        entry[81] = "Nutze geläufige Ausdrücke";
        entry[82] = "Behandle \\n als Zeilenumbruch";
        //Find&Replace
        entry[83] = "Finde & ersetze"; //Title
        entry[84] = "Ersetze"; //Label
        entry[85] = "durch";
        entry[86] = "Ersetze"; //Button
        entry[87] = "Ersetze alle";
        //More menu items
        entry[88] = "Speichere Datei";
        entry[89] = "Speichere alle Dateien";
        entry[90] = "Tabs (Links)";
        entry[91] = "Tabs (Unten)";
        entry[92] = "Tabs (Rechts)";
        entry[114] = "Werkzeuge";
        entry[93] = "Update";
        entry[94] = "Erzeuge";
        //And the new File/Group
        entry[95] = "Neu...";
        entry[96] = "Neue Datei oder Gruppe";
        entry[97] = "Standardbegriffe";
        entry[98] = "Setze als Hauptprojekt";
        entry[99] = "Säubere aktuelles Projekt";
        entry[100] = "Säubere Hauptprojekt";
        entry[101] = "Erzeuge aktuelles Projekt";
        entry[102] = "Teste aktuelles Projekt";
        entry[103] = "Erzeuge und teste aktuelles Projekt";
        entry[104] = "Erzeuge aktuelles Projekt endgültig";
        entry[105] = "Erzeuge Hauptprojekt";
        entry[106] = "Teste Hauptprojekt";
        entry[107] = "Erzeuge und teste Hauptprojekt";
        entry[108] = "Erzeuge aktuelles Hauptpndgültig";
        //Extensions manager
        entry[109] = "Erweiterungs-Manager";
        entry[110] = "Erweiterungs-Manager"; //Title
        entry[111] = "Füge hinzu";
        entry[112] = "Lösche";
        entry[113] = "Setze Änderungen zurück";
        //Popup
        //114 is already used
        entry[115] = "Kopiere Nachricht";
        entry[116] = "Verstecke Konsole";
        entry[117] = "Verstecke Toolbar";
        entry[118] = "Importiere Bild";
        entry[119] = "Zoom";
        //Settings editor again
        entry[120] = "Frequenz";
        entry[121] = "Andere";
        entry[122] = "Standart-Taste";
        entry[123] = "Lass' <ESC> das Spiel beenden";
        entry[124] = "Lass' <F4> zwischen Bildschirmmodi umschalten";
        entry[125] = "Lass' <F5> das Spiel speichern <F6> laden.";
        entry[126] = "Lade...";
        entry[127] = "Zeige Bild beim Laden";
        entry[128] = "Bild:";
        entry[129] = "Icon:";
        //Options
        entry[130] = "Globale Einstellungen";
        entry[131] = "Globale Einstellungen"; //Title
        //---
        entry[132] = "Metall-Theme";
        //Sprite editor
        entry[133] = "Füge hinzu";
        entry[134] = "Bearbeite";
        entry[135] = "Lösche";
        
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
    
     
    public String getSpecialEntry(String value){
        if(value.equals("GPlus.CompileCur"))
            return "Kompiliere aktuelle Erweiterung";
        if(value.equals("GAH.Menu"))
            return "Erweitert";
        if(value.equals("GAH.GC"))
            return "Erzwinge das Sammeln von Ausschussdaten";
        return "";
    }
}
