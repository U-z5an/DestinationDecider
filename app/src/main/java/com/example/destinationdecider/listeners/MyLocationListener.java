package com.example.destinationdecider.listeners;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public abstract class MyLocationListener implements LocationListener {
    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
