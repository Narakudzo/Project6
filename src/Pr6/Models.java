package Pr6;

class Student
{
    private Integer id;
    private String  firstname;
    private String  secondname;
    private Integer points;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{ " +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", points=" + points +
                " }";
    }

    // for test

    static String[] firstnames = new String[] { "Noah", "Liam", "William", "Mason", "James", "Benjamin" };
    static String[] lastnames  = new String[] { "Adderiy", "Allford", "Arnold" };

    public static Student[] getSamples()
    {
        var students = new Student[10];

        for (int i = 0; i < 10; i++)
        {
            var student = new Student();
            student.setFirstname(firstnames[i % firstnames.length]);
            student.setSecondname(lastnames[i % lastnames.length]);
            int a =(int) (Math.random()*100);
            int b =(int) (Math.random()*(1000-300+1));
            student.setPoints(a);
            student.setId(b);

            students[i] = student;
        }

        return students;
    }
}
