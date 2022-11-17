package com.example.customadapterwithpojoormodelclass;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);





        //create adapter object
        CustomAdapter adapter = new CustomAdapter(this,generateItemsList());

        //set custom adapter as adapter to our list view
        listView.setAdapter(adapter);

    }

    private ArrayList<Item> generateItemsList() {

        //  String itemNames[] = getResources().getStringArray(R.array.items_name);
        // String itemDescriptions[] = getResources().getStringArray(R.array.item_description);
        String[] itemNames = {
                "টাঙ্গাইল",
                "দিনাজপুর",
                "সিরাজগঞ্জ",
                "নওগাঁ",
                "নেত্রকোনা",
                "জামালপুর",
                "মাগুরা",
                "খুলনা",
                "যশোর",
                "বাগেরহাট",
                "মাগুরা",
                "ময়মনসিংহ",
                "শেরপুর",
                "নাটোর",
                "বাগেরহাট",
                "শেরপুর",
                "খুলনা",
                "ঝিনাইদহ",
                "শেরপুর",
                "শেরপুর",
                "শেরপুর",
                "শেরপুর",
                "ঝিনাইদহ",
                "জয়পুরহাট",
                "জয়পুরহাট",
                "রাজশাহী",
                "নাটোর",
                "পাবনা",
                "নাটোর",
                "রাজশাহী",
                "নাটোর",
                "পাবনা"
        } ;


        // String itemDescriptions[] = getResources().getStringArray(R.array.item_description);
        String[] itemDescriptions = {
                "Mymensingh",
                "Rajshahi",
                "Rangpur",
                "Rajshahi",
                "Rangpur",
                "Rangpur",
                "Rajshahi",
                "Rangpur",
                "Rangpur",
                "Rangpur",
                "Rangpur",
                "Rangpur",
                "Rangpur",
                "Rangpur",
                "Sylhet",
                "Rajshahi",
                "Sylhet",
                "Rajshahi",
                "Sylhet",
                "Sylhet",
                "Rajshahi",
                "Sylhet",
                "Sylhet",
                "Sylhet",
                "Sylhet",
                "Rajshahi",
                "Sylhet",
                "Sylhet",
                "Sylhet",
                "Rajshahi",
                "Sylhet",
                "Sylhet"
        } ;

        ArrayList<Item> list = new ArrayList<>();

        for (int i = 0; i < itemNames.length; i++) {
            list.add(new Item(itemNames[i], itemDescriptions[i]));
        }
        return list;
    }
}