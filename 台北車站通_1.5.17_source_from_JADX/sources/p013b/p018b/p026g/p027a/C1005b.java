package p013b.p018b.p026g.p027a;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p007v4.view.C0483r;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

@Deprecated
/* renamed from: b.b.g.a.b */
public abstract class C1005b extends C0483r {

    /* renamed from: c */
    private final FragmentManager f3895c;

    /* renamed from: d */
    private FragmentTransaction f3896d = null;

    /* renamed from: e */
    private ArrayList<Fragment.SavedState> f3897e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<Fragment> f3898f = new ArrayList<>();

    /* renamed from: g */
    private Fragment f3899g = null;

    @Deprecated
    public C1005b(FragmentManager fragmentManager) {
        this.f3895c = fragmentManager;
    }

    @Deprecated
    /* renamed from: a */
    public Object mo1975a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3898f.size() > i && (fragment = this.f3898f.get(i)) != null) {
            return fragment;
        }
        if (this.f3896d == null) {
            this.f3896d = this.f3895c.beginTransaction();
        }
        Fragment c = mo5001c(i);
        if (this.f3897e.size() > i && (savedState = this.f3897e.get(i)) != null) {
            c.setInitialSavedState(savedState);
        }
        while (this.f3898f.size() <= i) {
            this.f3898f.add((Object) null);
        }
        c.setMenuVisibility(false);
        C0999a.m5372b(c, false);
        this.f3898f.set(i, c);
        this.f3896d.add(viewGroup.getId(), c);
        return c;
    }

    @Deprecated
    /* renamed from: a */
    public void mo1977a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3897e.clear();
            this.f3898f.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3897e.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.f3895c.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.f3898f.size() <= parseInt) {
                            this.f3898f.add((Object) null);
                        }
                        C0999a.m5371a(fragment, false);
                        this.f3898f.set(parseInt, fragment);
                    } else {
                        Log.w("FragStatePagerAdapter", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo1980a(ViewGroup viewGroup) {
        FragmentTransaction fragmentTransaction = this.f3896d;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
            this.f3896d = null;
            this.f3895c.executePendingTransactions();
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo1981a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3896d == null) {
            this.f3896d = this.f3895c.beginTransaction();
        }
        while (this.f3897e.size() <= i) {
            this.f3897e.add((Object) null);
        }
        this.f3897e.set(i, fragment.isAdded() ? this.f3895c.saveFragmentInstanceState(fragment) : null);
        this.f3898f.set(i, (Object) null);
        this.f3896d.remove(fragment);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo1982a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Deprecated
    /* renamed from: b */
    public Parcelable mo1984b() {
        Bundle bundle;
        if (this.f3897e.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3897e.size()];
            this.f3897e.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3898f.size(); i++) {
            Fragment fragment = this.f3898f.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3895c.putFragment(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Deprecated
    /* renamed from: b */
    public void mo1987b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo1988b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3899g;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                C0999a.m5372b(this.f3899g, false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                C0999a.m5372b(fragment, true);
            }
            this.f3899g = fragment;
        }
    }

    @Deprecated
    /* renamed from: c */
    public abstract Fragment mo5001c(int i);
}
