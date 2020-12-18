package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.apache.http.protocol.HttpRequestExecutor;

public class WheelYearPicker extends WheelPicker implements C1171c {

    /* renamed from: ha */
    private int f4341ha;

    /* renamed from: ia */
    private int f4342ia;

    /* renamed from: ja */
    private int f4343ja;

    public WheelYearPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public WheelYearPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4341ha = 1000;
        this.f4342ia = HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE;
        m5911i();
        this.f4343ja = Calendar.getInstance().get(1);
        m5910h();
    }

    /* renamed from: h */
    private void m5910h() {
        setSelectedItemPosition(this.f4343ja - this.f4341ha);
    }

    /* renamed from: i */
    private void m5911i() {
        ArrayList arrayList = new ArrayList();
        for (int i = this.f4341ha; i <= this.f4342ia; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        super.setData(arrayList);
    }

    public int getCurrentYear() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    public int getSelectedYear() {
        return this.f4343ja;
    }

    public int getYearEnd() {
        return this.f4342ia;
    }

    public int getYearStart() {
        return this.f4341ha;
    }

    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelYearPicker");
    }

    public void setSelectedYear(int i) {
        this.f4343ja = i;
        m5910h();
    }

    public void setYearEnd(int i) {
        this.f4342ia = i;
        m5911i();
    }

    public void setYearStart(int i) {
        this.f4341ha = i;
        this.f4343ja = getCurrentYear();
        m5911i();
        m5910h();
    }
}
