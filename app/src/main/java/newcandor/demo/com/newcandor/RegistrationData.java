package newcandor.demo.com.newcandor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_data);
    }

    public void btnNextPress(View view){
        Intent i = new Intent(this, RegistrationDoc.class);
        startActivity(i);
    }
}
