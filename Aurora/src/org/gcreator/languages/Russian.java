package org.gcreator.languages;

import units.Dictionary;
import components.*;
import org.gcreator.exceptions.*;

/**
 *
 * @author Jonathon Potapenko
 */
public class Russian extends Dictionary{
    public Russian(){
        status = "Finished";
        language = "Russian";
        authors = new String[10];
        authors[0] = "Jonathon Potapenko";
        //If you changed this language, add your name here.
        entry = new String[200];
        entry[0] = "Архив";
        entry[1] = "Изменения";
        entry[2] = "Взгляд";
        entry[3] = "Строить&Старт";
        entry[4] = "Помощь";
        entry[5] = "Новый Проект";
        entry[6] = "Новый File/Group";
        entry[7] = "Открыть Проект";
        entry[8] = "Сохранить Проект";
        entry[9] = "Сохранить Проект Как";
        entry[10] = "Ввозить Архив";
        entry[11] = "Экспорт Архив";
        entry[12] = "Закрыть Проект";
        entry[13] = "Выход";
        entry[14] = "Очистьте Пульт";
        entry[15] = "Взгляд и Чывство";
        entry[16] = "Настроеть индикации";
        entry[17] = "Родной взгляд";
        entry[18] = "Перекрестный взгляд";
        entry[19] = "Доминантный взгляд";
        entry[20] = "Плат (Верхняя часть)";
        entry[21] = "Настроеть Рамки";
        entry[22] = "Коробка выхода";
        entry[23] = "Выберите язык";
        entry[24] = "О";
        entry[25] = "Помощь"; //The menu item, not the menu itself
        entry[26] = "Добро пожаловать!"; //Tab name
        entry[27] = "Помощь!"; //Tab name
        entry[28] = "Выберите язык"; //Tab name
        entry[29] = "Законченна нагрузка программы.";
        entry[30] = "Ошибка в создание архив установок";
        entry[31] = "Ошибка в сочинительство архив установок";
        entry[32] = "Ошибка в чтение архив установок";
        entry[33] = "Плохая структура в архиве установок";
        entry[34] = "Удвоино устанавливающий узел";
        entry[35] = "Не наидно устанавленые свойство";
        entry[36] = "Язык отсутствует";
        entry[37] = "Добро пожаловать к Aurora,";
        entry[38] = "следующее поколение G-Creator.";
        //Toolbar
	entry[39] = "Новый Проект"; 
	entry[40] = "Открыть"; 
	entry[41] = "Сохраните"; 
	entry[42] = "Сохраните Как"; 
	entry[43] = "Добавьте Картину";
	entry[44] = "Добавьте Звук"; 
	entry[45] = "Добавьте Актер";
	entry[46] = "Добавьте Место";
        //Language menu
        entry[47] = "Язык";
        entry[48] = "Состояние";
        entry[49] = "Применить Язык";
        entry[50] = "Повторите старт программы для того чтобы применить изменения";
        //Tree
        entry[51] = "Место для работы";
        //Toolbar
        entry[52] = "Добавьте Тип";
        //Menu
        entry[53] = "Сохраните Все Проекты";
        //New Project Wizard
        entry[54] = "Выбирайе тип вашего проекта";
        entry[55] = "Новый Проект";
        entry[56] = "Игры";
        entry[57] = "Пакеты";
        entry[58] = "Пустая Игра";
        entry[59] = "Пустая Пакет";
        entry[60] = "Имя проекта";
        entry[61] = "Организованый Пакет";
        entry[62] = "Простирании";
        entry[63] = "Пустая Простирания";
        entry[64] = "Графики";
        entry[65] = "Начните в режиме полного экрана";
        entry[66] = "Позвольте игроку протянуть рамку";
        entry[67] = "Не рисуйте границу на рамке";
        entry[68] = "Не показываите кнопки на рамке";
        entry[69] = "Показываите стрелку";
        entry[70] = "Покажите КВС в сообщении рамки";
        entry[71] = "Просветленность";
        entry[72] = "Установите просветленность экрана";
        entry[73] = "Глубина цвета";
        entry[74] = "Отсутствие изменений";
        //View
        entry[75] = "Покажите инструменты";
        //Find
        entry[76] = "Найди"; //Title
        entry[77] = "Найди"; //Label
        entry[78] = "Текст, который нужно найти";
        entry[79] = "Найди"; //Button
        entry[80] = "Чувствительный к капитализации"; 
        entry[81] = "Используйте регулярными выражениями";
        entry[82] = "Возпользайтесь \\n как пролом линии";
        //Find&Replace
        entry[83] = "Найди и Замени "; //Title
        entry[84] = "Замени"; //Label
        entry[85] = "возле";
        entry[86] = "Replace"; //Button
        entry[87] = "Замени все встречие";
        //More menu items
        entry[88] = "Сохранить архив";
        entry[89] = "Сохранить все архивы";
        entry[90] = "Платы (Левая часть)";
        entry[91] = "Платы (Нижняя часть)";
        entry[92] = "Платы (Правая часть)";
        entry[114] = "Инструменты";
        entry[93] = "Уточнените";
        entry[94] = "Создайте";
        //And the new File/Group
        entry[95] = "Новое...";
        entry[96] = "Новой Архив или группа";
        entry[97] = "Стандартные Детали";
        entry[98] = "Установите как главным проектам";
        entry[99] = "Очистьте настоящий проект";
        entry[100] = "Очистьте главный проект";
        entry[101] = "Стройте настоящий проект";
        entry[102] = "Test настоящий проект";
        entry[103] = "Стройте&Испытайте настоящий проект";
        entry[104] = "Окончательно Стройте настоящий проект";
        entry[105] = "Стройте главный проект";
        entry[106] = "Испытайте главный проект";
        entry[107] = "Стройте&Испытайте главный проект";
        entry[108] = "Окончательно Стройте главный проект";
        //Extensions manager
        entry[109] = "Менеджер Простирании";
        entry[110] = "Менеджер Простирании"; //Title
        entry[111] = "Добавьте";
        entry[112] = "Уберите";
        entry[113] = "Забудте изменения";
        //Popup
        //114 is already used
        entry[115] = "Сохрани Сообщение";
        entry[116] = "Закроите пульт";
        entry[117] = "Закроите инструмент";
        entry[118] = "Ввнеси картину";
        entry[119] = "Преблизь";
        //Settings editor again
        entry[120] = "Частота";
        entry[121] = "Другое";
        entry[122] = "Общие Клавя";
        entry[123] = "<ESC> конец игры";
        entry[124] = "<F4> переключите между режимами экрана";
        entry[125] = "<F5> Сохраните игру  и  <F6> скачать игру.";
        entry[126] = "Скачание";
        entry[127] = "Покажите изображение пока скачайте";
        entry[128] = "Картина:";
        entry[129] = "Картина в рамке:";
        
        
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

