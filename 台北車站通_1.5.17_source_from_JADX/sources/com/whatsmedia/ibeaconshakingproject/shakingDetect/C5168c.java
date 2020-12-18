package com.whatsmedia.ibeaconshakingproject.shakingDetect;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.UUID;

/* renamed from: com.whatsmedia.ibeaconshakingproject.shakingDetect.c */
class C5168c extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ C5169d f14514a;

    C5168c(C5169d dVar) {
        this.f14514a = dVar;
    }

    public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        this.f14514a.m20009c();
    }

    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (i != 0) {
            this.f14514a.m20009c();
        }
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i == 0 && i2 == 2) {
            this.f14514a.f14520f.discoverServices();
        } else {
            if (i2 == 0) {
                this.f14514a.m20009c();
            } else if (i == 133) {
                this.f14514a.f14518d.disable();
                do {
                } while (this.f14514a.f14518d.isEnabled());
                this.f14514a.f14518d.enable();
                do {
                } while (!this.f14514a.f14518d.isEnabled());
            }
            boolean unused = this.f14514a.f14524j = false;
        }
        super.onConnectionStateChange(bluetoothGatt, i, i2);
    }

    public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onMtuChanged(bluetoothGatt, i, i2);
    }

    public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onReadRemoteRssi(bluetoothGatt, i, i2);
    }

    public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
        super.onReliableWriteCompleted(bluetoothGatt, i);
    }

    public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        for (BluetoothGattService next : this.f14514a.f14520f.getServices()) {
            if (next.getUuid().compareTo(UUID.fromString("0000FFF0-0000-1000-8000-00805F9B34FB")) == 0) {
                for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                    if (next2.getUuid().compareTo(UUID.fromString("0000FFF3-0000-1000-8000-00805F9B34FB")) == 0) {
                        this.f14514a.f14520f.setCharacteristicNotification(next2, true);
                        BluetoothGattCharacteristic unused = this.f14514a.f14522h = next2;
                    } else if (next2.getUuid().compareTo(UUID.fromString("0000FFF2-0000-1000-8000-00805F9B34FB")) == 0) {
                        BluetoothGattCharacteristic unused2 = this.f14514a.f14521g = next2;
                    }
                }
            }
        }
        if (this.f14514a.f14522h == null || this.f14514a.f14521g == null) {
            this.f14514a.m20009c();
        } else {
            this.f14514a.f14521g.setValue(this.f14514a.f14518d.getName().getBytes());
            this.f14514a.f14521g.setWriteType(1);
            this.f14514a.f14520f.writeCharacteristic(this.f14514a.f14521g);
        }
        super.onServicesDiscovered(bluetoothGatt, i);
    }
}
