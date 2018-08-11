package fibamlscan.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import fibamlscan.library.BarcodeType;
import fibamlscan.library.PreviewActivity;

public class MainActivity extends AppCompatActivity {

    public final static int BARCODE_RESULT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.scan).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
            startActivityForResult(
                    PreviewActivity.getStartingIntent(MainActivity.this, BarcodeType.PDF417.type),
                    BARCODE_RESULT
            );
            }
        });
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK && requestCode==BARCODE_RESULT){
            String barcode = data.getStringExtra(PreviewActivity.RETURN_BARCODE);
            if (barcode!=null){
                ((TextView)findViewById(R.id.dlinfo)).setText(barcode);
            }
        }
    }
}
