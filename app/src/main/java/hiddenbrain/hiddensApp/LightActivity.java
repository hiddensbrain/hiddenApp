package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LightActivity extends Activity {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(LightActivity.this, R.color.redColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(LightActivity.this, R.color.greenColor));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.yellow);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(LightActivity.this, R.color.yellowColor));
    }

}
