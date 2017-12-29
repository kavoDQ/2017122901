package forfun.good.a2017122901;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("紀錄","你開始執行囉");
    }

    public void CL1(View V)
    {
        ed=findViewById(R.id.editText);
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,ed.getEditableText().toString());
        startActivity(it);

    }

    public void CL2(View V)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("image/jpeg");
        Uri uri = Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.testooo);
        it.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(it);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("紀錄","你回來了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("紀錄","你暫停了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("紀錄","你已經關閉了");
    }
}
