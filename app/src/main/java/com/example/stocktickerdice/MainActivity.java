package com.example.stocktickerdice;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int mode = 0; //0 = normal, 1 = crypto

    static String sName[] = {"Gold", "Silver", "Bonds", "Oil", "Industrial", "Grain"};
    static int sValue[] = {5,10,15,20};
    static String sAction[] = {"Up", "Down", "Pays"};
    static String cName[] = {"LiteCoin", "BitCoin", "DogeCoin", "SafeMoon", "Cardano", "Ethereum"};
    static int cValue[] = {5,10,15,20};
    static String cAction[] = {"Up", "Down", "Pays"};
    static String memeBoost[] = {"Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: x2",
            "Meme Boost: No.",
            "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: x3",
            "Meme Boost: No.",
            "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: x4",
            "Meme Boost: No.",
            "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: No.",
            "Meme Boost: No.", "Meme Boost: No.", "Meme Boost: x5",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView output = findViewById(R.id.txtOutput);
        Button stockButton = findViewById(R.id.btnStock);
        stockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = 0;
                output.setText("");
            }
        });

        Button cryptoButton = findViewById(R.id.btnCrypto);
        cryptoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode = 1;
                output.setText("");
            }
        });

        Button diceButton = findViewById(R.id.button);
        diceButton.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {
                int stockName = new Random().nextInt(sName.length);
                int stockValue = new Random().nextInt(sValue.length);
                int stockAction = new Random().nextInt(sAction.length);
                int cryptoName = new Random().nextInt(cName.length);
                int cryptoValue = new Random().nextInt(cValue.length);
                int cryptoAction = new Random().nextInt(cAction.length);
                int memeBonus = new Random().nextInt(memeBoost.length);
                if (mode == 0) {
                    output.setText(String.format("%s %s %d \n\n", sName[stockName], sAction[stockAction],
                            sValue[stockValue]/*, memeBoost[memeBonus]*/));
                    if (stockAction == 0) {
                        output.setTextColor(Color.parseColor("#000000"));
                    } else if (stockAction == 1) {
                        output.setTextColor(Color.parseColor("#FF0000"));
                    } else if (stockAction == 2) {
                        output.setTextColor(Color.parseColor("#000000"));
                    }
                } else if (mode == 1) {
                    output.setText(String.format("%s %s %d \n\n /*%s*/", cName[cryptoName], cAction[cryptoAction],
                            cValue[cryptoValue]/*, memeBoost[memeBonus]*/));
                    if (cryptoAction == 0) {
                        output.setTextColor(Color.parseColor("#000000"));
                    } else if (cryptoAction == 1) {
                        output.setTextColor(Color.parseColor("#FF0000"));
                    } else if (cryptoAction == 2) {
                        output.setTextColor(Color.parseColor("#000000"));
                    }
                }

            }
        });
    }
}

