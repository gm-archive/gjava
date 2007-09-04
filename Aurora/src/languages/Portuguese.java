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

/**
 *
 * @author Luís
 */
public class Portuguese extends Dictionary{
    public Portuguese(){
        status = "Completed";
        language = "Portuguese";
        authors = new String[10];
        authors[0] = "Luís Reis";
        //If you changed this language, add your name here.
        entry = new String[100];
        entry[0] = "Ficheiro";
        entry[1] = "Editar";
        entry[2] = "Ver";
        entry[3] = "Compilar&Executar";
        entry[4] = "Ajuda";
        entry[5] = "Novo Projecto";
        entry[6] = "Novo Ficheiro";
        entry[7] = "Abrir Projecto";
        entry[8] = "Guardar Projecto";
        entry[9] = "Guardar Projecto como";
        entry[10] = "Importar ficheiro";
        entry[11] = "Exportar ficheiro";
        entry[12] = "Fechar projecto";
        entry[13] = "Sair";
        entry[14] = "Apagar consola";
        entry[15] = "Aspecto";
        entry[16] = "Modo de disposição";
        entry[17] = "Aspecto nativo";
        entry[18] = "Aspecto Java";
        entry[19] = "Aspecto Motif";
        entry[20] = "Separadores";
        entry[21] = "MDI";
        entry[22] = "Mostrar consola";
        entry[23] = "Seleccionar idioma";
        entry[24] = "Sobre";
        entry[25] = "Ajuda"; //The menu item, not the menu itself
        entry[26] = "Bem-vindo!"; //Tab name
        entry[27] = "Ajuda!"; //Tab name
        entry[28] = "Seleccionar idioma"; //Tab name
        entry[29] = "Carregamento da aplicação terminado";
        entry[30] = "Erro ao criar ficheiro de definições";
        entry[31] = "Erro ao escrever ficheiro de definições";
        entry[32] = "Erro ao ler ficheiro de definições";
        entry[33] = "A estrutura do ficheiro de definições está incorrecta";
        entry[34] = "Definição em duplicado";
        entry[35] = "Definição em falta";
        entry[36] = "Idioma indisponivel";
        entry[37] = "Bem-vindo ao Aurora,";
        entry[38] = "a próxima geração do G-Creator.";
        //Toolbar
	entry[39] = "Novo Projecto"; 
	entry[40] = "Abrir"; 
	entry[41] = "Guardar"; 
	entry[42] = "Guardar como"; 
	entry[43] = "Adicionar Sprite";
	entry[44] = "Adicionar Som"; 
	entry[45] = "Adicionar Actor";
	entry[46] = "Adicionar Cena";   
        //Language menu
        entry[47] = "Idioma";
        entry[48] = "Estado";
        entry[49] = "Aplicar Idioma";
        entry[50] = "Reinie a aplicação para aplicar as mudanças.";
        //Tree
        entry[51] = "Área de trabalho";
        //Toolbar
        entry[52] = "Adicionar Código";
        //Menu
        entry[53] = "Guardar todos os projectos";
        //New Project Wizard
        entry[54] = "Escolha o tipo do seu projecto";
        entry[55] = "Novo Projecto";
        //Project types
        entry[56] = "Jogos";
        entry[57] = "Caixas";
        entry[58] = "Jogo Vazio";
        entry[59] = "Caixa Vazia";
        //Other settings
        entry[60] = "Nome do Projecto";
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
}
