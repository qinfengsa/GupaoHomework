// class version 49.0 (49)
// access flags 0x21
public class com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton {

  // compiled from: LazyInnerClassSingleton.java
  // access flags 0x1008 ---匿名内部类
  static synthetic INNERCLASS com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton$1 null null
  // access flags 0xA
  private static INNERCLASS com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton$LazyHolder com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton LazyHolder

  // access flags 0x2
  private <init>()V
   L0
    LINENUMBER 11 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 12 L1
    INVOKESTATIC com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton$LazyHolder.access$000 ()Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton;
    IFNULL L2
   L3
    LINENUMBER 13 L3
    NEW java/lang/RuntimeException
    DUP
    LDC "\u4e0d\u5141\u8bb8\u521b\u5efa\u591a\u4e2a\u5b9e\u4f8b"
    INVOKESPECIAL java/lang/RuntimeException.<init> (Ljava/lang/String;)V
    ATHROW
   L2
    LINENUMBER 15 L2
    RETURN
   L4
    LOCALVARIABLE this Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton; L0 L4 0
    MAXSTACK = 3
    MAXLOCALS = 1

  // access flags 0x19
  public final static getInstance()Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton;
   L0
    LINENUMBER 24 L0
    INVOKESTATIC com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton$LazyHolder.access$000 ()Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 0

  // access flags 0x1000
  synthetic <init>(Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton$1;)V
   L0
    LINENUMBER 8 L0
    ALOAD 0
    INVOKESPECIAL com/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton.<init> ()V
    RETURN
   L1
    LOCALVARIABLE this Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton; L0 L1 0
    LOCALVARIABLE x0 Lcom/qinfengsa/pattern/singleton/lazy/LazyInnerClassSingleton$1; L0 L1 1
    MAXSTACK = 1
    MAXLOCALS = 2
}
