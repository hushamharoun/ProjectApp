package com.example.buscis_c2_l9.projectapp;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Display;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.view.View.OnClickListener;
        import android.widget.TextView;
        import android.widget.TextView.OnEditorActionListener;
        import android.view.inputmethod.EditorInfo;
        import android.content.Intent;


public class MainActivity extends AppCompatActivity implements OnClickListener
{
    private Button Password;
    private Button UserName;
    private EditText UserEnt;
    private EditText PassEnt;
    private TextView Verify;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserEnt = (EditText) findViewById(R.id.UserEnt);
        PassEnt = (EditText) findViewById(R.id.PassENt);
        Password = (Button) findViewById(R.id.Password);
        UserName = (Button) findViewById(R.id.UserName);
        Verify = (TextView) findViewById(R.id.Verify);

        PassEnt.setOnClickListener(this);
        UserEnt.setOnClickListener(this);
        UserName.setOnClickListener(this);
        Password.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        if (v.getId()==R.id.Send)
        {
            if (UserEnt.getText().toString().equals("Admin") && PassEnt.getText().toString().equals("Admin"))
            {
                Intent intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
            }
            else Verify.setText("Incorrect");
        }
    }
}