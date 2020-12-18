package org.apache.http.impl.cookie;

import java.util.BitSet;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.CommonCookieAttributeHandler;
import org.apache.http.message.ParserCursor;

@Immutable
public class LaxExpiresHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("^([0-9]{1,2})([^0-9].*)?$");
    private static final BitSet DELIMS;
    private static final Map<String, Integer> MONTHS;
    private static final Pattern MONTH_PATTERN = Pattern.compile("^(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)(.*)?$", 2);
    private static final Pattern TIME_PATTERN = Pattern.compile("^([0-9]{1,2}):([0-9]{1,2}):([0-9]{1,2})([^0-9].*)?$");
    static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Pattern YEAR_PATTERN = Pattern.compile("^([0-9]{2,4})([^0-9].*)?$");

    static {
        BitSet bitSet = new BitSet();
        bitSet.set(9);
        for (int i = 32; i <= 47; i++) {
            bitSet.set(i);
        }
        for (int i2 = 59; i2 <= 64; i2++) {
            bitSet.set(i2);
        }
        for (int i3 = 91; i3 <= 96; i3++) {
            bitSet.set(i3);
        }
        for (int i4 = 123; i4 <= 126; i4++) {
            bitSet.set(i4);
        }
        DELIMS = bitSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
        concurrentHashMap.put("jan", 0);
        concurrentHashMap.put("feb", 1);
        concurrentHashMap.put("mar", 2);
        concurrentHashMap.put("apr", 3);
        concurrentHashMap.put("may", 4);
        concurrentHashMap.put("jun", 5);
        concurrentHashMap.put("jul", 6);
        concurrentHashMap.put("aug", 7);
        concurrentHashMap.put("sep", 8);
        concurrentHashMap.put("oct", 9);
        concurrentHashMap.put("nov", 10);
        concurrentHashMap.put("dec", 11);
        MONTHS = concurrentHashMap;
    }

    private void copyContent(CharSequence charSequence, ParserCursor parserCursor, StringBuilder sb) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            char charAt = charSequence.charAt(pos2);
            if (DELIMS.get(charAt)) {
                break;
            }
            pos++;
            sb.append(charAt);
        }
        parserCursor.updatePos(pos);
    }

    private void skipDelims(CharSequence charSequence, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        for (int pos2 = parserCursor.getPos(); pos2 < upperBound; pos2++) {
            if (!DELIMS.get(charSequence.charAt(pos2))) {
                break;
            }
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    public String getAttributeName() {
        return ClientCookie.EXPIRES_ATTR;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00f9: MOVE  (r6v2 int) = (r16v1 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public void parse(org.apache.http.cookie.SetCookie r21, java.lang.String r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "Invalid 'expires' attribute: "
            java.lang.String r4 = "Cookie"
            org.apache.http.util.Args.notNull(r1, r4)
            org.apache.http.message.ParserCursor r4 = new org.apache.http.message.ParserCursor
            int r5 = r22.length()
            r6 = 0
            r4.<init>(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x0028:
            boolean r18 = r4.atEnd()     // Catch:{ NumberFormatException -> 0x015a }
            if (r18 != 0) goto L_0x00cc
            r0.skipDelims(r2, r4)     // Catch:{ NumberFormatException -> 0x015a }
            r5.setLength(r6)     // Catch:{ NumberFormatException -> 0x015a }
            r0.copyContent(r2, r4, r5)     // Catch:{ NumberFormatException -> 0x015a }
            int r18 = r5.length()     // Catch:{ NumberFormatException -> 0x015a }
            if (r18 != 0) goto L_0x003f
            goto L_0x00cc
        L_0x003f:
            if (r8 != 0) goto L_0x006b
            java.util.regex.Pattern r6 = TIME_PATTERN     // Catch:{ NumberFormatException -> 0x015a }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ NumberFormatException -> 0x015a }
            boolean r19 = r6.matches()     // Catch:{ NumberFormatException -> 0x015a }
            if (r19 == 0) goto L_0x006b
            r7 = 1
            java.lang.String r8 = r6.group(r7)     // Catch:{ NumberFormatException -> 0x015a }
            int r14 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x015a }
            r7 = 2
            java.lang.String r7 = r6.group(r7)     // Catch:{ NumberFormatException -> 0x015a }
            int r15 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x015a }
            r7 = 3
            java.lang.String r6 = r6.group(r7)     // Catch:{ NumberFormatException -> 0x015a }
            int r16 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x015a }
            r6 = 0
            r8 = 1
            goto L_0x0028
        L_0x006b:
            if (r10 != 0) goto L_0x0085
            java.util.regex.Pattern r6 = DAY_OF_MONTH_PATTERN     // Catch:{ NumberFormatException -> 0x015a }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ NumberFormatException -> 0x015a }
            boolean r7 = r6.matches()     // Catch:{ NumberFormatException -> 0x015a }
            if (r7 == 0) goto L_0x0085
            r7 = 1
            java.lang.String r6 = r6.group(r7)     // Catch:{ NumberFormatException -> 0x015a }
            int r13 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x015a }
            r6 = 0
            r10 = 1
            goto L_0x0028
        L_0x0085:
            if (r11 != 0) goto L_0x00ae
            java.util.regex.Pattern r6 = MONTH_PATTERN     // Catch:{ NumberFormatException -> 0x015a }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ NumberFormatException -> 0x015a }
            boolean r7 = r6.matches()     // Catch:{ NumberFormatException -> 0x015a }
            if (r7 == 0) goto L_0x00ae
            java.util.Map<java.lang.String, java.lang.Integer> r7 = MONTHS     // Catch:{ NumberFormatException -> 0x015a }
            r11 = 1
            java.lang.String r6 = r6.group(r11)     // Catch:{ NumberFormatException -> 0x015a }
            java.util.Locale r11 = java.util.Locale.ROOT     // Catch:{ NumberFormatException -> 0x015a }
            java.lang.String r6 = r6.toLowerCase(r11)     // Catch:{ NumberFormatException -> 0x015a }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ NumberFormatException -> 0x015a }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ NumberFormatException -> 0x015a }
            int r17 = r6.intValue()     // Catch:{ NumberFormatException -> 0x015a }
            r6 = 0
            r11 = 1
            goto L_0x0028
        L_0x00ae:
            if (r12 != 0) goto L_0x00c9
            java.util.regex.Pattern r6 = YEAR_PATTERN     // Catch:{ NumberFormatException -> 0x015a }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ NumberFormatException -> 0x015a }
            boolean r7 = r6.matches()     // Catch:{ NumberFormatException -> 0x015a }
            if (r7 == 0) goto L_0x00c9
            r7 = 1
            java.lang.String r6 = r6.group(r7)     // Catch:{ NumberFormatException -> 0x015a }
            int r9 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x015a }
            r6 = 0
            r12 = 1
            goto L_0x0028
        L_0x00c9:
            r6 = 0
            goto L_0x0028
        L_0x00cc:
            if (r8 == 0) goto L_0x0145
            if (r10 == 0) goto L_0x0145
            if (r11 == 0) goto L_0x0145
            if (r12 == 0) goto L_0x0145
            r4 = 70
            if (r9 < r4) goto L_0x00de
            r4 = 99
            if (r9 > r4) goto L_0x00de
            int r9 = r9 + 1900
        L_0x00de:
            if (r9 < 0) goto L_0x00e6
            r4 = 69
            if (r9 > r4) goto L_0x00e6
            int r9 = r9 + 2000
        L_0x00e6:
            r4 = 1
            if (r13 < r4) goto L_0x0130
            r4 = 31
            if (r13 > r4) goto L_0x0130
            r4 = 1601(0x641, float:2.243E-42)
            if (r9 < r4) goto L_0x0130
            r4 = 23
            if (r14 > r4) goto L_0x0130
            r4 = 59
            if (r15 > r4) goto L_0x0130
            r6 = r16
            if (r6 > r4) goto L_0x0130
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.util.TimeZone r3 = UTC
            r2.setTimeZone(r3)
            r3 = 0
            r2.setTimeInMillis(r3)
            r3 = 13
            r2.set(r3, r6)
            r3 = 12
            r2.set(r3, r15)
            r3 = 11
            r2.set(r3, r14)
            r3 = 5
            r2.set(r3, r13)
            r6 = r17
            r3 = 2
            r2.set(r3, r6)
            r3 = 1
            r2.set(r3, r9)
            java.util.Date r2 = r2.getTime()
            r1.setExpiryDate(r2)
            return
        L_0x0130:
            org.apache.http.cookie.MalformedCookieException r1 = new org.apache.http.cookie.MalformedCookieException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x0145:
            org.apache.http.cookie.MalformedCookieException r1 = new org.apache.http.cookie.MalformedCookieException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        L_0x015a:
            org.apache.http.cookie.MalformedCookieException r1 = new org.apache.http.cookie.MalformedCookieException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.LaxExpiresHandler.parse(org.apache.http.cookie.SetCookie, java.lang.String):void");
    }
}
