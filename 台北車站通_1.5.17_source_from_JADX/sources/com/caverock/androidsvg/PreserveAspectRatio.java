package com.caverock.androidsvg;

public class PreserveAspectRatio {
    public static final PreserveAspectRatio BOTTOM = new PreserveAspectRatio(Alignment.xMidYMax, Scale.meet);
    public static final PreserveAspectRatio END = new PreserveAspectRatio(Alignment.xMaxYMax, Scale.meet);
    public static final PreserveAspectRatio FULLSCREEN = new PreserveAspectRatio(Alignment.xMidYMid, Scale.slice);
    public static final PreserveAspectRatio FULLSCREEN_START = new PreserveAspectRatio(Alignment.xMinYMin, Scale.slice);
    public static final PreserveAspectRatio LETTERBOX = new PreserveAspectRatio(Alignment.xMidYMid, Scale.meet);
    public static final PreserveAspectRatio START = new PreserveAspectRatio(Alignment.xMinYMin, Scale.meet);
    public static final PreserveAspectRatio STRETCH = new PreserveAspectRatio(Alignment.none, (Scale) null);
    public static final PreserveAspectRatio TOP = new PreserveAspectRatio(Alignment.xMidYMin, Scale.meet);
    public static final PreserveAspectRatio UNSCALED = new PreserveAspectRatio((Alignment) null, (Scale) null);
    private Alignment alignment;
    private Scale scale;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    PreserveAspectRatio(Alignment alignment2, Scale scale2) {
        this.alignment = alignment2;
        this.scale = scale2;
    }

    /* renamed from: of */
    public static PreserveAspectRatio m6452of(String str) {
        try {
            return SVGParser.parsePreserveAspectRatio(str);
        } catch (SVGParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreserveAspectRatio.class != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.alignment == preserveAspectRatio.alignment && this.scale == preserveAspectRatio.scale;
    }

    public Alignment getAlignment() {
        return this.alignment;
    }

    public Scale getScale() {
        return this.scale;
    }

    public String toString() {
        return this.alignment + " " + this.scale;
    }
}
