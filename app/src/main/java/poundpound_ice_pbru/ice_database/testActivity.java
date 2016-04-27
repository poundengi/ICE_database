package poundpound_ice_pbru.ice_database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class testActivity extends AppCompatActivity {

    //Explicit

    private EditText nameEditText,surnameEditText,userEditText,passwordEditText, emailEditText;
    private String nameString,surnameString,userString,passwordString, emailString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        //Bindwidget
        bindwitget();


    }//Main Method

    public void clickSignup(View view) {
        nameString = nameEditText.getText().toString().trim();
        surnameString = surnameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();

        if (checkspace()) {
            //Have space
            MainAlert mainAlert = new MainAlert();
            mainAlert.myDialog(this,"มีช่องว่าง","กรุณาตรวจสอบข้อมูลและกรอกให้ครบถ้วน");


        } else {
            //No space
        }

    }////clickSignup

    private boolean checkspace() {

        return  nameString.equals("") ||
                surnameString.equals("") ||
                userString.equals("") ||
                passwordString.equals("") ||
                emailString.equals("");
    }


    private void bindwitget() {
        nameEditText = (EditText) findViewById(R.id.editText6);
        surnameEditText = (EditText) findViewById(R.id.editText7);
        userEditText = (EditText) findViewById(R.id.editText8);
        passwordEditText = (EditText) findViewById(R.id.editText9);
        emailEditText = (EditText) findViewById(R.id.editText10);



    }//Bindwitget


}//Main Class

