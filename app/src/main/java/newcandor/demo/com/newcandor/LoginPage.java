package newcandor.demo.com.newcandor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void btnForgetPasswordPress(View view){
        Intent i = new Intent(this, ForgetPasswordPage.class);
        startActivity(i);
    }

    public void btnLoginClickPress(View view){
//        Intent in = new Intent(this, SoldPropertiesActivity.class);
//        startActivity(in);

        Intent in = new Intent(this, SoldPropertyDetails.class);
        // transfer new
        //second change
        startActivity(in);

//        Intent ine = new Intent(this, RentalDetailView.class);
//        startActivity(ine);

//        Intent ine = new Intent(this, AddNewProperty.class);
//        startActivity(ine);
    }

}
