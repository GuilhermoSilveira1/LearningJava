public class studentProfile {
    public static void main(String[] args) {
    student studentProfileGui = new student("Guilhermo", "Silveira", 2026, 3.47, "Eng. Mecatrônica");
    student studentProfilePaula = new student("Paula","Marcondes", 2025, 3.7, "Programador e operador de manufatura");

    int studentGraduationYearGui = studentProfileGui.incrementExpectedGradYear();
    int studentGraduationYearPaula = studentProfilePaula.incrementExpectedGradYear();

    System.out.println(studentGraduationYearGui);

    System.out.println(studentGraduationYearPaula);
    }
}
