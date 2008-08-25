/*
 * Dictionary.java
 * 
 * Created on 4/Set/2007, 11:16:25
 * 
 */

package org.gcreator.units;

import java.io.File;
import java.io.FileInputStream;
import java.util.Enumeration;
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
    protected Hashtable<String, String> entries = new Hashtable<String, String>();
    protected Vector<String> authors = new Vector<String>();
    protected String status = null;
    protected String language = null;
    protected static Hashtable<String, Dictionary> dictionaries = new Hashtable<String, Dictionary>();
    public static String activeDictionary = "en";
    
    public Dictionary(){}
    
    public static Dictionary loadFromXML(File file){
        System.out.println("Here");
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
                    dic.language = d.getAttributeValue(attr);
                else if(attr.equals("status"))
                    dic.status = d.getAttributeValue(attr);
                else
                    throw new SAXException("Unknown language attribute");
            }
            if(dic.language==null)
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
            System.out.println(e.toString());
            return null;
        }
    }
    
    public static void loadDictionaries(){
        File f = new File("./lang/");
        File[] files = f.listFiles();
        for(File lang : files){
            String name = lang.getName();
            if(!name.equals(".svn"))
                dictionaries.put(name.substring(0, name.indexOf(".")), loadFromXML(lang));
        }
        Enumeration<String> s = dictionaries.keys();
        while(s.hasMoreElements()){
            System.out.println(s.nextElement());
        }
    }
    
    public String getLanguage() throws Exception {
        if (language == null) {
            throw new Exception();
        }
        return language;
    }
    
    public Vector<String> getAuthors(){
        return authors;
    }
    
    public String getStatus(){
        return status;
    }
    
    public String getSpecialEntry(String value){
        return "";
    }
    
    public String getDictionaryEntry(String key){
        return entries.get(key);
    }
    
    public static Dictionary getActiveDictionary(){
        return dictionaries.get(activeDictionary);
    }
    
    public static String getEntry(String key){
        return getActiveDictionary().getDictionaryEntry(key);
    }
    
    public static Dictionary[] getDictionaries(){
        Dictionary[] dicts = new Dictionary[dictionaries.size()];
        int i = 0;
        for(Dictionary dict : dictionaries.values())
            dicts[i++] = dict;
        return dicts;
    }
}
