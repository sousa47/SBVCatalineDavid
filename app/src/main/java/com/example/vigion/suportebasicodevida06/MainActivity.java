package com.example.vigion.suportebasicodevida06;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;



public class MainActivity extends FragmentActivity {


    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.ola);

        FragmentManager fm = getSupportFragmentManager();
        viewPager.setAdapter(new MeuFragmentAdapter(fm));
        viewPager.setCurrentItem(0);
    }

/*
    public void onClick(View v) {
        Button b = (Button) v;
        Intent intent;

        if (((Button) v).getId() == R.id.buttonSBV) {
            intent = new Intent(b.getContext(), InicioSBV.class);
        } else {
            intent = new Intent(b.getContext(), Info.class);
        }


        startActivityForResult(intent, 0);
        if (((Button) v).getId() == R.id.buttonLigar112) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);


            callIntent.setData(Uri.parse("tel:112"));
            startActivity(callIntent);

        }


    }*/
}

class MeuFragmentAdapter extends FragmentPagerAdapter{
    MeuFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        if(position == 0){frag = new Main_fragment();}
        if(position == 1){frag = new Main_fragment();}
        if(position == 2){frag = new Main_fragment();}
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
}