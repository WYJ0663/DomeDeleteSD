package com.example.DomeDeleteSD;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final String name1 = "shoumeng";
        final String name2 = "shoumenggame";


        Button button = (Button) findViewById(R.id.delete);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FileUtil.deleteAllFile(name1);
                FileUtil.deleteAllFile(name2);
                Toast.makeText(MyActivity.this, "删除手盟文件夹成功", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
