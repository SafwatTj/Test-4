public class Person {
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", fName, lName, age);
    }

    public String shortToString(){
        String name = (fName!=null && fName.length()>0) ? fName.charAt(0)+".":"";
        return String.format("%s%s",name, lName); // Елена Иванова  -> Е.Иванова
    }
}
