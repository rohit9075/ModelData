package rohit.com.modeldata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import rohit.com.modeldata.model.DataItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DataItem dataItem = new DataItem(null, "my menu items", "a category",
                "a description", 1 ,
                9.95,"apple.jpg");
        TextView textView = findViewById(R.id.textview);
        textView.append(dataItem.toString());
    }
}
