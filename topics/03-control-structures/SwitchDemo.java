public class SwitchDemo {
    public static void main(String[] args) {
        int grade = 78; 
        char gradeCategory; 

        if (grade >= 90) 
            gradeCategory = 'A';
        else if (grade >= 80) 
            gradeCategory = 'B';
        else if (grade >= 70) 
            gradeCategory = 'C';
        else if (grade >= 60) 
            gradeCategory = 'D';
        else 
            gradeCategory = 'F';

        switch (gradeCategory) {
            case 'A':
                System.out.println("Outstanding");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Can do better");
                break;
            case 'F':
                System.out.println("Study hard");
                break;
            default:
                System.out.println("Invalid score");
                break;
        }
    }
}

