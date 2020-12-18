package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class MobileInfo {
    @C5598c("ANDROID_ID")
    private String androidId;
    @C5598c("BOARD")
    private String board;
    @C5598c("BRAND")
    private String brand;
    @C5598c("CPU_ABI")
    private String cpuAbi;
    @C5598c("DEVICE")
    private String device;
    @C5598c("MANUFACTURER")
    private String manufacturer;
    @C5598c("MODEL")
    private String model;
    @C5598c("PRODUCT")
    private String product;
    @C5598c("ROOT")
    private boolean root;
    @C5598c("SERIAL")
    private String serial;

    public MobileInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        this.board = str;
        this.brand = str2;
        this.cpuAbi = str3;
        this.device = str4;
        this.manufacturer = str5;
        this.model = str6;
        this.product = str7;
        this.serial = str8;
        this.androidId = str9;
        this.root = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MobileInfo.class != obj.getClass()) {
            return false;
        }
        MobileInfo mobileInfo = (MobileInfo) obj;
        if (this.root != mobileInfo.root) {
            return false;
        }
        String str = this.board;
        if (str == null ? mobileInfo.board != null : !str.equals(mobileInfo.board)) {
            return false;
        }
        String str2 = this.brand;
        if (str2 == null ? mobileInfo.brand != null : !str2.equals(mobileInfo.brand)) {
            return false;
        }
        String str3 = this.cpuAbi;
        if (str3 == null ? mobileInfo.cpuAbi != null : !str3.equals(mobileInfo.cpuAbi)) {
            return false;
        }
        String str4 = this.device;
        if (str4 == null ? mobileInfo.device != null : !str4.equals(mobileInfo.device)) {
            return false;
        }
        String str5 = this.manufacturer;
        if (str5 == null ? mobileInfo.manufacturer != null : !str5.equals(mobileInfo.manufacturer)) {
            return false;
        }
        String str6 = this.model;
        if (str6 == null ? mobileInfo.model != null : !str6.equals(mobileInfo.model)) {
            return false;
        }
        String str7 = this.product;
        if (str7 == null ? mobileInfo.product != null : !str7.equals(mobileInfo.product)) {
            return false;
        }
        String str8 = this.serial;
        if (str8 == null ? mobileInfo.serial != null : !str8.equals(mobileInfo.serial)) {
            return false;
        }
        String str9 = this.androidId;
        return str9 != null ? str9.equals(mobileInfo.androidId) : mobileInfo.androidId == null;
    }

    public int hashCode() {
        String str = this.board;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.brand;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cpuAbi;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.device;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.manufacturer;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.model;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.product;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.serial;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.androidId;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return ((hashCode8 + i) * 31) + (this.root ? 1 : 0);
    }
}
