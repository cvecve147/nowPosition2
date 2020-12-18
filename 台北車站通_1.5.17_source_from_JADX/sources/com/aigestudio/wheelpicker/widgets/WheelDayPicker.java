package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WheelDayPicker extends WheelPicker implements C1169a {

    /* renamed from: ha */
    private static final Map<Integer, List<Integer>> f4335ha = new HashMap();

    /* renamed from: ia */
    private Calendar f4336ia;

    /* renamed from: ja */
    private int f4337ja;

    /* renamed from: ka */
    private int f4338ka;

    /* renamed from: la */
    private int f4339la;

    public WheelDayPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public WheelDayPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4336ia = Calendar.getInstance();
        this.f4337ja = this.f4336ia.get(1);
        this.f4338ka = this.f4336ia.get(2);
        m5907h();
        this.f4339la = this.f4336ia.get(5);
        m5908i();
    }

    /* renamed from: h */
    private void m5907h() {
        this.f4336ia.set(1, this.f4337ja);
        this.f4336ia.set(2, this.f4338ka);
        int actualMaximum = this.f4336ia.getActualMaximum(5);
        List list = f4335ha.get(Integer.valueOf(actualMaximum));
        if (list == null) {
            list = new ArrayList();
            for (int i = 1; i <= actualMaximum; i++) {
                list.add(Integer.valueOf(i));
            }
            f4335ha.put(Integer.valueOf(actualMaximum), list);
        }
        super.setData(list);
    }

    /* renamed from: i */
    private void m5908i() {
        setSelectedItemPosition(this.f4339la - 1);
    }

    public int getCurrentDay() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    public int getMonth() {
        return this.f4338ka;
    }

    public int getSelectedDay() {
        return this.f4339la;
    }

    public int getYear() {
        return this.f4337ja;
    }

    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelDayPicker");
    }

    public void setMonth(int i) {
        this.f4338ka = i - 1;
        m5907h();
    }

    public void setSelectedDay(int i) {
        this.f4339la = i;
        m5908i();
    }

    public void setYear(int i) {
        this.f4337ja = i;
        m5907h();
    }
}
