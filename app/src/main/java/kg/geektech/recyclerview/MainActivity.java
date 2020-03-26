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

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MainAdapter adapter = new MainAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        Log.d("MainActivity onCreate", "");


    }

    public void add_new_student(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(intent, 9);
        Log.d("adding new Student", "");

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 9 && resultCode == RESULT_OK) {
            ArrayList <String> info=data.getStringArrayListExtra("Student");
            adapter.name.add(info.get(0));
            adapter.surname.add(info.get(1));
            adapter.dateOfBirth.add(info.get(2));
            adapter.notifyDataSetChanged();
            Log.d("onActivityResult", "");


        }
    }
}

