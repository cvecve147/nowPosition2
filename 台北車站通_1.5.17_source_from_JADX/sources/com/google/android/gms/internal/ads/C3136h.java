package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.C1697X;

/* renamed from: com.google.android.gms.internal.ads.h */
final class C3136h implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ String f9390a;

    /* renamed from: b */
    private final /* synthetic */ String f9391b;

    /* renamed from: c */
    private final /* synthetic */ C3108g f9392c;

    C3136h(C3108g gVar, String str, String str2) {
        this.f9392c = gVar;
        this.f9390a = str;
        this.f9391b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f9392c.f9348d.getSystemService("download");
        try {
            String str = this.f9390a;
            String str2 = this.f9391b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C1697X.m7700g().mo9721a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f9392c.mo9766a("Could not store picture.");
        }
    }
}
