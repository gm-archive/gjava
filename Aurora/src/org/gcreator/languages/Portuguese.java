/*
 * English.java
 * 
 * Created on 4/Set/2007, 11:22:39
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
 * @author Luís
 */
public class Portuguese extends Dictionary{
    public Portuguese(){
        status = "Finished";
        language = "Portuguese (European)";
        authors = new String[10];
        authors[0] = "Luís Reis";
        //If you changed this language, add your name here.
        entry = new String[200];
        entry[0] = "Ficheiro";
        entry[1] = "Editar";
        entry[2] = "Ver";
        entry[3] = "Compilar&Executar";
        entry[4] = "Ajuda";
        entry[5] = "Novo Projecto";
        entry[6] = "Novo Ficheiro/Grupo";
        entry[7] = "Abrir Projecto";
        entry[8] = "Guardar Projecto";
        entry[9] = "Guardar Projecto como";
        entry[10] = "Importar...";
        entry[11] = "Exportar...";
        entry[12] = "Fechar projecto";
        entry[13] = "Sair";
        entry[14] = "Apagar consola";
        entry[15] = "Aspecto";
        entry[16] = "Modo de disposição";
        entry[17] = "Aspecto nativo";
        entry[18] = "Aspecto Java";
        entry[19] = "Aspecto Motif";
        entry[20] = "Separadores (Cima)";
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
        entry[56] = "Jogos";
        entry[57] = "Caixas";
        entry[58] = "Jogo Vazio";
        entry[59] = "Caixa Vazia";
        entry[60] = "Nome do Projecto";
        entry[61] = "Caixa Organizada";
        entry[62] = "Extensões";
        entry[63] = "Extensão Vazia";
        entry[64] = "Gráficos";
        entry[65] = "Começar em modo de tela cheia";
        entry[66] = "Permitir ao jogador redimensionar a janela";
        entry[67] = "Não desenhar os limites da janela em modo de janela";
        entry[68] = "Não mostrar os botões no topo da janela";
        entry[69] = "Mostrar o rato";
        entry[70] = "Mostrar as Frames por segundo no titulo da janela";
        entry[71] = "Resolução";
        entry[72] = "Definir a resolução do ecrã";
        entry[73] = "Qualidade de cor";
        entry[74] = "Não mudar";
        //View
        entry[75] = "Ver barra de ferramentas";
        //Find
        entry[76] = "Procurar"; //Title
        entry[77] = "Procurar"; //Label
        entry[78] = "Texto a encontrar";
        entry[79] = "Procurar"; //Button
        entry[80] = "Sensível a maiúsculas/minúsculas";
        entry[81] = "Usar expressões regulares";
        entry[82] = "Tratar \\n como mudança de linha";
        //Find&Replace
        entry[83] = "Procurar e Substituir"; //Title
        entry[84] = "Substituir"; //Label
        entry[85] = "por";
        entry[86] = "Substituir"; //Button
        entry[87] = "Substituir todos";
        //More menu items
        entry[88] = "Guardar ficheiro";
        entry[89] = "Guardar todos os ficheiros";
        entry[90] = "Separadores (Esquerda)";
        entry[91] = "Separadores (Baixo)";
        entry[92] = "Separadores (Direita)";
        entry[114] = "Ferramentas";
        entry[93] = "Actualizar";
        entry[94] = "Criar";
        //And the new File/Group
        entry[95] = "Novo...";
        entry[96] = "Novo ficheiro ou grupo";
        entry[97] = "Items comuns";
        entry[98] = "Definir como projecto principal";
        entry[99] = "Limpar projecto actual";
        entry[100] = "Limpar projecto principal";
        entry[101] = "Compilar projecto actual";
        entry[102] = "Testar projecto actual";
        entry[103] = "Compilar e testar projecto actual";
        entry[104] = "Compilação final com o projecto actual";
        entry[105] = "Compilar projecto principal";
        entry[106] = "Testar projecto principal";
        entry[107] = "Compilar e testar projecto principal";
        entry[108] = "Compilação final com o projecto principal";
        //Extensions manager
        entry[109] = "Gerente de extensões";
        entry[110] = "Gerente de extensões"; //Title
        entry[111] = "Adicionar";
        entry[112] = "Remover";
        entry[113] = "Reverter alterações";
        //Popup
        //114 is already used
        entry[115] = "Copiar mensagem";
        entry[116] = "Ocultar mensagem";
        entry[117] = "Ocultar barra de ferramentas";
        entry[118] = "Importar imagem";
        entry[119] = "Aproximar";
        //Settings editor again
        entry[120] = "Frequencia";
        entry[121] = "Outros";
        entry[122] = "Teclas predefinidas";
        entry[123] = "Deixar a tecla <ESC> terminar o jogo";
        entry[124] = "Deixar a tecla <F4> trocar o modo de ecrã";
        entry[125] = "Deixar a tecla <F5> guardar o jogo e a <F6> carregá-lo";
        entry[126] = "A carregar";
        entry[127] = "Mostrar imagem enquanto carrega";
        entry[128] = "Imagem:";
        entry[129] = "Icon:";
        //Options
        entry[130] = "Opções gerais";
        entry[131] = "Opções gerais"; //Title
        //---
        entry[132] = "Tema Metálico";
        //Sprite editor
        entry[133] = "Adicionar";
        entry[134] = "Editar";
        entry[135] = "Remover";
        
        try{
            init();
        }
        catch(Exception e){} // To ignore
    }
    
     
    public String getSpecialEntry(String value){
        if(value.equals("GPlus.CompileCur"))
            return "Compilar extensão actual";
        if(value.equals("GAH.Menu"))
            return "Avançado";
     if(value.equals("GAH.GC"))
            return "Forçar recolha de lixo";
        return "";
    }
}
