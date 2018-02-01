package mik.easj.skole.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivty extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer_activty);

    }

    public void OnClickFindBeerBtn(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner colour = (Spinner) findViewById(R.id.MinSpinner);
       String beerType = String.valueOf(colour.getSelectedItem());
        List<String> brandList = expert.GetBrands(beerType);
        StringBuilder brandformatted = new StringBuilder();
        for (String i : brandList){
            brandformatted.append(i).append('\n');
        }
        brands.setText(brandformatted);


    }


}