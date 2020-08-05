package tawarina.checklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvResultNama)
    TextView tvResultNama;

    String resultNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        initComponents();

        Bundle extras = getIntent().getExtras();
        String username;

        if(extras != null){
            username = extras.getString("username");
            tvResultNama.setText("Welcome " + username);
        }
    }

    private void initComponents(){
        tvResultNama = (TextView) findViewById(R.id.tvResultNama);
    }
}
