SerializationDelegate 序列化委派 持有：Serializer序列化接口 和 Deserializer反序列化接口
通过构造函数为Serializer和Deserializer两个接口赋值对应的实例，然后有两个接口实例执行对应的序列化和反序列化操作，
自己本身并没有序列化和反序列化的功能，委派给别的类实现，是委派模式的简单应用场景

public SerializationDelegate(ClassLoader classLoader) {
    this.serializer = new DefaultSerializer();
    this.deserializer = new DefaultDeserializer(classLoader);
}

public SerializationDelegate(Serializer<Object> serializer, Deserializer<Object> deserializer) {
    Assert.notNull(serializer, "Serializer must not be null");
    Assert.notNull(deserializer, "Deserializer must not be null");
    this.serializer = serializer;
    this.deserializer = deserializer;
}