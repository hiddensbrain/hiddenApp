package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by alina on 08.12.16.
 */

public class RegisterFormActivity extends Activity {

    EditText login;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registerform);

    }

    public void onGivePresentClickButton(View view) {

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);

        Intent intent = new Intent(RegisterFormActivity.this, RegisterFinalActivity.class);

        intent.putExtra("login", login.getText().toString());
        intent.putExtra("password", password.getText().toString());
        startActivity(intent);
    }
}
