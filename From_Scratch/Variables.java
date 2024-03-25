public class Variables {
    private String classVariables = "My name is Michael";
    private int globalVariable = 500;

    public void method(){
        int localVariable = 600;
        classVariables = "My last name is NTAGANIRA";
        System.out.println(classVariables);

        // ----------------------- incrementation --------------------
        globalVariable ++;
        globalVariable ++;
        globalVariable ++;
        globalVariable ++;

        // -------------------- decrementation ----------------------
        localVariable --;
        localVariable --;
        localVariable --;
        localVariable --;

        System.out.println(globalVariable);
        System.out.println(localVariable);
    }

    public static void main(String[] args){
        Variables myVar = new Variables();
         String myName = myVar.classVariables;

         System.out.println(myName);

         myVar.classVariables  = "Other name is MUNEZERO";
         String nameAgain = myVar.classVariables;

         System.out.println(nameAgain);

         myVar.method();
        //  System.out.println(myVar.classVariables);

    }
}
