package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0026d;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.m */
public class C0038m extends Fragment {

    /* renamed from: a */
    private C0039a f139a;

    /* renamed from: android.arch.lifecycle.m$a */
    interface C0039a {
        /* renamed from: k */
        void mo66k();

        void onCreate();

        void onResume();
    }

    /* renamed from: a */
    public static void m111a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0038m(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m112a(C0026d.C0027a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0034i) {
            ((C0034i) activity).mo55b().mo57b(aVar);
        } else if (activity instanceof C0030f) {
            C0026d b = ((C0030f) activity).mo55b();
            if (b instanceof C0032h) {
                ((C0032h) b).mo57b(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m113a(C0039a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: b */
    private void m114b(C0039a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: c */
    private void m115c(C0039a aVar) {
        if (aVar != null) {
            aVar.mo66k();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m113a(this.f139a);
        m112a(C0026d.C0027a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m112a(C0026d.C0027a.ON_DESTROY);
        this.f139a = null;
    }

    public void onPause() {
        super.onPause();
        m112a(C0026d.C0027a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m114b(this.f139a);
        m112a(C0026d.C0027a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m115c(this.f139a);
        m112a(C0026d.C0027a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m112a(C0026d.C0027a.ON_STOP);
    }
}
