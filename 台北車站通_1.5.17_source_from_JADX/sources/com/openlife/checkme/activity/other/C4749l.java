package com.openlife.checkme.activity.other;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.openlife.checkme.activity.other.l */
class C4749l implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ OtherFragment f13705a;

    C4749l(OtherFragment otherFragment) {
        this.f13705a = otherFragment;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this.f13705a.getActivity().getBaseContext().getPackageName()));
        intent.addFlags(1208483840);
        try {
            this.f13705a.getActivity().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Activity activity = this.f13705a.getActivity();
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this.f13705a.getActivity().getBaseContext().getPackageName())));
        }
    }
}
