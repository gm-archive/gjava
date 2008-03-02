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
        authors[2] = "Luis Peregrina"; //Major Corrections
        //If you changed this language, add your name here.
        entry = new String[300];
        entry[0] = "Archivo";
        entry[1] = "Editar"; 
        entry[2] = "Ver";
        entry[3] = "Construir y Ejecutar";
        entry[4] = "Ayudar";
        entry[5] = "Proyecto Nuevo";
        entry[6] = "Archivo/Grupo Nuevo";
        entry[7] = "Abrir Proyecto";
        entry[8] = "Guardar Proyecto";
        entry[9] = "Guardar Proyecto Como...";
        entry[10] = "Importar Archivo";
        entry[11] = "Exportar Archivo";
        entry[12] = "Cerrar Proyecto";
        entry[13] = "Salida"; 
        entry[14] = "Limpiar Consola";
        entry[15] = "Modo Visual";
        entry[16] = "Modo de Exhibición"; 
        entry[17] = "Modo Visual Original"; // Or can be: "Modo origional (Origional look)"
        entry[18] = "Modo Visual Multi-Plataforma"; 
        entry[19] = "Modo Motif";
        entry[20] = "Pestañas (Arriba)";
        entry[21] = "Interfaz de Múltiples Documentos";
        entry[22] = "Mostrar Caja de Salida";
        entry[23] = "Seleccionar Idioma";
        entry[24] = "Información sobre G-Creator";
        entry[25] = "Ayuda"; //The menu item, not the menu itself
        entry[26] = "¡Bienvenido!"; //Tab name // 
        entry[27] = "¡Ayuda!"; //Tab name
        entry[28] = "Seleccionar idioma"; //Tab name
        entry[29] = "Se terminó de cargar la aplicación.";
        entry[30] = "¡Error al crear el archivo de configuraciones!";
        entry[31] = "¡Error al escribir el archivo de configuraciones!";
        entry[32] = "¡Error al leer el archivo de configuraciones!";
        entry[33] = "Mala estructura del archivo de configuraciones.";
        entry[34] = "Doble nodo de configuraciones";
        entry[35] = "Propiedad de configuración ausente"; 
        entry[36] = "Idioma no disponible";
        entry[37] = "Bienvenido(a) a 'Aurora',";
        entry[38] = "la siguiente generación de G-Creator.";
        //Toolbar
	entry[39] = "Nuevo Proyecto"; 
	entry[40] = "Abrir";
	entry[41] = "Guardar";
	entry[42] = "Guardar Como...";
	entry[43] = "Agregar Sprite";
	entry[44] = "Agregar Sonido";
	entry[45] = "Agregar Actor";
	entry[46] = "Agregar Escena";
        //Language menu
        entry[47] = "Idioma";
        entry[48] = "Estado";
        entry[49] = "Aplicar Idioma";
        entry[50] = "Hay que reiniciar el programa para aplicar los cambios.";
        //Tree
        entry[51] = "Espacio de trabajo"; 
        //Toolbar
        entry[52] = "Añadir Clase";
        //Menu
        entry[53] = "Guardar Todos los Proyectos";
        //New Project Wizard
        entry[54] = "Selecciona el tipo de tu proyecto";
        entry[55] = "Nuevo Proyecto";
        entry[56] = "Juegos";
        entry[57] = "Paquetes";
        entry[58] = "Juego vacío";
        entry[59] = "Paquete vacío";
        entry[60] = "Nombre del Proyecto";
        entry[61] = "Organizar Paquete";
        entry[62] = "Extensiones";
        entry[63] = "Extensión vacía";
        entry[64] = "Gráficos";
        entry[65] = "Empezar con Pantalla Completa";
        entry[66] = "Permitir al usuario cambiar el tamaño de la ventana";
        entry[67] = "No dibujar el borde en el modo de ventana";
        entry[68] = "No mostrar los botones en el título de la ventana";
        entry[69] = "Mostrar el ratón";
        entry[70] = "Mostrar los FPS (Cuadros Por Segundo) en el título de la venana.";
        entry[71] = "Resolución";
        entry[72] = "Poner la resolución de la ventana";
        entry[73] = "Profundidad de los Colores"; 
        entry[74] = "No Cambiar";
        //View
        entry[75] = "Ver barra de herramientas";
        //Find
        entry[76] = "Buscar"; //Title
        entry[77] = "Buscar"; //Label
        entry[78] = "Texto a buscar";
        entry[79] = "Buscar"; //Button 
        entry[80] = "Sensible a Mayúsculas/Minúsculas"; 
        entry[81] = "Usar expresiones regulares"; 
        entry[82] = "Tratar \\n como línea nueva";
        //Find&Replace
        entry[83] = "Buscar y Reemplazar Texto"; //Title
        entry[84] = "Reemplazar Texto"; //Label
        entry[85] = "por";
        entry[86] = "Reemplazar"; //Button
        entry[87] = "Reemplazar Todo";
        //More menu items
        entry[88] = "Guardar archivo"; 
        entry[89] = "Guardar todos los archivos";
        entry[90] = "Pestañas (Izquierda)";
        entry[91] = "Pestañas (Abajo)";
        entry[92] = "Pestañas (Derecho)";
        entry[114] = "Herramientas";
        entry[93] = "Actualizar"; 
        entry[94] = "Crear";
        //And the new File/Group
        entry[95] = "Nuevo...";
        entry[96] = "Archivo o Grupo Nuevo";
        entry[97] = "Artículos normales"; 
        entry[98] = "Poner como proyecto principal";
        entry[99] = "Limpiar proyecto actual";
        entry[100] = "Limpiar proyecto principal";
        entry[101] = "Construir proyecto actual";
        entry[102] = "Examinar proyecto actual";
        entry[103] = "Construir y Examinar proyecto actual";
        entry[104] = "Construcción final del proyecto actual";
        entry[105] = "Construir proyecto principal";
        entry[106] = "Examinar proyecto principal"; 
        entry[107] = "Construir & Examinar proyecto principal";
        entry[108] = "Construcción final del proyecto principal";
        //Extensions manager
        entry[109] = "Administrador de Extensiones";
        entry[110] = "Administrador de Extensiones"; //Title 
        entry[111] = "Agregar";
        entry[112] = "Remover";
        entry[113] = "Deshacer cambios";
        //Popup
        //114 is already used
        entry[115] = "Copiar mensaje";
        entry[116] = "Esconder la consola";
        entry[117] = "Esconder la Barra de Herramientas";
        entry[118] = "Importar imagen";
        entry[119] = "Acercar";
        //Settings editor again
        entry[120] = "Frecuencia";
        entry[121] = "Otro";
        entry[122] = "Teclas por default";
        entry[123] = "Tratar <ESC> como terminación del juego.";
        entry[124] = "Tratar <F4> como cambio de modo de pantalla";
        entry[125] = "Hacer que <F5> guarde y <F6> cargue el juego.";
        entry[126] = "Cargando";
        entry[127] = "Mostrar imagen mientras se carga";
        entry[128] = "Imagen:";
        entry[129] = "Icono:";
        //Options
        entry[130] = "Configuraciones globales";
        entry[131] = "Configuraciones globales"; //Title
        //---
        entry[132] = "Tema Metal";
        //Sprite editor
        entry[133] = "Añadir a Sprite";
        entry[134] = "Editar";
        entry[135] = "Remover";
        entry[136] = "Nombre:";
        entry[137] = "Sprite";
        entry[138] = "Editar";
        entry[139] = "Visible";
        entry[140] = "Sólido";
        entry[141] = "Persistente";
        entry[142] = "Fondo:";
        entry[143] = "Extender a:";
        entry[144] = "Máscara:";
        entry[145] = "Añadir Evento";
        entry[146] = "Añadir";
        entry[147] = "Actores";
        entry[148] = "Configuraciones";
        entry[149] = "Fondos";
        entry[150] = "Vistas";
        entry[151] = "Añadir";
        entry[152] = "Remover";
        entry[153] = "Habilitar el uso de vistas";
        entry[154] = "<HTML>Visible cuando la<br/> escena inicia";
        entry[155] = "Ver en escena";
        entry[156] = "Puerto en la pantalla";
        entry[157] = "Dibujar Color de Fondo";
        entry[158] = "Color:";
        entry[159] = "Nombre:";
        entry[160] = "Título para la escena:";
        entry[161] = "Ancho";
        entry[162] = "Alto";
        entry[163] = "Velocidad";
        entry[164] = "Persistente";
        entry[165] = "Código de Creación";
        entry[166] = "Nombre:";
        entry[167] = "Reproducir";
        entry[168] = "Reproducir y volver";
        entry[169] = "Detener";
        entry[170] = "Cargar Sonido";
        entry[171] = "Macros";
        entry[172] = "Reproducir macro";
        entry[173] = "Editar macro";   
        entry[174] = "Grabar nuevo macro";
        entry[175] = "Elegir el nombre del macro";
        entry[176] = "Error del Grabado del Macro";
        entry[177] = "Macro con el mismo nombre ya existe";
        entry[178] = "Elige el Macro a reproducir";
        entry[179] = "Cancelar";
        entry[180] = "Reproducir Macro";
        entry[181] = "Reproductor Macro";
        entry[182] = "Detener el grabado del macro";
        entry[183] = "Importar desde PowerPack";
        entry[184] = "Explorador PowerPack";
        entry[185] = "Archivo";
        entry[186] = "Proyecto";
        entry[187] = "Elegir recurso a importar";
        entry[188] = "Filtro";
        entry[189] = "Imagen"; //From the Import Menu
        entry[190] = "Agregar un Set de Azulejo";
        //Tileset Editor
        entry[191] = "Nombre";
        entry[192] = "Empezar En";
        //Workspace position
        entry[193] = "Posición del árbol del espacio de trabajo";
        entry[194] = "Izquierdo";
        entry[195] = "Derecho";
        entry[196] = "PELIGRO:";
        entry[197] = "<HTML>Si usas un recurso PowerPack, tu juego<br/>" +
                "<b>DEBE</b> estar bajo la licencia GPL v3";
        entry[198] = "Añadir Imagen";
        entry[199] = "Principal";
        entry[200] = "Mover";
        entry[201] = "Dibujar 2D";
        entry[202] = "Portapapeles";
        entry[203] = "Sistema";
        entry[204] = "Añadir línea de tiempo";
        entry[205] = "Vaciar Módulo";
        entry[206] = "Módulos";
        entry[207] = "Añadir script";
        entry[208] = "Escenas";
        entry[209] = "Imágenes";
        entry[210] = "Sprites";
        entry[211] = "Sets de Azulejos";
        entry[212] = "Sonidos";
        entry[213] = "Lineas de Tiempo";
        entry[214] = "Actores";
        entry[215] = "Escenas";
        entry[216] = "Clases";
        entry[217] = "Distribución";
        entry[218] = "Configuraciones";
        entry[219] = "Empezar bloque";
        entry[220] = "Terminar bloque";
        entry[221] = "Comentario";
        entry[222] = "Ejecutar código";
        entry[223] = "Asignar la velocidad horizontal";
        entry[224] = "Asignar la velocidad horizontal de $who a $what";
        entry[225] = "Asignar la velocidad vertical";
        entry[226] = "Asignar la velocidad vertical de $who a $what";
        entry[227] = "Ir a la siguiente escena";
        entry[228] = "Ir a la escena previa";
        entry[229] = "Añadir imagen a sprite";
        entry[230] = "Si el Portapapeles tiene texto";
        entry[231] = "Si el Portapapeles está vacío";
        entry[232] = "URL de la imagen";
        entry[233] = "Cuidado: No es recomendado cargar imágenes del internet.";
        
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
    
     
    public String getSpecialEntry(String value){
        if(value.equals("GPlus.CompileCur"))
            return "Compilar Extensión Actual";
        if(value.equals("GAH.Menu"))
            return "Avanzado";
        if(value.equals("GAH.GC"))
            return "Forzar colección de basura";
        return "";
    }
}
