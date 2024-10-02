package com.tnl.forex_app;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tnl.forex_app.databinding.ActivityMainBinding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    double fromValue=0.0;
    String fromUnit="";
    double toValue=0.0;
    String  toUnit="";
    private List<String> units = Arrays.asList(
            "JPY", "CNY", "SDG", "RON", "MKD", "MXN", "CAD","INR",
            "ZAR", "AUD", "NOK", "ILS", "ISK", "SYP", "LYD", "UYU", "YER", "CAD",
            "SEK", "THB", "IDR", "LBP", "AED", "BOB"



    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        initComponents();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initComponents() {
        Collections.sort(units);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, units);
        binding.toUnit.setAdapter(arrayAdapter);
        binding.fromUnit.setAdapter(arrayAdapter);
        binding.convertButton.setOnClickListener(view ->{
            //get Value
            try {
                fromValue=Double.parseDouble(binding.fromValue.getText().toString());
                fromUnit=binding.fromUnit.getSelectedItem().toString();
                toUnit=binding.toUnit.getSelectedItem().toString();
                convertValue();
            }catch (Exception e){
                Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
            }
        } );

    }
//contains to logic to convert into currency
    private void convertValue()
    { //convert USD
        try {
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("USD")){
                toValue=fromValue/83.23;
            }
            else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("USD")) {
                toValue=fromValue*83.23;

            }
            //and all logic write here
            //convert JPY
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("JPY")){
                toValue=fromValue/0.58;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("JPY")){
                toValue=fromValue*0.58;
            }
            //convert CNY
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("CNY")){
                toValue=fromValue/11.93;

            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("CNY") ){
                toValue=fromValue*11.93;

            }
            //convert SDG
            if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("SDG")){
                toValue=fromValue/65.18;
            } else if (fromUnit.equalsIgnoreCase("INR") && toUnit.equalsIgnoreCase("SDG")) {
                toValue=fromValue*65.18;

            }
            //convert RON
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("RON")){
                toValue=fromValue/18.67;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("RON")) {
                toValue=fromValue*18.67;

            }
            //convert MKD
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("MKD")){
                toValue=fromValue/1.51;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("MKD")) {
                toValue=fromValue*1.51;

            }
            //convert MXN
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("MXN")){
                toValue=fromValue/4.28;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("MXN")){
                toValue=fromValue*4.28;

            }
            //convert CAD
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("CAD")){
                toValue=fromValue/62.21;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("CAD")) {
                toValue=fromValue*62.21;

            }
            //convert ZAR
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("ZAR")){
                toValue=fromValue/4.83;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("ZAR")) {
                toValue=fromValue*4.83;

            }
            //convert AUD
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("AUD")){
                toValue=fromValue/57.86;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("AUD")) {
                toValue=fromValue*57.86;
            }
            //convert NOK
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("NOK")){
                toValue=fromValue/7.91;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("NOK")) {
                toValue=fromValue*7.91;

            }
            //convert ILS
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("ILS")){
                toValue=fromValue/22.34;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("ILS")) {
                toValue=fromValue*22.34;

            }
            //convert ISK
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("ISK")){
                toValue=fromValue/0.62;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("ISK")) {
                toValue=fromValue*0.62;
            }
            //convert SYP
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("SYP")){
                toValue=fromValue/0.05;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("SYP")) {
                toValue=fromValue*0.05;
            }
            //convert LYD
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("LYD")){
                toValue=fromValue/17.72;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("LYD")) {
                toValue=fromValue*17.72;

            }
            //convert UYU
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("UYU")){
                toValue=fromValue/2.01;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("UYU")) {
                toValue=fromValue*2.01;

            }
            //convert YER
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("YER")){
                toValue=fromValue/0.34;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("YER")) {
                toValue=fromValue*0.34;

            }
            //convert CAD
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("CAD")){
                toValue=fromValue/62.22;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("CAD")) {
                toValue=fromValue*62.22;

            }
            //convert SEk
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("SEk")){
                toValue=fromValue/8.17;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("SEk")) {
                toValue=fromValue*8.17;

            }
            //convert THB
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("THB")){
                toValue=fromValue/2.58;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("THB")) {
                toValue=fromValue*2.58;

            }
            //convert IDR
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("IDR")){
                toValue=fromValue/0.005;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("IDR")) {
                toValue=fromValue*0.005;

            }
            //convert LBP
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("LBP")){
                toValue=fromValue/0.00094;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("LBP")) {
                toValue=fromValue*0.00094;

            }
            //convert AED
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("AED")){
                toValue=fromValue/22.85;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("AED")) {
                toValue=fromValue*22.85;

            }
            //convert BOB
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("BOB")){
                toValue=fromValue/12.16;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("BOB")) {
                toValue=fromValue*12.16;
            }
            //convert INR
            if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("INR")){
                toValue=fromValue/83.91;
            } else if (fromUnit.equalsIgnoreCase("INR")&& toUnit.equalsIgnoreCase("INR")) {
                toValue=fromValue*83.91;

            }


            binding.toValue.setText(String.valueOf(toValue));
        }catch (Exception e){
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }



    }
}
