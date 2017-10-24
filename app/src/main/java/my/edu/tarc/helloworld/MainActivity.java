package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName,editTextAge;
    private TextView textViewMessage;
    //onCreate = main() in java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView = show UI
        //R = resources class
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextName=(EditText) findViewById(R.id.editTextName);
        editTextAge=(EditText) findViewById(R.id.editTextAge);
        textViewMessage=(TextView) findViewById(R.id.textViewMessage);

    }

    public void displayMessage(View view){
        textViewMessage.setText("Hi");
        int age =Integer.parseInt(editTextAge.getText().toString());
        String name=editTextName.getText().toString();
        age++;
        textViewMessage.setText("Hi "+name+", you will be "+age+" years old in 2018.");
    }
}
