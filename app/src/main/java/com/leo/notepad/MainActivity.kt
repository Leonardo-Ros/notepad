package com.leo.notepad

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.leo.notepad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val prefered= PreferedNote(applicationContext)
        val saveButton= binding.fab

        saveButton.setOnClickListener{

            val noterecov= binding.editContainer.editnote.text.toString()

            if (noterecov == ""){
                Toast.makeText(this,"Digite alguma coisa...",Toast.LENGTH_SHORT).show()
            } else {
                prefered.SaveNote(noterecov)
                Toast.makeText(this,"Anotação salva com sucesso",Toast.LENGTH_SHORT).show()
            }
        }

        val anotacao= prefered.RecovNote()
        if (anotacao!= ""){
            binding.editContainer.editnote.setText(anotacao)
        }

    }

    }

