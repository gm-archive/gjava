/*
 * Spanish.java
 * 
 * Created on October 21, 2007, 22:30
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.languages;

import org.gcreator.units.Dictionary;
import org.gcreator.components.*;
import org.gcreator.exceptions.*;

// Interpretor Note: This isn't a good translation, but I used my brain and the dictionary. Feel free to remove this line.

/**
 *
 * @author John Nahlen (FIREBALL5)
 */
public class Spanish extends Dictionary{
    public Spanish(){
        status = "In Progress/Finalization";
        language = "Spanish";
        authors = new String[10];
        authors[0] = "John Nahlen (FIREBALL5)";
        authors[1] = "Luís Reis"; //Small changes only
        //If you changed this language, add your name here.
        entry = new String[200];
        entry[0] = "Archivo";
        entry[1] = "Redactar"; 
        entry[2] = "Vista";
        entry[3] = "Estructura & Andar";
        entry[4] = "Ayudar";
        entry[5] = "Proyecto Nuevo";
        entry[6] = "Archivo/Grupo Nuevo";
        entry[7] = "Abrir Proyecto";
        entry[8] = "Guardar Proyecto";
        entry[9] = "Guardar Proyecto Como...";
        entry[10] = "Importancia Archivo";
        entry[11] = "Exportado Archivo";
        entry[12] = "Fin Proyecto";
        entry[13] = "Salida"; 
        entry[14] = "Claro Consolar";
        entry[15] = "Mirar y Sentir";
        entry[16] = "Modo de Exhibici�n"; 
        entry[17] = "Mira de Nativo"; // Or can be: "Modo origional (Origional look)"
        entry[18] = "Cruz-plataforma mira"; 
        entry[19] = "Motivo mira";
        entry[20] = "Leng�eta (superficie)";
        entry[21] = "MDI";
        entry[22] = "Exhibicin caja de rendimiento";
        entry[23] = "Selecto idioma";
        entry[24] = "Informatión sobre G-Creator";
        entry[25] = "Ayudar"; //The menu item, not the menu itself
        entry[26] = "Bienvenidos!"; //Tab name // 
        entry[27] = "Ayudarse!"; //Tab name
        entry[28] = "Selecto idioma"; //Tab name
        entry[29] = "Acabada con estoy (la programa) colmando.";
        entry[30] = "No puedo hacer la puesta archivo!";
        entry[31] = "No puedo escribir al archivo de puesta!";
        entry[32] = "No puedo leer del archivo de puesta!";
        entry[33] = "Mal archivo de puesta estructural.";
        entry[34] = "Double puesta nudo";
        entry[35] = "Propiedad de puesta ausente"; 
        entry[36] = "Idioma no es disponible";
        entry[37] = "Bienvenida a 'Aurora',";
        entry[38] = "el siguiente generación de G-Creator.";
        //Toolbar
	entry[39] = "Nuevo Proyecto"; 
	entry[40] = "Abrir";
	entry[41] = "Guardar";
	entry[42] = "Guardar Como...";
	entry[43] = "Sumar Imagen";
	entry[44] = "Sumar Cuerdo";
	entry[45] = "Sumar Actor";
	entry[46] = "Sumar Esenta";
        //Language menu
        entry[47] = "Idioma";
        entry[48] = "Estado";
        entry[49] = "Aplica Idioma";
        entry[50] = "Hay que salidar y cargar la programa para aplicar las vueltas.";
        //Tree
        entry[51] = "Espacio de trabajo"; 
        //Toolbar
        entry[52] = "Sumar Clase";
        //Menu
        entry[53] = "Guarda Todos Proyectos";
        //New Project Wizard
        entry[54] = "Seleccionar los clasifacaci�n de tu proyecto";
        entry[55] = "Nuevo Proyecto";
        entry[56] = "Juegos/Partidos";
        entry[57] = "Paquetes";
        entry[58] = "Juego vácio";
        entry[59] = "Paquete vácio";
        entry[60] = "Proyecto nombre";
        entry[61] = "Paquete de organizar";
        entry[62] = "Extensiones";
        entry[63] = "Extension con nada en lo";
        entry[64] = "Gráficos";
        entry[65] = "Empiezo en el modo de leno-pantilla";
        entry[66] = "Permito el jugador a alterar el tama�o del (pieza) ventana";
        entry[67] = "No dibujar un borde en el modo de ventana";
        entry[68] = "No mostro los bot�nes encima de la ventana";
        entry[69] = "Exhibición el rat�n de la computadora";
        entry[70] = "Exhibición armaz�n por momento (FPS) encima de la ventana";
        entry[71] = "Resolutión";
        entry[72] = "Poner el resolutión de la pantilla";
        entry[73] = "Fondo de los colores"; 
        entry[74] = "Ning�n vueltas";
        //View
        entry[75] = "Vista lista de instrumentos";
        //Find
        entry[76] = "Hallar"; //Title
        entry[77] = "Hallar"; //Label
        entry[78] = "Que texto a hacer una busqueda para:";
        entry[79] = "Hallar"; //Button 
        entry[80] = "Texto Caso-Sensitivo"; 
        entry[81] = "Usar expresi�nes regulares"; 
        entry[82] = "Obsequio \"\\n\" como interrupci�n de lineas";
        //Find&Replace
        entry[83] = "Hallar y Reponer Texto"; //Title
        entry[84] = "Reponer Texto"; //Label
        entry[85] = "c�mo";
        entry[86] = "Reponer"; //Button
        entry[87] = "Reponer Todo";
        //More menu items
        entry[88] = "Guardar archivo"; 
        entry[89] = "Guardar todos archivos";
        entry[90] = "Leng�etas (Izquierda)";
        entry[91] = "Leng�etas (Abajo)";
        entry[92] = "Leng�etas (Derecho)";
        entry[114] = "Instrumentos";
        entry[93] = "Poner al dia"; 
        entry[94] = "Crear";
        //And the new File/Group
        entry[95] = "Nuevo...";
        entry[96] = "Nuevo archivo o proyecto";
        entry[97] = "Norma art�culos"; 
        entry[98] = "Poner como proyecto principal";
        entry[99] = "Limpio proyecto corriente";
        entry[100] = "Limpio proyecto principal";
        entry[101] = "Estructura proyecto corriente";
        entry[102] = "Exam�n proyecto corriente";
        entry[103] = "Estructura & Exam�n proyecto corriente";
        entry[104] = "Estructura final proyecto corriente";
        entry[105] = "Estructura proyecto principal";
        entry[106] = "Exam�n proyecto principal"; 
        entry[107] = "Estructura & Exam�n proyecto principal";
        entry[108] = "Estructura final proyecto principal";
        //Extensions manager
        entry[109] = "Extensi�nes pesebre";
        entry[110] = "Extensi�nes pesebre"; //Title 
        entry[111] = "Sumar extensi�n";
        entry[112] = "Remover";
        entry[113] = "Revertir vueltas";
        //Popup
        //114 is already used
        entry[115] = "Copia mensaje";
        entry[116] = "Cuero consolar";
        entry[117] = "Cuero lista de instrumentos";
        entry[118] = "Importancia imagen";
        entry[119] = "Mirar Cercano";
        //Settings editor again
        entry[120] = "Frecuencia";
        entry[121] = "Otro";
        entry[122] = "Falla Cayos";
        entry[123] = "Dejar <ESC> terminaci�n el juego.";
        entry[124] = "Dejar <F4> mudanza entre modos de la pantilla";
        entry[125] = "Dejar <F5> guardar el juego y <F6> colmarlo.";
        entry[126] = "Estoy colmando";
        entry[127] = "Mostro imagen durante la programa est� colmando";
        entry[128] = "Imagen:";
        entry[129] = "Imagen:";
        
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
    
    @Override
    public String getSpecialEntry(String value){
        if(value.equals("GPlus.CompileCur"))
            return "Compile Current Extension";
        if(value.equals("GAH.Menu"))
            return "Advanced";
        if(value.equals("GAH.GC"))
            return "Force garbage collection";
        return "";
    }
}
