package com.example.manisaiprasad.ble;

import android.bluetooth.BluetoothDevice;

/**
 * Created by jgomez on 4/05/16.
 */
public interface BLEPeripheralChatEvents extends BLEChatEvents {
    void onClientDisconnect(BluetoothDevice device);
    void onInitRfcommSocket();
    void onConnectRfcommSocket();
}
