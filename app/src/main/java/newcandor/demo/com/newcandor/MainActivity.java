package newcandor.demo.com.newcandor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnLoginPress(View view){
        Intent i = new Intent(this, LoginPage.class);
        startActivity(i);
//        Intent ine = new Intent(this, SoldPropertyDetails.class);
//        startActivity(ine);
    }

    public void btnRegistrationMainPress(View view){
        Intent i = new Intent(this, RegistrationData.class);
        startActivity(i);
    }
}
