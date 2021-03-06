package com.draguve.droidducky;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

/**
 * Created by Draguve on 1/2/2018.
 */

public class Script {
    private String _id;
    private String _name;
    private String _code;
    private String _lang;

    public Script(String id,String name,String code,String lang){
        _id = id;
        _name = name;
        _code = code;
        _lang = lang;
    }

    public Script(String name,String code,String lang){
        _id = UUID.randomUUID().toString();
        _name = name;
        _code = code;
        _lang = lang;
    }

    public void setName(String name){
        _name = name;
    }

    public void setCode(String code){
        _code = code;
    }

    public void setLang(String lang) { _lang = lang; }

    public String getName(){
        return  _name;
    }

    public String getCode(){
        return _code;
    }

    public String getID(){
        return _id;
    }

    public String getLang() { return _lang;}
}
