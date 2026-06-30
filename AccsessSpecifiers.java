33333333class Base {
    public String publicVar = "Public: Everyone can see me";
    protected String protectedVar = "Protected: Subclasses and package can see me";
    private String privateVar = "Private: Only this class can see me";

    public String getPrivateVar() {
        return privateVar;
    }
}

public class AccsessSpecifiers extends Base {
    public void showAccess() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
       
        System.out.println(getPrivateVar());+
    }

    public static void main(String[] args) {
        AccsessSpecifiers example = new AccsessSpecifiers();
        example.showAccess();
    }
}
