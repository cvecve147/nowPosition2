package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Log;
import com.caverock.androidsvg.CSSParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;

public class SVG {
    private static final int DEFAULT_PICTURE_HEIGHT = 512;
    private static final int DEFAULT_PICTURE_WIDTH = 512;
    private static final long SPECIFIED_ALL = -1;
    static final long SPECIFIED_CLIP = 1048576;
    static final long SPECIFIED_CLIP_PATH = 268435456;
    static final long SPECIFIED_CLIP_RULE = 536870912;
    static final long SPECIFIED_COLOR = 4096;
    static final long SPECIFIED_DIRECTION = 68719476736L;
    static final long SPECIFIED_DISPLAY = 16777216;
    static final long SPECIFIED_FILL = 1;
    static final long SPECIFIED_FILL_OPACITY = 4;
    static final long SPECIFIED_FILL_RULE = 2;
    static final long SPECIFIED_FONT_FAMILY = 8192;
    static final long SPECIFIED_FONT_SIZE = 16384;
    static final long SPECIFIED_FONT_STYLE = 65536;
    static final long SPECIFIED_FONT_WEIGHT = 32768;
    static final long SPECIFIED_IMAGE_RENDERING = 137438953472L;
    static final long SPECIFIED_MARKER_END = 8388608;
    static final long SPECIFIED_MARKER_MID = 4194304;
    static final long SPECIFIED_MARKER_START = 2097152;
    static final long SPECIFIED_MASK = 1073741824;
    static final long SPECIFIED_OPACITY = 2048;
    static final long SPECIFIED_OVERFLOW = 524288;
    static final long SPECIFIED_SOLID_COLOR = 2147483648L;
    static final long SPECIFIED_SOLID_OPACITY = 4294967296L;
    static final long SPECIFIED_STOP_COLOR = 67108864;
    static final long SPECIFIED_STOP_OPACITY = 134217728;
    static final long SPECIFIED_STROKE = 8;
    static final long SPECIFIED_STROKE_DASHARRAY = 512;
    static final long SPECIFIED_STROKE_DASHOFFSET = 1024;
    static final long SPECIFIED_STROKE_LINECAP = 64;
    static final long SPECIFIED_STROKE_LINEJOIN = 128;
    static final long SPECIFIED_STROKE_MITERLIMIT = 256;
    static final long SPECIFIED_STROKE_OPACITY = 16;
    static final long SPECIFIED_STROKE_WIDTH = 32;
    static final long SPECIFIED_TEXT_ANCHOR = 262144;
    static final long SPECIFIED_TEXT_DECORATION = 131072;
    static final long SPECIFIED_VECTOR_EFFECT = 34359738368L;
    static final long SPECIFIED_VIEWPORT_FILL = 8589934592L;
    static final long SPECIFIED_VIEWPORT_FILL_OPACITY = 17179869184L;
    static final long SPECIFIED_VISIBILITY = 33554432;
    private static final double SQRT2 = 1.414213562373095d;
    static final String TAG = "AndroidSVG";
    private static final String VERSION = "1.3";
    private static boolean enableInternalEntities = true;
    private static SVGExternalFileResolver externalFileResolver;
    private CSSParser.Ruleset cssRules = new CSSParser.Ruleset();
    private String desc = "";
    private Map<String, SvgElementBase> idToElementMap = new HashMap();
    private float renderDPI = 96.0f;
    private Svg rootElement = null;
    private String title = "";

