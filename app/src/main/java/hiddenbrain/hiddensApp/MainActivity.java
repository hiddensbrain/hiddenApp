package hiddenbrain.hiddensApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void onMainButtonClick(View view) {
        Intent intentProjects = new Intent(this, ListActivity.class);
        startActivity(intentProjects);
    }

    public void onAboutButtonClick(View view) {
        Intent intentAbout = new Intent(this, AboutActivity.class);
        startActivity(intentAbout);
    }
}



