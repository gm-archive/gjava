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
        authors[0] = "Andr\u00E9 Reichelt";
        //If you changed this language, add your name here.
        entry = new String[200];
        entry[0] = "Datei";
        entry[1] = "Bearbeiten";
        entry[2] = "Ansicht";
        entry[3] = "Kompilieren & Starten";
        entry[4] = "Hilfe";
        entry[5] = "Neues Projekt";
        entry[6] = "Neue Datei/Gruppe";
        entry[7] = "Projekt \u00F6ffnen...";
        entry[8] = "Projekt speichern";
        entry[9] = "Projekt speichern als...";
        entry[10] = "Importieren...";
        entry[11] = "Exportieren...";
        entry[12] = "Projekt schlie\u00DFen";
        entry[13] = "Beenden";
        entry[14] = "Konsole leeren";
        entry[15] = "Look & Feel";
        entry[16] = "Anzeigemodus";
        entry[17] = "Systemeigener Stil";
        entry[18] = "Plattform\u00FCbergreifender Stil";
        entry[19] = "Motif-Stil";
        entry[20] = "Tabs (Oben)";
        entry[21] = "Seperate Fenster";
        entry[22] = "Zeige Ausgabe-Box";
        entry[23] = "Sprache w\u00E4hlen...";
        entry[24] = "\u00DCber";
        entry[25] = "Hilfe"; //The menu item, not the menu itself
        entry[26] = "Herzlich Willkommen!"; //Tab name
        entry[27] = "Hilfe!"; //Tab name
        entry[28] = "Sprachauswahl"; //Tab name
        entry[29] = "Das Programm wurde vollst\u00E4ndig geladen.";
        entry[30] = "Fehler bei der Erstellung der Einstellungsdatei";
        entry[31] = "Fehler beim Schreiben in die Einstellungsdatei";
        entry[32] = "Fehler beim Lesen aus der Einstellungsdatei";
        entry[33] = "Fehlerhafte Struktur der Einstellungsdatei";
        entry[34] = "Einstellung doppelt gesetzt";
        entry[35] = "Fehlende Einstellung in der Einstellungsdatei";
        entry[36] = "Sprache nicht verf\u00FCgbar";
        entry[37] = "Herzlich Willkommen bei Aurora,";
        entry[38] = "die n\u00E4chste Generation des G-Creators.";
        //Toolbar
	entry[39] = "Neues Projekt"; 
	entry[40] = "\u00D6ffnen"; 
	entry[41] = "Speichern"; 
	entry[42] = "Speichern Unter..."; 
	entry[43] = "Sprite hinzuf\u00FCgen";
	entry[44] = "Sound hinzuf\u00FCgen"; 
	entry[45] = "Actor hinzuf\u00FCgen";
	entry[46] = "Scene hinzuf\u00FCgen";
        //Language menu
        entry[47] = "Sprache";
        entry[48] = "Status";
        entry[49] = "Sprache \u00DCbernehmen";
        entry[50] = "Starten Sie das Programm neu, um die \u00C4nderungen zu \u00FCbernehmen.";
        //Tree
        entry[51] = "Arbeitsplatz";
        //Toolbar
        entry[52] = "Klasse hinzuf\u00FCgen";
        //Menu
        entry[53] = "Speichere alle Projekte";
        //New Project Wizard
        entry[54] = "Bitte w\u00E4hlen Sie den Typ des Projekts aus";
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
        entry[66] = "Der Spieler kann die Raum-Fenstergr\u00F6\u00DFe ver\u00E4ndern";
        entry[67] = "Zeige keinen Rahmen im Fenstermodus";
        entry[68] = "Zeige keine Kn\u00F6pfe in der Kopfzeile des Fensters";
        entry[69] = "Zeige den Mauszeiger";
        entry[70] = "Zeige die Bilder pro Sekunde (FPS) in der Kopfzeile des Fensters";
        entry[71] = "Aufl\u00F6sung";
        entry[72] = "Setze die Bildschirm-Aufl\u00F6sung";
        entry[73] = "Farbtiefe";
        entry[74] = "Keine \u00C4nderung";
        //View
        entry[75] = "Zeige die Toolbar";
        //Find
        entry[76] = "Finde"; //Title
        entry[77] = "Finde"; //Label
        entry[78] = "Text, der gesucht werden soll";
        entry[79] = "Finde"; //Button
        entry[80] = "Gro\u00DF-/Kleinschreibung beachten"; 
        entry[81] = "Nutze gel\u00E4ufige Ausdr\u00FCcke";
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
        entry[99] = "S\u00E4ubere aktuelles Projekt";
        entry[100] = "S\u00E4ubere Hauptprojekt";
        entry[101] = "Erzeuge aktuelles Projekt";
        entry[102] = "Teste aktuelles Projekt";
        entry[103] = "Erzeuge und teste aktuelles Projekt";
        entry[104] = "Erzeuge aktuelles Projekt endg\u00FCltig";
        entry[105] = "Erzeuge Hauptprojekt";
        entry[106] = "Teste Hauptprojekt";
        entry[107] = "Erzeuge und teste Hauptprojekt";
        entry[108] = "Erzeuge aktuelles Hauptpndg\u00FCltig";
        //Extensions manager
        entry[109] = "Erweiterungs-Manager";
        entry[110] = "Erweiterungs-Manager"; //Title
        entry[111] = "F\u00FCge hinzu";
        entry[112] = "L\u00F6sche";
        entry[113] = "Setze \u00C4nderungen zur\u00FCck";
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
        entry[133] = "F\u00FCge hinzu";
        entry[134] = "Bearbeite";
        entry[135] = "L\u00F6sche";
        
        
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
