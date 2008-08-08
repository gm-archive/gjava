/*
 * Dictionary.java
 * 
 * Created on 4/Set/2007, 11:16:25
 * 
 */

package org.gcreator.units;

import java.io.File;
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Vector;
import org.gcreator.sax.Node;
import org.gcreator.sax.SAXParser;
import org.xml.sax.SAXException;

/**
 *
 * @author Luís
 */
public class Dictionary {
    private Vector<String> authors = new Vector<String>();
    private String status = null;
    private String name = null;
    private Hashtable<String, String> entries = new Hashtable<String, String>();
    private static Hashtable<String, Dictionary> dictionaries = new Hashtable<String, Dictionary>();
    public static String activeDictionary = "en";
    
    public Dictionary(){}
    
    public static Dictionary loadFromXML(File file){
        try{
            FileInputStream stream = new FileInputStream(file);
            SAXParser p = new SAXParser(stream);
            Node d = p.getRootNode();
            if(!d.getName().equals("lang"))
                throw new SAXException("Invalid root");
            Dictionary dic = new Dictionary();
            for(int i = 0; i < d.getAttributeCount(); i++){
                String attr = d.getAttributeName(i);
                if(attr.equals("name"))
                    dic.name = d.getAttributeValue(attr);
                else if(attr.equals("stats"))
                    dic.status = d.getAttributeValue(attr);
                else
                    throw new SAXException("Unknown language attribute");
            }
            if(dic.name==null)
                throw new SAXException("Language name not specified");
            if(dic.status==null)
                throw new SAXException("Language status not specified");
            for(int i = 0; i < d.getChildrenCount(); i++){
                Node node = d.getChildAt(i);
                String name = node.getName();
                if(name.equals("author"))
                    dic.authors.add(node.getContent());
                else if(name.equals("slice")){
                    if(node.getAttributeCount()!=1)
                        throw new SAXException("Invalid attribute number for slice");
                    if(!node.getAttributeName(0).equals("key"))
                        throw new SAXException("Invalid attribute for slice");
                    dic.entries.put(node.getAttributeValue("key"), node.getContent());
                }
                else
                    throw new SAXException("Invalid language content");
            }
            if(dic.authors.isEmpty())
                throw new SAXException("No authors specified");
            if(dic.entries.isEmpty())
                throw new SAXException("No slices specified");
            return dic;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
    public static void loadDictionaries(){
        File f = new File("./lang/");
        File[] files = f.listFiles();
        for(File lang : files){
            String name = lang.getName();
            dictionaries.put(name.substring(0, name.indexOf(".")-1), loadFromXML(lang));
        }
    }
    
    public String getStatus(){
        return status;
    }
    
    public String[] getAuthors(){
        return (String[]) authors.toArray();
    }
    
    public String getName(){
        return name;
    }
    
    public static Dictionary getActiveDictionary(){
        return dictionaries.get(activeDictionary);
    }
    
    public String getDictionaryEntry(String key){
        return entries.get(key);
    }
    
    public static String getEntry(String key){
        return getActiveDictionary().getDictionaryEntry(key);
    }
    
    public static Dictionary[] getDictionaries(){
        return (Dictionary[]) dictionaries.values().toArray();
    }
}
