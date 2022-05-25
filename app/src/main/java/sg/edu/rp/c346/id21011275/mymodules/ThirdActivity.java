package sg.edu.rp.c346.id21011275.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView moduleCode;
    TextView moduleName;
    TextView academicYear;
    TextView semester;
    TextView moduleCredit;
    TextView venue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        moduleCode = findViewById(R.id.tvModuleCode);
        moduleName = findViewById(R.id.tvModuleName);
        academicYear = findViewById(R.id.tvAcademicYear);
        semester = findViewById(R.id.tvSemester);
        moduleCredit = findViewById(R.id.tvModuleCredit);
        venue = findViewById(R.id.tvVenue);

        Intent intent = getIntent();
        moduleCode.setText("Module code: " + intent.getStringExtra("moduleCode"));
        moduleName.setText("Module Name: " + intent.getStringExtra("moduleName"));
        academicYear.setText("Academic Year: " + intent.getIntExtra("Academic year", 2020));
        semester.setText("Semester: " + intent.getIntExtra("Semester", 1));
        moduleCredit.setText("Module Credit: " + intent.getIntExtra("Module Credit", 4));
        venue.setText("Venue: " + intent.getStringExtra("value"));
    }
}