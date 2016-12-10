package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by alina on 09.12.16.
 */

public class SherlockStartActivity extends Activity {

    static final private int CHOOSE_NAME = 0;

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_sherlockstart);
    }

    public void onSherlockChooseClick(View view) {
        Intent nameIntent = new Intent(this, SherlockFinalActivity.class);
        startActivityForResult(nameIntent, CHOOSE_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView infotextView = (TextView) findViewById(R.id.sherlockInfo);

        if (requestCode == CHOOSE_NAME) {
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra(SherlockFinalActivity.NAME);
                infotextView.setText(name);

            }else {
                infotextView.setText("");
            }
        }
    }
}
