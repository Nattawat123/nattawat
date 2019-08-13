public class CallStudent {
    //psvm + tab
      public static void main(String[] args) {
        Student korn = new Student();
        System.out.println(">>" + korn);
        
        korn.enrollment();
        korn.payment();
        korn.addCourse();
        korn.dropCourse();
        System.out.println("============");
        GraduateStudent kornza = new GraduateStudent();
        kornza.enrollment();
        kornza.addCourse();
        kornza.dropCourse();
        kornza.payment();
        kornza.oralExamination();
        kornza.thesisExamination();
    }
    
}//end class
