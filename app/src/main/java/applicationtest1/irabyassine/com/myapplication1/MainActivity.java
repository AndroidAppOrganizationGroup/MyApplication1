package applicationtest1.irabyassine.com.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txt_number1 = (EditText) findViewById(R.id.txt_Number1);
        final EditText txt_number2 = (EditText) findViewById(R.id.txt_Number2);
        final EditText txt_Result = (EditText) findViewById(R.id.txt_Result);

        final TextView login_field = (TextView) findViewById(R.id.login_field);
        final TextView password_field = (TextView) findViewById(R.id.password_field);

        final Button btn_Result = (Button) findViewById(R.id.btn_Result);

        btn_Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(txt_number1.getText().toString());
                int num2 = Integer.parseInt(txt_number2.getText().toString());

                int resul = num1 + num2;

                txt_Result.setText(String.valueOf(resul));
            }
        });


        Bundle b = getIntent().getExtras();

        String login = b.getString("txt_login");
        String password = b.getString("txt_password");

        login_field.setText(login);
        password_field.setText(password);













    }
}
