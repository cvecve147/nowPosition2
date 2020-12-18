package p101d.p129g.p131b.p132a.p134b;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* renamed from: d.g.b.a.b.i */
final class C5474i implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Context f15384a;

    /* renamed from: b */
    private final /* synthetic */ Intent f15385b;

    C5474i(Context context, Intent intent) {
        this.f15384a = context;
        this.f15385b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f15384a.startActivity(this.f15385b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
