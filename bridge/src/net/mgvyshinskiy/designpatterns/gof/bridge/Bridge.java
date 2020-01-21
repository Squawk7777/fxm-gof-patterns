package net.mgvyshinskiy.designpatterns.gof.bridge;

public class Bridge {
    public static void main(String[] args) throws ReflectiveOperationException {
        //
        CuisineFactory cuisineFactory = new CuisineFactory();
        CourseFactory courseFactory = new CourseFactory();

        UkrainianCuisine ukrainianCuisine = cuisineFactory.createEntity(UkrainianCuisine.class);
        JapaneseCuisine japaneseCuisine = cuisineFactory.createEntity(JapaneseCuisine.class);
        AmericanCuisine americanCuisine = cuisineFactory.createEntity(AmericanCuisine.class);

        Starter starter = courseFactory.createEntity(Starter.class);
        FirstCourseFactory firstCourseFactory = courseFactory.createEntity(FirstCourseFactory.class);
        SecondCourse secondCourse = courseFactory.createEntity(SecondCourse.class);
        Dessert dessert = courseFactory.createEntity(Dessert.class);


    }
}
