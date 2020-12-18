package com.caverock.androidsvg;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

class SVGAndroidRenderer {
    private static final float BEZIER_ARC_FACTOR = 0.5522848f;
    private static final String DEFAULT_FONT_FAMILY = "serif";
    public static final float LUMINANCE_TO_ALPHA_BLUE = 0.0722f;
    public static final float LUMINANCE_TO_ALPHA_GREEN = 0.7151f;
    public static final float LUMINANCE_TO_ALPHA_RED = 0.2127f;
    private static final String TAG = "SVGAndroidRenderer";
    private static HashSet<String> supportedFeatures;
    /* access modifiers changed from: private */
    public Canvas canvas;
    private SVG document;
    private float dpi;
    private Stack<Matrix> matrixStack;
    private Stack<SVG.SvgContainer> parentStack;
    private CSSParser.RuleMatchContext ruleMatchContext = null;
    /* access modifiers changed from: private */
    public RendererState state;
    private Stack<RendererState> stateStack;

    /* renamed from: com.caverock.androidsvg.SVGAndroidRenderer$1 */
    static /* synthetic */ class C13311 {
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment = new int[PreserveAspectRatio.Alignment.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap = new int[SVG.Style.LineCap.values().length];
        static final /* synthetic */ int[] $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin = new int[SVG.Style.LineJoin.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a4 */
        static {
            /*
                com.caverock.androidsvg.SVG$Style$LineJoin[] r0 = com.caverock.androidsvg.SVG.Style.LineJoin.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.caverock.androidsvg.SVG$Style$LineJoin r2 = com.caverock.androidsvg.SVG.Style.LineJoin.Miter     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin     // Catch:{ NoSuchFieldError -> 0x001f }
                com.caverock.androidsvg.SVG$Style$LineJoin r3 = com.caverock.androidsvg.SVG.Style.LineJoin.Round     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin     // Catch:{ NoSuchFieldError -> 0x002a }
                com.caverock.androidsvg.SVG$Style$LineJoin r4 = com.caverock.androidsvg.SVG.Style.LineJoin.Bevel     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.caverock.androidsvg.SVG$Style$LineCap[] r3 = com.caverock.androidsvg.SVG.Style.LineCap.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap = r3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap     // Catch:{ NoSuchFieldError -> 0x003d }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Butt     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Round     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r3 = $SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.caverock.androidsvg.SVG$Style$LineCap r4 = com.caverock.androidsvg.SVG.Style.LineCap.Square     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                com.caverock.androidsvg.PreserveAspectRatio$Alignment[] r3 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment = r3
                int[] r3 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r4 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMin     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x006e }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r3 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMax     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMin     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x008e }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMid     // Catch:{ NoSuchFieldError -> 0x008e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMax     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x00a4 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMid     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r0 = $SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment     // Catch:{ NoSuchFieldError -> 0x00b0 }
                com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMax     // Catch:{ NoSuchFieldError -> 0x00b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b0 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b0 }
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.C13311.<clinit>():void");
        }
    }

    private class MarkerPositionCalculator implements SVG.PathInterface {
        private boolean closepathReAdjustPending;
        private MarkerVector lastPos = null;
        private List<MarkerVector> markers = new ArrayList();
        private boolean normalCubic = true;
        private boolean startArc = false;
        private float startX;
        private float startY;
        private int subpathStartIndex = -1;

        MarkerPositionCalculator(SVG.PathDefinition pathDefinition) {
            if (pathDefinition != null) {
                pathDefinition.enumeratePath(this);
                if (this.closepathReAdjustPending) {
                    this.lastPos.add(this.markers.get(this.subpathStartIndex));
                    this.markers.set(this.subpathStartIndex, this.lastPos);
                    this.closepathReAdjustPending = false;
                }
                MarkerVector markerVector = this.lastPos;
                if (markerVector != null) {
                    this.markers.add(markerVector);
                }
            }
        }

        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.startArc = true;
            this.normalCubic = false;
            MarkerVector markerVector = this.lastPos;
            SVGAndroidRenderer.arcTo(markerVector.f4703x, markerVector.f4704y, f, f2, f3, z, z2, f4, f5, this);
            this.normalCubic = true;
            this.closepathReAdjustPending = false;
        }

        public void close() {
            this.markers.add(this.lastPos);
            lineTo(this.startX, this.startY);
            this.closepathReAdjustPending = true;
        }

        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.normalCubic || this.startArc) {
                this.lastPos.add(f, f2);
                this.markers.add(this.lastPos);
                this.startArc = false;
            }
            this.lastPos = new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.closepathReAdjustPending = false;
        }

        /* access modifiers changed from: package-private */
        public List<MarkerVector> getMarkers() {
            return this.markers;
        }

        public void lineTo(float f, float f2) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            SVGAndroidRenderer sVGAndroidRenderer = SVGAndroidRenderer.this;
            MarkerVector markerVector = this.lastPos;
            this.lastPos = new MarkerVector(f, f2, f - markerVector.f4703x, f2 - markerVector.f4704y);
            this.closepathReAdjustPending = false;
        }

        public void moveTo(float f, float f2) {
            if (this.closepathReAdjustPending) {
                this.lastPos.add(this.markers.get(this.subpathStartIndex));
                this.markers.set(this.subpathStartIndex, this.lastPos);
                this.closepathReAdjustPending = false;
            }
            MarkerVector markerVector = this.lastPos;
            if (markerVector != null) {
                this.markers.add(markerVector);
            }
            this.startX = f;
            this.startY = f2;
            this.lastPos = new MarkerVector(f, f2, 0.0f, 0.0f);
            this.subpathStartIndex = this.markers.size();
        }

        public void quadTo(float f, float f2, float f3, float f4) {
            this.lastPos.add(f, f2);
            this.markers.add(this.lastPos);
            this.lastPos = new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.closepathReAdjustPending = false;
        }
    }

    private class MarkerVector {

        /* renamed from: dx */
        float f4701dx = 0.0f;

        /* renamed from: dy */
        float f4702dy = 0.0f;
        boolean isAmbiguous = false;

        /* renamed from: x */
        float f4703x;

        /* renamed from: y */
        float f4704y;

        MarkerVector(float f, float f2, float f3, float f4) {
            this.f4703x = f;
            this.f4704y = f2;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                this.f4701dx = (float) (((double) f3) / sqrt);
                this.f4702dy = (float) (((double) f4) / sqrt);
            }
        }

        /* access modifiers changed from: package-private */
        public void add(float f, float f2) {
            float f3 = f - this.f4703x;
            float f4 = f2 - this.f4704y;
            double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
            if (sqrt != 0.0d) {
                f3 = (float) (((double) f3) / sqrt);
                f4 = (float) (((double) f4) / sqrt);
            }
            if (f3 == (-this.f4701dx) && f4 == (-this.f4702dy)) {
                this.isAmbiguous = true;
                this.f4701dx = -f4;
            } else {
                this.f4701dx += f3;
                f3 = this.f4702dy + f4;
            }
            this.f4702dy = f3;
        }

        /* access modifiers changed from: package-private */
        public void add(MarkerVector markerVector) {
            if (markerVector.f4701dx == (-this.f4701dx)) {
                float f = markerVector.f4702dy;
                if (f == (-this.f4702dy)) {
                    this.isAmbiguous = true;
                    this.f4701dx = -f;
                    this.f4702dy = markerVector.f4701dx;
                    return;
                }
            }
            this.f4701dx += markerVector.f4701dx;
            this.f4702dy += markerVector.f4702dy;
        }

        public String toString() {
            return "(" + this.f4703x + "," + this.f4704y + " " + this.f4701dx + "," + this.f4702dy + ")";
        }
    }

    private class PathConverter implements SVG.PathInterface {
        float lastX;
        float lastY;
        Path path = new Path();

        PathConverter(SVG.PathDefinition pathDefinition) {
            if (pathDefinition != null) {
                pathDefinition.enumeratePath(this);
            }
        }

        public void arcTo(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            SVGAndroidRenderer.arcTo(this.lastX, this.lastY, f, f2, f3, z, z2, f4, f5, this);
            this.lastX = f4;
            this.lastY = f5;
        }

        public void close() {
            this.path.close();
        }

        public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
            this.path.cubicTo(f, f2, f3, f4, f5, f6);
            this.lastX = f5;
            this.lastY = f6;
        }

        /* access modifiers changed from: package-private */
        public Path getPath() {
            return this.path;
        }

        public void lineTo(float f, float f2) {
            this.path.lineTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        public void moveTo(float f, float f2) {
            this.path.moveTo(f, f2);
            this.lastX = f;
            this.lastY = f2;
        }

        public void quadTo(float f, float f2, float f3, float f4) {
            this.path.quadTo(f, f2, f3, f4);
            this.lastX = f3;
            this.lastY = f4;
        }
    }

    private class PathTextDrawer extends PlainTextDrawer {
        private Path path;

        PathTextDrawer(Path path2, float f, float f2) {
            super(f, f2);
            this.path = path2;
        }

        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.f4705x, this.f4706y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawTextOnPath(str, this.path, this.f4705x, this.f4706y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.f4705x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private class PlainTextDrawer extends TextProcessor {

        /* renamed from: x */
        float f4705x;

        /* renamed from: y */
        float f4706y;

        PlainTextDrawer(float f, float f2) {
            super(SVGAndroidRenderer.this, (C13311) null);
            this.f4705x = f;
            this.f4706y = f2;
        }

        public void processText(String str) {
            SVGAndroidRenderer.debug("TextSequence render", new Object[0]);
            if (SVGAndroidRenderer.this.visible()) {
                if (SVGAndroidRenderer.this.state.hasFill) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.f4705x, this.f4706y, SVGAndroidRenderer.this.state.fillPaint);
                }
                if (SVGAndroidRenderer.this.state.hasStroke) {
                    SVGAndroidRenderer.this.canvas.drawText(str, this.f4705x, this.f4706y, SVGAndroidRenderer.this.state.strokePaint);
                }
            }
            this.f4705x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private class PlainTextToPath extends TextProcessor {
        Path textAsPath;

        /* renamed from: x */
        float f4707x;

        /* renamed from: y */
        float f4708y;

        PlainTextToPath(float f, float f2, Path path) {
            super(SVGAndroidRenderer.this, (C13311) null);
            this.f4707x = f;
            this.f4708y = f2;
            this.textAsPath = path;
        }

        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVGAndroidRenderer.warn("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Path path = new Path();
                SVGAndroidRenderer.this.state.fillPaint.getTextPath(str, 0, str.length(), this.f4707x, this.f4708y, path);
                this.textAsPath.addPath(path);
            }
            this.f4707x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private class RendererState {
        Paint fillPaint;
        boolean hasFill;
        boolean hasStroke;
        boolean spacePreserve;
        Paint strokePaint;
        SVG.Style style;
        SVG.Box viewBox;
        SVG.Box viewPort;

        RendererState() {
            this.fillPaint = new Paint();
            this.fillPaint.setFlags(385);
            this.fillPaint.setStyle(Paint.Style.FILL);
            this.fillPaint.setTypeface(Typeface.DEFAULT);
            this.strokePaint = new Paint();
            this.strokePaint.setFlags(385);
            this.strokePaint.setStyle(Paint.Style.STROKE);
            this.strokePaint.setTypeface(Typeface.DEFAULT);
            this.style = SVG.Style.getDefaultStyle();
        }

        RendererState(RendererState rendererState) {
            this.hasFill = rendererState.hasFill;
            this.hasStroke = rendererState.hasStroke;
            this.fillPaint = new Paint(rendererState.fillPaint);
            this.strokePaint = new Paint(rendererState.strokePaint);
            SVG.Box box = rendererState.viewPort;
            if (box != null) {
                this.viewPort = new SVG.Box(box);
            }
            SVG.Box box2 = rendererState.viewBox;
            if (box2 != null) {
                this.viewBox = new SVG.Box(box2);
            }
            this.spacePreserve = rendererState.spacePreserve;
            try {
                this.style = (SVG.Style) rendererState.style.clone();
            } catch (CloneNotSupportedException e) {
                Log.e(SVGAndroidRenderer.TAG, "Unexpected clone error", e);
                this.style = SVG.Style.getDefaultStyle();
            }
        }
    }

    private class TextBoundsCalculator extends TextProcessor {
        RectF bbox = new RectF();

        /* renamed from: x */
        float f4709x;

        /* renamed from: y */
        float f4710y;

        TextBoundsCalculator(float f, float f2) {
            super(SVGAndroidRenderer.this, (C13311) null);
            this.f4709x = f;
            this.f4710y = f2;
        }

        public boolean doTextContainer(SVG.TextContainer textContainer) {
            if (!(textContainer instanceof SVG.TextPath)) {
                return true;
            }
            SVG.TextPath textPath = (SVG.TextPath) textContainer;
            SVG.SvgObject resolveIRI = textContainer.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                SVGAndroidRenderer.error("TextPath path reference '%s' not found", textPath.href);
                return false;
            }
            SVG.Path path = (SVG.Path) resolveIRI;
            Path path2 = new PathConverter(path.f4668d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            RectF rectF = new RectF();
            path2.computeBounds(rectF, true);
            this.bbox.union(rectF);
            return false;
        }

        public void processText(String str) {
            if (SVGAndroidRenderer.this.visible()) {
                Rect rect = new Rect();
                SVGAndroidRenderer.this.state.fillPaint.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f4709x, this.f4710y);
                this.bbox.union(rectF);
            }
            this.f4709x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    private abstract class TextProcessor {
        private TextProcessor() {
        }

        /* synthetic */ TextProcessor(SVGAndroidRenderer sVGAndroidRenderer, C13311 r2) {
            this();
        }

        public boolean doTextContainer(SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void processText(String str);
    }

    private class TextWidthCalculator extends TextProcessor {

        /* renamed from: x */
        float f4711x;

        private TextWidthCalculator() {
            super(SVGAndroidRenderer.this, (C13311) null);
            this.f4711x = 0.0f;
        }

        /* synthetic */ TextWidthCalculator(SVGAndroidRenderer sVGAndroidRenderer, C13311 r2) {
            this();
        }

        public void processText(String str) {
            this.f4711x += SVGAndroidRenderer.this.state.fillPaint.measureText(str);
        }
    }

    SVGAndroidRenderer(Canvas canvas2, float f) {
        this.canvas = canvas2;
        this.dpi = f;
    }

    private void addObjectToClip(SVG.GraphicsElement graphicsElement, Path path, Matrix matrix) {
        Path path2;
        updateStyleForElement(this.state, graphicsElement);
        if (display() && visible()) {
            Matrix matrix2 = graphicsElement.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            if (graphicsElement instanceof SVG.Rect) {
                path2 = makePathAndBoundingBox((SVG.Rect) graphicsElement);
            } else if (graphicsElement instanceof SVG.Circle) {
                path2 = makePathAndBoundingBox((SVG.Circle) graphicsElement);
            } else if (graphicsElement instanceof SVG.Ellipse) {
                path2 = makePathAndBoundingBox((SVG.Ellipse) graphicsElement);
            } else if (graphicsElement instanceof SVG.PolyLine) {
                path2 = makePathAndBoundingBox((SVG.PolyLine) graphicsElement);
            } else {
                return;
            }
            checkForClipPath(graphicsElement);
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private void addObjectToClip(SVG.Path path, Path path2, Matrix matrix) {
        updateStyleForElement(this.state, path);
        if (display() && visible()) {
            Matrix matrix2 = path.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Path path3 = new PathConverter(path.f4668d).getPath();
            if (path.boundingBox == null) {
                path.boundingBox = calculatePathBounds(path3);
            }
            checkForClipPath(path);
            path2.setFillType(getClipRuleFromState());
            path2.addPath(path3, matrix);
        }
    }

    private void addObjectToClip(SVG.SvgObject svgObject, boolean z, Path path, Matrix matrix) {
        if (display()) {
            clipStatePush();
            if (svgObject instanceof SVG.Use) {
                if (z) {
                    addObjectToClip((SVG.Use) svgObject, path, matrix);
                } else {
                    error("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (svgObject instanceof SVG.Path) {
                addObjectToClip((SVG.Path) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.Text) {
                addObjectToClip((SVG.Text) svgObject, path, matrix);
            } else if (svgObject instanceof SVG.GraphicsElement) {
                addObjectToClip((SVG.GraphicsElement) svgObject, path, matrix);
            } else {
                error("Invalid %s element found in clipPath definition", svgObject.getClass().getSimpleName());
            }
            clipStatePop();
        }
    }

    private void addObjectToClip(SVG.Text text, Path path, Matrix matrix) {
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix2 = text.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            List<SVG.Length> list = text.f4689x;
            float f = 0.0f;
            float floatValueX = (list == null || list.size() == 0) ? 0.0f : text.f4689x.get(0).floatValueX(this);
            List<SVG.Length> list2 = text.f4690y;
            float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : text.f4690y.get(0).floatValueY(this);
            List<SVG.Length> list3 = text.f4687dx;
            float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.f4687dx.get(0).floatValueX(this);
            List<SVG.Length> list4 = text.f4688dy;
            if (!(list4 == null || list4.size() == 0)) {
                f = text.f4688dy.get(0).floatValueY(this);
            }
            if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            checkForClipPath(text);
            Path path2 = new Path();
            enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path2));
            path.setFillType(getClipRuleFromState());
            path.addPath(path2, matrix);
        }
    }

    private void addObjectToClip(SVG.Use use, Path path, Matrix matrix) {
        updateStyleForElement(this.state, use);
        if (display() && visible()) {
            Matrix matrix2 = use.transform;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            SVG.SvgObject resolveIRI = use.document.resolveIRI(use.href);
            if (resolveIRI == null) {
                error("Use reference '%s' not found", use.href);
                return;
            }
            checkForClipPath(use);
            addObjectToClip(resolveIRI, false, path, matrix);
        }
    }

    /* access modifiers changed from: private */
    public static void arcTo(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, SVG.PathInterface pathInterface) {
        float f8;
        double d;
        float f9 = f5;
        boolean z3 = z2;
        float f10 = f6;
        float f11 = f7;
        if (f != f10 || f2 != f11) {
            if (f3 == 0.0f || f4 == 0.0f) {
                pathInterface.lineTo(f10, f11);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = (double) ((float) Math.toRadians(((double) f9) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f12 = (f - f10) / 2.0f;
            float f13 = (f2 - f11) / 2.0f;
            float f14 = (cos * f12) + (sin * f13);
            float f15 = ((-sin) * f12) + (f13 * cos);
            float f16 = abs * abs;
            float f17 = abs2 * abs2;
            float f18 = f14 * f14;
            float f19 = f15 * f15;
            float f20 = (f18 / f16) + (f19 / f17);
            if (f20 > 1.0f) {
                double d2 = (double) f20;
                f8 = cos;
                abs *= (float) Math.sqrt(d2);
                abs2 *= (float) Math.sqrt(d2);
                f16 = abs * abs;
                f17 = abs2 * abs2;
            } else {
                f8 = cos;
            }
            float f21 = z == z3 ? -1.0f : 1.0f;
            float f22 = f16 * f17;
            float f23 = f16 * f19;
            float f24 = f17 * f18;
            float f25 = ((f22 - f23) - f24) / (f23 + f24);
            if (f25 < 0.0f) {
                f25 = 0.0f;
            }
            float sqrt = (float) (((double) f21) * Math.sqrt((double) f25));
            float f26 = ((abs * f15) / abs2) * sqrt;
            float f27 = sqrt * (-((abs2 * f14) / abs));
            float f28 = ((f + f10) / 2.0f) + ((f8 * f26) - (sin * f27));
            float f29 = ((f2 + f11) / 2.0f) + (sin * f26) + (f8 * f27);
            float f30 = (f14 - f26) / abs;
            float f31 = (f15 - f27) / abs2;
            float f32 = ((-f15) - f27) / abs2;
            float f33 = (f30 * f30) + (f31 * f31);
            float f34 = ((-f14) - f26) / abs;
            float f35 = abs;
            float degrees = (float) Math.toDegrees(((double) (f31 < 0.0f ? -1.0f : 1.0f)) * Math.acos((double) (f30 / ((float) Math.sqrt((double) f33)))));
            double degrees2 = Math.toDegrees(((double) ((f30 * f32) - (f31 * f34) < 0.0f ? -1.0f : 1.0f)) * Math.acos((double) (((f30 * f34) + (f31 * f32)) / ((float) Math.sqrt((double) (f33 * ((f34 * f34) + (f32 * f32))))))));
            if (z3 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z3 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            float[] arcToBeziers = arcToBeziers((double) (degrees % 360.0f), degrees2 % d);
            Matrix matrix = new Matrix();
            matrix.postScale(f35, abs2);
            matrix.postRotate(f9);
            matrix.postTranslate(f28, f29);
            matrix.mapPoints(arcToBeziers);
            arcToBeziers[arcToBeziers.length - 2] = f10;
            arcToBeziers[arcToBeziers.length - 1] = f11;
            for (int i = 0; i < arcToBeziers.length; i += 6) {
                pathInterface.cubicTo(arcToBeziers[i], arcToBeziers[i + 1], arcToBeziers[i + 2], arcToBeziers[i + 3], arcToBeziers[i + 4], arcToBeziers[i + 5]);
            }
        }
    }

    private static float[] arcToBeziers(double d, double d2) {
        int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians = Math.toRadians(d);
        float radians2 = (float) (Math.toRadians(d2) / ((double) ceil));
        double d3 = (double) radians2;
        double d4 = d3 / 2.0d;
        double sin = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
        float[] fArr = new float[(ceil * 6)];
        int i = 0;
        int i2 = 0;
        while (i < ceil) {
            double d5 = ((double) (((float) i) * radians2)) + radians;
            double cos = Math.cos(d5);
            double sin2 = Math.sin(d5);
            int i3 = i2 + 1;
            int i4 = ceil;
            double d6 = radians;
            fArr[i2] = (float) (cos - (sin * sin2));
            int i5 = i3 + 1;
            fArr[i3] = (float) (sin2 + (cos * sin));
            double d7 = d5 + d3;
            double cos2 = Math.cos(d7);
            double sin3 = Math.sin(d7);
            int i6 = i5 + 1;
            fArr[i5] = (float) ((sin * sin3) + cos2);
            int i7 = i6 + 1;
            fArr[i6] = (float) (sin3 - (sin * cos2));
            int i8 = i7 + 1;
            fArr[i7] = (float) cos2;
            fArr[i8] = (float) sin3;
            i++;
            radians = d6;
            i2 = i8 + 1;
            ceil = i4;
        }
        return fArr;
    }

    @TargetApi(19)
    private Path calculateClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        Path objectToPath;
        SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        boolean z = false;
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return null;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) resolveIRI;
        this.stateStack.push(this.state);
        this.state = findInheritFromAncestorState(clipPath);
        Boolean bool = clipPath.clipPathUnitsAreUser;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(box.minX, box.minY);
            matrix.preScale(box.width, box.height);
        }
        Matrix matrix2 = clipPath.transform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.SvgObject next : clipPath.children) {
            if ((next instanceof SVG.SvgElement) && (objectToPath = objectToPath((SVG.SvgElement) next, true)) != null) {
                path.op(objectToPath, Path.Op.UNION);
            }
        }
        if (this.state.style.clipPath != null) {
            if (clipPath.boundingBox == null) {
                clipPath.boundingBox = calculatePathBounds(path);
            }
            Path calculateClipPath = calculateClipPath(clipPath, clipPath.boundingBox);
            if (calculateClipPath != null) {
                path.op(calculateClipPath, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.state = this.stateStack.pop();
        return path;
    }

    private List<MarkerVector> calculateMarkerPositions(SVG.Line line) {
        SVG.Length length = line.f4662x1;
        float f = 0.0f;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = line.f4664y1;
        float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
        SVG.Length length3 = line.f4663x2;
        float floatValueX2 = length3 != null ? length3.floatValueX(this) : 0.0f;
        SVG.Length length4 = line.f4665y2;
        if (length4 != null) {
            f = length4.floatValueY(this);
        }
        float f2 = f;
        ArrayList arrayList = new ArrayList(2);
        float f3 = floatValueX2 - floatValueX;
        float f4 = f2 - floatValueY;
        arrayList.add(new MarkerVector(floatValueX, floatValueY, f3, f4));
        arrayList.add(new MarkerVector(floatValueX2, f2, f3, f4));
        return arrayList;
    }

    private List<MarkerVector> calculateMarkerPositions(SVG.PolyLine polyLine) {
        SVG.PolyLine polyLine2 = polyLine;
        int length = polyLine2.points.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = polyLine2.points;
        MarkerVector markerVector = new MarkerVector(fArr[0], fArr[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            float[] fArr2 = polyLine2.points;
            float f3 = fArr2[i];
            float f4 = fArr2[i + 1];
            markerVector.add(f3, f4);
            arrayList.add(markerVector);
            i += 2;
            markerVector = new MarkerVector(f3, f4, f3 - markerVector.f4703x, f4 - markerVector.f4704y);
            float f5 = f3;
            f2 = f4;
            f = f5;
        }
        if (polyLine2 instanceof SVG.Polygon) {
            float[] fArr3 = polyLine2.points;
            if (!(f == fArr3[0] || f2 == fArr3[1])) {
                float f6 = fArr3[0];
                float f7 = fArr3[1];
                markerVector.add(f6, f7);
                arrayList.add(markerVector);
                MarkerVector markerVector2 = new MarkerVector(f6, f7, f6 - markerVector.f4703x, f7 - markerVector.f4704y);
                markerVector2.add((MarkerVector) arrayList.get(0));
                arrayList.add(markerVector2);
                arrayList.set(0, markerVector2);
            }
        } else {
            arrayList.add(markerVector);
        }
        return arrayList;
    }

    private SVG.Box calculatePathBounds(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private float calculateTextWidth(SVG.TextContainer textContainer) {
        TextWidthCalculator textWidthCalculator = new TextWidthCalculator(this, (C13311) null);
        enumerateTextSpans(textContainer, textWidthCalculator);
        return textWidthCalculator.f4711x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r3 = r3 - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r11 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Matrix calculateViewBoxTransform(com.caverock.androidsvg.SVG.Box r9, com.caverock.androidsvg.SVG.Box r10, com.caverock.androidsvg.PreserveAspectRatio r11) {
        /*
            r8 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L_0x009b
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r11.getAlignment()
            if (r1 != 0) goto L_0x000f
            goto L_0x009b
        L_0x000f:
            float r1 = r9.width
            float r2 = r10.width
            float r1 = r1 / r2
            float r2 = r9.height
            float r3 = r10.height
            float r2 = r2 / r3
            float r3 = r10.minX
            float r3 = -r3
            float r4 = r10.minY
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L_0x0035
            float r10 = r9.minX
            float r9 = r9.minY
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
        L_0x0031:
            r0.preTranslate(r3, r4)
            return r0
        L_0x0035:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r11.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L_0x0042
            float r1 = java.lang.Math.max(r1, r2)
            goto L_0x0046
        L_0x0042:
            float r1 = java.lang.Math.min(r1, r2)
        L_0x0046:
            float r2 = r9.width
            float r2 = r2 / r1
            float r5 = r9.height
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.SVGAndroidRenderer.C13311.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r11.getAlignment()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            r7 = 1073741824(0x40000000, float:2.0)
            switch(r6) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0062;
                case 3: goto L_0x0062;
                case 4: goto L_0x005e;
                case 5: goto L_0x005e;
                case 6: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0067
        L_0x005e:
            float r6 = r10.width
            float r6 = r6 - r2
            goto L_0x0066
        L_0x0062:
            float r6 = r10.width
            float r6 = r6 - r2
            float r6 = r6 / r7
        L_0x0066:
            float r3 = r3 - r6
        L_0x0067:
            int[] r2 = com.caverock.androidsvg.SVGAndroidRenderer.C13311.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r11 = r11.getAlignment()
            int r11 = r11.ordinal()
            r11 = r2[r11]
            r2 = 2
            if (r11 == r2) goto L_0x008b
            r2 = 3
            if (r11 == r2) goto L_0x0087
            r2 = 5
            if (r11 == r2) goto L_0x008b
            r2 = 6
            if (r11 == r2) goto L_0x0087
            r2 = 7
            if (r11 == r2) goto L_0x008b
            r2 = 8
            if (r11 == r2) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            float r10 = r10.height
            float r10 = r10 - r5
            goto L_0x008f
        L_0x008b:
            float r10 = r10.height
            float r10 = r10 - r5
            float r10 = r10 / r7
        L_0x008f:
            float r4 = r4 - r10
        L_0x0090:
            float r10 = r9.minX
            float r9 = r9.minY
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            goto L_0x0031
        L_0x009b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.calculateViewBoxTransform(com.caverock.androidsvg.SVG$Box, com.caverock.androidsvg.SVG$Box, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    private void checkForClipPath(SVG.SvgElement svgElement) {
        checkForClipPath(svgElement, svgElement.boundingBox);
    }

    private void checkForClipPath(SVG.SvgElement svgElement, SVG.Box box) {
        if (this.state.style.clipPath != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                Path calculateClipPath = calculateClipPath(svgElement, box);
                if (calculateClipPath != null) {
                    this.canvas.clipPath(calculateClipPath);
                    return;
                }
                return;
            }
            checkForClipPath_OldStyle(svgElement, box);
        }
    }

    private void checkForClipPath_OldStyle(SVG.SvgElement svgElement, SVG.Box box) {
        SVG.SvgObject resolveIRI = svgElement.document.resolveIRI(this.state.style.clipPath);
        if (resolveIRI == null) {
            error("ClipPath reference '%s' not found", this.state.style.clipPath);
            return;
        }
        SVG.ClipPath clipPath = (SVG.ClipPath) resolveIRI;
        if (clipPath.children.isEmpty()) {
            this.canvas.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = clipPath.clipPathUnitsAreUser;
        boolean z = bool == null || bool.booleanValue();
        if (!(svgElement instanceof SVG.Group) || z) {
            clipStatePush();
            if (!z) {
                Matrix matrix = new Matrix();
                matrix.preTranslate(box.minX, box.minY);
                matrix.preScale(box.width, box.height);
                this.canvas.concat(matrix);
            }
            Matrix matrix2 = clipPath.transform;
            if (matrix2 != null) {
                this.canvas.concat(matrix2);
            }
            this.state = findInheritFromAncestorState(clipPath);
            checkForClipPath(clipPath);
            Path path = new Path();
            for (SVG.SvgObject addObjectToClip : clipPath.children) {
                addObjectToClip(addObjectToClip, true, path, new Matrix());
            }
            this.canvas.clipPath(path);
            clipStatePop();
            return;
        }
        warn("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", svgElement.getClass().getSimpleName());
    }

    private void checkForGradientsAndPatterns(SVG.SvgElement svgElement) {
        SVG.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            decodePaintReference(true, svgElement.boundingBox, (SVG.PaintReference) svgPaint);
        }
        SVG.SvgPaint svgPaint2 = this.state.style.stroke;
        if (svgPaint2 instanceof SVG.PaintReference) {
            decodePaintReference(false, svgElement.boundingBox, (SVG.PaintReference) svgPaint2);
        }
    }

    private Bitmap checkForImageDataURL(String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) == -1 || indexOf < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    private Typeface checkGenericFont(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        Typeface typeface;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c = 1;
                    break;
                }
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 2;
                    break;
                }
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 4;
                    break;
                }
                break;
            case 109326717:
                if (str.equals(DEFAULT_FONT_FAMILY)) {
                    c = 0;
                    break;
                }
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c == 2) {
                    typeface = Typeface.MONOSPACE;
                } else if (!(c == 3 || c == 4)) {
                    return null;
                }
            }
            typeface = Typeface.SANS_SERIF;
        } else {
            typeface = Typeface.SERIF;
        }
        return Typeface.create(typeface, i);
    }

    private void checkXMLSpaceAttribute(SVG.SvgObject svgObject) {
        Boolean bool;
        if ((svgObject instanceof SVG.SvgElementBase) && (bool = ((SVG.SvgElementBase) svgObject).spacePreserve) != null) {
            this.state.spacePreserve = bool.booleanValue();
        }
    }

    private static int clamp255(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    private void clipStatePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    @SuppressLint({"WrongConstant"})
    private void clipStatePush() {
        this.canvas.save(1);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    static int colourWithOpacity(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* access modifiers changed from: private */
    public static void debug(String str, Object... objArr) {
    }

    private void decodePaintReference(boolean z, SVG.Box box, SVG.PaintReference paintReference) {
        SVG.SvgObject resolveIRI = this.document.resolveIRI(paintReference.href);
        if (resolveIRI == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = paintReference.href;
            error("%s reference '%s' not found", objArr);
            SVG.SvgPaint svgPaint = paintReference.fallback;
            if (svgPaint != null) {
                setPaintColour(this.state, z, svgPaint);
            } else if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else if (resolveIRI instanceof SVG.SvgLinearGradient) {
            makeLinearGradient(z, box, (SVG.SvgLinearGradient) resolveIRI);
        } else if (resolveIRI instanceof SVG.SvgRadialGradient) {
            makeRadialGradient(z, box, (SVG.SvgRadialGradient) resolveIRI);
        } else if (resolveIRI instanceof SVG.SolidColor) {
            setSolidColor(z, (SVG.SolidColor) resolveIRI);
        }
    }

    private boolean display() {
        Boolean bool = this.state.style.display;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private void doFilledPath(SVG.SvgElement svgElement, Path path) {
        SVG.SvgPaint svgPaint = this.state.style.fill;
        if (svgPaint instanceof SVG.PaintReference) {
            SVG.SvgObject resolveIRI = this.document.resolveIRI(((SVG.PaintReference) svgPaint).href);
            if (resolveIRI instanceof SVG.Pattern) {
                fillWithPattern(svgElement, path, (SVG.Pattern) resolveIRI);
                return;
            }
        }
        this.canvas.drawPath(path, this.state.fillPaint);
    }

    private void doStroke(Path path) {
        RendererState rendererState = this.state;
        if (rendererState.style.vectorEffect == SVG.Style.VectorEffect.NonScalingStroke) {
            Matrix matrix = this.canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.canvas.setMatrix(new Matrix());
            Shader shader = this.state.strokePaint.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.canvas.drawPath(path2, this.state.strokePaint);
            this.canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.canvas.drawPath(path, rendererState.strokePaint);
    }

    private float dotProduct(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    private void enumerateTextSpans(SVG.TextContainer textContainer, TextProcessor textProcessor) {
        if (display()) {
            Iterator<SVG.SvgObject> it = textContainer.children.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.SvgObject next = it.next();
                if (next instanceof SVG.TextSequence) {
                    textProcessor.processText(textXMLSpaceTransform(((SVG.TextSequence) next).text, z, !it.hasNext()));
                } else {
                    processTextChild(next, textProcessor);
                }
                z = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void error(String str, Object... objArr) {
        Log.e(TAG, String.format(str, objArr));
    }

    private void extractRawText(SVG.TextContainer textContainer, StringBuilder sb) {
        Iterator<SVG.SvgObject> it = textContainer.children.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.SvgObject next = it.next();
            if (next instanceof SVG.TextContainer) {
                extractRawText((SVG.TextContainer) next, sb);
            } else if (next instanceof SVG.TextSequence) {
                sb.append(textXMLSpaceTransform(((SVG.TextSequence) next).text, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private void fillInChainedGradientFields(SVG.GradientElement gradientElement, String str) {
        SVG.SvgObject resolveIRI = gradientElement.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Gradient reference '%s' not found", str);
        } else if (!(resolveIRI instanceof SVG.GradientElement)) {
            error("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (resolveIRI == gradientElement) {
            error("Circular reference in gradient href attribute '%s'", str);
        } else {
            SVG.GradientElement gradientElement2 = (SVG.GradientElement) resolveIRI;
            if (gradientElement.gradientUnitsAreUser == null) {
                gradientElement.gradientUnitsAreUser = gradientElement2.gradientUnitsAreUser;
            }
            if (gradientElement.gradientTransform == null) {
                gradientElement.gradientTransform = gradientElement2.gradientTransform;
            }
            if (gradientElement.spreadMethod == null) {
                gradientElement.spreadMethod = gradientElement2.spreadMethod;
            }
            if (gradientElement.children.isEmpty()) {
                gradientElement.children = gradientElement2.children;
            }
            try {
                if (gradientElement instanceof SVG.SvgLinearGradient) {
                    fillInChainedGradientFields((SVG.SvgLinearGradient) gradientElement, (SVG.SvgLinearGradient) resolveIRI);
                } else {
                    fillInChainedGradientFields((SVG.SvgRadialGradient) gradientElement, (SVG.SvgRadialGradient) resolveIRI);
                }
            } catch (ClassCastException unused) {
            }
            String str2 = gradientElement2.href;
            if (str2 != null) {
                fillInChainedGradientFields(gradientElement, str2);
            }
        }
    }

    private void fillInChainedGradientFields(SVG.SvgLinearGradient svgLinearGradient, SVG.SvgLinearGradient svgLinearGradient2) {
        if (svgLinearGradient.f4678x1 == null) {
            svgLinearGradient.f4678x1 = svgLinearGradient2.f4678x1;
        }
        if (svgLinearGradient.f4680y1 == null) {
            svgLinearGradient.f4680y1 = svgLinearGradient2.f4680y1;
        }
        if (svgLinearGradient.f4679x2 == null) {
            svgLinearGradient.f4679x2 = svgLinearGradient2.f4679x2;
        }
        if (svgLinearGradient.f4681y2 == null) {
            svgLinearGradient.f4681y2 = svgLinearGradient2.f4681y2;
        }
    }

    private void fillInChainedGradientFields(SVG.SvgRadialGradient svgRadialGradient, SVG.SvgRadialGradient svgRadialGradient2) {
        if (svgRadialGradient.f4682cx == null) {
            svgRadialGradient.f4682cx = svgRadialGradient2.f4682cx;
        }
        if (svgRadialGradient.f4683cy == null) {
            svgRadialGradient.f4683cy = svgRadialGradient2.f4683cy;
        }
        if (svgRadialGradient.f4686r == null) {
            svgRadialGradient.f4686r = svgRadialGradient2.f4686r;
        }
        if (svgRadialGradient.f4684fx == null) {
            svgRadialGradient.f4684fx = svgRadialGradient2.f4684fx;
        }
        if (svgRadialGradient.f4685fy == null) {
            svgRadialGradient.f4685fy = svgRadialGradient2.f4685fy;
        }
    }

    private void fillInChainedPatternFields(SVG.Pattern pattern, String str) {
        SVG.SvgObject resolveIRI = pattern.document.resolveIRI(str);
        if (resolveIRI == null) {
            warn("Pattern reference '%s' not found", str);
        } else if (!(resolveIRI instanceof SVG.Pattern)) {
            error("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (resolveIRI == pattern) {
            error("Circular reference in pattern href attribute '%s'", str);
        } else {
            SVG.Pattern pattern2 = (SVG.Pattern) resolveIRI;
            if (pattern.patternUnitsAreUser == null) {
                pattern.patternUnitsAreUser = pattern2.patternUnitsAreUser;
            }
            if (pattern.patternContentUnitsAreUser == null) {
                pattern.patternContentUnitsAreUser = pattern2.patternContentUnitsAreUser;
            }
            if (pattern.patternTransform == null) {
                pattern.patternTransform = pattern2.patternTransform;
            }
            if (pattern.f4669x == null) {
                pattern.f4669x = pattern2.f4669x;
            }
            if (pattern.f4670y == null) {
                pattern.f4670y = pattern2.f4670y;
            }
            if (pattern.width == null) {
                pattern.width = pattern2.width;
            }
            if (pattern.height == null) {
                pattern.height = pattern2.height;
            }
            if (pattern.children.isEmpty()) {
                pattern.children = pattern2.children;
            }
            if (pattern.viewBox == null) {
                pattern.viewBox = pattern2.viewBox;
            }
            if (pattern.preserveAspectRatio == null) {
                pattern.preserveAspectRatio = pattern2.preserveAspectRatio;
            }
            String str2 = pattern2.href;
            if (str2 != null) {
                fillInChainedPatternFields(pattern, str2);
            }
        }
    }

    private void fillWithPattern(SVG.SvgElement svgElement, Path path, SVG.Pattern pattern) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        SVG.SvgElement svgElement2 = svgElement;
        SVG.Pattern pattern2 = pattern;
        Boolean bool = pattern2.patternUnitsAreUser;
        boolean z = bool != null && bool.booleanValue();
        String str = pattern2.href;
        if (str != null) {
            fillInChainedPatternFields(pattern2, str);
        }
        if (z) {
            SVG.Length length = pattern2.f4669x;
            f4 = length != null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = pattern2.f4670y;
            float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = pattern2.width;
            f2 = length3 != null ? length3.floatValueX(this) : 0.0f;
            SVG.Length length4 = pattern2.height;
            float floatValueY2 = length4 != null ? length4.floatValueY(this) : 0.0f;
            f = floatValueY;
            f3 = floatValueY2;
        } else {
            SVG.Length length5 = pattern2.f4669x;
            float floatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length6 = pattern2.f4670y;
            float floatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length7 = pattern2.width;
            float floatValue3 = length7 != null ? length7.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length8 = pattern2.height;
            float floatValue4 = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            SVG.Box box = svgElement2.boundingBox;
            float f6 = box.minX;
            float f7 = box.width;
            f4 = (floatValue * f7) + f6;
            float f8 = box.minY;
            float f9 = box.height;
            f3 = floatValue4 * f9;
            float f10 = floatValue3 * f7;
            f = (floatValue2 * f9) + f8;
            f2 = f10;
        }
        if (f2 != 0.0f && f3 != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = pattern2.preserveAspectRatio;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
            }
            statePush();
            this.canvas.clipPath(path);
            RendererState rendererState = new RendererState();
            updateStyle(rendererState, SVG.Style.getDefaultStyle());
            rendererState.style.overflow = false;
            findInheritFromAncestorState(pattern2, rendererState);
            this.state = rendererState;
            SVG.Box box2 = svgElement2.boundingBox;
            Matrix matrix = pattern2.patternTransform;
            if (matrix != null) {
                this.canvas.concat(matrix);
                Matrix matrix2 = new Matrix();
                if (pattern2.patternTransform.invert(matrix2)) {
                    SVG.Box box3 = svgElement2.boundingBox;
                    SVG.Box box4 = svgElement2.boundingBox;
                    SVG.Box box5 = svgElement2.boundingBox;
                    float[] fArr = {box3.minX, box3.minY, box3.maxX(), box4.minY, box4.maxX(), svgElement2.boundingBox.maxY(), box5.minX, box5.maxY()};
                    matrix2.mapPoints(fArr);
                    RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                    for (int i = 2; i <= 6; i += 2) {
                        if (fArr[i] < rectF.left) {
                            rectF.left = fArr[i];
                        }
                        if (fArr[i] > rectF.right) {
                            rectF.right = fArr[i];
                        }
                        int i2 = i + 1;
                        if (fArr[i2] < rectF.top) {
                            rectF.top = fArr[i2];
                        }
                        if (fArr[i2] > rectF.bottom) {
                            rectF.bottom = fArr[i2];
                        }
                    }
                    float f11 = rectF.left;
                    float f12 = rectF.top;
                    box2 = new SVG.Box(f11, f12, rectF.right - f11, rectF.bottom - f12);
                }
            }
            float floor = f4 + (((float) Math.floor((double) ((box2.minX - f4) / f2))) * f2);
            float maxX = box2.maxX();
            float maxY = box2.maxY();
            SVG.Box box6 = new SVG.Box(0.0f, 0.0f, f2, f3);
            boolean pushLayer = pushLayer();
            for (float floor2 = f + (((float) Math.floor((double) ((box2.minY - f) / f3))) * f3); floor2 < maxY; floor2 += f3) {
                float f13 = floor;
                while (f13 < maxX) {
                    box6.minX = f13;
                    box6.minY = floor2;
                    statePush();
                    if (!this.state.style.overflow.booleanValue()) {
                        f5 = floor;
                        setClipRect(box6.minX, box6.minY, box6.width, box6.height);
                    } else {
                        f5 = floor;
                    }
                    SVG.Box box7 = pattern2.viewBox;
                    if (box7 != null) {
                        this.canvas.concat(calculateViewBoxTransform(box6, box7, preserveAspectRatio));
                    } else {
                        Boolean bool2 = pattern2.patternContentUnitsAreUser;
                        boolean z2 = bool2 == null || bool2.booleanValue();
                        this.canvas.translate(f13, floor2);
                        if (!z2) {
                            Canvas canvas2 = this.canvas;
                            SVG.Box box8 = svgElement2.boundingBox;
                            canvas2.scale(box8.width, box8.height);
                        }
                    }
                    for (SVG.SvgObject render : pattern2.children) {
                        render(render);
                    }
                    statePop();
                    f13 += f2;
                    floor = f5;
                }
                float f14 = floor;
            }
            if (pushLayer) {
                popLayer(pattern2);
            }
            statePop();
        }
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject) {
        RendererState rendererState = new RendererState();
        updateStyle(rendererState, SVG.Style.getDefaultStyle());
        findInheritFromAncestorState(svgObject, rendererState);
        return rendererState;
    }

    private RendererState findInheritFromAncestorState(SVG.SvgObject svgObject, RendererState rendererState) {
        ArrayList<SVG.SvgElementBase> arrayList = new ArrayList<>();
        while (true) {
            if (svgObject instanceof SVG.SvgElementBase) {
                arrayList.add(0, (SVG.SvgElementBase) svgObject);
            }
            SVG.SvgContainer svgContainer = svgObject.parent;
            if (svgContainer == null) {
                break;
            }
            svgObject = (SVG.SvgObject) svgContainer;
        }
        for (SVG.SvgElementBase updateStyleForElement : arrayList) {
            updateStyleForElement(rendererState, updateStyleForElement);
        }
        RendererState rendererState2 = this.state;
        rendererState.viewBox = rendererState2.viewBox;
        rendererState.viewPort = rendererState2.viewPort;
        return rendererState;
    }

    private SVG.Style.TextAnchor getAnchorPosition() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.state.style;
        if (style.direction == SVG.Style.TextDirection.LTR || (textAnchor = style.textAnchor) == SVG.Style.TextAnchor.Middle) {
            return this.state.style.textAnchor;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    private Path.FillType getClipRuleFromState() {
        SVG.Style.FillRule fillRule = this.state.style.clipRule;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private Path.FillType getFillTypeFromState() {
        SVG.Style.FillRule fillRule = this.state.style.fillRule;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static synchronized void initialiseSupportedFeaturesMap() {
        synchronized (SVGAndroidRenderer.class) {
            supportedFeatures = new HashSet<>();
            supportedFeatures.add("Structure");
            supportedFeatures.add("BasicStructure");
            supportedFeatures.add("ConditionalProcessing");
            supportedFeatures.add("Image");
            supportedFeatures.add("Style");
            supportedFeatures.add("ViewportAttribute");
            supportedFeatures.add("Shape");
            supportedFeatures.add("BasicText");
            supportedFeatures.add("PaintAttribute");
            supportedFeatures.add("BasicPaintAttribute");
            supportedFeatures.add("OpacityAttribute");
            supportedFeatures.add("BasicGraphicsAttribute");
            supportedFeatures.add("Marker");
            supportedFeatures.add("Gradient");
            supportedFeatures.add("Pattern");
            supportedFeatures.add("Clip");
            supportedFeatures.add("BasicClip");
            supportedFeatures.add("Mask");
            supportedFeatures.add("View");
        }
    }

    private boolean isSpecified(SVG.Style style, long j) {
        return (style.specifiedFlags & j) != 0;
    }

    private void makeLinearGradient(boolean z, SVG.Box box, SVG.SvgLinearGradient svgLinearGradient) {
        float f;
        float f2;
        float f3;
        float f4;
        SVG.Box box2 = box;
        SVG.SvgLinearGradient svgLinearGradient2 = svgLinearGradient;
        String str = svgLinearGradient2.href;
        if (str != null) {
            fillInChainedGradientFields((SVG.GradientElement) svgLinearGradient2, str);
        }
        Boolean bool = svgLinearGradient2.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        Paint paint = z ? this.state.fillPaint : this.state.strokePaint;
        if (z2) {
            SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
            SVG.Length length = svgLinearGradient2.f4678x1;
            float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
            SVG.Length length2 = svgLinearGradient2.f4680y1;
            float floatValueY = length2 != null ? length2.floatValueY(this) : 0.0f;
            SVG.Length length3 = svgLinearGradient2.f4679x2;
            float floatValueX2 = length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width;
            SVG.Length length4 = svgLinearGradient2.f4681y2;
            f2 = floatValueX2;
            f4 = floatValueX;
            f3 = floatValueY;
            f = length4 != null ? length4.floatValueY(this) : 0.0f;
        } else {
            SVG.Length length5 = svgLinearGradient2.f4678x1;
            float floatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length6 = svgLinearGradient2.f4680y1;
            float floatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.0f;
            SVG.Length length7 = svgLinearGradient2.f4679x2;
            float floatValue3 = length7 != null ? length7.floatValue(this, 1.0f) : 1.0f;
            SVG.Length length8 = svgLinearGradient2.f4681y2;
            f4 = floatValue;
            f = length8 != null ? length8.floatValue(this, 1.0f) : 0.0f;
            f3 = floatValue2;
            f2 = floatValue3;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgLinearGradient2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box2.minX, box2.minY);
            matrix.preScale(box2.width, box2.height);
        }
        Matrix matrix2 = svgLinearGradient2.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgLinearGradient2.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f5 = -1.0f;
            Iterator<SVG.SvgObject> it = svgLinearGradient2.children.iterator();
            while (it.hasNext()) {
                SVG.Stop stop = (SVG.Stop) it.next();
                Float f6 = stop.offset;
                float floatValue4 = f6 != null ? f6.floatValue() : 0.0f;
                if (i == 0 || floatValue4 >= f5) {
                    fArr[i] = floatValue4;
                    f5 = floatValue4;
                } else {
                    fArr[i] = f5;
                }
                statePush();
                updateStyleForElement(this.state, stop);
                SVG.Colour colour = (SVG.Colour) this.state.style.stopColor;
                if (colour == null) {
                    colour = SVG.Colour.BLACK;
                }
                iArr[i] = colourWithOpacity(colour.colour, this.state.style.stopOpacity.floatValue());
                i++;
                statePop();
            }
            if ((f4 == f2 && f3 == f) || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.GradientSpread gradientSpread = svgLinearGradient2.spreadMethod;
            if (gradientSpread != null) {
                if (gradientSpread == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (gradientSpread == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            statePop();
            LinearGradient linearGradient = new LinearGradient(f4, f3, f2, f, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
        }
    }

    private Path makePathAndBoundingBox(SVG.Circle circle) {
        SVG.Circle circle2 = circle;
        SVG.Length length = circle2.f4653cx;
        float f = 0.0f;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = circle2.f4654cy;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        float floatValue = circle2.f4655r.floatValue(this);
        float f2 = floatValueX - floatValue;
        float f3 = f - floatValue;
        float f4 = floatValueX + floatValue;
        float f5 = f + floatValue;
        if (circle2.boundingBox == null) {
            float f6 = 2.0f * floatValue;
            circle2.boundingBox = new SVG.Box(f2, f3, f6, f6);
        }
        float f7 = BEZIER_ARC_FACTOR * floatValue;
        Path path = new Path();
        path.moveTo(floatValueX, f3);
        float f8 = floatValueX + f7;
        float f9 = f - f7;
        Path path2 = path;
        path2.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f + f7;
        path2.cubicTo(f4, f10, f8, f5, floatValueX, f5);
        float f11 = floatValueX - f7;
        path2.cubicTo(f11, f5, f2, f10, f2, f);
        path2.cubicTo(f2, f9, f11, f3, floatValueX, f3);
        path.close();
        return path;
    }

    private Path makePathAndBoundingBox(SVG.Ellipse ellipse) {
        SVG.Ellipse ellipse2 = ellipse;
        SVG.Length length = ellipse2.f4656cx;
        float f = 0.0f;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        SVG.Length length2 = ellipse2.f4657cy;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        float floatValueX2 = ellipse2.f4658rx.floatValueX(this);
        float floatValueY = ellipse2.f4659ry.floatValueY(this);
        float f2 = floatValueX - floatValueX2;
        float f3 = f - floatValueY;
        float f4 = floatValueX + floatValueX2;
        float f5 = f + floatValueY;
        if (ellipse2.boundingBox == null) {
            ellipse2.boundingBox = new SVG.Box(f2, f3, floatValueX2 * 2.0f, 2.0f * floatValueY);
        }
        float f6 = floatValueX2 * BEZIER_ARC_FACTOR;
        float f7 = BEZIER_ARC_FACTOR * floatValueY;
        Path path = new Path();
        path.moveTo(floatValueX, f3);
        float f8 = floatValueX + f6;
        float f9 = f - f7;
        Path path2 = path;
        path.cubicTo(f8, f3, f4, f9, f4, f);
        float f10 = f7 + f;
        Path path3 = path2;
        path3.cubicTo(f4, f10, f8, f5, floatValueX, f5);
        float f11 = floatValueX - f6;
        path3.cubicTo(f11, f5, f2, f10, f2, f);
        path3.cubicTo(f2, f9, f11, f3, floatValueX, f3);
        path2.close();
        return path2;
    }

    private Path makePathAndBoundingBox(SVG.Line line) {
        SVG.Length length = line.f4662x1;
        float f = 0.0f;
        float floatValueX = length == null ? 0.0f : length.floatValueX(this);
        SVG.Length length2 = line.f4664y1;
        float floatValueY = length2 == null ? 0.0f : length2.floatValueY(this);
        SVG.Length length3 = line.f4663x2;
        float floatValueX2 = length3 == null ? 0.0f : length3.floatValueX(this);
        SVG.Length length4 = line.f4665y2;
        if (length4 != null) {
            f = length4.floatValueY(this);
        }
        if (line.boundingBox == null) {
            line.boundingBox = new SVG.Box(Math.min(floatValueX, floatValueX2), Math.min(floatValueY, f), Math.abs(floatValueX2 - floatValueX), Math.abs(f - floatValueY));
        }
        Path path = new Path();
        path.moveTo(floatValueX, floatValueY);
        path.lineTo(floatValueX2, f);
        return path;
    }

    private Path makePathAndBoundingBox(SVG.PolyLine polyLine) {
        Path path = new Path();
        float[] fArr = polyLine.points;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = polyLine.points;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (polyLine instanceof SVG.Polygon) {
            path.close();
        }
        if (polyLine.boundingBox == null) {
            polyLine.boundingBox = calculatePathBounds(path);
        }
        return path;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Path makePathAndBoundingBox(com.caverock.androidsvg.SVG.Rect r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            com.caverock.androidsvg.SVG$Length r2 = r1.f4671rx
            r3 = 0
            if (r2 != 0) goto L_0x000f
            com.caverock.androidsvg.SVG$Length r2 = r1.f4672ry
            if (r2 != 0) goto L_0x000f
            r2 = r3
            goto L_0x0019
        L_0x000f:
            com.caverock.androidsvg.SVG$Length r2 = r1.f4671rx
            if (r2 != 0) goto L_0x001b
            com.caverock.androidsvg.SVG$Length r2 = r1.f4672ry
            float r2 = r2.floatValueY(r0)
        L_0x0019:
            r4 = r2
            goto L_0x002e
        L_0x001b:
            com.caverock.androidsvg.SVG$Length r4 = r1.f4672ry
            if (r4 != 0) goto L_0x0024
            float r2 = r2.floatValueX(r0)
            goto L_0x0019
        L_0x0024:
            float r2 = r2.floatValueX(r0)
            com.caverock.androidsvg.SVG$Length r4 = r1.f4672ry
            float r4 = r4.floatValueY(r0)
        L_0x002e:
            com.caverock.androidsvg.SVG$Length r5 = r1.width
            float r5 = r5.floatValueX(r0)
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r2 = java.lang.Math.min(r2, r5)
            com.caverock.androidsvg.SVG$Length r5 = r1.height
            float r5 = r5.floatValueY(r0)
            float r5 = r5 / r6
            float r4 = java.lang.Math.min(r4, r5)
            com.caverock.androidsvg.SVG$Length r5 = r1.f4673x
            if (r5 == 0) goto L_0x004f
            float r5 = r5.floatValueX(r0)
            goto L_0x0050
        L_0x004f:
            r5 = r3
        L_0x0050:
            com.caverock.androidsvg.SVG$Length r6 = r1.f4674y
            if (r6 == 0) goto L_0x005a
            float r6 = r6.floatValueY(r0)
            r13 = r6
            goto L_0x005b
        L_0x005a:
            r13 = r3
        L_0x005b:
            com.caverock.androidsvg.SVG$Length r6 = r1.width
            float r6 = r6.floatValueX(r0)
            com.caverock.androidsvg.SVG$Length r7 = r1.height
            float r7 = r7.floatValueY(r0)
            com.caverock.androidsvg.SVG$Box r8 = r1.boundingBox
            if (r8 != 0) goto L_0x0072
            com.caverock.androidsvg.SVG$Box r8 = new com.caverock.androidsvg.SVG$Box
            r8.<init>(r5, r13, r6, r7)
            r1.boundingBox = r8
        L_0x0072:
            float r15 = r5 + r6
            float r1 = r13 + r7
            android.graphics.Path r14 = new android.graphics.Path
            r14.<init>()
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00dc
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0085
            goto L_0x00dc
        L_0x0085:
            r3 = 1057841801(0x3f0d6289, float:0.5522848)
            float r16 = r2 * r3
            float r3 = r3 * r4
            float r12 = r13 + r4
            r14.moveTo(r5, r12)
            float r17 = r12 - r3
            float r11 = r5 + r2
            float r21 = r11 - r16
            r6 = r14
            r7 = r5
            r8 = r17
            r9 = r21
            r10 = r13
            r24 = r11
            r22 = r12
            r12 = r13
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            float r2 = r15 - r2
            r14.lineTo(r2, r13)
            float r6 = r2 + r16
            r7 = r14
            r8 = r6
            r9 = r13
            r10 = r15
            r11 = r17
            r12 = r15
            r13 = r22
            r7.cubicTo(r8, r9, r10, r11, r12, r13)
            float r12 = r1 - r4
            r14.lineTo(r15, r12)
            float r3 = r3 + r12
            r4 = r14
            r16 = r3
            r17 = r6
            r18 = r1
            r19 = r2
            r20 = r1
            r14.cubicTo(r15, r16, r17, r18, r19, r20)
            r2 = r24
            r4.lineTo(r2, r1)
            r6 = r4
            r7 = r21
            r8 = r1
            r9 = r5
            r10 = r3
            r11 = r5
            r6.cubicTo(r7, r8, r9, r10, r11, r12)
            goto L_0x00e9
        L_0x00dc:
            r4 = r14
            r4.moveTo(r5, r13)
            r4.lineTo(r15, r13)
            r4.lineTo(r15, r1)
            r4.lineTo(r5, r1)
        L_0x00e9:
            r4.lineTo(r5, r13)
            r4.close()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.makePathAndBoundingBox(com.caverock.androidsvg.SVG$Rect):android.graphics.Path");
    }

    private Path makePathAndBoundingBox(SVG.Text text) {
        List<SVG.Length> list = text.f4689x;
        float f = 0.0f;
        float floatValueX = (list == null || list.size() == 0) ? 0.0f : text.f4689x.get(0).floatValueX(this);
        List<SVG.Length> list2 = text.f4690y;
        float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : text.f4690y.get(0).floatValueY(this);
        List<SVG.Length> list3 = text.f4687dx;
        float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.f4687dx.get(0).floatValueX(this);
        List<SVG.Length> list4 = text.f4688dy;
        if (!(list4 == null || list4.size() == 0)) {
            f = text.f4688dy.get(0).floatValueY(this);
        }
        if (this.state.style.textAnchor != SVG.Style.TextAnchor.Start) {
            float calculateTextWidth = calculateTextWidth(text);
            if (this.state.style.textAnchor == SVG.Style.TextAnchor.Middle) {
                calculateTextWidth /= 2.0f;
            }
            floatValueX -= calculateTextWidth;
        }
        if (text.boundingBox == null) {
            TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
            enumerateTextSpans(text, textBoundsCalculator);
            RectF rectF = textBoundsCalculator.bbox;
            text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
        }
        Path path = new Path();
        enumerateTextSpans(text, new PlainTextToPath(floatValueX + floatValueX2, floatValueY + f, path));
        return path;
    }

    private void makeRadialGradient(boolean z, SVG.Box box, SVG.SvgRadialGradient svgRadialGradient) {
        float f;
        float f2;
        float f3;
        SVG.Box box2 = box;
        SVG.SvgRadialGradient svgRadialGradient2 = svgRadialGradient;
        String str = svgRadialGradient2.href;
        if (str != null) {
            fillInChainedGradientFields((SVG.GradientElement) svgRadialGradient2, str);
        }
        Boolean bool = svgRadialGradient2.gradientUnitsAreUser;
        int i = 0;
        boolean z2 = bool != null && bool.booleanValue();
        Paint paint = z ? this.state.fillPaint : this.state.strokePaint;
        if (z2) {
            SVG.Length length = new SVG.Length(50.0f, SVG.Unit.percent);
            SVG.Length length2 = svgRadialGradient2.f4682cx;
            float floatValueX = length2 != null ? length2.floatValueX(this) : length.floatValueX(this);
            SVG.Length length3 = svgRadialGradient2.f4683cy;
            float floatValueY = length3 != null ? length3.floatValueY(this) : length.floatValueY(this);
            SVG.Length length4 = svgRadialGradient2.f4686r;
            f = length4 != null ? length4.floatValue(this) : length.floatValue(this);
            f3 = floatValueX;
            f2 = floatValueY;
        } else {
            SVG.Length length5 = svgRadialGradient2.f4682cx;
            float floatValue = length5 != null ? length5.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length6 = svgRadialGradient2.f4683cy;
            float floatValue2 = length6 != null ? length6.floatValue(this, 1.0f) : 0.5f;
            SVG.Length length7 = svgRadialGradient2.f4686r;
            f3 = floatValue;
            f = length7 != null ? length7.floatValue(this, 1.0f) : 0.5f;
            f2 = floatValue2;
        }
        statePush();
        this.state = findInheritFromAncestorState(svgRadialGradient2);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(box2.minX, box2.minY);
            matrix.preScale(box2.width, box2.height);
        }
        Matrix matrix2 = svgRadialGradient2.gradientTransform;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = svgRadialGradient2.children.size();
        if (size == 0) {
            statePop();
            if (z) {
                this.state.hasFill = false;
            } else {
                this.state.hasStroke = false;
            }
        } else {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            float f4 = -1.0f;
            Iterator<SVG.SvgObject> it = svgRadialGradient2.children.iterator();
            while (true) {
                float f5 = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                SVG.Stop stop = (SVG.Stop) it.next();
                Float f6 = stop.offset;
                if (f6 != null) {
                    f5 = f6.floatValue();
                }
                if (i == 0 || f5 >= f4) {
                    fArr[i] = f5;
                    f4 = f5;
                } else {
                    fArr[i] = f4;
                }
                statePush();
                updateStyleForElement(this.state, stop);
                SVG.Colour colour = (SVG.Colour) this.state.style.stopColor;
                if (colour == null) {
                    colour = SVG.Colour.BLACK;
                }
                iArr[i] = colourWithOpacity(colour.colour, this.state.style.stopOpacity.floatValue());
                i++;
                statePop();
            }
            if (f == 0.0f || size == 1) {
                statePop();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.GradientSpread gradientSpread = svgRadialGradient2.spreadMethod;
            if (gradientSpread != null) {
                if (gradientSpread == SVG.GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (gradientSpread == SVG.GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            statePop();
            RadialGradient radialGradient = new RadialGradient(f3, f2, f, iArr, fArr, tileMode);
            radialGradient.setLocalMatrix(matrix);
            paint.setShader(radialGradient);
            paint.setAlpha(clamp255(this.state.style.fillOpacity.floatValue()));
        }
    }

    private SVG.Box makeViewPort(SVG.Length length, SVG.Length length2, SVG.Length length3, SVG.Length length4) {
        float f = 0.0f;
        float floatValueX = length != null ? length.floatValueX(this) : 0.0f;
        if (length2 != null) {
            f = length2.floatValueY(this);
        }
        SVG.Box currentViewPortInUserUnits = getCurrentViewPortInUserUnits();
        return new SVG.Box(floatValueX, f, length3 != null ? length3.floatValueX(this) : currentViewPortInUserUnits.width, length4 != null ? length4.floatValueY(this) : currentViewPortInUserUnits.height);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        if (r7 != null) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
        if (r7 != null) goto L_0x00fa;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Path objectToPath(com.caverock.androidsvg.SVG.SvgElement r6, boolean r7) {
        /*
            r5 = this;
            java.util.Stack<com.caverock.androidsvg.SVGAndroidRenderer$RendererState> r0 = r5.stateStack
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r1 = r5.state
            r0.push(r1)
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = new com.caverock.androidsvg.SVGAndroidRenderer$RendererState
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r1 = r5.state
            r0.<init>(r1)
            r5.state = r0
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r5.state
            r5.updateStyleForElement(r0, r6)
            boolean r0 = r5.display()
            r1 = 0
            if (r0 == 0) goto L_0x0136
            boolean r0 = r5.visible()
            if (r0 != 0) goto L_0x0024
            goto L_0x0136
        L_0x0024:
            boolean r0 = r6 instanceof com.caverock.androidsvg.SVG.Use
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0081
            if (r7 != 0) goto L_0x0033
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r0 = "<use> elements inside a <clipPath> cannot reference another <use>"
            error(r0, r7)
        L_0x0033:
            r7 = r6
            com.caverock.androidsvg.SVG$Use r7 = (com.caverock.androidsvg.SVG.Use) r7
            com.caverock.androidsvg.SVG r0 = r6.document
            java.lang.String r4 = r7.href
            com.caverock.androidsvg.SVG$SvgObject r0 = r0.resolveIRI(r4)
            if (r0 != 0) goto L_0x0056
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r7 = r7.href
            r6[r3] = r7
            java.lang.String r7 = "Use reference '%s' not found"
            error(r7, r6)
            java.util.Stack<com.caverock.androidsvg.SVGAndroidRenderer$RendererState> r6 = r5.stateStack
            java.lang.Object r6 = r6.pop()
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = (com.caverock.androidsvg.SVGAndroidRenderer.RendererState) r6
            r5.state = r6
            return r1
        L_0x0056:
            boolean r2 = r0 instanceof com.caverock.androidsvg.SVG.SvgElement
            if (r2 != 0) goto L_0x0065
            java.util.Stack<com.caverock.androidsvg.SVGAndroidRenderer$RendererState> r6 = r5.stateStack
            java.lang.Object r6 = r6.pop()
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = (com.caverock.androidsvg.SVGAndroidRenderer.RendererState) r6
            r5.state = r6
            return r1
        L_0x0065:
            com.caverock.androidsvg.SVG$SvgElement r0 = (com.caverock.androidsvg.SVG.SvgElement) r0
            android.graphics.Path r0 = r5.objectToPath(r0, r3)
            if (r0 != 0) goto L_0x006e
            return r1
        L_0x006e:
            com.caverock.androidsvg.SVG$Box r1 = r7.boundingBox
            if (r1 != 0) goto L_0x0078
            com.caverock.androidsvg.SVG$Box r1 = r5.calculatePathBounds(r0)
            r7.boundingBox = r1
        L_0x0078:
            android.graphics.Matrix r7 = r7.transform
            if (r7 == 0) goto L_0x0104
            r0.transform(r7)
            goto L_0x0104
        L_0x0081:
            boolean r7 = r6 instanceof com.caverock.androidsvg.SVG.GraphicsElement
            if (r7 == 0) goto L_0x00e8
            r7 = r6
            com.caverock.androidsvg.SVG$GraphicsElement r7 = (com.caverock.androidsvg.SVG.GraphicsElement) r7
            boolean r0 = r6 instanceof com.caverock.androidsvg.SVG.Path
            if (r0 == 0) goto L_0x00a5
            r0 = r6
            com.caverock.androidsvg.SVG$Path r0 = (com.caverock.androidsvg.SVG.Path) r0
            com.caverock.androidsvg.SVGAndroidRenderer$PathConverter r2 = new com.caverock.androidsvg.SVGAndroidRenderer$PathConverter
            com.caverock.androidsvg.SVG$PathDefinition r0 = r0.f4668d
            r2.<init>(r0)
            android.graphics.Path r0 = r2.getPath()
            com.caverock.androidsvg.SVG$Box r2 = r6.boundingBox
            if (r2 != 0) goto L_0x00d6
            com.caverock.androidsvg.SVG$Box r2 = r5.calculatePathBounds(r0)
            r6.boundingBox = r2
            goto L_0x00d6
        L_0x00a5:
            boolean r0 = r6 instanceof com.caverock.androidsvg.SVG.Rect
            if (r0 == 0) goto L_0x00b1
            r0 = r6
            com.caverock.androidsvg.SVG$Rect r0 = (com.caverock.androidsvg.SVG.Rect) r0
            android.graphics.Path r0 = r5.makePathAndBoundingBox((com.caverock.androidsvg.SVG.Rect) r0)
            goto L_0x00d6
        L_0x00b1:
            boolean r0 = r6 instanceof com.caverock.androidsvg.SVG.Circle
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            com.caverock.androidsvg.SVG$Circle r0 = (com.caverock.androidsvg.SVG.Circle) r0
            android.graphics.Path r0 = r5.makePathAndBoundingBox((com.caverock.androidsvg.SVG.Circle) r0)
            goto L_0x00d6
        L_0x00bd:
            boolean r0 = r6 instanceof com.caverock.androidsvg.SVG.Ellipse
            if (r0 == 0) goto L_0x00c9
            r0 = r6
            com.caverock.androidsvg.SVG$Ellipse r0 = (com.caverock.androidsvg.SVG.Ellipse) r0
            android.graphics.Path r0 = r5.makePathAndBoundingBox((com.caverock.androidsvg.SVG.Ellipse) r0)
            goto L_0x00d6
        L_0x00c9:
            boolean r0 = r6 instanceof com.caverock.androidsvg.SVG.PolyLine
            if (r0 == 0) goto L_0x00d5
            r0 = r6
            com.caverock.androidsvg.SVG$PolyLine r0 = (com.caverock.androidsvg.SVG.PolyLine) r0
            android.graphics.Path r0 = r5.makePathAndBoundingBox((com.caverock.androidsvg.SVG.PolyLine) r0)
            goto L_0x00d6
        L_0x00d5:
            r0 = r1
        L_0x00d6:
            if (r0 != 0) goto L_0x00d9
            return r1
        L_0x00d9:
            com.caverock.androidsvg.SVG$Box r1 = r7.boundingBox
            if (r1 != 0) goto L_0x00e3
            com.caverock.androidsvg.SVG$Box r1 = r5.calculatePathBounds(r0)
            r7.boundingBox = r1
        L_0x00e3:
            android.graphics.Matrix r7 = r7.transform
            if (r7 == 0) goto L_0x00fd
            goto L_0x00fa
        L_0x00e8:
            boolean r7 = r6 instanceof com.caverock.androidsvg.SVG.Text
            if (r7 == 0) goto L_0x0124
            r7 = r6
            com.caverock.androidsvg.SVG$Text r7 = (com.caverock.androidsvg.SVG.Text) r7
            android.graphics.Path r0 = r5.makePathAndBoundingBox((com.caverock.androidsvg.SVG.Text) r7)
            if (r0 != 0) goto L_0x00f6
            return r1
        L_0x00f6:
            android.graphics.Matrix r7 = r7.transform
            if (r7 == 0) goto L_0x00fd
        L_0x00fa:
            r0.transform(r7)
        L_0x00fd:
            android.graphics.Path$FillType r7 = r5.getClipRuleFromState()
            r0.setFillType(r7)
        L_0x0104:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = r5.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            java.lang.String r7 = r7.clipPath
            if (r7 == 0) goto L_0x0119
            com.caverock.androidsvg.SVG$Box r7 = r6.boundingBox
            android.graphics.Path r6 = r5.calculateClipPath(r6, r7)
            if (r6 == 0) goto L_0x0119
            android.graphics.Path$Op r7 = android.graphics.Path.Op.INTERSECT
            r0.op(r6, r7)
        L_0x0119:
            java.util.Stack<com.caverock.androidsvg.SVGAndroidRenderer$RendererState> r6 = r5.stateStack
            java.lang.Object r6 = r6.pop()
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = (com.caverock.androidsvg.SVGAndroidRenderer.RendererState) r6
            r5.state = r6
            return r0
        L_0x0124:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r7[r3] = r6
            java.lang.String r6 = "Invalid %s element found in clipPath definition"
            error(r6, r7)
            return r1
        L_0x0136:
            java.util.Stack<com.caverock.androidsvg.SVGAndroidRenderer$RendererState> r6 = r5.stateStack
            java.lang.Object r6 = r6.pop()
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = (com.caverock.androidsvg.SVGAndroidRenderer.RendererState) r6
            r5.state = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.objectToPath(com.caverock.androidsvg.SVG$SvgElement, boolean):android.graphics.Path");
    }

    private void parentPop() {
        this.parentStack.pop();
        this.matrixStack.pop();
    }

    private void parentPush(SVG.SvgContainer svgContainer) {
        this.parentStack.push(svgContainer);
        this.matrixStack.push(this.canvas.getMatrix());
    }

    private void popLayer(SVG.SvgElement svgElement) {
        if (this.state.style.mask != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.canvas.saveLayer((RectF) null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.canvas.saveLayer((RectF) null, paint2, 31);
            SVG.Mask mask = (SVG.Mask) this.document.resolveIRI(this.state.style.mask);
            renderMask(mask, svgElement);
            this.canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.canvas.saveLayer((RectF) null, paint3, 31);
            renderMask(mask, svgElement);
            this.canvas.restore();
            this.canvas.restore();
        }
        statePop();
    }

    private void processTextChild(SVG.SvgObject svgObject, TextProcessor textProcessor) {
        float f;
        float f2;
        float f3;
        SVG.Style.TextAnchor anchorPosition;
        if (textProcessor.doTextContainer((SVG.TextContainer) svgObject)) {
            if (svgObject instanceof SVG.TextPath) {
                statePush();
                renderTextPath((SVG.TextPath) svgObject);
            } else {
                boolean z = true;
                if (svgObject instanceof SVG.TSpan) {
                    debug("TSpan render", new Object[0]);
                    statePush();
                    SVG.TSpan tSpan = (SVG.TSpan) svgObject;
                    updateStyleForElement(this.state, tSpan);
                    if (display()) {
                        List<SVG.Length> list = tSpan.f4689x;
                        if (list == null || list.size() <= 0) {
                            z = false;
                        }
                        boolean z2 = textProcessor instanceof PlainTextDrawer;
                        float f4 = 0.0f;
                        if (z2) {
                            float floatValueX = !z ? ((PlainTextDrawer) textProcessor).f4705x : tSpan.f4689x.get(0).floatValueX(this);
                            List<SVG.Length> list2 = tSpan.f4690y;
                            f2 = (list2 == null || list2.size() == 0) ? ((PlainTextDrawer) textProcessor).f4706y : tSpan.f4690y.get(0).floatValueY(this);
                            List<SVG.Length> list3 = tSpan.f4687dx;
                            f = (list3 == null || list3.size() == 0) ? 0.0f : tSpan.f4687dx.get(0).floatValueX(this);
                            List<SVG.Length> list4 = tSpan.f4688dy;
                            if (!(list4 == null || list4.size() == 0)) {
                                f4 = tSpan.f4688dy.get(0).floatValueY(this);
                            }
                            f3 = f4;
                            f4 = floatValueX;
                        } else {
                            f3 = 0.0f;
                            f2 = 0.0f;
                            f = 0.0f;
                        }
                        if (z && (anchorPosition = getAnchorPosition()) != SVG.Style.TextAnchor.Start) {
                            float calculateTextWidth = calculateTextWidth(tSpan);
                            if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                                calculateTextWidth /= 2.0f;
                            }
                            f4 -= calculateTextWidth;
                        }
                        checkForGradientsAndPatterns((SVG.SvgElement) tSpan.getTextRoot());
                        if (z2) {
                            PlainTextDrawer plainTextDrawer = (PlainTextDrawer) textProcessor;
                            plainTextDrawer.f4705x = f4 + f;
                            plainTextDrawer.f4706y = f2 + f3;
                        }
                        boolean pushLayer = pushLayer();
                        enumerateTextSpans(tSpan, textProcessor);
                        if (pushLayer) {
                            popLayer(tSpan);
                        }
                    }
                } else if (svgObject instanceof SVG.TRef) {
                    statePush();
                    SVG.TRef tRef = (SVG.TRef) svgObject;
                    updateStyleForElement(this.state, tRef);
                    if (display()) {
                        checkForGradientsAndPatterns((SVG.SvgElement) tRef.getTextRoot());
                        SVG.SvgObject resolveIRI = svgObject.document.resolveIRI(tRef.href);
                        if (resolveIRI == null || !(resolveIRI instanceof SVG.TextContainer)) {
                            error("Tref reference '%s' not found", tRef.href);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            extractRawText((SVG.TextContainer) resolveIRI, sb);
                            if (sb.length() > 0) {
                                textProcessor.processText(sb.toString());
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            statePop();
        }
    }

    private boolean pushLayer() {
        SVG.SvgObject resolveIRI;
        if (!requiresCompositing()) {
            return false;
        }
        this.canvas.saveLayerAlpha((RectF) null, clamp255(this.state.style.opacity.floatValue()), 31);
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
        String str = this.state.style.mask;
        if (str != null && ((resolveIRI = this.document.resolveIRI(str)) == null || !(resolveIRI instanceof SVG.Mask))) {
            error("Mask reference '%s' not found", this.state.style.mask);
            this.state.style.mask = null;
        }
        return true;
    }

    private MarkerVector realignMarkerMid(MarkerVector markerVector, MarkerVector markerVector2, MarkerVector markerVector3) {
        float dotProduct = dotProduct(markerVector2.f4701dx, markerVector2.f4702dy, markerVector2.f4703x - markerVector.f4703x, markerVector2.f4704y - markerVector.f4704y);
        if (dotProduct == 0.0f) {
            dotProduct = dotProduct(markerVector2.f4701dx, markerVector2.f4702dy, markerVector3.f4703x - markerVector2.f4703x, markerVector3.f4704y - markerVector2.f4704y);
        }
        int i = (dotProduct > 0.0f ? 1 : (dotProduct == 0.0f ? 0 : -1));
        if (i > 0) {
            return markerVector2;
        }
        if (i == 0 && (markerVector2.f4701dx > 0.0f || markerVector2.f4702dy >= 0.0f)) {
            return markerVector2;
        }
        markerVector2.f4701dx = -markerVector2.f4701dx;
        markerVector2.f4702dy = -markerVector2.f4702dy;
        return markerVector2;
    }

    private void render(SVG.Circle circle) {
        debug("Circle render", new Object[0]);
        SVG.Length length = circle.f4655r;
        if (length != null && !length.isZero()) {
            updateStyleForElement(this.state, circle);
            if (display() && visible()) {
                Matrix matrix = circle.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(circle);
                updateParentBoundingBox(circle);
                checkForGradientsAndPatterns(circle);
                checkForClipPath(circle);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(circle, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(circle);
                }
            }
        }
    }

    private void render(SVG.Ellipse ellipse) {
        debug("Ellipse render", new Object[0]);
        SVG.Length length = ellipse.f4658rx;
        if (length != null && ellipse.f4659ry != null && !length.isZero() && !ellipse.f4659ry.isZero()) {
            updateStyleForElement(this.state, ellipse);
            if (display() && visible()) {
                Matrix matrix = ellipse.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(ellipse);
                updateParentBoundingBox(ellipse);
                checkForGradientsAndPatterns(ellipse);
                checkForClipPath(ellipse);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(ellipse, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(ellipse);
                }
            }
        }
    }

    private void render(SVG.Group group) {
        debug("Group render", new Object[0]);
        updateStyleForElement(this.state, group);
        if (display()) {
            Matrix matrix = group.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(group);
            boolean pushLayer = pushLayer();
            renderChildren(group, true);
            if (pushLayer) {
                popLayer(group);
            }
            updateParentBoundingBox(group);
        }
    }

    private void render(SVG.Image image) {
        SVG.Length length;
        int i = 0;
        debug("Image render", new Object[0]);
        SVG.Length length2 = image.width;
        if (length2 != null && !length2.isZero() && (length = image.height) != null && !length.isZero() && image.href != null) {
            PreserveAspectRatio preserveAspectRatio = image.preserveAspectRatio;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
            }
            Bitmap checkForImageDataURL = checkForImageDataURL(image.href);
            if (checkForImageDataURL == null) {
                SVGExternalFileResolver fileResolver = SVG.getFileResolver();
                if (fileResolver != null) {
                    checkForImageDataURL = fileResolver.resolveImage(image.href);
                } else {
                    return;
                }
            }
            if (checkForImageDataURL == null) {
                error("Could not locate image '%s'", image.href);
                return;
            }
            SVG.Box box = new SVG.Box(0.0f, 0.0f, (float) checkForImageDataURL.getWidth(), (float) checkForImageDataURL.getHeight());
            updateStyleForElement(this.state, image);
            if (display() && visible()) {
                Matrix matrix = image.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                SVG.Length length3 = image.f4660x;
                float floatValueX = length3 != null ? length3.floatValueX(this) : 0.0f;
                SVG.Length length4 = image.f4661y;
                this.state.viewPort = new SVG.Box(floatValueX, length4 != null ? length4.floatValueY(this) : 0.0f, image.width.floatValueX(this), image.height.floatValueX(this));
                if (!this.state.style.overflow.booleanValue()) {
                    SVG.Box box2 = this.state.viewPort;
                    setClipRect(box2.minX, box2.minY, box2.width, box2.height);
                }
                image.boundingBox = this.state.viewPort;
                updateParentBoundingBox(image);
                checkForClipPath(image);
                boolean pushLayer = pushLayer();
                viewportFill();
                this.canvas.save();
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box, preserveAspectRatio));
                if (this.state.style.imageRendering != SVG.Style.RenderQuality.optimizeSpeed) {
                    i = 2;
                }
                this.canvas.drawBitmap(checkForImageDataURL, 0.0f, 0.0f, new Paint(i));
                this.canvas.restore();
                if (pushLayer) {
                    popLayer(image);
                }
            }
        }
    }

    private void render(SVG.Line line) {
        debug("Line render", new Object[0]);
        updateStyleForElement(this.state, line);
        if (display() && visible() && this.state.hasStroke) {
            Matrix matrix = line.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            Path makePathAndBoundingBox = makePathAndBoundingBox(line);
            updateParentBoundingBox(line);
            checkForGradientsAndPatterns(line);
            checkForClipPath(line);
            boolean pushLayer = pushLayer();
            doStroke(makePathAndBoundingBox);
            renderMarkers(line);
            if (pushLayer) {
                popLayer(line);
            }
        }
    }

    private void render(SVG.Path path) {
        debug("Path render", new Object[0]);
        if (path.f4668d != null) {
            updateStyleForElement(this.state, path);
            if (display() && visible()) {
                RendererState rendererState = this.state;
                if (rendererState.hasStroke || rendererState.hasFill) {
                    Matrix matrix = path.transform;
                    if (matrix != null) {
                        this.canvas.concat(matrix);
                    }
                    Path path2 = new PathConverter(path.f4668d).getPath();
                    if (path.boundingBox == null) {
                        path.boundingBox = calculatePathBounds(path2);
                    }
                    updateParentBoundingBox(path);
                    checkForGradientsAndPatterns(path);
                    checkForClipPath(path);
                    boolean pushLayer = pushLayer();
                    if (this.state.hasFill) {
                        path2.setFillType(getFillTypeFromState());
                        doFilledPath(path, path2);
                    }
                    if (this.state.hasStroke) {
                        doStroke(path2);
                    }
                    renderMarkers(path);
                    if (pushLayer) {
                        popLayer(path);
                    }
                }
            }
        }
    }

    private void render(SVG.PolyLine polyLine) {
        debug("PolyLine render", new Object[0]);
        updateStyleForElement(this.state, polyLine);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polyLine.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                if (polyLine.points.length >= 2) {
                    Path makePathAndBoundingBox = makePathAndBoundingBox(polyLine);
                    updateParentBoundingBox(polyLine);
                    makePathAndBoundingBox.setFillType(getFillTypeFromState());
                    checkForGradientsAndPatterns(polyLine);
                    checkForClipPath(polyLine);
                    boolean pushLayer = pushLayer();
                    if (this.state.hasFill) {
                        doFilledPath(polyLine, makePathAndBoundingBox);
                    }
                    if (this.state.hasStroke) {
                        doStroke(makePathAndBoundingBox);
                    }
                    renderMarkers(polyLine);
                    if (pushLayer) {
                        popLayer(polyLine);
                    }
                }
            }
        }
    }

    private void render(SVG.Polygon polygon) {
        debug("Polygon render", new Object[0]);
        updateStyleForElement(this.state, polygon);
        if (display() && visible()) {
            RendererState rendererState = this.state;
            if (rendererState.hasStroke || rendererState.hasFill) {
                Matrix matrix = polygon.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                if (polygon.points.length >= 2) {
                    Path makePathAndBoundingBox = makePathAndBoundingBox((SVG.PolyLine) polygon);
                    updateParentBoundingBox(polygon);
                    checkForGradientsAndPatterns(polygon);
                    checkForClipPath(polygon);
                    boolean pushLayer = pushLayer();
                    if (this.state.hasFill) {
                        doFilledPath(polygon, makePathAndBoundingBox);
                    }
                    if (this.state.hasStroke) {
                        doStroke(makePathAndBoundingBox);
                    }
                    renderMarkers(polygon);
                    if (pushLayer) {
                        popLayer(polygon);
                    }
                }
            }
        }
    }

    private void render(SVG.Rect rect) {
        debug("Rect render", new Object[0]);
        SVG.Length length = rect.width;
        if (length != null && rect.height != null && !length.isZero() && !rect.height.isZero()) {
            updateStyleForElement(this.state, rect);
            if (display() && visible()) {
                Matrix matrix = rect.transform;
                if (matrix != null) {
                    this.canvas.concat(matrix);
                }
                Path makePathAndBoundingBox = makePathAndBoundingBox(rect);
                updateParentBoundingBox(rect);
                checkForGradientsAndPatterns(rect);
                checkForClipPath(rect);
                boolean pushLayer = pushLayer();
                if (this.state.hasFill) {
                    doFilledPath(rect, makePathAndBoundingBox);
                }
                if (this.state.hasStroke) {
                    doStroke(makePathAndBoundingBox);
                }
                if (pushLayer) {
                    popLayer(rect);
                }
            }
        }
    }

    private void render(SVG.Svg svg) {
        render(svg, makeViewPort(svg.f4675x, svg.f4676y, svg.width, svg.height), svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box) {
        render(svg, box, svg.viewBox, svg.preserveAspectRatio);
    }

    private void render(SVG.Svg svg, SVG.Box box, SVG.Box box2, PreserveAspectRatio preserveAspectRatio) {
        debug("Svg render", new Object[0]);
        if (box.width != 0.0f && box.height != 0.0f) {
            if (preserveAspectRatio == null && (preserveAspectRatio = svg.preserveAspectRatio) == null) {
                preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
            }
            updateStyleForElement(this.state, svg);
            if (display()) {
                RendererState rendererState = this.state;
                rendererState.viewPort = box;
                if (!rendererState.style.overflow.booleanValue()) {
                    SVG.Box box3 = this.state.viewPort;
                    setClipRect(box3.minX, box3.minY, box3.width, box3.height);
                }
                checkForClipPath(svg, this.state.viewPort);
                if (box2 != null) {
                    this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box2, preserveAspectRatio));
                    this.state.viewBox = svg.viewBox;
                } else {
                    Canvas canvas2 = this.canvas;
                    SVG.Box box4 = this.state.viewPort;
                    canvas2.translate(box4.minX, box4.minY);
                }
                boolean pushLayer = pushLayer();
                viewportFill();
                renderChildren(svg, true);
                if (pushLayer) {
                    popLayer(svg);
                }
                updateParentBoundingBox(svg);
            }
        }
    }

    private void render(SVG.SvgObject svgObject) {
        if (!(svgObject instanceof SVG.NotDirectlyRendered)) {
            statePush();
            checkXMLSpaceAttribute(svgObject);
            if (svgObject instanceof SVG.Svg) {
                render((SVG.Svg) svgObject);
            } else if (svgObject instanceof SVG.Use) {
                render((SVG.Use) svgObject);
            } else if (svgObject instanceof SVG.Switch) {
                render((SVG.Switch) svgObject);
            } else if (svgObject instanceof SVG.Group) {
                render((SVG.Group) svgObject);
            } else if (svgObject instanceof SVG.Image) {
                render((SVG.Image) svgObject);
            } else if (svgObject instanceof SVG.Path) {
                render((SVG.Path) svgObject);
            } else if (svgObject instanceof SVG.Rect) {
                render((SVG.Rect) svgObject);
            } else if (svgObject instanceof SVG.Circle) {
                render((SVG.Circle) svgObject);
            } else if (svgObject instanceof SVG.Ellipse) {
                render((SVG.Ellipse) svgObject);
            } else if (svgObject instanceof SVG.Line) {
                render((SVG.Line) svgObject);
            } else if (svgObject instanceof SVG.Polygon) {
                render((SVG.Polygon) svgObject);
            } else if (svgObject instanceof SVG.PolyLine) {
                render((SVG.PolyLine) svgObject);
            } else if (svgObject instanceof SVG.Text) {
                render((SVG.Text) svgObject);
            }
            statePop();
        }
    }

    private void render(SVG.Switch switchR) {
        debug("Switch render", new Object[0]);
        updateStyleForElement(this.state, switchR);
        if (display()) {
            Matrix matrix = switchR.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            checkForClipPath(switchR);
            boolean pushLayer = pushLayer();
            renderSwitchChild(switchR);
            if (pushLayer) {
                popLayer(switchR);
            }
            updateParentBoundingBox(switchR);
        }
    }

    private void render(SVG.Symbol symbol, SVG.Box box) {
        debug("Symbol render", new Object[0]);
        if (box.width != 0.0f && box.height != 0.0f) {
            PreserveAspectRatio preserveAspectRatio = symbol.preserveAspectRatio;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.LETTERBOX;
            }
            updateStyleForElement(this.state, symbol);
            RendererState rendererState = this.state;
            rendererState.viewPort = box;
            if (!rendererState.style.overflow.booleanValue()) {
                SVG.Box box2 = this.state.viewPort;
                setClipRect(box2.minX, box2.minY, box2.width, box2.height);
            }
            SVG.Box box3 = symbol.viewBox;
            if (box3 != null) {
                this.canvas.concat(calculateViewBoxTransform(this.state.viewPort, box3, preserveAspectRatio));
                this.state.viewBox = symbol.viewBox;
            } else {
                Canvas canvas2 = this.canvas;
                SVG.Box box4 = this.state.viewPort;
                canvas2.translate(box4.minX, box4.minY);
            }
            boolean pushLayer = pushLayer();
            renderChildren(symbol, true);
            if (pushLayer) {
                popLayer(symbol);
            }
            updateParentBoundingBox(symbol);
        }
    }

    private void render(SVG.Text text) {
        debug("Text render", new Object[0]);
        updateStyleForElement(this.state, text);
        if (display()) {
            Matrix matrix = text.transform;
            if (matrix != null) {
                this.canvas.concat(matrix);
            }
            List<SVG.Length> list = text.f4689x;
            float f = 0.0f;
            float floatValueX = (list == null || list.size() == 0) ? 0.0f : text.f4689x.get(0).floatValueX(this);
            List<SVG.Length> list2 = text.f4690y;
            float floatValueY = (list2 == null || list2.size() == 0) ? 0.0f : text.f4690y.get(0).floatValueY(this);
            List<SVG.Length> list3 = text.f4687dx;
            float floatValueX2 = (list3 == null || list3.size() == 0) ? 0.0f : text.f4687dx.get(0).floatValueX(this);
            List<SVG.Length> list4 = text.f4688dy;
            if (!(list4 == null || list4.size() == 0)) {
                f = text.f4688dy.get(0).floatValueY(this);
            }
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(text);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValueX -= calculateTextWidth;
            }
            if (text.boundingBox == null) {
                TextBoundsCalculator textBoundsCalculator = new TextBoundsCalculator(floatValueX, floatValueY);
                enumerateTextSpans(text, textBoundsCalculator);
                RectF rectF = textBoundsCalculator.bbox;
                text.boundingBox = new SVG.Box(rectF.left, rectF.top, rectF.width(), textBoundsCalculator.bbox.height());
            }
            updateParentBoundingBox(text);
            checkForGradientsAndPatterns(text);
            checkForClipPath(text);
            boolean pushLayer = pushLayer();
            enumerateTextSpans(text, new PlainTextDrawer(floatValueX + floatValueX2, floatValueY + f));
            if (pushLayer) {
                popLayer(text);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void render(com.caverock.androidsvg.SVG.Use r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Use render"
            debug(r2, r1)
            com.caverock.androidsvg.SVG$Length r1 = r8.width
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.isZero()
            if (r1 != 0) goto L_0x001c
        L_0x0012:
            com.caverock.androidsvg.SVG$Length r1 = r8.height
            if (r1 == 0) goto L_0x001d
            boolean r1 = r1.isZero()
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r1 = r7.state
            r7.updateStyleForElement(r1, r8)
            boolean r1 = r7.display()
            if (r1 != 0) goto L_0x0029
            return
        L_0x0029:
            com.caverock.androidsvg.SVG r1 = r8.document
            java.lang.String r2 = r8.href
            com.caverock.androidsvg.SVG$SvgObject r1 = r1.resolveIRI(r2)
            if (r1 != 0) goto L_0x0040
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = r8.href
            r1[r0] = r8
            java.lang.String r8 = "Use reference '%s' not found"
            error(r8, r1)
            return
        L_0x0040:
            android.graphics.Matrix r0 = r8.transform
            if (r0 == 0) goto L_0x0049
            android.graphics.Canvas r2 = r7.canvas
            r2.concat(r0)
        L_0x0049:
            com.caverock.androidsvg.SVG$Length r0 = r8.f4699x
            r2 = 0
            if (r0 == 0) goto L_0x0053
            float r0 = r0.floatValueX(r7)
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            com.caverock.androidsvg.SVG$Length r3 = r8.f4700y
            if (r3 == 0) goto L_0x005c
            float r2 = r3.floatValueY(r7)
        L_0x005c:
            android.graphics.Canvas r3 = r7.canvas
            r3.translate(r0, r2)
            r7.checkForClipPath(r8)
            boolean r0 = r7.pushLayer()
            r7.parentPush(r8)
            boolean r2 = r1 instanceof com.caverock.androidsvg.SVG.Svg
            r3 = 0
            if (r2 == 0) goto L_0x0084
            com.caverock.androidsvg.SVG$Svg r1 = (com.caverock.androidsvg.SVG.Svg) r1
            com.caverock.androidsvg.SVG$Length r2 = r8.width
            com.caverock.androidsvg.SVG$Length r4 = r8.height
            com.caverock.androidsvg.SVG$Box r2 = r7.makeViewPort(r3, r3, r2, r4)
            r7.statePush()
            r7.render((com.caverock.androidsvg.SVG.Svg) r1, (com.caverock.androidsvg.SVG.Box) r2)
        L_0x0080:
            r7.statePop()
            goto L_0x00b2
        L_0x0084:
            boolean r2 = r1 instanceof com.caverock.androidsvg.SVG.Symbol
            if (r2 == 0) goto L_0x00af
            com.caverock.androidsvg.SVG$Length r2 = r8.width
            r4 = 1120403456(0x42c80000, float:100.0)
            if (r2 == 0) goto L_0x008f
            goto L_0x0096
        L_0x008f:
            com.caverock.androidsvg.SVG$Length r2 = new com.caverock.androidsvg.SVG$Length
            com.caverock.androidsvg.SVG$Unit r5 = com.caverock.androidsvg.SVG.Unit.percent
            r2.<init>(r4, r5)
        L_0x0096:
            com.caverock.androidsvg.SVG$Length r5 = r8.height
            if (r5 == 0) goto L_0x009b
            goto L_0x00a2
        L_0x009b:
            com.caverock.androidsvg.SVG$Length r5 = new com.caverock.androidsvg.SVG$Length
            com.caverock.androidsvg.SVG$Unit r6 = com.caverock.androidsvg.SVG.Unit.percent
            r5.<init>(r4, r6)
        L_0x00a2:
            com.caverock.androidsvg.SVG$Box r2 = r7.makeViewPort(r3, r3, r2, r5)
            r7.statePush()
            com.caverock.androidsvg.SVG$Symbol r1 = (com.caverock.androidsvg.SVG.Symbol) r1
            r7.render((com.caverock.androidsvg.SVG.Symbol) r1, (com.caverock.androidsvg.SVG.Box) r2)
            goto L_0x0080
        L_0x00af:
            r7.render((com.caverock.androidsvg.SVG.SvgObject) r1)
        L_0x00b2:
            r7.parentPop()
            if (r0 == 0) goto L_0x00ba
            r7.popLayer(r8)
        L_0x00ba:
            r7.updateParentBoundingBox(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.render(com.caverock.androidsvg.SVG$Use):void");
    }

    private void renderChildren(SVG.SvgContainer svgContainer, boolean z) {
        if (z) {
            parentPush(svgContainer);
        }
        for (SVG.SvgObject render : svgContainer.getChildren()) {
            render(render);
        }
        if (z) {
            parentPop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        r0 = 0.0f - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e6, code lost:
        r7 = com.caverock.androidsvg.SVGAndroidRenderer.C13311.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment[r7.getAlignment().ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f3, code lost:
        if (r7 == 2) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f6, code lost:
        if (r7 == 3) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        if (r7 == 5) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        if (r7 == 6) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ff, code lost:
        if (r7 == 7) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0103, code lost:
        if (r7 == 8) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        r12 = r4 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0109, code lost:
        r12 = (r4 - r12) / 2.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010c, code lost:
        r1 = 0.0f - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0117, code lost:
        if (r10.state.style.overflow.booleanValue() != false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0119, code lost:
        setClipRect(r0, r1, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011c, code lost:
        r3.reset();
        r3.preScale(r6, r5);
        r10.canvas.concat(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void renderMarker(com.caverock.androidsvg.SVG.Marker r11, com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector r12) {
        /*
            r10 = this;
            r10.statePush()
            java.lang.Float r0 = r11.orient
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x002e
            float r0 = r12.f4701dx
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            float r0 = r12.f4702dy
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
        L_0x001e:
            float r0 = r12.f4702dy
            double r2 = (double) r0
            float r0 = r12.f4701dx
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            double r2 = java.lang.Math.toDegrees(r2)
            float r0 = (float) r2
            goto L_0x0036
        L_0x002e:
            java.lang.Float r0 = r11.orient
            float r0 = r0.floatValue()
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            boolean r2 = r11.markerUnitsAreUser
            if (r2 == 0) goto L_0x003d
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0049
        L_0x003d:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r2 = r10.state
            com.caverock.androidsvg.SVG$Style r2 = r2.style
            com.caverock.androidsvg.SVG$Length r2 = r2.strokeWidth
            float r3 = r10.dpi
            float r2 = r2.floatValue((float) r3)
        L_0x0049:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r3 = r10.findInheritFromAncestorState(r11)
            r10.state = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            float r4 = r12.f4703x
            float r12 = r12.f4704y
            r3.preTranslate(r4, r12)
            r3.preRotate(r0)
            r3.preScale(r2, r2)
            com.caverock.androidsvg.SVG$Length r12 = r11.refX
            if (r12 == 0) goto L_0x006a
            float r12 = r12.floatValueX(r10)
            goto L_0x006b
        L_0x006a:
            r12 = r1
        L_0x006b:
            com.caverock.androidsvg.SVG$Length r0 = r11.refY
            if (r0 == 0) goto L_0x0074
            float r0 = r0.floatValueY(r10)
            goto L_0x0075
        L_0x0074:
            r0 = r1
        L_0x0075:
            com.caverock.androidsvg.SVG$Length r2 = r11.markerWidth
            r4 = 1077936128(0x40400000, float:3.0)
            if (r2 == 0) goto L_0x0080
            float r2 = r2.floatValueX(r10)
            goto L_0x0081
        L_0x0080:
            r2 = r4
        L_0x0081:
            com.caverock.androidsvg.SVG$Length r5 = r11.markerHeight
            if (r5 == 0) goto L_0x0089
            float r4 = r5.floatValueY(r10)
        L_0x0089:
            com.caverock.androidsvg.SVG$Box r5 = r11.viewBox
            if (r5 == 0) goto L_0x0128
            float r6 = r5.width
            float r6 = r2 / r6
            float r5 = r5.height
            float r5 = r4 / r5
            com.caverock.androidsvg.PreserveAspectRatio r7 = r11.preserveAspectRatio
            if (r7 == 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            com.caverock.androidsvg.PreserveAspectRatio r7 = com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX
        L_0x009c:
            com.caverock.androidsvg.PreserveAspectRatio r8 = com.caverock.androidsvg.PreserveAspectRatio.STRETCH
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00b7
            com.caverock.androidsvg.PreserveAspectRatio$Scale r8 = r7.getScale()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r9 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r8 != r9) goto L_0x00b1
            float r5 = java.lang.Math.max(r6, r5)
            goto L_0x00b5
        L_0x00b1:
            float r5 = java.lang.Math.min(r6, r5)
        L_0x00b5:
            r6 = r5
            r5 = r6
        L_0x00b7:
            float r12 = -r12
            float r12 = r12 * r6
            float r0 = -r0
            float r0 = r0 * r5
            r3.preTranslate(r12, r0)
            android.graphics.Canvas r12 = r10.canvas
            r12.concat(r3)
            com.caverock.androidsvg.SVG$Box r12 = r11.viewBox
            float r0 = r12.width
            float r0 = r0 * r6
            float r12 = r12.height
            float r12 = r12 * r5
            int[] r8 = com.caverock.androidsvg.SVGAndroidRenderer.C13311.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r9 = r7.getAlignment()
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 1073741824(0x40000000, float:2.0)
            switch(r8) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00de;
                case 5: goto L_0x00de;
                case 6: goto L_0x00de;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            r0 = r1
            goto L_0x00e6
        L_0x00de:
            float r0 = r2 - r0
            goto L_0x00e4
        L_0x00e1:
            float r0 = r2 - r0
            float r0 = r0 / r9
        L_0x00e4:
            float r0 = r1 - r0
        L_0x00e6:
            int[] r8 = com.caverock.androidsvg.SVGAndroidRenderer.C13311.$SwitchMap$com$caverock$androidsvg$PreserveAspectRatio$Alignment
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r7.getAlignment()
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r8 = 2
            if (r7 == r8) goto L_0x0109
            r8 = 3
            if (r7 == r8) goto L_0x0106
            r8 = 5
            if (r7 == r8) goto L_0x0109
            r8 = 6
            if (r7 == r8) goto L_0x0106
            r8 = 7
            if (r7 == r8) goto L_0x0109
            r8 = 8
            if (r7 == r8) goto L_0x0106
            goto L_0x010d
        L_0x0106:
            float r12 = r4 - r12
            goto L_0x010c
        L_0x0109:
            float r12 = r4 - r12
            float r12 = r12 / r9
        L_0x010c:
            float r1 = r1 - r12
        L_0x010d:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r12 = r10.state
            com.caverock.androidsvg.SVG$Style r12 = r12.style
            java.lang.Boolean r12 = r12.overflow
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x011c
            r10.setClipRect(r0, r1, r2, r4)
        L_0x011c:
            r3.reset()
            r3.preScale(r6, r5)
            android.graphics.Canvas r12 = r10.canvas
            r12.concat(r3)
            goto L_0x0141
        L_0x0128:
            float r12 = -r12
            float r0 = -r0
            r3.preTranslate(r12, r0)
            android.graphics.Canvas r12 = r10.canvas
            r12.concat(r3)
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r12 = r10.state
            com.caverock.androidsvg.SVG$Style r12 = r12.style
            java.lang.Boolean r12 = r12.overflow
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0141
            r10.setClipRect(r1, r1, r2, r4)
        L_0x0141:
            boolean r12 = r10.pushLayer()
            r0 = 0
            r10.renderChildren(r11, r0)
            if (r12 == 0) goto L_0x014e
            r10.popLayer(r11)
        L_0x014e:
            r10.statePop()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.renderMarker(com.caverock.androidsvg.SVG$Marker, com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void renderMarkers(com.caverock.androidsvg.SVG.GraphicsElement r10) {
        /*
            r9 = this;
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r9.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r1 = r0.markerStart
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = r0.markerMid
            if (r1 != 0) goto L_0x0011
            java.lang.String r0 = r0.markerEnd
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r0 = r9.state
            com.caverock.androidsvg.SVG$Style r0 = r0.style
            java.lang.String r0 = r0.markerStart
            java.lang.String r1 = "Marker reference '%s' not found"
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0036
            com.caverock.androidsvg.SVG r5 = r10.document
            com.caverock.androidsvg.SVG$SvgObject r0 = r5.resolveIRI(r0)
            if (r0 == 0) goto L_0x0029
            com.caverock.androidsvg.SVG$Marker r0 = (com.caverock.androidsvg.SVG.Marker) r0
            goto L_0x0037
        L_0x0029:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r5 = r9.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerStart
            r0[r3] = r5
            error(r1, r0)
        L_0x0036:
            r0 = r2
        L_0x0037:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r5 = r9.state
            com.caverock.androidsvg.SVG$Style r5 = r5.style
            java.lang.String r5 = r5.markerMid
            if (r5 == 0) goto L_0x0057
            com.caverock.androidsvg.SVG r6 = r10.document
            com.caverock.androidsvg.SVG$SvgObject r5 = r6.resolveIRI(r5)
            if (r5 == 0) goto L_0x004a
            com.caverock.androidsvg.SVG$Marker r5 = (com.caverock.androidsvg.SVG.Marker) r5
            goto L_0x0058
        L_0x004a:
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = r9.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerMid
            r5[r3] = r6
            error(r1, r5)
        L_0x0057:
            r5 = r2
        L_0x0058:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r6 = r9.state
            com.caverock.androidsvg.SVG$Style r6 = r6.style
            java.lang.String r6 = r6.markerEnd
            if (r6 == 0) goto L_0x0079
            com.caverock.androidsvg.SVG r7 = r10.document
            com.caverock.androidsvg.SVG$SvgObject r6 = r7.resolveIRI(r6)
            if (r6 == 0) goto L_0x006c
            r1 = r6
            com.caverock.androidsvg.SVG$Marker r1 = (com.caverock.androidsvg.SVG.Marker) r1
            goto L_0x007a
        L_0x006c:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = r9.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            java.lang.String r7 = r7.markerEnd
            r6[r3] = r7
            error(r1, r6)
        L_0x0079:
            r1 = r2
        L_0x007a:
            boolean r6 = r10 instanceof com.caverock.androidsvg.SVG.Path
            if (r6 == 0) goto L_0x008c
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerPositionCalculator r6 = new com.caverock.androidsvg.SVGAndroidRenderer$MarkerPositionCalculator
            com.caverock.androidsvg.SVG$Path r10 = (com.caverock.androidsvg.SVG.Path) r10
            com.caverock.androidsvg.SVG$PathDefinition r10 = r10.f4668d
            r6.<init>(r10)
            java.util.List r10 = r6.getMarkers()
            goto L_0x009d
        L_0x008c:
            boolean r6 = r10 instanceof com.caverock.androidsvg.SVG.Line
            if (r6 == 0) goto L_0x0097
            com.caverock.androidsvg.SVG$Line r10 = (com.caverock.androidsvg.SVG.Line) r10
            java.util.List r10 = r9.calculateMarkerPositions((com.caverock.androidsvg.SVG.Line) r10)
            goto L_0x009d
        L_0x0097:
            com.caverock.androidsvg.SVG$PolyLine r10 = (com.caverock.androidsvg.SVG.PolyLine) r10
            java.util.List r10 = r9.calculateMarkerPositions((com.caverock.androidsvg.SVG.PolyLine) r10)
        L_0x009d:
            if (r10 != 0) goto L_0x00a0
            return
        L_0x00a0:
            int r6 = r10.size()
            if (r6 != 0) goto L_0x00a7
            return
        L_0x00a7:
            com.caverock.androidsvg.SVGAndroidRenderer$RendererState r7 = r9.state
            com.caverock.androidsvg.SVG$Style r7 = r7.style
            r7.markerEnd = r2
            r7.markerMid = r2
            r7.markerStart = r2
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r2 = r10.get(r3)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r2 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r2
            r9.renderMarker(r0, r2)
        L_0x00bc:
            if (r5 == 0) goto L_0x00ec
            int r0 = r10.size()
            r2 = 2
            if (r0 <= r2) goto L_0x00ec
            java.lang.Object r0 = r10.get(r3)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r0 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r0
            java.lang.Object r2 = r10.get(r4)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r2 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r2
            r3 = r0
            r0 = r4
        L_0x00d3:
            int r7 = r6 + -1
            if (r0 >= r7) goto L_0x00ec
            int r0 = r0 + 1
            java.lang.Object r7 = r10.get(r0)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r7 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r7
            boolean r8 = r2.isAmbiguous
            if (r8 == 0) goto L_0x00e6
            r9.realignMarkerMid(r3, r2, r7)
        L_0x00e6:
            r9.renderMarker(r5, r2)
            r3 = r2
            r2 = r7
            goto L_0x00d3
        L_0x00ec:
            if (r1 == 0) goto L_0x00f8
            int r6 = r6 - r4
            java.lang.Object r10 = r10.get(r6)
            com.caverock.androidsvg.SVGAndroidRenderer$MarkerVector r10 = (com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) r10
            r9.renderMarker(r1, r10)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGAndroidRenderer.renderMarkers(com.caverock.androidsvg.SVG$GraphicsElement):void");
    }

    private void renderMask(SVG.Mask mask, SVG.SvgElement svgElement) {
        float f;
        float f2;
        debug("Mask render", new Object[0]);
        Boolean bool = mask.maskUnitsAreUser;
        boolean z = true;
        if (bool != null && bool.booleanValue()) {
            SVG.Length length = mask.width;
            f2 = length != null ? length.floatValueX(this) : svgElement.boundingBox.width;
            SVG.Length length2 = mask.height;
            f = length2 != null ? length2.floatValueY(this) : svgElement.boundingBox.height;
        } else {
            SVG.Length length3 = mask.width;
            float f3 = 1.2f;
            float floatValue = length3 != null ? length3.floatValue(this, 1.0f) : 1.2f;
            SVG.Length length4 = mask.height;
            if (length4 != null) {
                f3 = length4.floatValue(this, 1.0f);
            }
            SVG.Box box = svgElement.boundingBox;
            f2 = floatValue * box.width;
            f = f3 * box.height;
        }
        if (f2 != 0.0f && f != 0.0f) {
            statePush();
            this.state = findInheritFromAncestorState(mask);
            this.state.style.opacity = Float.valueOf(1.0f);
            Boolean bool2 = mask.maskContentUnitsAreUser;
            if (bool2 != null && !bool2.booleanValue()) {
                z = false;
            }
            if (!z) {
                Canvas canvas2 = this.canvas;
                SVG.Box box2 = svgElement.boundingBox;
                canvas2.translate(box2.minX, box2.minY);
                Canvas canvas3 = this.canvas;
                SVG.Box box3 = svgElement.boundingBox;
                canvas3.scale(box3.width, box3.height);
            }
            renderChildren(mask, false);
            statePop();
        }
    }

    private void renderSwitchChild(SVG.Switch switchR) {
        Set<String> systemLanguage;
        String language = Locale.getDefault().getLanguage();
        SVGExternalFileResolver fileResolver = SVG.getFileResolver();
        for (SVG.SvgObject next : switchR.getChildren()) {
            if (next instanceof SVG.SvgConditional) {
                SVG.SvgConditional svgConditional = (SVG.SvgConditional) next;
                if (svgConditional.getRequiredExtensions() == null && ((systemLanguage = svgConditional.getSystemLanguage()) == null || (!systemLanguage.isEmpty() && systemLanguage.contains(language)))) {
                    Set<String> requiredFeatures = svgConditional.getRequiredFeatures();
                    if (requiredFeatures != null) {
                        if (supportedFeatures == null) {
                            initialiseSupportedFeaturesMap();
                        }
                        if (requiredFeatures.isEmpty()) {
                            continue;
                        } else if (!supportedFeatures.containsAll(requiredFeatures)) {
                            continue;
                        }
                    }
                    Set<String> requiredFormats = svgConditional.getRequiredFormats();
                    if (requiredFormats != null) {
                        if (!requiredFormats.isEmpty() && fileResolver != null) {
                            Iterator<String> it = requiredFormats.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!fileResolver.isFormatSupported(it.next())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    Set<String> requiredFonts = svgConditional.getRequiredFonts();
                    if (requiredFonts != null) {
                        if (!requiredFonts.isEmpty() && fileResolver != null) {
                            for (String resolveFont : requiredFonts) {
                                if (fileResolver.resolveFont(resolveFont, this.state.style.fontWeight.intValue(), String.valueOf(this.state.style.fontStyle)) == null) {
                                }
                            }
                        }
                    }
                    render(next);
                    return;
                }
            }
        }
    }

    private void renderTextPath(SVG.TextPath textPath) {
        debug("TextPath render", new Object[0]);
        updateStyleForElement(this.state, textPath);
        if (display() && visible()) {
            SVG.SvgObject resolveIRI = textPath.document.resolveIRI(textPath.href);
            if (resolveIRI == null) {
                error("TextPath reference '%s' not found", textPath.href);
                return;
            }
            SVG.Path path = (SVG.Path) resolveIRI;
            Path path2 = new PathConverter(path.f4668d).getPath();
            Matrix matrix = path.transform;
            if (matrix != null) {
                path2.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(path2, false);
            SVG.Length length = textPath.startOffset;
            float floatValue = length != null ? length.floatValue(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor anchorPosition = getAnchorPosition();
            if (anchorPosition != SVG.Style.TextAnchor.Start) {
                float calculateTextWidth = calculateTextWidth(textPath);
                if (anchorPosition == SVG.Style.TextAnchor.Middle) {
                    calculateTextWidth /= 2.0f;
                }
                floatValue -= calculateTextWidth;
            }
            checkForGradientsAndPatterns((SVG.SvgElement) textPath.getTextRoot());
            boolean pushLayer = pushLayer();
            enumerateTextSpans(textPath, new PathTextDrawer(path2, floatValue, 0.0f));
            if (pushLayer) {
                popLayer(textPath);
            }
        }
    }

    private boolean requiresCompositing() {
        return this.state.style.opacity.floatValue() < 1.0f || this.state.style.mask != null;
    }

    private void resetState() {
        this.state = new RendererState();
        this.stateStack = new Stack<>();
        updateStyle(this.state, SVG.Style.getDefaultStyle());
        RendererState rendererState = this.state;
        rendererState.viewPort = null;
        rendererState.spacePreserve = false;
        this.stateStack.push(new RendererState(rendererState));
        this.matrixStack = new Stack<>();
        this.parentStack = new Stack<>();
    }

    private void setClipRect(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        SVG.CSSClipRect cSSClipRect = this.state.style.clip;
        if (cSSClipRect != null) {
            f += cSSClipRect.left.floatValueX(this);
            f2 += this.state.style.clip.top.floatValueY(this);
            f5 -= this.state.style.clip.right.floatValueX(this);
            f6 -= this.state.style.clip.bottom.floatValueY(this);
        }
        this.canvas.clipRect(f, f2, f5, f6);
    }

    private void setPaintColour(RendererState rendererState, boolean z, SVG.SvgPaint svgPaint) {
        SVG.Colour colour;
        float floatValue = (z ? rendererState.style.fillOpacity : rendererState.style.strokeOpacity).floatValue();
        if (svgPaint instanceof SVG.Colour) {
            colour = (SVG.Colour) svgPaint;
        } else if (svgPaint instanceof SVG.CurrentColor) {
            colour = rendererState.style.color;
        } else {
            return;
        }
        (z ? rendererState.fillPaint : rendererState.strokePaint).setColor(colourWithOpacity(colour.colour, floatValue));
    }

    private void setSolidColor(boolean z, SVG.SolidColor solidColor) {
        RendererState rendererState;
        SVG.SvgPaint svgPaint;
        boolean z2 = true;
        if (z) {
            if (isSpecified(solidColor.baseStyle, 2147483648L)) {
                RendererState rendererState2 = this.state;
                SVG.Style style = rendererState2.style;
                SVG.SvgPaint svgPaint2 = solidColor.baseStyle.solidColor;
                style.fill = svgPaint2;
                if (svgPaint2 == null) {
                    z2 = false;
                }
                rendererState2.hasFill = z2;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.fillOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                rendererState = this.state;
                svgPaint = rendererState.style.fill;
            } else {
                return;
            }
        } else {
            if (isSpecified(solidColor.baseStyle, 2147483648L)) {
                RendererState rendererState3 = this.state;
                SVG.Style style2 = rendererState3.style;
                SVG.SvgPaint svgPaint3 = solidColor.baseStyle.solidColor;
                style2.stroke = svgPaint3;
                if (svgPaint3 == null) {
                    z2 = false;
                }
                rendererState3.hasStroke = z2;
            }
            if (isSpecified(solidColor.baseStyle, 4294967296L)) {
                this.state.style.strokeOpacity = solidColor.baseStyle.solidOpacity;
            }
            if (isSpecified(solidColor.baseStyle, 6442450944L)) {
                rendererState = this.state;
                svgPaint = rendererState.style.stroke;
            } else {
                return;
            }
        }
        setPaintColour(rendererState, z, svgPaint);
    }

    private void statePop() {
        this.canvas.restore();
        this.state = this.stateStack.pop();
    }

    private void statePush() {
        this.canvas.save();
        this.stateStack.push(this.state);
        this.state = new RendererState(this.state);
    }

    private String textXMLSpaceTransform(String str, boolean z, boolean z2) {
        String str2;
        if (this.state.spacePreserve) {
            str2 = "[\\n\\t]";
        } else {
            str = str.replaceAll("\\n", "").replaceAll("\\t", " ");
            if (z) {
                str = str.replaceAll("^\\s+", "");
            }
            if (z2) {
                str = str.replaceAll("\\s+$", "");
            }
            str2 = "\\s{2,}";
        }
        return str.replaceAll(str2, " ");
    }

    private void updateParentBoundingBox(SVG.SvgElement svgElement) {
        if (svgElement.parent != null && svgElement.boundingBox != null) {
            Matrix matrix = new Matrix();
            if (this.matrixStack.peek().invert(matrix)) {
                SVG.Box box = svgElement.boundingBox;
                SVG.Box box2 = svgElement.boundingBox;
                SVG.Box box3 = svgElement.boundingBox;
                float[] fArr = {box.minX, box.minY, box.maxX(), box2.minY, box2.maxX(), svgElement.boundingBox.maxY(), box3.minX, box3.maxY()};
                matrix.preConcat(this.canvas.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                }
                SVG.SvgElement svgElement2 = (SVG.SvgElement) this.parentStack.peek();
                SVG.Box box4 = svgElement2.boundingBox;
                if (box4 == null) {
                    svgElement2.boundingBox = SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom);
                } else {
                    box4.union(SVG.Box.fromLimits(rectF.left, rectF.top, rectF.right, rectF.bottom));
                }
            }
        }
    }

    private void updateStyle(RendererState rendererState, SVG.Style style) {
        Integer num;
        SVG.Style style2;
        int intValue;
        Paint.Join join;
        Paint paint;
        Paint.Cap cap;
        Paint paint2;
        if (isSpecified(style, 4096)) {
            rendererState.style.color = style.color;
        }
        if (isSpecified(style, 2048)) {
            rendererState.style.opacity = style.opacity;
        }
        boolean z = false;
        if (isSpecified(style, 1)) {
            rendererState.style.fill = style.fill;
            SVG.SvgPaint svgPaint = style.fill;
            rendererState.hasFill = (svgPaint == null || svgPaint == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 4)) {
            rendererState.style.fillOpacity = style.fillOpacity;
        }
        if (isSpecified(style, 6149)) {
            setPaintColour(rendererState, true, rendererState.style.fill);
        }
        if (isSpecified(style, 2)) {
            rendererState.style.fillRule = style.fillRule;
        }
        if (isSpecified(style, 8)) {
            rendererState.style.stroke = style.stroke;
            SVG.SvgPaint svgPaint2 = style.stroke;
            rendererState.hasStroke = (svgPaint2 == null || svgPaint2 == SVG.Colour.TRANSPARENT) ? false : true;
        }
        if (isSpecified(style, 16)) {
            rendererState.style.strokeOpacity = style.strokeOpacity;
        }
        if (isSpecified(style, 6168)) {
            setPaintColour(rendererState, false, rendererState.style.stroke);
        }
        if (isSpecified(style, 34359738368L)) {
            rendererState.style.vectorEffect = style.vectorEffect;
        }
        if (isSpecified(style, 32)) {
            SVG.Style style3 = rendererState.style;
            style3.strokeWidth = style.strokeWidth;
            rendererState.strokePaint.setStrokeWidth(style3.strokeWidth.floatValue(this));
        }
        if (isSpecified(style, 64)) {
            rendererState.style.strokeLineCap = style.strokeLineCap;
            int i = C13311.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineCap[style.strokeLineCap.ordinal()];
            if (i == 1) {
                paint2 = rendererState.strokePaint;
                cap = Paint.Cap.BUTT;
            } else if (i == 2) {
                paint2 = rendererState.strokePaint;
                cap = Paint.Cap.ROUND;
            } else if (i == 3) {
                paint2 = rendererState.strokePaint;
                cap = Paint.Cap.SQUARE;
            }
            paint2.setStrokeCap(cap);
        }
        if (isSpecified(style, 128)) {
            rendererState.style.strokeLineJoin = style.strokeLineJoin;
            int i2 = C13311.$SwitchMap$com$caverock$androidsvg$SVG$Style$LineJoin[style.strokeLineJoin.ordinal()];
            if (i2 == 1) {
                paint = rendererState.strokePaint;
                join = Paint.Join.MITER;
            } else if (i2 == 2) {
                paint = rendererState.strokePaint;
                join = Paint.Join.ROUND;
            } else if (i2 == 3) {
                paint = rendererState.strokePaint;
                join = Paint.Join.BEVEL;
            }
            paint.setStrokeJoin(join);
        }
        if (isSpecified(style, 256)) {
            rendererState.style.strokeMiterLimit = style.strokeMiterLimit;
            rendererState.strokePaint.setStrokeMiter(style.strokeMiterLimit.floatValue());
        }
        if (isSpecified(style, 512)) {
            rendererState.style.strokeDashArray = style.strokeDashArray;
        }
        if (isSpecified(style, 1024)) {
            rendererState.style.strokeDashOffset = style.strokeDashOffset;
        }
        Typeface typeface = null;
        if (isSpecified(style, 1536)) {
            SVG.Length[] lengthArr = rendererState.style.strokeDashArray;
            if (lengthArr != null) {
                int length = lengthArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    fArr[i4] = rendererState.style.strokeDashArray[i4 % length].floatValue(this);
                    f += fArr[i4];
                }
                if (f != 0.0f) {
                    float floatValue = rendererState.style.strokeDashOffset.floatValue(this);
                    if (floatValue < 0.0f) {
                        floatValue = (floatValue % f) + f;
                    }
                    rendererState.strokePaint.setPathEffect(new DashPathEffect(fArr, floatValue));
                }
            }
            rendererState.strokePaint.setPathEffect((PathEffect) null);
        }
        if (isSpecified(style, 16384)) {
            float currentFontSize = getCurrentFontSize();
            rendererState.style.fontSize = style.fontSize;
            rendererState.fillPaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
            rendererState.strokePaint.setTextSize(style.fontSize.floatValue(this, currentFontSize));
        }
        if (isSpecified(style, 8192)) {
            rendererState.style.fontFamily = style.fontFamily;
        }
        if (isSpecified(style, 32768)) {
            if (style.fontWeight.intValue() == -1 && rendererState.style.fontWeight.intValue() > 100) {
                style2 = rendererState.style;
                intValue = style2.fontWeight.intValue() - 100;
            } else if (style.fontWeight.intValue() != 1 || rendererState.style.fontWeight.intValue() >= 900) {
                style2 = rendererState.style;
                num = style.fontWeight;
                style2.fontWeight = num;
            } else {
                style2 = rendererState.style;
                intValue = style2.fontWeight.intValue() + 100;
            }
            num = Integer.valueOf(intValue);
            style2.fontWeight = num;
        }
        if (isSpecified(style, 65536)) {
            rendererState.style.fontStyle = style.fontStyle;
        }
        if (isSpecified(style, 106496)) {
            if (rendererState.style.fontFamily != null && this.document != null) {
                SVGExternalFileResolver fileResolver = SVG.getFileResolver();
                for (String next : rendererState.style.fontFamily) {
                    SVG.Style style4 = rendererState.style;
                    Typeface checkGenericFont = checkGenericFont(next, style4.fontWeight, style4.fontStyle);
                    if (checkGenericFont != null || fileResolver == null) {
                        typeface = checkGenericFont;
                        continue;
                    } else {
                        typeface = fileResolver.resolveFont(next, rendererState.style.fontWeight.intValue(), String.valueOf(rendererState.style.fontStyle));
                        continue;
                    }
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                SVG.Style style5 = rendererState.style;
                typeface = checkGenericFont(DEFAULT_FONT_FAMILY, style5.fontWeight, style5.fontStyle);
            }
            rendererState.fillPaint.setTypeface(typeface);
            rendererState.strokePaint.setTypeface(typeface);
        }
        if (isSpecified(style, 131072)) {
            rendererState.style.textDecoration = style.textDecoration;
            rendererState.fillPaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
            rendererState.fillPaint.setUnderlineText(style.textDecoration == SVG.Style.TextDecoration.Underline);
            if (Build.VERSION.SDK_INT >= 17) {
                rendererState.strokePaint.setStrikeThruText(style.textDecoration == SVG.Style.TextDecoration.LineThrough);
                Paint paint3 = rendererState.strokePaint;
                if (style.textDecoration == SVG.Style.TextDecoration.Underline) {
                    z = true;
                }
                paint3.setUnderlineText(z);
            }
        }
        if (isSpecified(style, 68719476736L)) {
            rendererState.style.direction = style.direction;
        }
        if (isSpecified(style, 262144)) {
            rendererState.style.textAnchor = style.textAnchor;
        }
        if (isSpecified(style, 524288)) {
            rendererState.style.overflow = style.overflow;
        }
        if (isSpecified(style, 2097152)) {
            rendererState.style.markerStart = style.markerStart;
        }
        if (isSpecified(style, 4194304)) {
            rendererState.style.markerMid = style.markerMid;
        }
        if (isSpecified(style, 8388608)) {
            rendererState.style.markerEnd = style.markerEnd;
        }
        if (isSpecified(style, 16777216)) {
            rendererState.style.display = style.display;
        }
        if (isSpecified(style, 33554432)) {
            rendererState.style.visibility = style.visibility;
        }
        if (isSpecified(style, 1048576)) {
            rendererState.style.clip = style.clip;
        }
        if (isSpecified(style, 268435456)) {
            rendererState.style.clipPath = style.clipPath;
        }
        if (isSpecified(style, 536870912)) {
            rendererState.style.clipRule = style.clipRule;
        }
        if (isSpecified(style, 1073741824)) {
            rendererState.style.mask = style.mask;
        }
        if (isSpecified(style, 67108864)) {
            rendererState.style.stopColor = style.stopColor;
        }
        if (isSpecified(style, 134217728)) {
            rendererState.style.stopOpacity = style.stopOpacity;
        }
        if (isSpecified(style, 8589934592L)) {
            rendererState.style.viewportFill = style.viewportFill;
        }
        if (isSpecified(style, 17179869184L)) {
            rendererState.style.viewportFillOpacity = style.viewportFillOpacity;
        }
        if (isSpecified(style, 137438953472L)) {
            rendererState.style.imageRendering = style.imageRendering;
        }
    }

    private void updateStyleForElement(RendererState rendererState, SVG.SvgElementBase svgElementBase) {
        rendererState.style.resetNonInheritingProperties(svgElementBase.parent == null);
        SVG.Style style = svgElementBase.baseStyle;
        if (style != null) {
            updateStyle(rendererState, style);
        }
        if (this.document.hasCSSRules()) {
            for (CSSParser.Rule next : this.document.getCSSRules()) {
                if (CSSParser.ruleMatch(this.ruleMatchContext, next.selector, svgElementBase)) {
                    updateStyle(rendererState, next.style);
                }
            }
        }
        SVG.Style style2 = svgElementBase.style;
        if (style2 != null) {
            updateStyle(rendererState, style2);
        }
    }

    private void viewportFill() {
        int i;
        SVG.Style style = this.state.style;
        SVG.SvgPaint svgPaint = style.viewportFill;
        if (svgPaint instanceof SVG.Colour) {
            i = ((SVG.Colour) svgPaint).colour;
        } else if (svgPaint instanceof SVG.CurrentColor) {
            i = style.color.colour;
        } else {
            return;
        }
        Float f = this.state.style.viewportFillOpacity;
        if (f != null) {
            i = colourWithOpacity(i, f.floatValue());
        }
        this.canvas.drawColor(i);
    }

    /* access modifiers changed from: private */
    public boolean visible() {
        Boolean bool = this.state.style.visibility;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static void warn(String str, Object... objArr) {
        Log.w(TAG, String.format(str, objArr));
    }

    /* access modifiers changed from: package-private */
    public float getCurrentFontSize() {
        return this.state.fillPaint.getTextSize();
    }

    /* access modifiers changed from: package-private */
    public float getCurrentFontXHeight() {
        return this.state.fillPaint.getTextSize() / 2.0f;
    }

    /* access modifiers changed from: package-private */
    public SVG.Box getCurrentViewPortInUserUnits() {
        RendererState rendererState = this.state;
        SVG.Box box = rendererState.viewBox;
        return box != null ? box : rendererState.viewPort;
    }

    /* access modifiers changed from: package-private */
    public float getDPI() {
        return this.dpi;
    }

    /* access modifiers changed from: package-private */
    public void renderDocument(SVG svg, RenderOptions renderOptions) {
        SVG.Box box;
        PreserveAspectRatio preserveAspectRatio;
        if (renderOptions != null) {
            this.document = svg;
            SVG.Svg rootElement = svg.getRootElement();
            if (rootElement == null) {
                warn("Nothing to render. Document is empty.", new Object[0]);
                return;
            }
            if (renderOptions.hasView()) {
                SVG.SvgElementBase elementById = this.document.getElementById(renderOptions.viewId);
                if (elementById == null || !(elementById instanceof SVG.View)) {
                    Log.w(TAG, String.format("View element with id \"%s\" not found.", new Object[]{renderOptions.viewId}));
                    return;
                }
                SVG.View view = (SVG.View) elementById;
                box = view.viewBox;
                if (box == null) {
                    Log.w(TAG, String.format("View element with id \"%s\" is missing a viewBox attribute.", new Object[]{renderOptions.viewId}));
                    return;
                }
                preserveAspectRatio = view.preserveAspectRatio;
            } else {
                box = renderOptions.hasViewBox() ? renderOptions.viewBox : rootElement.viewBox;
                preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.preserveAspectRatio : rootElement.preserveAspectRatio;
            }
            if (renderOptions.hasCss()) {
                svg.addCSSRules(renderOptions.css);
            }
            if (renderOptions.hasTarget()) {
                this.ruleMatchContext = new CSSParser.RuleMatchContext();
                this.ruleMatchContext.targetElement = svg.getElementById(renderOptions.targetId);
            }
            resetState();
            checkXMLSpaceAttribute(rootElement);
            statePush();
            SVG.Box box2 = new SVG.Box(renderOptions.viewPort);
            SVG.Length length = rootElement.width;
            if (length != null) {
                box2.width = length.floatValue(this, box2.width);
            }
            SVG.Length length2 = rootElement.height;
            if (length2 != null) {
                box2.height = length2.floatValue(this, box2.height);
            }
            render(rootElement, box2, box, preserveAspectRatio);
            statePop();
            if (renderOptions.hasCss()) {
                svg.clearRenderCSSRules();
                return;
            }
            return;
        }
        throw new NullPointerException("renderOptions shouldn't be null");
    }
}
