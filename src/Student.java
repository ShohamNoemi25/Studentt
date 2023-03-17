public class Student {
    private long controlNumber; // 22670076
    private String name;        // Shoham noemi
    private String lastName;    //Medina Rosas
    private String career;      // Informatica
    private int semester;       // Segundo

    public Student(long controlNumber, String name, String lastName, String career, int semester) {
        this.controlNumber = controlNumber;
        this.name = name;
        this.lastName = lastName;
        this.career = career;
        this.semester = semester;
    }

    public long getControlNumber() {
        return controlNumber;
    }

    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double generalAvg(long controlNumber) {
        return 0.0;
    }

    public double subjectGrade(long controlNumber, String subject){
        return 0.0;
    }
    public void mostrardatos(){
        System.out.println("nombre:"+ getName());
        System.out.println("apellido" + getLastName());
        System.out.println("numero de control"+getControlNumber());
        System.out.println("semestre"+ getSemester());
        System.out.println("career"+ getCareer());

    }
}
