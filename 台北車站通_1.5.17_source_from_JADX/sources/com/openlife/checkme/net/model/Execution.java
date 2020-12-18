package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p101d.p129g.p152e.p153a.C5598c;

public class Execution {
    @C5598c("barcode")
    private String barcode;
    @C5598c("beacon")
    private Set<Sensor> beacons = new HashSet();
    @C5598c("invoice_bar_code")
    private String invoiceBarCode;
    @C5598c("invoice_qr_code")
    private String invoiceQrCode;
    @C5598c("sensor_id")
    private Integer sensorId;

    public void addBeacon(Sensor sensor) {
        this.beacons.add(sensor);
    }

    public String getBarcode() {
        String str = this.barcode;
        return str != null ? str : "";
    }

    public List<Sensor> getBeacons() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.beacons);
        return arrayList;
    }

    public String getInvoiceBarCode() {
        String str = this.invoiceBarCode;
        return str != null ? str : "";
    }

    public String getInvoiceQrCode() {
        String str = this.invoiceQrCode;
        return str != null ? str : "";
    }

    public int getSensorId() {
        return this.sensorId.intValue();
    }

    public void setBarcode(String str) {
        this.barcode = str;
    }

    public void setInvoiceBarCode(String str) {
        this.invoiceBarCode = str;
    }

    public void setInvoiceQrCode(String str) {
        this.invoiceQrCode = str;
    }

    public void setSensorId(int i) {
        this.sensorId = Integer.valueOf(i);
    }
}
