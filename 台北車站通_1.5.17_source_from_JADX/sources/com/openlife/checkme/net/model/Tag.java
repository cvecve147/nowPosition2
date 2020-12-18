package com.openlife.checkme.net.model;

public class Tag {
    private String color;
    private String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tag.class != obj.getClass()) {
            return false;
        }
        Tag tag = (Tag) obj;
        String str = this.title;
        if (str == null ? tag.title != null : !str.equals(tag.title)) {
            return false;
        }
        String str2 = this.color;
        return str2 != null ? str2.equals(tag.color) : tag.color == null;
    }

    public String getColor() {
        String str = this.color;
        return str != null ? str : "";
    }

    public String getTitle() {
        String str = this.title;
        return str != null ? str : "";
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.color;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}
