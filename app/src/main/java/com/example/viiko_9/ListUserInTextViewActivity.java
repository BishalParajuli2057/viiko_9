package com.example.viiko_9;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ListUserInTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StringBuilder usersText = new StringBuilder();
        for (User user : UserStorage.file().getUsers()) {
            usersText.append("Etunimi: ").append(user.getFirstName())
                    .append("\nSukunimi: ").append(user.getLastName())
                    .append("\nSähköposti: ").append(user.getEmail())
                    .append("\nTutkinto-ohjelma: ").append(user.getDegreeProgram())
                    .append("\n\n");
        }

    }
}
