package com.example.ass4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun showInfo(view:View){
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
        text_show.text = "Name: ${edit_username.text}\nPassword: ${edit_password.text}\nGender: ${radio.text}\nE-mail: ${edit_mail.text}\nBirthday: ${text_date.text}"
    }
    fun showDatePickerDialog(v: View){
        val newDateFragment = DatePickerFragment()
        newDateFragment.show(supportFragmentManager, "Date Picker")
    }
    fun radio_button_click(view: View){
        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
    }

    fun reset(v:View){
        edit_username.text.clear()
        edit_password.text.clear()
        male.setChecked(false)
        female.setChecked(false)
        edit_mail.text.clear()
        text_date.text = "mm /dd/yy"
        text_show.text = "Show information"
    }

}
