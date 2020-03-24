package kg.geektech.recyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity<Information, T> extends AppCompatActivity {
    RecyclerView recyclerView;

    MainAdapter adapter = new MainAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

    }

    public void add_new_student(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(intent, 9);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 9 && resultCode == RESULT_OK) {
            String[] dataForIntent = data.getStringArrayExtra("Student");
            adapter.name.add(dataForIntent[0]);
            adapter.surname.add(dataForIntent[1]);
            adapter.dateOfBirth.add(dataForIntent[2]);
            adapter.notifyDataSetChanged();

        }
    }
}

