package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void onListButtonClick(View view) {
        Intent intentlight = new Intent(this, LightActivity.class);
        startActivity(intentlight);
    }

    public void onRegisterButtonClick(View view) {
        Intent intentRegister = new Intent(this, RegisterFormActivity.class);
        startActivity(intentRegister);
    }

    public void onSherlockButtonClick(View view) {
        Intent intentSherlock = new Intent(this, SherlockStartActivity.class);
        startActivity(intentSherlock);
    }

    public void onToastButtonClick(View view) {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.cat_toast,
                                       (ViewGroup) findViewById(R.id.catFoodLayout));

        Toast toastCat = new Toast (getApplicationContext());
        toastCat.setGravity(Gravity.CENTER, 0, 0);
        toastCat.setDuration(Toast.LENGTH_LONG);
        toastCat.setView(layout);
        toastCat.show();

    }

    public void onMenuButtonClick(View view) {
        Intent intentMenu = new Intent(this, MenuActivity.class);
        startActivity(intentMenu);
    }
}
