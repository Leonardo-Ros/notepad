package com.leo.notepad


import android.content.Context
import android.content.SharedPreferences


class PreferedNote(private val context: Context) {

    private val ARQUIVO= "note prefered"
    private val CHAVE= "nome"
    private val preferences: SharedPreferences
    private val editor: SharedPreferences.Editor



    fun SaveNote(anotacao:String?){
        editor.putString(CHAVE,anotacao)
        editor.commit()
    }

    fun RecovNote(): String? {
        return preferences.getString(CHAVE,"")
    }

    init{
        preferences= context.getSharedPreferences(ARQUIVO,0)
        editor= preferences.edit()
    }
}