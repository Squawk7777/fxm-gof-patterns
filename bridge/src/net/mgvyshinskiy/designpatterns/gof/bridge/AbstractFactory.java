package net.mgvyshinskiy.designpatterns.gof.bridge;

public class AbstractFactory<T> {
    public <R extends T> R create(Class<R> cls) throws ReflectiveOperationException {
        return cls.getDeclaredConstructor().newInstance();
    }
}
