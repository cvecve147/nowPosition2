package p263h;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import okhttp3.ResponseBody;
import okio.Buffer;

/* renamed from: h.t */
final class C6656t {

    /* renamed from: a */
    static final Type[] f18442a = new Type[0];

    /* renamed from: h.t$a */
    private static final class C6657a implements GenericArrayType {

        /* renamed from: a */
        private final Type f18443a;

        public C6657a(Type type) {
            this.f18443a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C6656t.m25305a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f18443a;
        }

        public int hashCode() {
            return this.f18443a.hashCode();
        }

        public String toString() {
            return C6656t.m25311e(this.f18443a) + "[]";
        }
    }

    /* renamed from: h.t$b */
    private static final class C6658b implements ParameterizedType {

        /* renamed from: a */
        private final Type f18444a;

        /* renamed from: b */
        private final Type f18445b;

        /* renamed from: c */
        private final Type[] f18446c;

        public C6658b(Type type, Type type2, Type... typeArr) {
            int i = 0;
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f18444a = type;
            this.f18445b = type2;
            this.f18446c = (Type[]) typeArr.clone();
            Type[] typeArr2 = this.f18446c;
            int length = typeArr2.length;
            while (i < length) {
                Type type3 = typeArr2[i];
                if (type3 != null) {
                    C6656t.m25303a(type3);
                    i++;
                } else {
                    throw new NullPointerException();
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C6656t.m25305a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f18446c.clone();
        }

        public Type getOwnerType() {
            return this.f18444a;
        }

        public Type getRawType() {
            return this.f18445b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f18446c) ^ this.f18445b.hashCode()) ^ C6656t.m25293a((Object) this.f18444a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f18446c.length + 1) * 30);
            sb.append(C6656t.m25311e(this.f18445b));
            if (this.f18446c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C6656t.m25311e(this.f18446c[0]));
            for (int i = 1; i < this.f18446c.length; i++) {
                sb.append(", ");
                sb.append(C6656t.m25311e(this.f18446c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: h.t$c */
    private static final class C6659c implements WildcardType {

        /* renamed from: a */
        private final Type f18447a;

        /* renamed from: b */
        private final Type f18448b;

        public C6659c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    if (typeArr2[0] != null) {
                        C6656t.m25303a(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.f18448b = typeArr2[0];
                            cls = Object.class;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        throw new NullPointerException();
                    }
                } else if (typeArr[0] != null) {
                    C6656t.m25303a(typeArr[0]);
                    this.f18448b = null;
                    cls = typeArr[0];
                } else {
                    throw new NullPointerException();
                }
                this.f18447a = cls;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C6656t.m25305a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f18448b;
            if (type == null) {
                return C6656t.f18442a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f18447a};
        }

        public int hashCode() {
            Type type = this.f18448b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f18447a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f18448b != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f18448b;
            } else if (this.f18447a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f18447a;
            }
            sb.append(C6656t.m25311e(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    static int m25293a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    private static int m25294a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m25295a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    static <T> T m25296a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static Type m25297a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    /* renamed from: a */
    static Type m25298a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m25298a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m25298a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.reflect.Type m25299a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m25300a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.TypeVariable<?>) r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m25299a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            h.t$a r0 = new h.t$a
            r0.<init>(r8)
        L_0x002c:
            return r0
        L_0x002d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0044
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m25299a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)
            if (r0 != r8) goto L_0x003e
            goto L_0x0043
        L_0x003e:
            h.t$a r10 = new h.t$a
            r10.<init>(r8)
        L_0x0043:
            return r10
        L_0x0044:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0087
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m25299a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)
            if (r3 == r0) goto L_0x0058
            r0 = r1
            goto L_0x0059
        L_0x0058:
            r0 = r2
        L_0x0059:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005e:
            if (r2 >= r5) goto L_0x0079
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m25299a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0076
            if (r0 != 0) goto L_0x0074
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x0074:
            r4[r2] = r6
        L_0x0076:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0079:
            if (r0 == 0) goto L_0x0085
            h.t$b r8 = new h.t$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            goto L_0x0086
        L_0x0085:
            r8 = r10
        L_0x0086:
            return r8
        L_0x0087:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00cb
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00b2
            r3 = r0[r2]
            java.lang.reflect.Type r8 = m25299a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r3)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00cb
            h.t$c r9 = new h.t$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r2] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            r0[r2] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00b2:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00cb
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m25299a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)     // Catch:{ Throwable -> 0x00cc }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00cb
            h.t$c r9 = new h.t$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            java.lang.reflect.Type[] r8 = f18442a
            r9.<init>(r10, r8)
            return r9
        L_0x00cb:
            return r10
        L_0x00cc:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p263h.C6656t.m25299a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: a */
    private static Type m25300a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m25295a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m25298a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m25294a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    static ResponseBody m25301a(ResponseBody responseBody) {
        Buffer buffer = new Buffer();
        responseBody.source().readAll(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    /* renamed from: a */
    static <T> void m25302a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: a */
    static void m25303a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static boolean m25304a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static boolean m25305a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m25304a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m25305a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    /* renamed from: a */
    static boolean m25306a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static Type m25307b(Type type) {
        if (type instanceof ParameterizedType) {
            return m25297a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    /* renamed from: b */
    static Type m25308b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return m25299a(type, cls, m25298a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    static Class<?> m25309c(Type type) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (type instanceof Class) {
            return (Class) type;
        } else {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(m25309c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    return m25309c(((WildcardType) type).getUpperBounds()[0]);
                }
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
            }
        }
    }

    /* renamed from: d */
    static boolean m25310d(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type d : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m25310d(d)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return m25310d(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* renamed from: e */
    static String m25311e(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
