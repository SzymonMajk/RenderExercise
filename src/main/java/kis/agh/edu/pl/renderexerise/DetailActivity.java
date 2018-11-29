package kis.agh.edu.pl.renderexerise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView start = findViewById(R.id.tv_from);
        TextView end = findViewById(R.id.tv_to);
        TextView dur = findViewById(R.id.tv_duration);
        TextView met = findViewById(R.id.tv_method);

        CheckBox checkBaggage = findViewById(R.id.checkBox);
        CheckBox checkDog = findViewById(R.id.checkBox2);
        CheckBox checkAir = findViewById(R.id.checkBox3);

        RadioButton radio1 = findViewById(R.id.radioButton);
        RadioButton radio2 = findViewById(R.id.radioButton2);
        RadioButton radio3 = findViewById(R.id.radioButton3);
        RadioButton radio4 = findViewById(R.id.radioButton4);

        ToggleButton action = findViewById(R.id.toggleButton);

        start.setText(getIntent().getExtras().getString("start","From"));
        end.setText(getIntent().getExtras().getString("end", "To"));
        dur.setText(getIntent().getExtras().getString("dur","Duration"));
        met.setText(getIntent().getExtras().getString("method","Paiyng method"));

        checkBaggage.setChecked(getIntent().getExtras().getBoolean("baggage",false));
        checkDog.setChecked(getIntent().getExtras().getBoolean("dog",false));
        checkAir.setChecked(getIntent().getExtras().getBoolean("air",false));

        switch ((DataSource.Position)getIntent().getExtras().getSerializable("position")) {
            case WINDOW : radio1.setChecked(true);
            case MIDDLE : radio2.setChecked(true);
            case BORDER : radio3.setChecked(true);
            case STANDING : radio4.setChecked(true);
        }

        action.setChecked(getIntent().getExtras().getBoolean("active",false));
    }
}
