package com.aigestudio.wheelpicker.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.aigestudio.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class WheelMonthPicker extends WheelPicker implements C1170b {

    /* renamed from: ha */
    private int f4340ha;

    public WheelMonthPicker(Context context) {
        this(context, (AttributeSet) null);
    }

    public WheelMonthPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 12; i++) {
            arrayList.add(Integer.valueOf(i));
        }
        super.setData(arrayList);
        this.f4340ha = Calendar.getInstance().get(2) + 1;
        m5909h();
    }

    /* renamed from: h */
    private void m5909h() {
        setSelectedItemPosition(this.f4340ha - 1);
    }

    public int getCurrentMonth() {
        return Integer.valueOf(String.valueOf(getData().get(getCurrentItemPosition()))).intValue();
    }

    public int getSelectedMonth() {
        return this.f4340ha;
    }

    public void setData(List list) {
        throw new UnsupportedOperationException("You can not invoke setData in WheelMonthPicker");
    }

    public void setSelectedMonth(int i) {
        this.f4340ha = i;
        m5909h();
    }
}
