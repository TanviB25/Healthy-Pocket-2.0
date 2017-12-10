package com.tanvi.myway.healthypocket20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class family_budget extends AppCompatActivity {

    CheckBox Milk,Juice,Pancakes,yogurt,pizza,burger,fingerchips,fruit,veggie,pasta,butter,sausage,noodles,cheese;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_budget);

        // TextView mItemSelected1;
        //String listItems[];
        //boolean checkedItems[];
        //ArrayList<Integer> mUserItems1 = new ArrayList<>();
            addListenerOnButtonClick();
        }

    public void addListenerOnButtonClick(){
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        Milk=(CheckBox)findViewById(R.id.checkBox1);
        Juice=(CheckBox)findViewById(R.id.checkBox2);
        Pancakes=(CheckBox)findViewById(R.id.checkBox3);
        yogurt=(CheckBox)findViewById(R.id.checkBox4);

        pizza=(CheckBox)findViewById(R.id.checkBox12);
        //bread=(CheckBox)findViewById(R.id.cBox6);
        burger=(CheckBox)findViewById(R.id.checkBox7);
        fingerchips=(CheckBox)findViewById(R.id.checkBox8);

        fruit=(CheckBox)findViewById(R.id.checkBox9);
        sausage=(CheckBox)findViewById(R.id.checkBox10);
        veggie=(CheckBox)findViewById(R.id.checkBox11);
        pasta=(CheckBox)findViewById(R.id.checkBox12);
        noodles=(CheckBox)findViewById(R.id.checkBox13);
        butter=(CheckBox)findViewById(R.id.checkBox14);
        cheese=(CheckBox)findViewById(R.id.checkBox15);
        // Cola=(CheckBox)findViewById(R.id.checkBox16);
        button1=(Button)findViewById(R.id.button1);

        //Applying the Listener on the Button click
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                float totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");
                if(Milk.isChecked()){
                    result.append("\nMilk is £1.09/ltr");
                    totalamount+=1.09;
                }
                if(Juice.isChecked()){
                    result.append("\njuice is £0.90/ltr");
                    totalamount+=0.90;
                }
                if(Pancakes.isChecked()){
                    result.append("\nSweet Pancakes are £1.60/ 8 pieces");
                    totalamount+=1.60;
                }
                if(yogurt.isChecked()){
                    result.append("\nyogurt is £1.09");
                    totalamount+=1.09;
                }
                if(pizza.isChecked()){
                    result.append("\npizza is £3");
                    totalamount+=3.0;
                }
                if(burger.isChecked()){
                    result.append("\nBurger £3.60");
                    totalamount+=3.60;
                }
                if(fingerchips.isChecked()){
                    result.append("\nFingerchips £2");
                    totalamount+=2.0;
                }
                if(fruit.isChecked()){
                    result.append("\nFruits [Apples] are £1.60");
                    totalamount+=1.60;
                }
                if(veggie.isChecked()){
                    result.append("\nvegetables are £1.60");
                    totalamount+=1.60;
                }

                if(pasta.isChecked()){
                    result.append("\nPasta is £3.90");
                    totalamount+=3.90;
                }
                if(butter.isChecked()){
                    result.append("\nButter is £2.60/ 250 gms");
                    totalamount+=2.60;
                }
                if(sausage.isChecked()){
                    result.append("\nSausages are £1.09");
                    totalamount+=1.09;
                }
                if(noodles.isChecked()){
                    result.append("\nRice Noodles are £1.0");
                    totalamount+=1.00;
                }
                if(cheese.isChecked()){
                    result.append("\nCheese is £2.60");
                    totalamount+=2.60;
                }
                if(totalamount>=15.0)
                {
                    result.append("\n\n \b Exceeding amount than 15 GBP");
                }
                result.append("\nTotal: "+totalamount+"GBP");
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



