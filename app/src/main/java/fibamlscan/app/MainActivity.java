package fibamlscan.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import fibamlscan.library.BarcodeType;
import fibamlscan.library.PreviewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.scan).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                // todo: startActivityForResult();
                startActivity(PreviewActivity.getStartingIntent(MainActivity.this, BarcodeType.PDF417.type));
            }
        });
    }
}
