package hiddenbrain.hiddensApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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

    public void onMaimMenuClick(MenuItem item) {
        Intent intentAbout = new Intent(this, AboutActivity.class);
        startActivity(intentAbout);
    }
}



