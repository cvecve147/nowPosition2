package com.sto.stolibrary.layout;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.sto.stolibrary.layout.c */
class C5096c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f14443a;

    /* renamed from: b */
    final /* synthetic */ WebImage f14444b;

    C5096c(WebImage webImage, String str) {
        this.f14444b = webImage;
        this.f14443a = str;
    }

    public void run() {
        try {
            Bitmap unused = this.f14444b.f14431c = BitmapFactory.decodeStream(new URL(this.f14443a).openConnection().getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            WebImage webImage = this.f14444b;
            webImage.setImage(webImage.f14431c);
            throw th;
        }
        WebImage webImage2 = this.f14444b;
        webImage2.setImage(webImage2.f14431c);
    }
}
