package com.google.android.gms.internal.ads;

import org.apache.http.message.TokenParser;

/* renamed from: com.google.android.gms.internal.ads._n */
final class C2923_n {
    /* renamed from: a */
    static String m11864a(C3150hm hmVar) {
        String str;
        C2952ao aoVar = new C2952ao(hmVar);
        StringBuilder sb = new StringBuilder(aoVar.size());
        for (int i = 0; i < aoVar.size(); i++) {
            int a = aoVar.mo9192a(i);
            if (a == 34) {
                str = "\\\"";
            } else if (a == 39) {
                str = "\\'";
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            a = (a & 7) + 48;
                        }
                        sb.append((char) a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
