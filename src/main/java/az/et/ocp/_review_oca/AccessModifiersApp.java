package az.et.ocp._review_oca;

public class AccessModifiersApp {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
//        System.out.println(cat.id); // private
    }
}