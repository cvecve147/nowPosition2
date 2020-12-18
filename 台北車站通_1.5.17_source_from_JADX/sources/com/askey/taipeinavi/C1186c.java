package com.askey.taipeinavi;

import android.content.Intent;
import android.os.Bundle;
import com.askey.taipeinavi.home.HomeActivity;
import com.askey.taipeinavi.p058d.C1213g;
import com.askey.taipeinavi.tutorial.TutorialFragment;
import p267i.p274b.p282c.C6740b;
import p267i.p274b.p282c.C6744e;
import p267i.p274b.p282c.C6749j;

/* renamed from: com.askey.taipeinavi.c */
public class C1186c extends C6740b {

    /* renamed from: ba */
    private C6744e f4360ba;

    /* renamed from: com.askey.taipeinavi.c$a */
    private class C1187a implements C6749j {
        private C1187a() {
        }

        /* synthetic */ C1187a(C1186c cVar, C1183b bVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo5481a() {
            return C1186c.this.mo6389fa();
        }
    }

    /* renamed from: ha */
    private void m5946ha() {
        if (!this.f18739W) {
            this.f18739W = true;
            mo17225a(new C1172a(), false);
            m5948ja();
        }
    }

    /* renamed from: ia */
    private void m5947ia() {
        TutorialFragment tutorialFragment = new TutorialFragment();
        tutorialFragment.mo5655a((TutorialFragment.C1311a) new C1183b(this));
        mo17225a(tutorialFragment, false);
    }

    /* renamed from: ja */
    private void m5948ja() {
        if (C1213g.m6069l(mo1396i())) {
            mo5480ga();
        } else {
            m5947ia();
        }
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        m5946ha();
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        super.mo1301c(bundle);
        this.f4360ba = (C6744e) mo1337a();
        this.f4360ba.mo17231a((C6749j) new C1187a(this, (C1183b) null));
    }

    /* renamed from: ga */
    public void mo5480ga() {
        this.f4360ba.startActivity(new Intent(this.f4360ba, HomeActivity.class));
        this.f4360ba.finish();
    }
}
