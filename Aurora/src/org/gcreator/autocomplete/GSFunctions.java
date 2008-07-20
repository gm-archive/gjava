/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.autocomplete;

import java.util.Vector;
import org.gcreator.autocomplete.impl.FunctionSuggestion;

/**
 *
 * @author Luís
 */
public class GSFunctions {
    public static Vector<FunctionSuggestion> functions = new Vector<FunctionSuggestion>();
    
    static{
        applyFunction("room_goto_next", "");
        applyFunction("room_goto_previous", "");
        applyFunction("scene_goto_next", "");
        applyFunction("scene_goto_previous", "");
        applyFunction("random", "max");
        applyFunction("abs", "x");
        applyFunction("sign", "x");
        applyFunction("round", "x");
        applyFunction("floor", "x");
        applyFunction("ceil", "x");
        applyFunction("frac", "x");
        applyFunction("sqrt", "x");
        applyFunction("sqr", "x");
        applyFunction("power", "x");
        applyFunction("exp", "x");
        applyFunction("ln", "x");
        applyFunction("log2", "x");
        applyFunction("log10", "x");
        applyFunction("logn", "n, x");
        applyFunction("sin", "x");
        applyFunction("cos", "x");
        applyFunction("tan", "x");
        applyFunction("arcsin", "x");
        applyFunction("arccos", "x");
        applyFunction("arctan", "x");
        applyFunction("arctan2", "y, x");
        applyFunction("degtorad", "degrees");
        applyFunction("radtodeg", "radians");
        applyFunction("point_distance", "x1, y1, x2, y2");
        applyFunction("lengthdir_x", "len, dir");
        applyFunction("lengthdir_y", "len, dir");
        applyFunction("is_real", "x");
        applyFunction("is_string", "x");
        applyFunction("point_direction", "x1, y1, x2, y2");
        applyFunction("real", "str");
        applyFunction("string", "value");
        applyFunction("chr", "value");
        applyFunction("ord", "char");
        applyFunction("string_length", "text");
        applyFunction("string_pos", "substring, text");
        applyFunction("string_copy", "text, index, count");
        applyFunction("string_char_at", "text, index");
        applyFunction("string_delete", "text, index, count");
        applyFunction("string_insert", "substring, text, index");
        applyFunction("string_lower", "text");
        applyFunction("string_upper", "text");
        applyFunction("string_repeat", "text, times");
        applyFunction("string_letters", "text");
        applyFunction("string_digits", "text");
        applyFunction("string_lettersdigits", "text");
        applyFunction("string_replace", "text, find, replace");
        applyFunction("string_replaceall", "text, find, replace");
        applyFunction("string_count", "substring, text");
        applyFunction("string_format", "val, total, dec");
        applyFunction("clipboard_has_text", "");
        applyFunction("clipboard_get_text", "");
        applyFunction("clipboard_set_text", "text");
        applyFunction("clipboard_has_image", "");
        applyFunction("clipboard_get_image", "");
        applyFunction("clipboard_set_image", "text");
        applyFunction("date_current_date", "");
        applyFunction("move_snap", "hsnap, vsnap");
        applyFunction("place_snapped", "hsnap, vsnap");
        applyFunction("move_random", "hsnap, vsnap");
        applyFunction("move_wrap", "hsnap, vsnap");
        applyFunction("move_towards_point", "x, y, sp");
        applyFunction("distance_to_point", "x, y");
        applyFunction("sleep", "millisecond");
        applyFunction("game_end", "");
        applyFunction("draw_sprite", "sprite, subimg, x, y");
        applyFunction("draw_sprite_stretched", "sprite, subimg, x, y, w, h");
        applyFunction("draw_clear", "color");
        applyFunction("draw_point", "x, y");
        applyFunction("draw_line", "x1, y1, x2, y2");
        applyFunction("draw_rectangle", "x1, y1, x2, y2, outline");
        applyFunction("draw_roundrect", "x1, y1, x2, y2, outline");
        applyFunction("draw_set_color", "color");
        applyFunction("draw_get_color", "");
        applyFunction("draw_get_red", "");
        applyFunction("draw_get_green", "");
        applyFunction("draw_get_blue", "");
        applyFunction("make_color_rgb", "red, green, blue");
        applyFunction("draw_text", "x, y, string");
        applyFunction("surface_create", "w, h");
        applyFunction("surface_get_width", "id");
        applyFunction("surface_get_height", "id");
        applyFunction("surface_set_target", "id");
        applyFunction("surface_reset_target", "id");
        applyFunction("surface_save", "id, fname");
        applyFunction("draw_surface", "id, x, y");
        //Tiles
        applyFunction("display_get_width", "");
        applyFunction("display_get_height", "");
        applyFunction("display_get_frequency", "");
        applyFunction("display_get_colordepth", "");
        applyFunction("show_message", "text");
        applyFunction("show_error", "text, abort");
        applyFunction("file_text_open_read", "fname");
        applyFunction("file_text_open_write", "fname");
        applyFunction("file_text_close", "fileid");
        applyFunction("file_text_write_string", "fileid, str");
        applyFunction("file_text_write_real", "fileid, x");
        applyFunction("file_text_read_string", "fileid");
        applyFunction("ds_stack_create", "");
        applyFunction("ds_stack_destroy", "id");
        applyFunction("ds_stack_clear", "id");
        applyFunction("ds_stack_size", "id");
        applyFunction("ds_stack_empty", "id");
        applyFunction("ds_stack_push", "id, value");
        applyFunction("ds_stack_pop", "id");
        applyFunction("ds_stack_top", "id");
        applyFunction("ds_queue_create", "");
        applyFunction("ds_queue_destroy", "id");
        applyFunction("ds_queue_clear", "id");
        applyFunction("ds_queue_size", "id");
        applyFunction("ds_queue_empty", "id");
        applyFunction("ds_queue_enqueue", "id, val");
        applyFunction("ds_queue_dequeue", "id");
        applyFunction("ds_queue_head", "id");
        applyFunction("ds_queue_tail", "id");
        //Lists
        //Maps
        applyFunction("window_set_visible", "visible");
        applyFunction("window_get_visible", "");
        applyFunction("window_set_fullscreen", "fullscreen");
        applyFunction("window_get_fullscreen", "");
        applyFunction("window_set_showborder", "showborder");
        applyFunction("window_get_showborder", "");
        applyFunction("window_set_sizeable", "sizeable");
        applyFunction("window_get_sizeable", "");
        applyFunction("window_set_caption", "caption");
        applyFunction("window_get_caption", "");
    }
    
    public static void applyFunction(String val, String args){
        functions.add(new FunctionSuggestion(val, args));
    }
}
