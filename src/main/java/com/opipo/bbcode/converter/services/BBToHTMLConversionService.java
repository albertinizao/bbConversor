package com.opipo.bbcode.converter.services;

import com.opipo.bbcode.converter.bbcode.*;
import javafx.scene.control.Tab;
import org.reflections.Reflections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class BBToHTMLConversionService {

    public String converText(String original) {
        String result = original.replaceAll("\n","[br]").replaceAll("\t", " ");
        for (Class<? extends BBTag> bbTagClazz:getBBCodeClasses()){
            result=converTag(result, bbTagClazz);
        }
        return result;
    }

    public Class<? extends BBTag>[] getBBCodeClasses() {
        Reflections reflections = new Reflections("com.opipo.bbcode.converter.bbcode");
        Set<Class<? extends BBTag>> allClasses =
                reflections.getSubTypesOf(BBTag.class);
        return allClasses.stream().sorted((c1,c2)->{
            try{
                return -1*(c1.newInstance().getBBTag().length()-c2.newInstance().getBBTag().length());
            }catch (InstantiationException | IllegalAccessException e){
                throw new InternalError(e);
            }
        }).collect(Collectors.toList()).toArray(new Class[]{});
    }

    public String converTag(String original, Class<? extends  BBTag> bbTagClazz) {
        String newText = original;
        try {
            BBTag bbtag =null;
            do{
                bbtag = bbTagClazz.newInstance();
                newText = bbtag.execute(newText);
            }while (bbtag.contains(newText));
        }catch (InstantiationException | IllegalAccessException e){
            throw new InternalError(e);
        }
        return newText;
    }
}
