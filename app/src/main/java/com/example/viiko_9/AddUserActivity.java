package com.example.viiko_9;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {

    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private RadioGroup radioDegreeProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);
        radioDegreeProgram = findViewById(R.id.radioDegreeProgram);

        // Lisäysnappi
        findViewById(R.id.addUserButton).setOnClickListener(v -> {
            String firstName = editFirstName.getText().toString();
            String lastName = editLastName.getText().toString();
            String email = editEmail.getText().toString();
            String degreeProgram = ((RadioButton) findViewById(radioDegreeProgram.getCheckedRadioButtonId())).getText().toString();

            User newUser = new User(firstName, lastName, email, degreeProgram);
            UserStorage.file().addUser(newUser);

            finish();
        });
    }
}



