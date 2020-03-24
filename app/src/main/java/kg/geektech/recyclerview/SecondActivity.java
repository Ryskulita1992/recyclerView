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

public class SecondActivity<T> extends AppCompatActivity {
    public TextView addedName;
    public TextView addedSurname;
    public TextView addedDateOfBirth;
    T info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        addedName=findViewById(R.id.name);
        addedSurname=findViewById(R.id.surname);
        addedDateOfBirth=findViewById(R.id.date_of_birth);
    }

    public void save(View view) {

        ArrayList <T> info =new ArrayList<>();
        info.add((T) addedName.getText().toString());
        info.add((T) addedSurname.getText().toString());
        info.add((T) addedDateOfBirth.getText());
        Intent save = new Intent(SecondActivity.this, MainActivity.class);
        save.putExtra("Student", info);
        setResult(RESULT_OK, save);
        finish();
        Log.d("adding new Student", "");
    }



    }
