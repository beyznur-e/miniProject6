public class Main {
    public static void main(String[] args) {


        Course course1 = new Course(1, "Yazılım Geliştirme Kampı (C# + ANGULAR)", "2 ay sürecek...", "Engin Demiroğ");
        Course course2 = new Course(2, "Yazılım Geliştirme Kampı (JavaScript)", "1.5 ay sürecek...", "Engin Demiroğ");
        Course course3 = new Course(3, "Yazılım Geliştirme Kampı (.NET)", "2 ay sürecek...", "Engin Demiroğ");

        Course[] courses = {course1, course2, course3};
        for (Course courseArray : courses){
            System.out.println(courseArray.name);
            System.out.println(courseArray.detail);
            System.out.println(courseArray.educator);
            System.out.println("-------------------------");
        }

        Category category1 = new Category(1, "Tümü");
        Category category2 = new Category(2, "Programlama");

        Category[] categories = {category1, category2};
        for (Category categoryArray : categories){
            System.out.println(categoryArray.name);
        }

    }
}