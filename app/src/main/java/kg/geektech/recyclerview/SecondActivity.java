package kg.geektech.recyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    public TextView addedName, addedSurname, addedDateOfBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        addedName=findViewById(R.id.name);
        addedSurname=findViewById(R.id.surname);
        addedDateOfBirth=findViewById(R.id.date_of_birth);
        Log.d("Method onCreate", "");

    }

    public void save(View view) {
        ArrayList <String>info=new ArrayList<>();
        info.add(String.valueOf(addedName));
        info.add(String.valueOf(addedSurname));
        info.add(String.valueOf(addedDateOfBirth));
        Intent save = new Intent();
        save.putExtra("Student", info);
        setResult(RESULT_OK, save);
        finish();
        Log.d("adding new Student", "");
    }



    }
