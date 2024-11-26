public class VariableScope {
    
    int instanceVariable =22;

    static double staticVariable = 1.65;

    public void showLocalVariable(){
        String localVariable ="Tan Kai Jie";
        System.out.println("Name: "+localVariable);
        System.out.println("Age: " +instanceVariable);
        System.out.println("height: "+staticVariable);

    }
    

    public static void main(String[] args) {
        VariableScope variableScope = new VariableScope();
        variableScope.showLocalVariable();

    }
}
