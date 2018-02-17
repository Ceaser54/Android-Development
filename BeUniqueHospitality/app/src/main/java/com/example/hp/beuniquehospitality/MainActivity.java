package com.example.hp.beuniquehospitality;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


//Using API 14 android => 4.0 (IceCreameSandwitch)

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Connect(View view)
    {
        Toast.makeText(this, "You Can Call This Number Now ", Toast.LENGTH_LONG).show();
        Intent Phone = new Intent(Intent.ACTION_DIAL);
        Phone.setData(Uri.parse("tel:+971 4 380 5077"));
        startActivity(Phone);
    }


    public void Locate(View view) {
        Toast.makeText(this, "See your current location on the map and start your journey", Toast.LENGTH_LONG).show();
        String Location = "geo:0,0?q=-6.908572,107.610923(Office No. 1, Oasis Centre, Sheikh Zayed Road, Dubai)";
        Intent GoogleMap = new Intent(Intent.ACTION_VIEW, Uri.parse(Location));
        startActivity(GoogleMap);
    }
}
