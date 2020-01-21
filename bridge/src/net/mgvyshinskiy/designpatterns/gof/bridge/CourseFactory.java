package net.mgvyshinskiy.designpatterns.gof.bridge;

public class CourseFactory {
    public static <T extends Course> T createCourse(Class<T> courseClass) throws ReflectiveOperationException {
        return courseClass.getDeclaredConstructor().newInstance();
    }
}
