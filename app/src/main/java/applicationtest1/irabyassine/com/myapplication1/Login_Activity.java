package applicationtest1.irabyassine.com.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }

    public void btn_connect(View view) {

        EditText txt_login = (EditText) findViewById(R.id.txt_Login);
        EditText txt_password = (EditText) findViewById(R.id.txt_password);


        Intent i = new Intent(this,MainActivity.class);
        Bundle b = new Bundle();
        b.putString("txt_login",txt_login.getText().toString());
        b.putString("txt_password",txt_password.getText().toString());

        i.putExtras(b);

        startActivity(i);


    }
}
