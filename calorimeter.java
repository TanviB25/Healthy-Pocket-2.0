package com.tanvi.myway.healthypocket20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class calorimeter extends AppCompatActivity {

    CheckBox Milk,Juice,Pancakes,yogurt,pizza,bread,burger,fingerchips,fruit,veggie,pasta,butter,
            sausage,noodles,cheese,Cola;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorimeter);



        addListenerOnButtonClick();
    }


    public void addListenerOnButtonClick(){
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        Milk=(CheckBox)findViewById(R.id.cBox1);
        Juice=(CheckBox)findViewById(R.id.cBox2);
        Pancakes=(CheckBox)findViewById(R.id.cBox3);
        yogurt=(CheckBox)findViewById(R.id.cBox4);

        pizza=(CheckBox)findViewById(R.id.cBox5);
        bread=(CheckBox)findViewById(R.id.cBox6);
        burger=(CheckBox)findViewById(R.id.cBox7);
        fingerchips=(CheckBox)findViewById(R.id.cBox8);

        fruit=(CheckBox)findViewById(R.id.cBox9);
        sausage=(CheckBox)findViewById(R.id.cBox10);
        veggie=(CheckBox)findViewById(R.id.cBox11);
        pasta=(CheckBox)findViewById(R.id.cBox12);
        noodles=(CheckBox)findViewById(R.id.cBox13);
        butter=(CheckBox)findViewById(R.id.cBox14);
        cheese=(CheckBox)findViewById(R.id.cBox15);
        Cola=(CheckBox)findViewById(R.id.cBox16);
        but1=(Button)findViewById(R.id.but1);

        //Applying the Listener on the Button click
        but1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                int totalcalories=0;
                StringBuilder result=new StringBuilder();
                result.append("Calories Count:");
                if(Milk.isChecked()){
                    result.append("\n Whole Milk contains 146 calories/glass");
                    totalcalories+=146;
                }
                if(Juice.isChecked()){
                    result.append("\n Orange juice contains 112calories/glass");
                    totalcalories+=112;
                }
                if(Pancakes.isChecked()){
                    result.append("\nSweet Pancakes contains 460calories/ 2 pieces");
                    totalcalories+=460;
                }
                if(yogurt.isChecked()){
                    result.append("\nYogurt contains 160calories/cup");
                    totalcalories+=160;
                }
                if(pizza.isChecked()){
                    result.append("\n Regular crust pizza contains 266 calories");
                    totalcalories+=266;
                }
                if(bread.isChecked()){
                    result.append("\n Whole wheat bread contains 250calories/100gms");
                    totalcalories+=250;
                }
                if(burger.isChecked()){
                    result.append("\n Burger contains 300 calories/piece");
                    totalcalories+=300;
                }
                if(fingerchips.isChecked()){
                    result.append("\nfingerchips contain 100calories/gms");
                    totalcalories+=100;
                }

                if(fruit.isChecked()){
                    result.append("\n Orange juice contains 112calories/glass");
                    totalcalories+=112;
                }
                if(sausage.isChecked()){
                    result.append("\nSausage contains 300 calories/ 100gms");
                    totalcalories+=300;
                }
                if(veggie.isChecked()){
                    result.append("\nVegetables contain 65 calories/ 100gms");
                    totalcalories+=65;
                }
                if(pasta.isChecked()){
                    result.append("\nPasta contains 135calories/100gms");
                    totalcalories+=135;
                }
                if(noodles.isChecked()){
                    result.append("\nNoodles contain 138calories/ cup");
                    totalcalories+=138;
                }
                if(butter.isChecked()){
                    result.append("\nButter contains 717/100gms");
                    totalcalories+=717;
                }
                if(cheese.isChecked()){
                    result.append("\nCheese contains 371/ 100gms");
                    totalcalories+=371;
                }
                if(Cola.isChecked()){
                    result.append("\nSoft drinks contains 250calories/ 500ml");
                    totalcalories+=250;
                }


                if(totalcalories>=2000)
                {
                    result.append("\n\n \b Exceeding calories limit, ideally it should be 2000 calories per day");
                }
                result.append("\nTotal: "+totalcalories+"calories");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_your_selection_result, menu);
        return true;
    }

}

