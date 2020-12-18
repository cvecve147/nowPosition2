package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class SystemConfigResponse extends C4953c<SystemConfigData> {
    public SystemConfigData getData() {
        T t = this.data;
        return t != null ? (SystemConfigData) t : new SystemConfigData();
    }
}
