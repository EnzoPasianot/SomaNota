package br.com.fatec.somanota;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.editTextN1);
        n2 = (EditText) findViewById(R.id.editTextN2);
        result = (TextView) findViewById(R.id.textViewRes);

        Button soma = (Button) findViewById(R.id.btnSoma);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int nota1 = Integer.valueOf(n1.getText().toString());
                int nota2 = Integer.valueOf(n2.getText().toString());
                int res = nota1 + nota2;

                result.setText(String.valueOf(res));
            }
        });

    }

}
