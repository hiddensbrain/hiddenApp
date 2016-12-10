package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by alina on 08.12.16.
 */

public class RegisterFinalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerfinal);

        String login = "Login";
        String password = "Password";

        login = getIntent().getStringExtra("login");
        password = getIntent().getStringExtra("password");

        TextView infoTextView = (TextView)findViewById(R.id.textViewGotPresent);
        infoTextView.setText("Спасибо," + login + ", ваш пароль " + password);
    }

}
