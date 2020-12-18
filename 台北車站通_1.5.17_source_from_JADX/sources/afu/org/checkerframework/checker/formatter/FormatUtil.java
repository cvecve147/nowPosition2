package afu.org.checkerframework.checker.formatter;

import afu.org.checkerframework.checker.formatter.qual.ConversionCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IllegalFormatConversionException;
import java.util.MissingFormatArgumentException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatUtil {

    /* renamed from: a */
    private static Pattern f82a = Pattern.compile("%(\\d+\\$)?([-#+ 0,(\\<]*)?(\\d+)?(\\.\\d+)?([tT])?([a-zA-Z%])");

    public static class ExcessiveOrMissingFormatArgumentException extends MissingFormatArgumentException {

        /* renamed from: a */
        private final int f83a;

        /* renamed from: b */
        private final int f84b;

        public ExcessiveOrMissingFormatArgumentException(int i, int i2) {
            super("-");
            this.f83a = i;
            this.f84b = i2;
        }

        public int getExpected() {
            return this.f83a;
        }

        public int getFound() {
            return this.f84b;
        }

        public String getMessage() {
            return String.format("Expected %d arguments but found %d.", new Object[]{Integer.valueOf(this.f83a), Integer.valueOf(this.f84b)});
        }
    }

    public static class IllegalFormatConversionCategoryException extends IllegalFormatConversionException {

        /* renamed from: a */
        private final ConversionCategory f85a;

        /* renamed from: b */
        private final ConversionCategory f86b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IllegalFormatConversionCategoryException(ConversionCategory conversionCategory, ConversionCategory conversionCategory2) {
            super(conversionCategory.chars.length() == 0 ? '-' : conversionCategory.chars.charAt(0), conversionCategory2.types == null ? Object.class : conversionCategory2.types[0]);
            this.f85a = conversionCategory;
            this.f86b = conversionCategory2;
        }

        public ConversionCategory getExpected() {
            return this.f85a;
        }

        public ConversionCategory getFound() {
            return this.f86b;
        }

        public String getMessage() {
            return String.format("Expected category %s but found %s.", new Object[]{this.f85a, this.f86b});
        }
    }

    /* renamed from: afu.org.checkerframework.checker.formatter.FormatUtil$a */
    private static class C0021a {

        /* renamed from: a */
        private final int f87a;

        /* renamed from: b */
        private final ConversionCategory f88b;

        public C0021a(char c, int i) {
            this.f87a = i;
            this.f88b = ConversionCategory.fromConversionChar(c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ConversionCategory mo31a() {
            return this.f88b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo32b() {
            return this.f87a;
        }
    }

    /* renamed from: a */
    private static char m52a(Matcher matcher) {
        String group = matcher.group(5);
        return group == null ? matcher.group(6).charAt(0) : group.charAt(0);
    }

    /* renamed from: a */
    private static C0021a[] m53a(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f82a.matcher(str);
        while (matcher.find()) {
            char a = m52a(matcher);
            if (!(a == '%' || a == 'n')) {
                arrayList.add(new C0021a(a, m54b(matcher)));
            }
        }
        return (C0021a[]) arrayList.toArray(new C0021a[arrayList.size()]);
    }

    public static String asFormat(String str, ConversionCategory... conversionCategoryArr) {
        ConversionCategory[] formatParameterCategories = formatParameterCategories(str);
        if (formatParameterCategories.length == conversionCategoryArr.length) {
            int i = 0;
            while (i < conversionCategoryArr.length) {
                if (conversionCategoryArr[i] == formatParameterCategories[i]) {
                    i++;
                } else {
                    throw new IllegalFormatConversionCategoryException(conversionCategoryArr[i], formatParameterCategories[i]);
                }
            }
            return str;
        }
        throw new ExcessiveOrMissingFormatArgumentException(conversionCategoryArr.length, formatParameterCategories.length);
    }

    /* renamed from: b */
    private static int m54b(Matcher matcher) {
        String group = matcher.group(1);
        return group != null ? Integer.parseInt(group.substring(0, group.length() - 1)) : (matcher.group(2) == null || !matcher.group(2).contains(String.valueOf('<'))) ? 0 : -1;
    }

    public static ConversionCategory[] formatParameterCategories(String str) {
        tryFormatSatisfiability(str);
        C0021a[] a = m53a(str);
        HashMap hashMap = new HashMap();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        for (C0021a aVar : a) {
            int b = aVar.mo32b();
            if (b != -1) {
                if (b != 0) {
                    i3 = b - 1;
                } else {
                    i2++;
                    i3 = i2;
                }
            }
            i = Math.max(i, i3);
            hashMap.put(Integer.valueOf(i3), ConversionCategory.intersect(hashMap.containsKey(Integer.valueOf(i3)) ? (ConversionCategory) hashMap.get(Integer.valueOf(i3)) : ConversionCategory.UNUSED, aVar.mo31a()));
        }
        ConversionCategory[] conversionCategoryArr = new ConversionCategory[(i + 1)];
        for (int i4 = 0; i4 <= i; i4++) {
            conversionCategoryArr[i4] = hashMap.containsKey(Integer.valueOf(i4)) ? (ConversionCategory) hashMap.get(Integer.valueOf(i4)) : ConversionCategory.UNUSED;
        }
        return conversionCategoryArr;
    }

    public static void tryFormatSatisfiability(String str) {
        String.format(str, (Object[]) null);
    }
}
