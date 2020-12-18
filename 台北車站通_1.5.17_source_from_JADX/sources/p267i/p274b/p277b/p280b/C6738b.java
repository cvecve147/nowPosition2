package p267i.p274b.p277b.p280b;

import java.util.Locale;

/* renamed from: i.b.b.b.b */
public class C6738b {

    /* renamed from: a */
    public static final String[] f18731a = {"Confirm", "確定", "确定", "確定", "확인"};

    /* renamed from: b */
    public static final String[] f18732b = {"Cancel", "取消", "取消", "キャンセル", "취소"};

    /* renamed from: c */
    public static final String[] f18733c = {"Settings", "前往設定", "前往设定", "設定リストへ", "설정 바로가기"};

    /* renamed from: d */
    public static final String[] f18734d = {"Later", "稍後再說", "稍后再说", "後で確認します", "잠시후"};

    /* renamed from: e */
    public static final String[] f18735e = {"Please turn your Bluetooth on to use this function.", "應用程式要求開啟藍芽功能進行定位導航", "请打开蓝牙功能进行定位导航", "ナビ機能をはじめるにはフォンのブルートゥースをオンにしてください。", "Bluetooth 열어주시고 위치추적을 시작합나다"};

    /* renamed from: f */
    public static final String[] f18736f = {"Turning Bluetooth on...", "正在開啟藍芽...", "正在开启蓝芽...", "Bluetooth接続中...", "블루투스를 켜는 중..."};

    /* renamed from: g */
    public static final String[] f18737g = {"Please turn your Location Services on to use this function", "應用程式要求開啟定位功能進行定位導航", "请开启蓝牙定位功能，进入导航", "ナビ機能をはじめるにはフォンの位置情報をオンにしてください。", "GPS 열어주시고 위치추적을 시작합나다"};

    /* renamed from: h */
    public static final String[] f18738h = {"Network Error. Check your connection and try again.", "由於網路不穩定，伺服器暫時沒有回應，請稍候再試", "由於網路不穩定，伺服器暫時沒有回應，請稍候再試", "ネット接続が悪いのでサーバーが応答を停止しています。後でもう一度試してください。", "인터넷 접수 안되니까 잠시후 다시 한번 해주세요"};

    /* renamed from: a */
    private static int m25536a() {
        String language = Locale.getDefault().getLanguage();
        if (language.equals(Locale.TRADITIONAL_CHINESE.getLanguage())) {
            return 1;
        }
        if (language.equals(Locale.SIMPLIFIED_CHINESE.getLanguage())) {
            return 2;
        }
        if (language.equals(Locale.JAPANESE.getLanguage())) {
            return 3;
        }
        return language.equals(Locale.KOREAN.getLanguage()) ? 4 : 0;
    }

    /* renamed from: a */
    public static String m25537a(String[] strArr) {
        return strArr[m25536a()];
    }
}
