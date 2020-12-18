package p101d.p129g.p152e.p154b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: d.g.e.b.b */
public final class C5680b {

    /* renamed from: a */
    static final Type[] f15718a = new Type[0];

    /* renamed from: d.g.e.b.b$a */
    private static final class C5681a implements GenericArrayType, Serializable {

        /* renamed from: a */
        private final Type f15719a;

        public C5681a(Type type) {
            this.f15719a = C5680b.m21505b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C5680b.m21504a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f15719a;
        }

        public int hashCode() {
            return this.f15719a.hashCode();
        }

        public String toString() {
            return C5680b.m21513h(this.f15719a) + "[]";
        }
    }

    /* renamed from: d.g.e.b.b$b */
    private static final class C5682b implements ParameterizedType, Serializable {

        /* renamed from: a */
        private final Type f15720a;

        /* renamed from: b */
        private final Type f15721b;

        /* renamed from: c */
        private final Type[] f15722c;

        public C5682b(Type type, Type type2, Type... typeArr) {
            int i = 0;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C5611a.m21266a(z);
            }
            this.f15720a = type == null ? null : C5680b.m21505b(type);
            this.f15721b = C5680b.m21505b(type2);
            this.f15722c = (Type[]) typeArr.clone();
            while (true) {
                Type[] typeArr2 = this.f15722c;
                if (i < typeArr2.length) {
                    C5611a.m21265a(typeArr2[i]);
                    C5680b.m21508c(this.f15722c[i]);
                    Type[] typeArr3 = this.f15722c;
                    typeArr3[i] = C5680b.m21505b(typeArr3[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C5680b.m21504a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f15722c.clone();
        }

        public Type getOwnerType() {
            return this.f15720a;
        }

        public Type getRawType() {
            return this.f15721b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f15722c) ^ this.f15721b.hashCode()) ^ C5680b.m21494a((Object) this.f15720a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f15722c.length + 1) * 30);
            sb.append(C5680b.m21513h(this.f15721b));
            if (this.f15722c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(C5680b.m21513h(this.f15722c[0]));
            for (int i = 1; i < this.f15722c.length; i++) {
                sb.append(", ");
                sb.append(C5680b.m21513h(this.f15722c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: d.g.e.b.b$c */
    private static final class C5683c implements WildcardType, Serializable {

        /* renamed from: a */
        private final Type f15723a;

        /* renamed from: b */
        private final Type f15724b;

        public C5683c(Type[] typeArr, Type[] typeArr2) {
            Type type;
            boolean z = true;
            C5611a.m21266a(typeArr2.length <= 1);
            C5611a.m21266a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C5611a.m21265a(typeArr2[0]);
                C5680b.m21508c(typeArr2[0]);
                C5611a.m21266a(typeArr[0] != Object.class ? false : z);
                this.f15724b = C5680b.m21505b(typeArr2[0]);
                type = Object.class;
            } else {
                C5611a.m21265a(typeArr[0]);
                C5680b.m21508c(typeArr[0]);
                this.f15724b = null;
                type = C5680b.m21505b(typeArr[0]);
            }
            this.f15723a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C5680b.m21504a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f15724b;
            if (type == null) {
                return C5680b.f15718a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f15723a};
        }

        public int hashCode() {
            Type type = this.f15724b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f15723a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f15724b != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f15724b;
            } else if (this.f15723a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f15723a;
            }
            sb.append(C5680b.m21513h(type));
            return sb.toString();
        }
    }

    /* renamed from: a */
    static int m21494a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    private static int m21495a(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m21496a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: a */
    public static GenericArrayType m21497a(Type type) {
        return new C5681a(type);
    }

    /* renamed from: a */
    public static ParameterizedType m21498a(Type type, Type type2, Type... typeArr) {
        return new C5682b(type, type2, typeArr);
    }

    /* renamed from: a */
    public static Type m21499a(Type type, Class<?> cls) {
        Type b = m21506b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        return b instanceof ParameterizedType ? ((ParameterizedType) b).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: a */
    static Type m21500a(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m21500a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return m21500a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m21501a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m21502a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.TypeVariable<?>) r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m21501a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.reflect.GenericArrayType r0 = m21497a((java.lang.reflect.Type) r8)
        L_0x002b:
            return r0
        L_0x002c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0042
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m21501a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)
            if (r0 != r8) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            java.lang.reflect.GenericArrayType r10 = m21497a((java.lang.reflect.Type) r8)
        L_0x0041:
            return r10
        L_0x0042:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0082
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m21501a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)
            if (r3 == r0) goto L_0x0056
            r0 = r1
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005c:
            if (r2 >= r5) goto L_0x0077
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m21501a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0074
            if (r0 != 0) goto L_0x0072
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = r1
        L_0x0072:
            r4[r2] = r6
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x005c
        L_0x0077:
            if (r0 == 0) goto L_0x0081
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = m21498a((java.lang.reflect.Type) r3, (java.lang.reflect.Type) r8, (java.lang.reflect.Type[]) r4)
        L_0x0081:
            return r10
        L_0x0082:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00b4
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00a2
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m21501a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r1)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00b4
            java.lang.reflect.WildcardType r8 = m21512g(r8)
            return r8
        L_0x00a2:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00b4
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m21501a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)     // Catch:{ Throwable -> 0x00b5 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00b4
            java.lang.reflect.WildcardType r8 = m21511f(r8)
            return r8
        L_0x00b4:
            return r10
        L_0x00b5:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p152e.p154b.C5680b.m21501a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: a */
    static Type m21502a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a = m21496a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m21500a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m21495a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    static boolean m21503a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m21504a(Type type, Type type2) {
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
            return m21503a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m21504a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: b */
    public static Type m21505b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C5681a(m21505b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5682b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C5681a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C5683c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: b */
    static Type m21506b(Type type, Class<?> cls, Class<?> cls2) {
        C5611a.m21266a(cls2.isAssignableFrom(cls));
        return m21501a(type, cls, m21500a(type, cls, cls2));
    }

    /* renamed from: b */
    public static Type[] m21507b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = m21506b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    /* renamed from: c */
    static void m21508c(Type type) {
        C5611a.m21266a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    public static Type m21509d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: e */
    public static Class<?> m21510e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C5611a.m21266a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m21510e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m21510e(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    /* renamed from: f */
    public static WildcardType m21511f(Type type) {
        return new C5683c(new Type[]{type}, f15718a);
    }

    /* renamed from: g */
    public static WildcardType m21512g(Type type) {
        return new C5683c(new Type[]{Object.class}, new Type[]{type});
    }

    /* renamed from: h */
    public static String m21513h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
