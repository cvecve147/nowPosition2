package com.sto.stolibrary.layout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class WebImage extends LinearLayout {

    /* renamed from: a */
    private Context f14429a;

    /* renamed from: b */
    private Bitmap f14430b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Bitmap f14431c;

    /* renamed from: d */
    private String f14432d;

    /* renamed from: e */
    private Boolean f14433e;

    public WebImage(Context context) {
        super(context);
        this.f14430b = null;
        this.f14431c = null;
        this.f14432d = null;
        this.f14433e = false;
        this.f14429a = context;
        m19959a();
    }

    public WebImage(Context context, Bitmap bitmap) {
        this(context, bitmap, (String) null);
    }

    public WebImage(Context context, Bitmap bitmap, String str) {
        super(context);
        this.f14430b = null;
        this.f14431c = null;
        this.f14432d = null;
        this.f14433e = false;
        this.f14429a = context;
        this.f14430b = bitmap;
        this.f14432d = str;
        m19959a();
        this.f14433e = true;
    }

    public WebImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14430b = null;
        this.f14431c = null;
        this.f14432d = null;
        this.f14433e = false;
        this.f14429a = context;
        m19959a();
    }

    public WebImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14430b = null;
        this.f14431c = null;
        this.f14432d = null;
        this.f14433e = false;
        this.f14429a = context;
        m19959a();
    }

    public WebImage(Context context, String str) {
        super(context);
        this.f14430b = null;
        this.f14431c = null;
        this.f14432d = null;
        this.f14433e = false;
        this.f14429a = context;
        this.f14432d = str;
        m19959a();
    }

    /* renamed from: a */
    private void m19959a() {
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.f14429a);
        RelativeLayout relativeLayout = new RelativeLayout(this.f14429a);
        ProgressBar progressBar = new ProgressBar(this.f14429a);
        imageView.setTag("IM");
        relativeLayout.setTag("LD");
        imageView.setVisibility(8);
        relativeLayout.setVisibility(0);
        relativeLayout.setBackgroundColor(-7829368);
        relativeLayout.addView(progressBar);
        addView(relativeLayout);
        addView(imageView);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) progressBar.getLayoutParams();
        layoutParams.addRule(13, -1);
        progressBar.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private void m19961b(String str) {
        Bitmap bitmap = this.f14431c;
        if (bitmap != null) {
            setImage(bitmap);
        }
        new Thread(new C5096c(this, str)).start();
    }

    /* access modifiers changed from: private */
    public void setImage(Bitmap bitmap) {
        if (bitmap != null || (bitmap = this.f14430b) != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            float width = ((float) getWidth()) / ((float) bitmap.getWidth());
            ((Activity) this.f14429a).runOnUiThread(new C5097d(this, bitmapDrawable, (int) (((float) bitmap.getWidth()) * width), (int) (((float) bitmap.getHeight()) * width)));
        }
    }

    /* renamed from: a */
    public void mo14161a(String str) {
        this.f14431c = null;
        this.f14432d = str;
        this.f14433e = true;
        findViewWithTag("IM").setVisibility(8);
        findViewWithTag("LD").setVisibility(0);
    }

    public Bitmap getBitmap() {
        return this.f14431c;
    }

    public String getURL() {
        return this.f14432d;
    }

    public Bitmap getUnknownBMP() {
        return this.f14430b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f14433e.booleanValue()) {
            Log.d("WebImage", "RELOAD");
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewWithTag("LD").getLayoutParams();
            layoutParams.width = i3;
            layoutParams.height = (int) ((((float) getWidth()) / 16.0f) * 9.0f);
            findViewWithTag("LD").setLayoutParams(layoutParams);
            String str = this.f14432d;
            if (str != null) {
                m19961b(str);
                this.f14433e = false;
            }
        }
    }

    public void setUnknownBMP(Bitmap bitmap) {
        this.f14430b = bitmap;
    }
}