    /* renamed from: com.caverock.androidsvg.SVG$1 */
    static /* synthetic */ class C13301 {
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Unit = new int[Unit.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.caverock.androidsvg.SVG$Unit[] r0 = com.caverock.androidsvg.SVG.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$caverock$androidsvg$SVG$Unit = r0
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.px     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x001f }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.em     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x002a }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.ex     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.in     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.cm     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x004b }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.mm     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.pt     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.pc     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$SVG$Unit     // Catch:{ NoSuchFieldError -> 0x006e }
                com.caverock.androidsvg.SVG$Unit r1 = com.caverock.androidsvg.SVG.Unit.percent     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVG.C13301.<clinit>():void");
        }
    }

    static class Box {
        float height;
        float minX;
        float minY;
        float width;

        Box(float f, float f2, float f3, float f4) {
            this.minX = f;
            this.minY = f2;
            this.width = f3;
            this.height = f4;
        }

        Box(Box box) {
            this.minX = box.minX;
            this.minY = box.minY;
            this.width = box.width;
            this.height = box.height;
        }

        static Box fromLimits(float f, float f2, float f3, float f4) {
            return new Box(f, f2, f3 - f, f4 - f2);
        }

        static Box fromRectF(RectF rectF) {
            return fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }

        /* access modifiers changed from: package-private */
        public float maxX() {
            return this.minX + this.width;
        }

        /* access modifiers changed from: package-private */
        public float maxY() {
            return this.minY + this.height;
        }

        /* access modifiers changed from: package-private */
        public RectF toRectF() {
            return new RectF(this.minX, this.minY, maxX(), maxY());
        }

        public String toString() {
            return "[" + this.minX + " " + this.minY + " " + this.width + " " + this.height + "]";
        }

        /* access modifiers changed from: package-private */
        public void union(Box box) {
            float f = box.minX;
            if (f < this.minX) {
                this.minX = f;
            }
            float f2 = box.minY;
            if (f2 < this.minY) {
                this.minY = f2;
            }
            if (box.maxX() > maxX()) {
                this.width = box.maxX() - this.minX;
            }
            if (box.maxY() > maxY()) {
                this.height = box.maxY() - this.minY;
            }
        }
    }

    static class CSSClipRect {
        Length bottom;
        Length left;
        Length right;
        Length top;

        CSSClipRect(Length length, Length length2, Length length3, Length length4) {
            this.top = length;
            this.right = length2;
            this.bottom = length3;
            this.left = length4;
        }
    }

    static class Circle extends GraphicsElement {

        /* renamed from: cx */
        Length f4653cx;

        /* renamed from: cy */
        Length f4654cy;

        /* renamed from: r */
        Length f4655r;

        Circle() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "circle";
        }
    }

    static class ClipPath extends Group implements NotDirectlyRendered {
        Boolean clipPathUnitsAreUser;

        ClipPath() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "clipPath";
        }
    }

    static class Colour extends SvgPaint {
        static final Colour BLACK = new Colour(-16777216);
        static final Colour TRANSPARENT = new Colour(0);
        int colour;

        Colour(int i) {
            this.colour = i;
        }

        public String toString() {
            return String.format("#%08x", new Object[]{Integer.valueOf(this.colour)});
        }
    }

    static class CurrentColor extends SvgPaint {
        private static CurrentColor instance = new CurrentColor();

        private CurrentColor() {
        }

        static CurrentColor getInstance() {
            return instance;
        }
    }

    static class Defs extends Group implements NotDirectlyRendered {
        Defs() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "defs";
        }
    }

    static class Ellipse extends GraphicsElement {

        /* renamed from: cx */
        Length f4656cx;

        /* renamed from: cy */
        Length f4657cy;

        /* renamed from: rx */
        Length f4658rx;

        /* renamed from: ry */
        Length f4659ry;

        Ellipse() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "ellipse";
        }
    }

    static abstract class GradientElement extends SvgElementBase implements SvgContainer {
        List<SvgObject> children = new ArrayList();
        Matrix gradientTransform;
        Boolean gradientUnitsAreUser;
        String href;
        GradientSpread spreadMethod;

        GradientElement() {
        }

        public void addChild(SvgObject svgObject) {
            if (svgObject instanceof Stop) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Gradient elements cannot contain " + svgObject + " elements.");
        }

        public List<SvgObject> getChildren() {
            return this.children;
        }
    }

    enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    static abstract class GraphicsElement extends SvgConditionalElement implements HasTransform {
        Matrix transform;

        GraphicsElement() {
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    static class Group extends SvgConditionalContainer implements HasTransform {
        Matrix transform;

        Group() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "group";
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface HasTransform {
        void setTransform(Matrix matrix);
    }

    static class Image extends SvgPreserveAspectRatioContainer implements HasTransform {
        Length height;
        String href;
        Matrix transform;
        Length width;

        /* renamed from: x */
        Length f4660x;

        /* renamed from: y */
        Length f4661y;

        Image() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "image";
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    static class Length implements Cloneable {
        Unit unit;
        float value;

        Length(float f) {
            this.value = 0.0f;
            Unit unit2 = Unit.px;
            this.unit = unit2;
            this.value = f;
            this.unit = unit2;
        }

        Length(float f, Unit unit2) {
            this.value = 0.0f;
            this.unit = Unit.px;
            this.value = f;
            this.unit = unit2;
        }

        /* access modifiers changed from: package-private */
        public float floatValue() {
            return this.value;
        }

        /* access modifiers changed from: package-private */
        public float floatValue(float f) {
            int i = C13301.$SwitchMap$com$caverock$androidsvg$SVG$Unit[this.unit.ordinal()];
            if (i == 1) {
                return this.value;
            }
            switch (i) {
                case 4:
                    return this.value * f;
                case 5:
                    return (this.value * f) / 2.54f;
                case 6:
                    return (this.value * f) / 25.4f;
                case 7:
                    return (this.value * f) / 72.0f;
                case 8:
                    return (this.value * f) / 6.0f;
                default:
                    return this.value;
            }
        }

        /* access modifiers changed from: package-private */
        public float floatValue(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box currentViewPortInUserUnits = sVGAndroidRenderer.getCurrentViewPortInUserUnits();
            if (currentViewPortInUserUnits == null) {
                return this.value;
            }
            float f = currentViewPortInUserUnits.width;
            float f2 = currentViewPortInUserUnits.height;
            if (f == f2) {
                return (this.value * f) / 100.0f;
            }
            return (this.value * ((float) (Math.sqrt((double) ((f * f) + (f2 * f2))) / SVG.SQRT2))) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        public float floatValue(SVGAndroidRenderer sVGAndroidRenderer, float f) {
            return this.unit == Unit.percent ? (this.value * f) / 100.0f : floatValueX(sVGAndroidRenderer);
        }

        /* access modifiers changed from: package-private */
        public float floatValueX(SVGAndroidRenderer sVGAndroidRenderer) {
            switch (C13301.$SwitchMap$com$caverock$androidsvg$SVG$Unit[this.unit.ordinal()]) {
                case 1:
                    return this.value;
                case 2:
                    return this.value * sVGAndroidRenderer.getCurrentFontSize();
                case 3:
                    return this.value * sVGAndroidRenderer.getCurrentFontXHeight();
                case 4:
                    return this.value * sVGAndroidRenderer.getDPI();
                case 5:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 2.54f;
                case 6:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 25.4f;
                case 7:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 72.0f;
                case 8:
                    return (this.value * sVGAndroidRenderer.getDPI()) / 6.0f;
                case 9:
                    Box currentViewPortInUserUnits = sVGAndroidRenderer.getCurrentViewPortInUserUnits();
                    return currentViewPortInUserUnits == null ? this.value : (this.value * currentViewPortInUserUnits.width) / 100.0f;
                default:
                    return this.value;
            }
        }

        /* access modifiers changed from: package-private */
        public float floatValueY(SVGAndroidRenderer sVGAndroidRenderer) {
            if (this.unit != Unit.percent) {
                return floatValueX(sVGAndroidRenderer);
            }
            Box currentViewPortInUserUnits = sVGAndroidRenderer.getCurrentViewPortInUserUnits();
            return currentViewPortInUserUnits == null ? this.value : (this.value * currentViewPortInUserUnits.height) / 100.0f;
        }

        /* access modifiers changed from: package-private */
        public boolean isNegative() {
            return this.value < 0.0f;
        }

        /* access modifiers changed from: package-private */
        public boolean isZero() {
            return this.value == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.value) + this.unit;
        }
    }

    static class Line extends GraphicsElement {

        /* renamed from: x1 */
        Length f4662x1;

        /* renamed from: x2 */
        Length f4663x2;

        /* renamed from: y1 */
        Length f4664y1;

        /* renamed from: y2 */
        Length f4665y2;

        Line() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "line";
        }
    }

    static class Marker extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length markerHeight;
        boolean markerUnitsAreUser;
        Length markerWidth;
        Float orient;
        Length refX;
        Length refY;

        Marker() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "marker";
        }
    }

    static class Mask extends SvgConditionalContainer implements NotDirectlyRendered {
        Length height;
        Boolean maskContentUnitsAreUser;
        Boolean maskUnitsAreUser;
        Length width;

        /* renamed from: x */
        Length f4666x;

        /* renamed from: y */
        Length f4667y;

        Mask() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "mask";
        }
    }

    interface NotDirectlyRendered {
    }

    static class PaintReference extends SvgPaint {
        SvgPaint fallback;
        String href;

        PaintReference(String str, SvgPaint svgPaint) {
            this.href = str;
            this.fallback = svgPaint;
        }

        public String toString() {
            return this.href + " " + this.fallback;
        }
    }

    static class Path extends GraphicsElement {

        /* renamed from: d */
        PathDefinition f4668d;
        Float pathLength;

        Path() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return ClientCookie.PATH_ATTR;
        }
    }

    static class PathDefinition implements PathInterface {
        private static final byte ARCTO = 4;
        private static final byte CLOSE = 8;
        private static final byte CUBICTO = 2;
        private static final byte LINETO = 1;
        private static final byte MOVETO = 0;
        private static final byte QUADTO = 3;
        private byte[] commands;
        private int commandsLength;
        private float[] coords;
        private int coordsLength;

        PathDefinition() {
            this.commands = null;
            this.commandsLength = 0;
            this.coords = null;
            this.coordsLength = 0;
            this.commands = new byte[8];
            this.coords = new float[16];
        }

        private void addCommand(byte b) {
            int i = this.commandsLength;
            byte[] bArr = this.commands;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[(bArr.length * 2)];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.commands = bArr2;
            }
            byte[] bArr3 = this.commands;
            int i2 = this.commandsLength;
            this.commandsLength = i2 + 1;
            bArr3[i2] = b;
        }

        private void coordsEnsure(int i) {
            float[] fArr = this.coords;
            if (fArr.length < this.coordsLength + i) {
                float[] fArr2 = new float[(fArr.length * 2)];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.coords = fArr2;
            }
        }

        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            addCommand(((z ? (char) 2 : 0) | true) | z2 ? (byte) 1 : 0);
            coordsEnsure(5);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
            int i3 = this.coordsLength;
            this.coordsLength = i3 + 1;
            fArr[i3] = f3;
            int i4 = this.coordsLength;
            this.coordsLength = i4 + 1;
            fArr[i4] = f4;
            int i5 = this.coordsLength;
            this.coordsLength = i5 + 1;
            fArr[i5] = f5;
        }

        public void close() {
            addCommand(CLOSE);
        }

        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            addCommand(CUBICTO);
            coordsEnsure(6);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
            int i3 = this.coordsLength;
            this.coordsLength = i3 + 1;
            fArr[i3] = f3;
            int i4 = this.coordsLength;
            this.coordsLength = i4 + 1;
            fArr[i4] = f4;
            int i5 = this.coordsLength;
            this.coordsLength = i5 + 1;
            fArr[i5] = f5;
            int i6 = this.coordsLength;
            this.coordsLength = i6 + 1;
            fArr[i6] = f6;
        }

        /* access modifiers changed from: package-private */
        public void enumeratePath(PathInterface pathInterface) {
            int i;
            int i2 = 0;
            for (int i3 = 0; i3 < this.commandsLength; i3++) {
                byte b = this.commands[i3];
                if (b == 0) {
                    float[] fArr = this.coords;
                    int i4 = i2 + 1;
                    i = i4 + 1;
                    pathInterface.moveTo(fArr[i2], fArr[i4]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.coords;
                        int i5 = i2 + 1;
                        float f = fArr2[i2];
                        int i6 = i5 + 1;
                        float f2 = fArr2[i5];
                        int i7 = i6 + 1;
                        float f3 = fArr2[i6];
                        int i8 = i7 + 1;
                        float f4 = fArr2[i7];
                        int i9 = i8 + 1;
                        float f5 = fArr2[i8];
                        i2 = i9 + 1;
                        pathInterface.cubicTo(f, f2, f3, f4, f5, fArr2[i9]);
                    } else if (b == 3) {
                        float[] fArr3 = this.coords;
                        int i10 = i2 + 1;
                        int i11 = i10 + 1;
                        int i12 = i11 + 1;
                        pathInterface.quadTo(fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                        i2 = i12 + 1;
                    } else if (b != 8) {
                        boolean z = (b & CUBICTO) != 0;
                        boolean z2 = (b & LINETO) != 0;
                        float[] fArr4 = this.coords;
                        int i13 = i2 + 1;
                        float f6 = fArr4[i2];
                        int i14 = i13 + 1;
                        float f7 = fArr4[i13];
                        int i15 = i14 + 1;
                        float f8 = fArr4[i14];
                        int i16 = i15 + 1;
                        pathInterface.arcTo(f6, f7, f8, z, z2, fArr4[i15], fArr4[i16]);
                        i2 = i16 + 1;
                    } else {
                        pathInterface.close();
                    }
                } else {
                    float[] fArr5 = this.coords;
                    int i17 = i2 + 1;
                    i = i17 + 1;
                    pathInterface.lineTo(fArr5[i2], fArr5[i17]);
                }
                i2 = i;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.commandsLength == 0;
        }

        public void lineTo(float f, float f2) {
            addCommand(LINETO);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
        }

        public void moveTo(float f, float f2) {
            addCommand(MOVETO);
            coordsEnsure(2);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
        }

        public void quadTo(float f, float f2, float f3, float f4) {
            addCommand(QUADTO);
            coordsEnsure(4);
            float[] fArr = this.coords;
            int i = this.coordsLength;
            this.coordsLength = i + 1;
            fArr[i] = f;
            int i2 = this.coordsLength;
            this.coordsLength = i2 + 1;
            fArr[i2] = f2;
            int i3 = this.coordsLength;
            this.coordsLength = i3 + 1;
            fArr[i3] = f3;
            int i4 = this.coordsLength;
            this.coordsLength = i4 + 1;
            fArr[i4] = f4;
        }
    }

    interface PathInterface {
        void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void cubicTo(float f, float f2, float f3, float f4, float f5, float f6);

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);

        void quadTo(float f, float f2, float f3, float f4);
    }

    static class Pattern extends SvgViewBoxContainer implements NotDirectlyRendered {
        Length height;
        String href;
        Boolean patternContentUnitsAreUser;
        Matrix patternTransform;
        Boolean patternUnitsAreUser;
        Length width;

        /* renamed from: x */
        Length f4669x;

        /* renamed from: y */
        Length f4670y;

        Pattern() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "pattern";
        }
    }

    static class PolyLine extends GraphicsElement {
        float[] points;

        PolyLine() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "polyline";
        }
    }

    static class Polygon extends PolyLine {
        Polygon() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "polygon";
        }
    }

    static class Rect extends GraphicsElement {
        Length height;

        /* renamed from: rx */
        Length f4671rx;

        /* renamed from: ry */
        Length f4672ry;
        Length width;

        /* renamed from: x */
        Length f4673x;

        /* renamed from: y */
        Length f4674y;

        Rect() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "rect";
        }
    }

    static class SolidColor extends SvgElementBase implements SvgContainer {
        SolidColor() {
        }

        public void addChild(SvgObject svgObject) {
        }

        public List<SvgObject> getChildren() {
            return Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "solidColor";
        }
    }

    static class Stop extends SvgElementBase implements SvgContainer {
        Float offset;

        Stop() {
        }

        public void addChild(SvgObject svgObject) {
        }

        public List<SvgObject> getChildren() {
            return Collections.emptyList();
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "stop";
        }
    }

    static class Style implements Cloneable {
        static final int FONT_WEIGHT_BOLD = 700;
        static final int FONT_WEIGHT_BOLDER = 1;
        static final int FONT_WEIGHT_LIGHTER = -1;
        static final int FONT_WEIGHT_NORMAL = 400;
        CSSClipRect clip;
        String clipPath;
        FillRule clipRule;
        Colour color;
        TextDirection direction;
        Boolean display;
        SvgPaint fill;
        Float fillOpacity;
        FillRule fillRule;
        List<String> fontFamily;
        Length fontSize;
        FontStyle fontStyle;
        Integer fontWeight;
        RenderQuality imageRendering;
        String markerEnd;
        String markerMid;
        String markerStart;
        String mask;
        Float opacity;
        Boolean overflow;
        SvgPaint solidColor;
        Float solidOpacity;
        long specifiedFlags = 0;
        SvgPaint stopColor;
        Float stopOpacity;
        SvgPaint stroke;
        Length[] strokeDashArray;
        Length strokeDashOffset;
        LineCap strokeLineCap;
        LineJoin strokeLineJoin;
        Float strokeMiterLimit;
        Float strokeOpacity;
        Length strokeWidth;
        TextAnchor textAnchor;
        TextDecoration textDecoration;
        VectorEffect vectorEffect;
        SvgPaint viewportFill;
        Float viewportFillOpacity;
        Boolean visibility;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        Style() {
        }

        static Style getDefaultStyle() {
            Style style = new Style();
            style.specifiedFlags = SVG.SPECIFIED_ALL;
            style.fill = Colour.BLACK;
            style.fillRule = FillRule.NonZero;
            Float valueOf = Float.valueOf(1.0f);
            style.fillOpacity = valueOf;
            style.stroke = null;
            style.strokeOpacity = valueOf;
            style.strokeWidth = new Length(1.0f);
            style.strokeLineCap = LineCap.Butt;
            style.strokeLineJoin = LineJoin.Miter;
            style.strokeMiterLimit = Float.valueOf(4.0f);
            style.strokeDashArray = null;
            style.strokeDashOffset = new Length(0.0f);
            style.opacity = valueOf;
            style.color = Colour.BLACK;
            style.fontFamily = null;
            style.fontSize = new Length(12.0f, Unit.pt);
            style.fontWeight = 400;
            style.fontStyle = FontStyle.Normal;
            style.textDecoration = TextDecoration.None;
            style.direction = TextDirection.LTR;
            style.textAnchor = TextAnchor.Start;
            style.overflow = true;
            style.clip = null;
            style.markerStart = null;
            style.markerMid = null;
            style.markerEnd = null;
            Boolean bool = Boolean.TRUE;
            style.display = bool;
            style.visibility = bool;
            style.stopColor = Colour.BLACK;
            style.stopOpacity = valueOf;
            style.clipPath = null;
            style.clipRule = FillRule.NonZero;
            style.mask = null;
            style.solidColor = null;
            style.solidOpacity = valueOf;
            style.viewportFill = null;
            style.viewportFillOpacity = valueOf;
            style.vectorEffect = VectorEffect.None;
            style.imageRendering = RenderQuality.auto;
            return style;
        }

        /* access modifiers changed from: protected */
        public Object clone() {
            Style style = (Style) super.clone();
            Length[] lengthArr = this.strokeDashArray;
            if (lengthArr != null) {
                style.strokeDashArray = (Length[]) lengthArr.clone();
            }
            return style;
        }

        /* access modifiers changed from: package-private */
        public void resetNonInheritingProperties(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.display = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.overflow = bool;
            this.clip = null;
            this.clipPath = null;
            this.opacity = Float.valueOf(1.0f);
            this.stopColor = Colour.BLACK;
            this.stopOpacity = Float.valueOf(1.0f);
            this.mask = null;
            this.solidColor = null;
            this.solidOpacity = Float.valueOf(1.0f);
            this.viewportFill = null;
            this.viewportFillOpacity = Float.valueOf(1.0f);
            this.vectorEffect = VectorEffect.None;
        }
    }

    static class Svg extends SvgViewBoxContainer {
        Length height;
        public String version;
        Length width;

        /* renamed from: x */
        Length f4675x;

        /* renamed from: y */
        Length f4676y;

        Svg() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "svg";
        }
    }

    interface SvgConditional {
        String getRequiredExtensions();

        Set<String> getRequiredFeatures();

        Set<String> getRequiredFonts();

        Set<String> getRequiredFormats();

        Set<String> getSystemLanguage();

        void setRequiredExtensions(String str);

        void setRequiredFeatures(Set<String> set);

        void setRequiredFonts(Set<String> set);

        void setRequiredFormats(Set<String> set);

        void setSystemLanguage(Set<String> set);
    }

    static abstract class SvgConditionalContainer extends SvgElement implements SvgConditional, SvgContainer {
        List<SvgObject> children = new ArrayList();
        String requiredExtensions = null;
        Set<String> requiredFeatures = null;
        Set<String> requiredFonts = null;
        Set<String> requiredFormats = null;
        Set<String> systemLanguage = null;

        SvgConditionalContainer() {
        }

        public void addChild(SvgObject svgObject) {
            this.children.add(svgObject);
        }

        public List<SvgObject> getChildren() {
            return this.children;
        }

        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        public Set<String> getSystemLanguage() {
            return null;
        }

        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    static abstract class SvgConditionalElement extends SvgElement implements SvgConditional {
        String requiredExtensions = null;
        Set<String> requiredFeatures = null;
        Set<String> requiredFonts = null;
        Set<String> requiredFormats = null;
        Set<String> systemLanguage = null;

        SvgConditionalElement() {
        }

        public String getRequiredExtensions() {
            return this.requiredExtensions;
        }

        public Set<String> getRequiredFeatures() {
            return this.requiredFeatures;
        }

        public Set<String> getRequiredFonts() {
            return this.requiredFonts;
        }

        public Set<String> getRequiredFormats() {
            return this.requiredFormats;
        }

        public Set<String> getSystemLanguage() {
            return this.systemLanguage;
        }

        public void setRequiredExtensions(String str) {
            this.requiredExtensions = str;
        }

        public void setRequiredFeatures(Set<String> set) {
            this.requiredFeatures = set;
        }

        public void setRequiredFonts(Set<String> set) {
            this.requiredFonts = set;
        }

        public void setRequiredFormats(Set<String> set) {
            this.requiredFormats = set;
        }

        public void setSystemLanguage(Set<String> set) {
            this.systemLanguage = set;
        }
    }

    interface SvgContainer {
        void addChild(SvgObject svgObject);

        List<SvgObject> getChildren();
    }

    static abstract class SvgElement extends SvgElementBase {
        Box boundingBox = null;

        SvgElement() {
        }
    }

    static abstract class SvgElementBase extends SvgObject {
        Style baseStyle = null;
        List<String> classNames = null;

        /* renamed from: id */
        String f4677id = null;
        Boolean spacePreserve = null;
        Style style = null;

        SvgElementBase() {
        }

        /* access modifiers changed from: package-private */
        public abstract String getNodeName();
    }

    static class SvgLinearGradient extends GradientElement {

        /* renamed from: x1 */
        Length f4678x1;

        /* renamed from: x2 */
        Length f4679x2;

        /* renamed from: y1 */
        Length f4680y1;

        /* renamed from: y2 */
        Length f4681y2;

        SvgLinearGradient() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "linearGradient";
        }
    }

    static class SvgObject {
        SVG document;
        SvgContainer parent;

        SvgObject() {
        }

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    static abstract class SvgPaint implements Cloneable {
        SvgPaint() {
        }
    }

    static abstract class SvgPreserveAspectRatioContainer extends SvgConditionalContainer {
        PreserveAspectRatio preserveAspectRatio = null;

        SvgPreserveAspectRatioContainer() {
        }
    }

    static class SvgRadialGradient extends GradientElement {

        /* renamed from: cx */
        Length f4682cx;

        /* renamed from: cy */
        Length f4683cy;

        /* renamed from: fx */
        Length f4684fx;

        /* renamed from: fy */
        Length f4685fy;

        /* renamed from: r */
        Length f4686r;

        SvgRadialGradient() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "radialGradient";
        }
    }

    static abstract class SvgViewBoxContainer extends SvgPreserveAspectRatioContainer {
        Box viewBox;

        SvgViewBoxContainer() {
        }
    }

    static class Switch extends Group {
        Switch() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "switch";
        }
    }

    static class Symbol extends SvgViewBoxContainer implements NotDirectlyRendered {
        Symbol() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "symbol";
        }
    }

    static class TRef extends TextContainer implements TextChild {
        String href;
        private TextRoot textRoot;

        TRef() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "tref";
        }

        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public void setTextRoot(TextRoot textRoot2) {
            this.textRoot = textRoot2;
        }
    }

    static class TSpan extends TextPositionedContainer implements TextChild {
        private TextRoot textRoot;

        TSpan() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "tspan";
        }

        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public void setTextRoot(TextRoot textRoot2) {
            this.textRoot = textRoot2;
        }
    }

    static class Text extends TextPositionedContainer implements HasTransform, TextRoot {
        Matrix transform;

        Text() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "text";
        }

        public void setTransform(Matrix matrix) {
            this.transform = matrix;
        }
    }

    interface TextChild {
        TextRoot getTextRoot();

        void setTextRoot(TextRoot textRoot);
    }

    static abstract class TextContainer extends SvgConditionalContainer {
        TextContainer() {
        }

        public void addChild(SvgObject svgObject) {
            if (svgObject instanceof TextChild) {
                this.children.add(svgObject);
                return;
            }
            throw new SVGParseException("Text content elements cannot contain " + svgObject + " elements.");
        }
    }

    static class TextPath extends TextContainer implements TextChild {
        String href;
        Length startOffset;
        private TextRoot textRoot;

        TextPath() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "textPath";
        }

        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public void setTextRoot(TextRoot textRoot2) {
            this.textRoot = textRoot2;
        }
    }

    static abstract class TextPositionedContainer extends TextContainer {

        /* renamed from: dx */
        List<Length> f4687dx;

        /* renamed from: dy */
        List<Length> f4688dy;

        /* renamed from: x */
        List<Length> f4689x;

        /* renamed from: y */
        List<Length> f4690y;

        TextPositionedContainer() {
        }
    }

    interface TextRoot {
    }

    static class TextSequence extends SvgObject implements TextChild {
        String text;
        private TextRoot textRoot;

        TextSequence(String str) {
            this.text = str;
        }

        public TextRoot getTextRoot() {
            return this.textRoot;
        }

        public void setTextRoot(TextRoot textRoot2) {
            this.textRoot = textRoot2;
        }

        public String toString() {
            return TextSequence.class.getSimpleName() + " '" + this.text + "'";
        }
    }

    enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    static class Use extends Group {
        Length height;
        String href;
        Length width;

        /* renamed from: x */
        Length f4699x;

        /* renamed from: y */
        Length f4700y;

        Use() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "use";
        }
    }

    static class View extends SvgViewBoxContainer implements NotDirectlyRendered {
        View() {
        }

        /* access modifiers changed from: package-private */
        public String getNodeName() {
            return "view";
        }
    }

    SVG() {
    }

    private String cssQuotedString(String str) {
        String substring;
        String str2;
        String str3 = "\"";
        if (!str.startsWith(str3) || !str.endsWith(str3)) {
            str3 = "'";
            if (str.startsWith(str3) && str.endsWith(str3)) {
                substring = str.substring(1, str.length() - 1);
                str2 = "\\'";
            }
            return str.replace("\\\n", "").replace("\\A", "\n");
        }
        substring = str.substring(1, str.length() - 1);
        str2 = "\\\"";
        str = substring.replace(str2, str3);
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    public static void deregisterExternalFileResolver() {
        externalFileResolver = null;
    }

    private Box getDocumentDimensions(float f) {
        Unit unit;
        float f2;
        Unit unit2;
        Svg svg = this.rootElement;
        Length length = svg.width;
        Length length2 = svg.height;
        if (length == null || length.isZero() || (unit = length.unit) == Unit.percent || unit == Unit.em || unit == Unit.ex) {
            return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float floatValue = length.floatValue(f);
        if (length2 == null) {
            Box box = this.rootElement.viewBox;
            f2 = box != null ? (box.height * floatValue) / box.width : floatValue;
        } else if (length2.isZero() || (unit2 = length2.unit) == Unit.percent || unit2 == Unit.em || unit2 == Unit.ex) {
            return new Box(-1.0f, -1.0f, -1.0f, -1.0f);
        } else {
            f2 = length2.floatValue(f);
        }
        return new Box(0.0f, 0.0f, floatValue, f2);
    }

    private SvgElementBase getElementById(SvgContainer svgContainer, String str) {
        SvgElementBase elementById;
        SvgElementBase svgElementBase = (SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.f4677id)) {
            return svgElementBase;
        }
        for (SvgObject next : svgContainer.getChildren()) {
            if (next instanceof SvgElementBase) {
                SvgElementBase svgElementBase2 = (SvgElementBase) next;
                if (str.equals(svgElementBase2.f4677id)) {
                    return svgElementBase2;
                }
                if ((next instanceof SvgContainer) && (elementById = getElementById((SvgContainer) next, str)) != null) {
                    return elementById;
                }
            }
        }
        return null;
    }

    private List<SvgObject> getElementsByTagName(SvgContainer svgContainer, Class cls) {
        ArrayList arrayList = new ArrayList();
        if (svgContainer.getClass() == cls) {
            arrayList.add((SvgObject) svgContainer);
        }
        for (SvgObject next : svgContainer.getChildren()) {
            if (next.getClass() == cls) {
                arrayList.add(next);
            }
            if (next instanceof SvgContainer) {
                getElementsByTagName((SvgContainer) next, cls);
            }
        }
        return arrayList;
    }

    private List<SvgObject> getElementsByTagName(Class cls) {
        return getElementsByTagName(this.rootElement, cls);
    }

    static SVGExternalFileResolver getFileResolver() {
        return externalFileResolver;
    }

    public static SVG getFromAsset(AssetManager assetManager, String str) {
        SVGParser sVGParser = new SVGParser();
        InputStream open = assetManager.open(str);
        try {
            return sVGParser.parse(open, enableInternalEntities);
        } finally {
            try {
                open.close();
            } catch (IOException unused) {
            }
        }
    }

    public static SVG getFromInputStream(InputStream inputStream) {
        return new SVGParser().parse(inputStream, enableInternalEntities);
    }

    public static SVG getFromResource(Context context, int i) {
        return getFromResource(context.getResources(), i);
    }

    public static SVG getFromResource(Resources resources, int i) {
        SVGParser sVGParser = new SVGParser();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return sVGParser.parse(openRawResource, enableInternalEntities);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static SVG getFromString(String str) {
        return new SVGParser().parse(new ByteArrayInputStream(str.getBytes()), enableInternalEntities);
    }

    public static String getVersion() {
        return VERSION;
    }

    public static boolean isInternalEntitiesEnabled() {
        return enableInternalEntities;
    }

    public static void registerExternalFileResolver(SVGExternalFileResolver sVGExternalFileResolver) {
        externalFileResolver = sVGExternalFileResolver;
    }

    public static void setInternalEntitiesEnabled(boolean z) {
        enableInternalEntities = z;
    }

    /* access modifiers changed from: package-private */
    public void addCSSRules(CSSParser.Ruleset ruleset) {
        this.cssRules.addAll(ruleset);
    }

    /* access modifiers changed from: package-private */
    public void clearRenderCSSRules() {
        this.cssRules.removeFromSource(CSSParser.Source.RenderOptions);
    }

    /* access modifiers changed from: package-private */
    public List<CSSParser.Rule> getCSSRules() {
        return this.cssRules.getRules();
    }

    public float getDocumentAspectRatio() {
        Unit unit;
        Svg svg = this.rootElement;
        if (svg != null) {
            Length length = svg.width;
            Length length2 = svg.height;
            if (length == null || length2 == null || length.unit == (unit = Unit.percent) || length2.unit == unit) {
                Box box = this.rootElement.viewBox;
                if (box != null) {
                    float f = box.width;
                    if (f != 0.0f) {
                        float f2 = box.height;
                        if (f2 != 0.0f) {
                            return f / f2;
                        }
                    }
                }
                return -1.0f;
            } else if (length.isZero() || length2.isZero()) {
                return -1.0f;
            } else {
                return length.floatValue(this.renderDPI) / length2.floatValue(this.renderDPI);
            }
        } else {
            throw new IllegalArgumentException("SVG document is empty");
        }
    }

    public String getDocumentDescription() {
        if (this.rootElement != null) {
            return this.desc;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float getDocumentHeight() {
        if (this.rootElement != null) {
            return getDocumentDimensions(this.renderDPI).height;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public PreserveAspectRatio getDocumentPreserveAspectRatio() {
        Svg svg = this.rootElement;
        if (svg != null) {
            PreserveAspectRatio preserveAspectRatio = svg.preserveAspectRatio;
            if (preserveAspectRatio == null) {
                return null;
            }
            return preserveAspectRatio;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public String getDocumentSVGVersion() {
        Svg svg = this.rootElement;
        if (svg != null) {
            return svg.version;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public String getDocumentTitle() {
        if (this.rootElement != null) {
            return this.title;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF getDocumentViewBox() {
        Svg svg = this.rootElement;
        if (svg != null) {
            Box box = svg.viewBox;
            if (box == null) {
                return null;
            }
            return box.toRectF();
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float getDocumentWidth() {
        if (this.rootElement != null) {
            return getDocumentDimensions(this.renderDPI).width;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* access modifiers changed from: package-private */
    public SvgElementBase getElementById(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.rootElement.f4677id)) {
            return this.rootElement;
        }
        if (this.idToElementMap.containsKey(str)) {
            return this.idToElementMap.get(str);
        }
        SvgElementBase elementById = getElementById(this.rootElement, str);
        this.idToElementMap.put(str, elementById);
        return elementById;
    }

    public float getRenderDPI() {
        return this.renderDPI;
    }

    /* access modifiers changed from: package-private */
    public Svg getRootElement() {
        return this.rootElement;
    }

    public Set<String> getViewList() {
        if (this.rootElement != null) {
            List<SvgObject> elementsByTagName = getElementsByTagName(View.class);
            HashSet hashSet = new HashSet(elementsByTagName.size());
            Iterator<SvgObject> it = elementsByTagName.iterator();
            while (it.hasNext()) {
                String str = ((View) it.next()).f4677id;
                if (str != null) {
                    hashSet.add(str);
                } else {
                    Log.w(TAG, "getViewList(): found a <view> without an id attribute");
                }
            }
            return hashSet;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    /* access modifiers changed from: package-private */
    public boolean hasCSSRules() {
        return !this.cssRules.isEmpty();
    }

    public void renderToCanvas(Canvas canvas) {
        renderToCanvas(canvas, (RenderOptions) null);
    }

    public void renderToCanvas(Canvas canvas, RectF rectF) {
        RenderOptions renderOptions = new RenderOptions();
        if (rectF != null) {
            renderOptions.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        } else {
            renderOptions.viewPort(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI).renderDocument(this, renderOptions);
    }

    public void renderToCanvas(Canvas canvas, RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        }
        new SVGAndroidRenderer(canvas, this.renderDPI).renderDocument(this, renderOptions);
    }

    public Picture renderToPicture() {
        return renderToPicture((RenderOptions) null);
    }

    public Picture renderToPicture(int i, int i2) {
        return renderToPicture(i, i2, (RenderOptions) null);
    }

    public Picture renderToPicture(int i, int i2, RenderOptions renderOptions) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (renderOptions == null || renderOptions.viewPort == null) {
            renderOptions = renderOptions == null ? new RenderOptions() : new RenderOptions(renderOptions);
            renderOptions.viewPort(0.0f, 0.0f, (float) i, (float) i2);
        }
        new SVGAndroidRenderer(beginRecording, this.renderDPI).renderDocument(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    public Picture renderToPicture(RenderOptions renderOptions) {
        Unit unit;
        Length length;
        Box box = (renderOptions == null || !renderOptions.hasViewBox()) ? this.rootElement.viewBox : renderOptions.viewBox;
        if (renderOptions == null || !renderOptions.hasViewPort()) {
            Svg svg = this.rootElement;
            Length length2 = svg.width;
            if (length2 == null || length2.unit == (unit = Unit.percent) || (length = svg.height) == null || length.unit == unit) {
                Length length3 = this.rootElement.width;
                if (length3 == null || box == null) {
                    Length length4 = this.rootElement.height;
                    if (length4 == null || box == null) {
                        return renderToPicture(512, 512, renderOptions);
                    }
                    float floatValue = length4.floatValue(this.renderDPI);
                    return renderToPicture((int) Math.ceil((double) ((box.width * floatValue) / box.height)), (int) Math.ceil((double) floatValue), renderOptions);
                }
                float floatValue2 = length3.floatValue(this.renderDPI);
                return renderToPicture((int) Math.ceil((double) floatValue2), (int) Math.ceil((double) ((box.height * floatValue2) / box.width)), renderOptions);
            }
            return renderToPicture((int) Math.ceil((double) length2.floatValue(this.renderDPI)), (int) Math.ceil((double) this.rootElement.height.floatValue(this.renderDPI)), renderOptions);
        }
        return renderToPicture((int) Math.ceil((double) renderOptions.viewPort.maxX()), (int) Math.ceil((double) renderOptions.viewPort.maxY()), renderOptions);
    }

    public void renderViewToCanvas(String str, Canvas canvas) {
        renderToCanvas(canvas, RenderOptions.create().view(str));
    }

    public void renderViewToCanvas(String str, Canvas canvas, RectF rectF) {
        RenderOptions view = RenderOptions.create().view(str);
        if (rectF != null) {
            view.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        renderToCanvas(canvas, view);
    }

    public Picture renderViewToPicture(String str, int i, int i2) {
        RenderOptions renderOptions = new RenderOptions();
        renderOptions.view(str).viewPort(0.0f, 0.0f, (float) i, (float) i2);
        Picture picture = new Picture();
        new SVGAndroidRenderer(picture.beginRecording(i, i2), this.renderDPI).renderDocument(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    /* access modifiers changed from: package-private */
    public SvgObject resolveIRI(String str) {
        if (str == null) {
            return null;
        }
        String cssQuotedString = cssQuotedString(str);
        if (cssQuotedString.length() <= 1 || !cssQuotedString.startsWith("#")) {
            return null;
        }
        return getElementById(cssQuotedString.substring(1));
    }

    /* access modifiers changed from: package-private */
    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDocumentHeight(float f) {
        Svg svg = this.rootElement;
        if (svg != null) {
            svg.height = new Length(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentHeight(String str) {
        Svg svg = this.rootElement;
        if (svg != null) {
            svg.height = SVGParser.parseLength(str);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentPreserveAspectRatio(PreserveAspectRatio preserveAspectRatio) {
        Svg svg = this.rootElement;
        if (svg != null) {
            svg.preserveAspectRatio = preserveAspectRatio;
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentViewBox(float f, float f2, float f3, float f4) {
        Svg svg = this.rootElement;
        if (svg != null) {
            svg.viewBox = new Box(f, f2, f3, f4);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentWidth(float f) {
        Svg svg = this.rootElement;
        if (svg != null) {
            svg.width = new Length(f);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setDocumentWidth(String str) {
        Svg svg = this.rootElement;
        if (svg != null) {
            svg.width = SVGParser.parseLength(str);
            return;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public void setRenderDPI(float f) {
        this.renderDPI = f;
    }

    /* access modifiers changed from: package-private */
    public void setRootElement(Svg svg) {
        this.rootElement = svg;
    }

    /* access modifiers changed from: package-private */
    public void setTitle(String str) {
        this.title = str;
    }
}
