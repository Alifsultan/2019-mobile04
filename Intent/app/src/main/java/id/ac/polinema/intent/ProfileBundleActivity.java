package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileBundleActivity extends AppCompatActivity {
    private View usernameText;
    private View nameText;
    private View ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText = findViewById(R.id.input_username);
         nameText = findViewById(R.id.input_name);
         ageText = findViewById(R.id.input_age);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String username = getIntent().getStringExtra(username: "username");
            usernameText.setText(username);
            String name = getIntent().getStringExtra(name : "nama");
            nameText.setText(name);
            String age = getIntent().getStringExtra(age : "age");
            ageText.setText(age);
            
        }
    }
}
