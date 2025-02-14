package lv.rvt;

class Student extends Person {
    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }

    public void study() {
        studyCredits++;
    }

    public int credits() {
        return studyCredits;
    }
}