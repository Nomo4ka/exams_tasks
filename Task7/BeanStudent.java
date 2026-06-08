public class BeanStudent implements java.io.Serializable {
    private String name;
    private String secondName;
    private String patronymic;

    private int numberOfCreditBook;
    private int[] assesments;

    public BeanStudent() {
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int[] getAssesments() {
        return assesments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumberOfCreditBook() {
        return numberOfCreditBook;
    }

    public void setNumberOfCreditBook(int numberOfCreditBook) {
        this.numberOfCreditBook = numberOfCreditBook;
    }

    public void setAssesments(int index, int assesment) {
        this.assesments[index] = assesment;
    }

    public void setAssesments(int[] assesments) {
        this.assesments = assesments;
    }

    public int getAssesment(int index) {
        return assesments[index];
    }
    
}   
