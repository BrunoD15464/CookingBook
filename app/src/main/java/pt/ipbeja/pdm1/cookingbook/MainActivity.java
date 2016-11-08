package pt.ipbeja.pdm1.cookingbook;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Toast.makeText(this, Dish.DishName[0].toString(), Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, Dish.DishDescription[0].toString(), Toast.LENGTH_SHORT).show();


        if (findViewById(R.id.activity_main) != null) {

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create a new Fragment to be placed in the activity layout
//            Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
//            DishNameFragment firstFragment = new DishNameFragment();
//
//            // In case this activity was started with special instructions from an
//            // Intent, pass the Intent's extras to the fragment as arguments
//            firstFragment.setArguments(getIntent().getExtras());
//
//            // Add the fragment to the 'fragment_container' FrameLayout
//            getSupportFragmentManager().beginTransaction()
//                   .add(R.id.activity_main, firstFragment).commit();


            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            DishNameFragment dishname = new DishNameFragment();
            fragmentTransaction.add(R.id.activity_main, dishname, "DISHNAME");
            fragmentTransaction.commit();

        }
    }


}
