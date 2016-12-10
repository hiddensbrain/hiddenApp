package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
}
