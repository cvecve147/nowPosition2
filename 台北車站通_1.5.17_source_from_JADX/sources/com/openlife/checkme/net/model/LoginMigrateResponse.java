package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class LoginMigrateResponse extends C4953c<AccountData> {
    public AccountData getData() {
        T t = this.data;
        return t != null ? (AccountData) t : new AccountData();
    }
}
