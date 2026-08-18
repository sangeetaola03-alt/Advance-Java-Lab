public class runcalculator {

    public static void main(String[] args) {
        viewscalculator view = new viewscalculator();
        modelsclac model = new modelsclac();
        new controllercalculator (view, model);

    }
    
}
