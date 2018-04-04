package id.dev.simpleui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        Button buttonRelative = findViewById(R.id.btnRelative);
//        Button buttonLinear = findViewById(R.id.btnLinear);
//        Button buttonConstrain   = findViewById(R.id.btnConstrain);
//        buttonRelative.setOnClickListener(this);
//        buttonLinear.setOnClickListener(this);
//        buttonConstrain.setOnClickListener(this);
        TextView textViewNama = findViewById(R.id.textNamaTampil);
        TextView textViewNIM = findViewById(R.id.textNimTampil);
        textViewNama.setText(getIntent().getStringExtra("nama"));
        textViewNIM.setText(getIntent().getStringExtra("nim"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.btnRelative:
//                Intent intent = new Intent(this,MainActivity.class);
//                startActivity(intent);
//                break;
//            case R.id.btnLinear:
//                Intent intent2 = new Intent(this,Main2Activity.class);
//                startActivity(intent2);
//                break;
//            case R.id.btnConstrain:
//                Intent intent3 = new Intent(this,Main3Activity.class);
//                startActivity(intent3);
//                break;
        }
    }
}
