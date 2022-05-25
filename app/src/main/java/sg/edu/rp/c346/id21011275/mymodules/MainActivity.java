package sg.edu.rp.c346.id21011275.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtViewAndroid;
    TextView txtViewIpad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewAndroid = findViewById(R.id.textViewAndroid);
        txtViewIpad = findViewById(R.id.textViewIpad);

        txtViewAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("academicYear", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("value", "W66M");
                startActivity(intent);
            }
        });

        txtViewIpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("moduleCode", "C349");
                intent.putExtra("moduleName", "iPad Programming");
                intent.putExtra("academicYear", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("moduleCredit", "4");
                intent.putExtra("value", "E66K");
                startActivity(intent);
            }
        });
    }
}
