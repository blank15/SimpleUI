package id.dev.simpleui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = findViewById(R.id.btnLogin);
        final EditText textViewNama = findViewById(R.id.ediTextUsername);
        final EditText textViewPss = findViewById(R.id.ediTextPss);
        final EditText textViewNIM = findViewById(R.id.textNim);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textViewNama.getText().toString().isEmpty() || textViewPss.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Password atau username kosong", Toast.LENGTH_SHORT).show();
                }else {
                    if (textViewNama.getText().toString().equals("Yudistiro") && textViewPss.getText().toString().equals("12345678")) {
                        Intent intent = new Intent(MainActivity.this,Home.class);
                        intent.putExtra("nama",textViewNama.getText().toString());
                        intent.putExtra("nim",textViewNIM.getText().toString());
                        startActivity(intent);
                    }else {
                        Toast.makeText(MainActivity.this, "Password atau username salah", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }
}
