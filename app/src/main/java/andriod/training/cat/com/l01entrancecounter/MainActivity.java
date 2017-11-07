package andriod.training.cat.com.l01entrancecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define init variables
    private int total_counter = 0;
    private int male_counter = 0;
    private int female_counter = 0;
    private TextView tv_counter;
    private TextView tv_male_female_counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referent TextView Total Counter
        tv_counter = (TextView) findViewById(R.id.lo_tv_counter);
        //Set TextView Total Counter
        tv_counter.setText(String.valueOf(total_counter));

        //Referent TextView String Separate Male and Female counters
        tv_male_female_counter = (TextView) findViewById(R.id.lo_tv_male_female_counter);
        //Set TextView Total Counter male and female value
        tv_male_female_counter.setText("Male:"+String.valueOf(male_counter)+", Female:"+String.valueOf(female_counter));

        //Button Male
        Button bt_male_counter = (Button) findViewById(R.id.lo_bt_male_counter);
        bt_male_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                male_counter++;
                total_counter++;
                //modify TextView add counting for male value
                tv_male_female_counter.setText("Male:"+String.valueOf(male_counter)+", Female:"+String.valueOf(female_counter));
                //modify TextView add counting for male value
                tv_counter.setText(String.valueOf(total_counter));
            }
        });

        //Button Female
        Button bt_female_counter = (Button) findViewById(R.id.lo_bt_female_counter);
        bt_female_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                female_counter++;
                total_counter++;
                //modify TextView  add counting for female value
                tv_male_female_counter.setText("Male:"+String.valueOf(male_counter)+", Female:"+String.valueOf(female_counter));
                //modify TextView add counting for male value
                tv_counter.setText(String.valueOf(total_counter));
            }
        });

    }
}
