package com.example.viiko_9;
import static com.example.viiko_9.UserStorage.getInstance;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private RadioGroup radioDegreeProgram;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);
        radioDegreeProgram = findViewById(R.id.radioDegreeProgram);

    }

    public void addUserOnClick(View view) {
        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        int selectedId = radioDegreeProgram.getCheckedRadioButtonId();
        String degreeProgram = "";
        if(selectedId == R.id.seRadioButton) {
            degreeProgram = "Software Engineering";
        } else if(selectedId == R.id.imRadioButton) {
            degreeProgram = "Information Management";
        } else if(selectedId == R.id.ceRadioButton) {
            degreeProgram = "Computer Engineering";
        } else if(selectedId == R.id.eeRadioButton) {
            degreeProgram = "Electrical Engineering";
        } else {
        }

        User newUser = new User(firstName, lastName, email, degreeProgram);
        UserStorage.getInstance().addUser(newUser);
    }
}



