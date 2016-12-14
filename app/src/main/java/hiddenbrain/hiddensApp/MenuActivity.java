package hiddenbrain.hiddensApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by alina on 14.12.16.
 */

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_menu);

        Button buttonMenu = (Button) findViewById(R.id.buttonMenu);
        TextView textViewMenu = (TextView) findViewById(R.id.textViewMenu);
        ImageView imageViewMenu = (ImageView) findViewById(R.id.imageViewMenu);


        buttonMenu.setOnClickListener(viewClickListener);
        textViewMenu.setOnClickListener(viewClickListener);
        imageViewMenu.setOnClickListener(viewClickListener);
    }

    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }
    };

    private void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.popupmenu);

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {

                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(),
                                               "Вы выбрали Popupmenu 1",
                                               Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.menu2:
                                Toast.makeText(getApplicationContext(),
                                               "Вы выбрали Popupmenu 2",
                                               Toast.LENGTH_SHORT).show();
                                return true;

                            case R.id.menu3:
                                Toast.makeText(getApplicationContext(),
                                               "Вы выбрали Popupmenu 3",
                                               Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                Toast.makeText(getApplicationContext(), "onDismiss",
                               Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();



    }
}
