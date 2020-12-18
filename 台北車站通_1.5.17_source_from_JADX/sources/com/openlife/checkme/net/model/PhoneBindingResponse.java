package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class PhoneBindingResponse extends C4953c<PhoneBindingData> {
    public PhoneBindingData getData() {
        T t = this.data;
        return t != null ? (PhoneBindingData) t : new PhoneBindingData();
    }
}
