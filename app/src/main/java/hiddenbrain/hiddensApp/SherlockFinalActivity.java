package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by alina on 09.12.16.
 */

public class SherlockFinalActivity extends Activity {

    public final static String NAME = "ru.alina.sherlock.NAME";

    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_sherlockfinal);
    }

    public void onRadioClick(View view) {
        Intent namegivenIntent = new Intent();

        switch (view.getId()) {
            case R.id.radioVasya:
                namegivenIntent.putExtra(NAME, "Вася");
                break;
            case R.id.radioPetya:
                namegivenIntent.putExtra(NAME, "Петя");
                break;
            case R.id.radioFedya:
                namegivenIntent.putExtra(NAME, "Федя");
                break;
            case R.id.radioBubenchik:
                namegivenIntent.putExtra(NAME, "Бубенчик!");
                break;

            default:
                break;
        }

        setResult(RESULT_OK, namegivenIntent);
        finish();
    }
}
