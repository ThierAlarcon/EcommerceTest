package senac.com.ecommercetest;

import static senac.com.ecommercetest.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import senac.com.ecommercetest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private TextView textInfo;

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //textInfo = findViewById(id.textInfo);
        //textInfo.setText("Boa noite a todos!");

         binding = ActivityMainBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());

         binding.textInfo.setText("Olá desenvolvedores android");




        

    }
}